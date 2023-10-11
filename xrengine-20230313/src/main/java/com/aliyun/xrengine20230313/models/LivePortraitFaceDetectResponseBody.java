// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class LivePortraitFaceDetectResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public LivePortraitFaceDetectResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static LivePortraitFaceDetectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LivePortraitFaceDetectResponseBody self = new LivePortraitFaceDetectResponseBody();
        return TeaModel.build(map, self);
    }

    public LivePortraitFaceDetectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public LivePortraitFaceDetectResponseBody setData(LivePortraitFaceDetectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public LivePortraitFaceDetectResponseBodyData getData() {
        return this.data;
    }

    public LivePortraitFaceDetectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LivePortraitFaceDetectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LivePortraitFaceDetectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class LivePortraitFaceDetectResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("Message")
        public String message;

        public static LivePortraitFaceDetectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            LivePortraitFaceDetectResponseBodyData self = new LivePortraitFaceDetectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public LivePortraitFaceDetectResponseBodyData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public LivePortraitFaceDetectResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
