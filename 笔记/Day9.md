## Day9

Redis Day3

KEYS pattern 不建议

DEL key [key ...] 删除一个指定的key 返回删除成功的数量

EXISTS key [key ...] 判断key是否存在

EXPIRE key seconds 给key设置有效期，到期后key会被自动删除

TTL 查看剩余有效期 -1代表永久有效 最好都设置有效期