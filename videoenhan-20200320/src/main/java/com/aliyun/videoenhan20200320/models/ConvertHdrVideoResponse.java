// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class ConvertHdrVideoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ConvertHdrVideoResponseData data;

    public static ConvertHdrVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        ConvertHdrVideoResponse self = new ConvertHdrVideoResponse();
        return TeaModel.build(map, self);
    }

    public ConvertHdrVideoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConvertHdrVideoResponse setData(ConvertHdrVideoResponseData data) {
        this.data = data;
        return this;
    }
    public ConvertHdrVideoResponseData getData() {
        return this.data;
    }

    public static class ConvertHdrVideoResponseData extends TeaModel {
        @NameInMap("VideoURL")
        @Validation(required = true)
        public String videoURL;

        public static ConvertHdrVideoResponseData build(java.util.Map<String, ?> map) throws Exception {
            ConvertHdrVideoResponseData self = new ConvertHdrVideoResponseData();
            return TeaModel.build(map, self);
        }

        public ConvertHdrVideoResponseData setVideoURL(String videoURL) {
            this.videoURL = videoURL;
            return this;
        }
        public String getVideoURL() {
            return this.videoURL;
        }

    }

}
