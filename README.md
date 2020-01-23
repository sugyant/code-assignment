# Code Assignment - by Sugyant Chettri

 BONUS exercise

## Assignment BONUS
1. Can you add a second language (if you know a language other than English) Use the rooster as a PoC for demonstrating this. For example, this is how the Rooster sounds differently depending on language. Please add the rooster sound in your native
tongue.

```
• Danish: kykyliky
• Dutch: kukeleku
• Finnish: kukko kiekuu
• French: cocorico
• German: kikeriki
• Greek: kikiriki
• Hebrew: coo-koo-ri-koo
• Hungarian: kukuriku
• Italian: chicchirichi
• Japanese: ko-ke-kok-ko-o
• Portuguese: cucurucu
• Russian: kukareku
• Swedish: kuckeliku
• Turkish: kuk-kurri-kuuu
• Urdu: kuklooku

```
```diff
Please run AnswerExecutable.java to see the output.

```
2. Can you design a RESTful API for querying these animals?


```diff
Designing RESTFUL WEBSERVICE :

First, a REST resource to GET a list of Animals:
http://www.xxx.com/animals
Next, a REST resource to GET details of Animal with name (Example:Rooster):
http://www.xxx.com/animals/rooster

Representations :
Here is an XML respresentation of a response—GET animal from "name"
<animalfactory>
<type>birdfactory</type>
<name>rooster</name>
<swim>I cannot swim</swim>
<walk>I am walking</walk>
<sing>Cluck, cluck</sing>
<fly>I cannot fly</fly>
</animalfactory>


```


 ## Running the tests

Run the Test Class - com.java.sugyant.Test.java
to see output answers Run --> AnswerExecutable.java


