//Name: Hajer sayah
//ID: 445013975

// Java code for linearly search x in arr[]. If x

// is present then return its location, otherwise

// return -1

class LinearSearch {

            // This function returns index of element x in arr[]
            //n is the number of elements in the array, and x is the element to search for.

            static int search(int arr[], int n, int x)

            {
                        // Loop through each element of the array to check if it's the target element
                        for (int i = 0; i < n; i++) {

                                // Return the index of the element if the element

                                    // is found

                                    if (arr[i] == x)

                                                return i;

                        }

 

                        // return -1 if the element is not found

                        return -1;

            }

 
            // Main function
            public static void main(String[] args)

            {

                        // This is the array of elements we want to search in
                        int[] arr = { 3, 4, 1, 7, 5 };

                        // n is the number of elements in the array
                        int n = arr.length;

                        // x is the element we want to search for
                        int x = 4;

                        // Call the search function
                        int index = search(arr, n, x);


                        // Check if the element is found or not
                        if (index == -1)

                          System.out.println("Element is not present in the array");

                        else

                          System.out.println("Element found at position " + index);

            }

}

//------------------------------------------------------------------------------------------------------



