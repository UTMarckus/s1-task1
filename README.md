Условия задач
1) Happy Array
   An array of integers is "sad" while it contains bad elements. Element of an array is bad if the sum of nearest elements is less than its value.

Example:

Sad array: 1, 5, 2, 7, 93, 8, 9, 3

Happy array: 1, 2, 7, 8, 9, 3

5 is bad element: 1 + 2 < 5

93 is bad element: 7 + 8 < 93

Let's make the array happy!

Nota Bene: first and last elements of the array are always happy.

Input: "Sad" array of integers

Output: "Happy" array of integers

2) Bill Counter
   Anna and Brian are sharing a meal at a restaurant and they agree to split the bill equally. Brian wants to order something that Anna is allergic to though, and they agree that Anna won't pay for that item. Brian gets the check and calculates Anna's portion. You must determine if his calculation is correct. For example, assume the bill has the following prices: bill = [2, 4, 6] .Anna declines to eat item k = bill[2] which costs 6. If Brian calculates the bill correctly, Anna will pay (2 + 4)/2 = 3. If he includes the cost of , he will calculate (2 + 4 + 6)/2 = 6. In the second case, he should refund 3 to Anna.

Complete the function. It should print "Bon Appetit" if the bill is fairly split. Otherwise, it should print the amount of money that Brian owes Anna.

Input:

bill: An array of integers representing the cost of each item ordered
k: An integer representing the zero-based index of the item Anna doesn't eat
b: The amount of money that Anna contributed to the bill
Output: If Brian did not overcharge Anna, return "Bon Appetit"; otherwise, return the difference (i.e., b_charged - b_actual) that Brian must refund to Anna. This will always be a String (e.g. "10").

3) String Parser
   Given a string with open-close brackets, which are [], <> or (). Find all the substrings, that are met between the brackets.

Note that substring must be located between first met open and close bracket. As an example, for «(here is) some text)» the input would be «here is», not «(here is) some text)» due the second «)» bracket.

Input: String that might contain the following brackets: [], <>, ()

Output: An Array of Strings. Each element of the array must contain substring between the open-close bracket.

Sample Input:

«It’s <an> [example] (string)»

Sample Output:

[«an», «example», «string»]

Nota Bene: Please, do not forget to handle situation with nested brackets (e.g. «(ipsum [dolor<] amet)>»).

:ok_hand: