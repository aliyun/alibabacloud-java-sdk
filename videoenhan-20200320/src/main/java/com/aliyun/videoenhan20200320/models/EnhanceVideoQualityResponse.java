// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EnhanceVideoQualityResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public EnhanceVideoQualityResponseData data;

    public static EnhanceVideoQualityResponse build(java.util.Map<String, ?> map) throws Exception {
        EnhanceVideoQualityResponse self = new EnhanceVideoQualityResponse();
        return TeaModel.build(map, self);
    }

    public EnhanceVideoQualityResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnhanceVideoQualityResponse setData(EnhanceVideoQualityResponseData data) {
        this.data = data;
        return this;
    }
    public EnhanceVideoQualityResponseData getData() {
        return this.data;
    }

    public static class EnhanceVideoQualityResponseData extends TeaModel {
        @NameInMap("VideoURL")
        @Validation(required = true)
        public String videoURL;

        public static EnhanceVideoQualityResponseData build(java.util.Map<String, ?> map) throws Exception {
            EnhanceVideoQualityResponseData self = new EnhanceVideoQualityResponseData();
            return TeaModel.build(map, self);
        }

        public EnhanceVideoQualityResponseData setVideoURL(String videoURL) {
            this.videoURL = videoURL;
            return this;
        }
        public String getVideoURL() {
            return this.videoURL;
        }

    }

}
