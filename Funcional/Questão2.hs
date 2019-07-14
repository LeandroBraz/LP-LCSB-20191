stringToList :: String -> [String]
stringToList []  = []
stringToList xxs@(x:xs)  | x == ' ' = stringToList xs
                    | otherwise = ys : stringToList rest
                      where (ys, rest) = break (== ' ') xxs

reverteList :: [a] -> [a]  
reverteList [] = []  
reverteList (x:xs) = reverteList xs ++ [x]

listToString :: [String] -> String
listToString [] = ""
listToString (x:xs) | xs == [] = x
                    | otherwise = x ++ " " ++ listToString xs

inverterTexto :: String -> String
inverterTexto x = listToString . reverteList . stringToList $ x

main = do
  print(inverterTexto "la vou eu")