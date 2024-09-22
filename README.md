# Notification
## send-payment api requiest
### post
```
http://localhost:8080/api/notifications/send-payment
```
### postman input
```
{
"sender": "System",
"receiver": "user@example.com",
"message": "Your payment of $100 has been received.",
"subject": "Payment Received"
}
```
### postman output
```
{
    "id": "66f06eaaa4537b035443d738",
    "sender": "System",
    "receiver": "user@example.com",
    "status": "SENT",
    "message": "Your payment of $100 has been received.",
    "subject": "Payment Received",
    "type": "PAYMENT",
    "createdAt": "2024-09-23T00:53:22.2195226"
}
```
## broadcast api requiest
### post
```
http://localhost:8080/api/notifications/broadcast
```
### Input postman data
```
{
"message": "We have an important system update.",
"subject": "System Update Notification"
}
```
### output postman data
```
{
    "id": "66f0764b271b0348758c8a42",
    "sender": "System",
    "receiver": "All Users",
    "status": "SENT",
    "message": "We have an important system update.",
    "subject": "System Update Notification",
    "type": "BROADCAST",
    "createdAt": "2024-09-23T01:25:55.6204563"
}
```
## get-All notification data
### get
```
http://localhost:8080/api/notifications/all
```
### output postman data
```
[
    {
        "id": "66f06eaaa4537b035443d738",
        "sender": "System",
        "receiver": "user@example.com",
        "status": "SENT",
        "message": "Your payment of $100 has been received.",
        "subject": "Payment Received",
        "type": "PAYMENT",
        "createdAt": "2024-09-23T00:53:22.219"
    },
    {
        "id": "66f0764b271b0348758c8a42",
        "sender": "System",
        "receiver": "All Users",
        "status": "SENT",
        "message": "We have an important system update.",
        "subject": "System Update Notification",
        "type": "BROADCAST",
        "createdAt": "2024-09-23T01:25:55.62"
    }
]
```
