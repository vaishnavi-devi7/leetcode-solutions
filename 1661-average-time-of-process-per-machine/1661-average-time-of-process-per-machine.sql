# Write your MySQL query statement below
SELECT 
    start_act.machine_id, 
    ROUND(AVG(end_act.timestamp - start_act.timestamp), 3) AS processing_time
FROM Activity start_act
JOIN Activity end_act 
    ON start_act.machine_id = end_act.machine_id 
    AND start_act.process_id = end_act.process_id 
    AND start_act.activity_type = 'start' 
    AND end_act.activity_type = 'end'
GROUP BY start_act.machine_id;