package chess.dto.web;

public class RoomIdDto {
    private final String roomId;

    public RoomIdDto(final String roomId) {
        this.roomId = roomId;
    }

    public String getRoomId() {
        return roomId;
    }
}
