// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EraseVideoLogoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public EraseVideoLogoResponseData data;

    public static EraseVideoLogoResponse build(java.util.Map<String, ?> map) throws Exception {
        EraseVideoLogoResponse self = new EraseVideoLogoResponse();
        return TeaModel.build(map, self);
    }

    public EraseVideoLogoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EraseVideoLogoResponse setData(EraseVideoLogoResponseData data) {
        this.data = data;
        return this;
    }
    public EraseVideoLogoResponseData getData() {
        return this.data;
    }

    public static class EraseVideoLogoResponseData extends TeaModel {
        @NameInMap("VideoUrl")
        @Validation(required = true)
        public String videoUrl;

        public static EraseVideoLogoResponseData build(java.util.Map<String, ?> map) throws Exception {
            EraseVideoLogoResponseData self = new EraseVideoLogoResponseData();
            return TeaModel.build(map, self);
        }

        public EraseVideoLogoResponseData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
