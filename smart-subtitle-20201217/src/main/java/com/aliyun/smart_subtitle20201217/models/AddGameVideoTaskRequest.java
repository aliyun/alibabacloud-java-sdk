// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smart_subtitle20201217.models;

import com.aliyun.tea.*;

public class AddGameVideoTaskRequest extends TeaModel {
    @NameInMap("CustomVideoId")
    public String customVideoId;

    @NameInMap("RoomId")
    public String roomId;

    @NameInMap("UID")
    public String UID;

    @NameInMap("VideoList")
    public String videoList;

    @NameInMap("VideoTemplate")
    public String videoTemplate;

    @NameInMap("VideoType")
    public Long videoType;

    public static AddGameVideoTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGameVideoTaskRequest self = new AddGameVideoTaskRequest();
        return TeaModel.build(map, self);
    }

    public AddGameVideoTaskRequest setCustomVideoId(String customVideoId) {
        this.customVideoId = customVideoId;
        return this;
    }
    public String getCustomVideoId() {
        return this.customVideoId;
    }

    public AddGameVideoTaskRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public AddGameVideoTaskRequest setUID(String UID) {
        this.UID = UID;
        return this;
    }
    public String getUID() {
        return this.UID;
    }

    public AddGameVideoTaskRequest setVideoList(String videoList) {
        this.videoList = videoList;
        return this;
    }
    public String getVideoList() {
        return this.videoList;
    }

    public AddGameVideoTaskRequest setVideoTemplate(String videoTemplate) {
        this.videoTemplate = videoTemplate;
        return this;
    }
    public String getVideoTemplate() {
        return this.videoTemplate;
    }

    public AddGameVideoTaskRequest setVideoType(Long videoType) {
        this.videoType = videoType;
        return this;
    }
    public Long getVideoType() {
        return this.videoType;
    }

}
