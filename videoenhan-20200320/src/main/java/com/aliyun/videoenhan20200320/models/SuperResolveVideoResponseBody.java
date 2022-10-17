// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class SuperResolveVideoResponseBody extends TeaModel {
    @NameInMap("Data")
    public SuperResolveVideoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SuperResolveVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SuperResolveVideoResponseBody self = new SuperResolveVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public SuperResolveVideoResponseBody setData(SuperResolveVideoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SuperResolveVideoResponseBodyData getData() {
        return this.data;
    }

    public SuperResolveVideoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SuperResolveVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SuperResolveVideoResponseBodyData extends TeaModel {
        @NameInMap("VideoUrl")
        public String videoUrl;

        public static SuperResolveVideoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SuperResolveVideoResponseBodyData self = new SuperResolveVideoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SuperResolveVideoResponseBodyData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
