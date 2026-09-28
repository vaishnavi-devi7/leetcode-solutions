# Write your MySQL query statement below
SELECT w2.id
FROM Weather w2
JOIN Weather w3 
  ON DATEDIFF(w2.recordDate, w3.recordDate) = 1
WHERE w2.temperature > w3.temperature;