<?php

function comp($a1, $a2) {

    for ($i = 0; $i < count($a1); $i++) {

        for ($j = 0; $j < count($a1); $j++) {

            if ($a2[$i] == pow($a[$j], 2)) {

                $x++;
            }
        }
    }

    if ($x == count($a2)) { 
        return true;
    } else {
         return false;
    }
}
$x = 0;

$a = [121, 144, 19, 161, 19, 144, 19, 11]; 

for ($i = 0; $i < count($a); $i++){
    echo "" . $a[$i];
}

?>
