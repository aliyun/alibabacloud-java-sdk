// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class ConvertHdrVideoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ConvertHdrVideoResponseBodyData data;

    public static ConvertHdrVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConvertHdrVideoResponseBody self = new ConvertHdrVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public ConvertHdrVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConvertHdrVideoResponseBody setData(ConvertHdrVideoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ConvertHdrVideoResponseBodyData getData() {
        return this.data;
    }

    public static class ConvertHdrVideoResponseBodyData extends TeaModel {
        @NameInMap("VideoURL")
        public String videoURL;

        public static ConvertHdrVideoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ConvertHdrVideoResponseBodyData self = new ConvertHdrVideoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ConvertHdrVideoResponseBodyData setVideoURL(String videoURL) {
            this.videoURL = videoURL;
            return this;
        }
        public String getVideoURL() {
            return this.videoURL;
        }

    }

}
