// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EnhanceVideoQualityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public EnhanceVideoQualityResponseBodyData data;

    public static EnhanceVideoQualityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnhanceVideoQualityResponseBody self = new EnhanceVideoQualityResponseBody();
        return TeaModel.build(map, self);
    }

    public EnhanceVideoQualityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnhanceVideoQualityResponseBody setData(EnhanceVideoQualityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EnhanceVideoQualityResponseBodyData getData() {
        return this.data;
    }

    public static class EnhanceVideoQualityResponseBodyData extends TeaModel {
        @NameInMap("VideoURL")
        public String videoURL;

        public static EnhanceVideoQualityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EnhanceVideoQualityResponseBodyData self = new EnhanceVideoQualityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EnhanceVideoQualityResponseBodyData setVideoURL(String videoURL) {
            this.videoURL = videoURL;
            return this;
        }
        public String getVideoURL() {
            return this.videoURL;
        }

    }

}
