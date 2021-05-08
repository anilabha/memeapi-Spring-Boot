# memeapi-Spring-Boot

# Response
```JSON
[
    {
        "meme_id": 1,
        "meme_name": "doge meme test 2 db",
        "meme_url": "https://upload.wikimedia.org/wikipedia/en/thumb/5/5f/Original_Doge_meme.jpg/300px-Original_Doge_meme.jpg"
    },
    {
        "meme_id": 2,
        "meme_name": "doge meme test 3 db",
        "meme_url": "https://upload.wikimedia.org/wikipedia/en/thumb/5/5f/Original_Doge_meme.jpg/300px-Original_Doge_meme.jpg"
    }
]
```

# GET All Meme
```url
 https://meme-app-api.herokuapp.com/memeapi/v1/getmeme
```

# POST
```url
  https://meme-app-api.herokuapp.com/memeapi/v1/addmeme
```
Content-Type: application/json
Pass the raw data by the following body structure Given below
```JSON

    {
        "meme_id": 1,
        "meme_name": "doge meme test 2 db",
        "meme_url": "https://upload.wikimedia.org/wikipedia/en/thumb/5/5f/Original_Doge_meme.jpg/300px-Original_Doge_meme.jpg"
    }
  ```
# GETBYID
```url
 https://meme-app-api.herokuapp.com/memeapi/v1/getmeme/{id}
```
