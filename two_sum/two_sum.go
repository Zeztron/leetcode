func twoSum(nums []int, target int) []int {
	m := make(map[int]int)
	for i, num := range nums {
		complement := target - num
		index, found := m[complement]
		if found {
			return []int{i, index}
		}

		m[num] = i
	}

	return make([]int, 0)
}