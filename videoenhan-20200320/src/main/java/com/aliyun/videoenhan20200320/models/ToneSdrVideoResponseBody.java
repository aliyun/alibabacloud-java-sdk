// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class ToneSdrVideoResponseBody extends TeaModel {
    @NameInMap("Data")
    public ToneSdrVideoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ToneSdrVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ToneSdrVideoResponseBody self = new ToneSdrVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public ToneSdrVideoResponseBody setData(ToneSdrVideoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ToneSdrVideoResponseBodyData getData() {
        return this.data;
    }

    public ToneSdrVideoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ToneSdrVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ToneSdrVideoResponseBodyData extends TeaModel {
        @NameInMap("VideoURL")
        public String videoURL;

        public static ToneSdrVideoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ToneSdrVideoResponseBodyData self = new ToneSdrVideoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ToneSdrVideoResponseBodyData setVideoURL(String videoURL) {
            this.videoURL = videoURL;
            return this;
        }
        public String getVideoURL() {
            return this.videoURL;
        }

    }

}
