#!/bin/bash
#bash program for lab1 java part
today = date +"%m-%d-%Y"
lab2 = $(date +%d) -$(date -d '10/26/2022'+%d)
lab3 = $(date +%d) -$(date -d '11/23/2022'+%d)
lab4 = $(date -d '12/07/2022'+%d) - $(date +%d)
quiz3 = $(date -d '10/26/2022'+%d)-$(date +%d)
quiz4 = $(date -d '11/16/2022'+%d)-$(date +%d)
quiz5 = $(date -d '12/07/2022'+%d)-$(date +%d)
final = $(date -d 20221219)-$(date +%d)
echo "days till lab2 is due: " $lab2
echo "days till lab3 is due: " $lab3
echo "days till lab4 is due: " $lab4
echo "idays till quiz3 is due: " $quiz3
echo "days till quiz4 is due: " $quiz4
echo "days till quiz5 is due: " $quiz5
echo "days tll final: " $final
echo "current date is "$date
