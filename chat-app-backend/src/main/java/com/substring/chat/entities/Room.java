package com.substring.chat.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "rooms")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Room {

    @Id
    private String id;  //Mongodb unique identifier
    private String roomId;

    public List<Message> getMessages() {
        return messages;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }


    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public String getRoomId() {
        return roomId;
    }

    public String getId() {
        return id;
    }

    private List<Message> messages =new ArrayList<>();

}
