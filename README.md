# Deloitte-Quiz
Deloitte Coding Assignment for Interview

Write a utility class that encrypts and decrypts names.

 Your utility class should contain a cache of previously encrypted names so that if you encrypt or

decrypt a name, the cache is checked first to see if the name is there. You can implement the

cache any way you would like.

 Encryption algorithm:

o Split the name into two equal parts. if it is an odd number length, then add a # at the

end of the name to make the length even.

 Example: Amin -> “Am” “in”

 Example: Vimal -> “Vim” “al#”

o Reverse the parts and concatenate back into one string

 Example: Amin -> Am in -> inAm

 Example: Vimal -> Vim al# -> al#Vim

o Decryption would reverse this algorithm and remove the ‘#’ symbol if present.

 Encryption method:

o If the non-encrypted name is in the cache, just return the encrypted name

o Otherwise encrypt the name per the encryption algorithm, add to the cache, and return

the encrypted name

 Decryption method:

o If the encrypted name is in the cache, return the non-encrypted name

o Otherwise decrypt the name by reversing the encryption algorithm, add to the cache,

and return the non-encrypted name

You should test your utility class using a variety of names of different length. For example, your output

might look something like this as driven from a main method in the class (as an example):

encrypting Sridhar

adding to cache

result = har#Srid

encrypting Sridhar

Sridhar found in cache

result = har#Srid

encrypting Amin

adding to cache

result = inAm

decrypting inAm

inAm found in cache

result = Amin

decrypting ilAn

adding to cache

result = Anil

decrypting ilAn

ilAn found in cache

result = Anil

Make sure your code is production ready. This should represent some of your best work as will be part

of the basis for selection for an interview.
