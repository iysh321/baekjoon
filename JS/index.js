//* readFileSync 제출용
// 0
// /dev/stdin

//* readFileSync 풀이용
// example.txt

//* 여러줄 일때
//! 아래 두줄 코드는 시간이 오래걸림 (반복문 여러번 사용)
// .split("\n").map((line) => line.split(" "));
// .split("\n").map((line) => line.split(" ").map(Number));

console.log("----------------------------------------------------------------");

const filePath = process.platform === "linux" ? "/dev/stdin" : "./example.txt";
const input = require("fs")
  .readFileSync(filePath)
  .toString()
  .trim()
  .split("\n")
  .map((line) => line.split(" ").map(Number));

let max = 0;
let idx = [];

for (let i = 0; i < 9; i++) {
  for (let j = 0; j < 9; j++) {
    if (input[i][j] >= max) {
      max = input[i][j];
      idx = [i + 1, j + 1];
    }
  }
}
console.log(max);
console.log(idx.join(" "));

console.log("input-----------------------------------------------------------");
console.log(input);
