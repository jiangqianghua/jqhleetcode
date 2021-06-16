package main

import "fmt"

func main() {
    fmt.Println("Hello, World!")
    nums := []int{3,5,4,7}
    target := 11
    result := towSum(nums, target)
    if result != nil {
        fmt.Println(result[0], result[1])
    } else {
        fmt.Println("not found")
    }
}

func towSum(nums []int, target int) []int{
    hashTable := map[int]int{}
    for i, x := range nums {
        if p, ok := hashTable[target - x]; ok {
            return []int{p, i}
        }
        hashTable[x] = i
    }
    return nil
}