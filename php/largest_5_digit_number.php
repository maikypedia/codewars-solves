<?php

function solution(string $s): int {
    
    $intArray = array_map(
        function($value) { return (int)$value; },
        $s
    );    
    sort($intArray);
    $res = "";
    for ($i = 4; $i > -1; $i--) {
        $res .= strval($intArray[$i]);
    }    
    return $res; //intval(res);
}

solution("47264");
?>