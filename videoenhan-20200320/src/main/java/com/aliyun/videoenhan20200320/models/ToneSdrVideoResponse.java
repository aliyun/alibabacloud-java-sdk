// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class ToneSdrVideoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ToneSdrVideoResponseData data;

    public static ToneSdrVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        ToneSdrVideoResponse self = new ToneSdrVideoResponse();
        return TeaModel.build(map, self);
    }

    public ToneSdrVideoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ToneSdrVideoResponse setData(ToneSdrVideoResponseData data) {
        this.data = data;
        return this;
    }
    public ToneSdrVideoResponseData getData() {
        return this.data;
    }

    public static class ToneSdrVideoResponseData extends TeaModel {
        @NameInMap("VideoURL")
        @Validation(required = true)
        public String videoURL;

        public static ToneSdrVideoResponseData build(java.util.Map<String, ?> map) throws Exception {
            ToneSdrVideoResponseData self = new ToneSdrVideoResponseData();
            return TeaModel.build(map, self);
        }

        public ToneSdrVideoResponseData setVideoURL(String videoURL) {
            this.videoURL = videoURL;
            return this;
        }
        public String getVideoURL() {
            return this.videoURL;
        }

    }

}
