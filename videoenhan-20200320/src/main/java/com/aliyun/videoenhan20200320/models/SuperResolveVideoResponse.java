// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class SuperResolveVideoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SuperResolveVideoResponseData data;

    public static SuperResolveVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        SuperResolveVideoResponse self = new SuperResolveVideoResponse();
        return TeaModel.build(map, self);
    }

    public SuperResolveVideoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SuperResolveVideoResponse setData(SuperResolveVideoResponseData data) {
        this.data = data;
        return this;
    }
    public SuperResolveVideoResponseData getData() {
        return this.data;
    }

    public static class SuperResolveVideoResponseData extends TeaModel {
        @NameInMap("VideoUrl")
        @Validation(required = true)
        public String videoUrl;

        public static SuperResolveVideoResponseData build(java.util.Map<String, ?> map) throws Exception {
            SuperResolveVideoResponseData self = new SuperResolveVideoResponseData();
            return TeaModel.build(map, self);
        }

        public SuperResolveVideoResponseData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
