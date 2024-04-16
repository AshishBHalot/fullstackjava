#include <iostream>
#include <vector>
#include <set>
using namespace std;

int removeDuplicates(vector<int> &arr, int n) {
    // Create a set to store unique elements
    set<int> st;

    // Insert elements from array into the set
    for(int i = 0; i < n; i++) {
        st.insert(arr[i]);
    }

    // Count the number of unique elements in the set
    int count = 0;
    for(auto it = st.begin(); it != st.end(); it++) {
        count++;
    }

    return count;
}

int main() {
    vector<int> arr = {1, 2, 2, 3, 4, 4, 5};
    int n = arr.size();

    cout << "Original array: ";
    for(int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    int uniqueCount = removeDuplicates(arr, n);

    cout << "Array after removing duplicates: ";
    for(int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    cout << "Number of unique elements: " << uniqueCount << endl;

    return 0;
}