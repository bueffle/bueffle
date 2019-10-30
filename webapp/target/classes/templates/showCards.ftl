<!DOCTYPE html>
<html>
    <head>
        <title>Cities</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        </head>
    <body>
        <h2>List of cards</h2>

        <table>
            <tr>
                <th>Id</th>
                <th>Question</th>
                <th>Answer</th>
            </tr>

            <#list cards as card>
                <tr>
                    <td>${card.id}</td>
                    <td>${card.question}</td>
                    <td>${card.answer}</td>
                </tr>
            </#list>
        </table>
    </body>
</html>