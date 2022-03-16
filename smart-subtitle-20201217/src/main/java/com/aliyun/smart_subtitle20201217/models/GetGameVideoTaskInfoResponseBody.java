// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smart_subtitle20201217.models;

import com.aliyun.tea.*;

public class GetGameVideoTaskInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetGameVideoTaskInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessResponse")
    public Boolean successResponse;

    public static GetGameVideoTaskInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGameVideoTaskInfoResponseBody self = new GetGameVideoTaskInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGameVideoTaskInfoResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetGameVideoTaskInfoResponseBody setData(GetGameVideoTaskInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGameVideoTaskInfoResponseBodyData getData() {
        return this.data;
    }

    public GetGameVideoTaskInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGameVideoTaskInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGameVideoTaskInfoResponseBody setSuccessResponse(Boolean successResponse) {
        this.successResponse = successResponse;
        return this;
    }
    public Boolean getSuccessResponse() {
        return this.successResponse;
    }

    public static class GetGameVideoTaskInfoResponseBodyData extends TeaModel {
        @NameInMap("CustomVideoId")
        public String customVideoId;

        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("TaskId")
        public Long taskId;

        @NameInMap("UID")
        public String UID;

        @NameInMap("VideoList")
        public String videoList;

        @NameInMap("VideoTemplate")
        public String videoTemplate;

        @NameInMap("VideoType")
        public Long videoType;

        public static GetGameVideoTaskInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGameVideoTaskInfoResponseBodyData self = new GetGameVideoTaskInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGameVideoTaskInfoResponseBodyData setCustomVideoId(String customVideoId) {
            this.customVideoId = customVideoId;
            return this;
        }
        public String getCustomVideoId() {
            return this.customVideoId;
        }

        public GetGameVideoTaskInfoResponseBodyData setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public GetGameVideoTaskInfoResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public GetGameVideoTaskInfoResponseBodyData setUID(String UID) {
            this.UID = UID;
            return this;
        }
        public String getUID() {
            return this.UID;
        }

        public GetGameVideoTaskInfoResponseBodyData setVideoList(String videoList) {
            this.videoList = videoList;
            return this;
        }
        public String getVideoList() {
            return this.videoList;
        }

        public GetGameVideoTaskInfoResponseBodyData setVideoTemplate(String videoTemplate) {
            this.videoTemplate = videoTemplate;
            return this;
        }
        public String getVideoTemplate() {
            return this.videoTemplate;
        }

        public GetGameVideoTaskInfoResponseBodyData setVideoType(Long videoType) {
            this.videoType = videoType;
            return this;
        }
        public Long getVideoType() {
            return this.videoType;
        }

    }

}
