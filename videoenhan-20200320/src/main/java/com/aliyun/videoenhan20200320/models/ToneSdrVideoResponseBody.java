// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class ToneSdrVideoResponseBody extends TeaModel {
    @NameInMap("Data")
    public ToneSdrVideoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>89B5AFF1-8A64-4F76-B391-56AD7D22DE35</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-vd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/sdr-color-enhance/20-12-22/SxBKgwBhlObusG20_20-12-22-07-59-45.mp4?Expires=1608625795&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=maoOZ52y7U9ZuL2KqI0IfGq8%2FR">http://vibktprfx-prod-prod-aic-vd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/sdr-color-enhance/20-12-22/SxBKgwBhlObusG20_20-12-22-07-59-45.mp4?Expires=1608625795&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=maoOZ52y7U9ZuL2KqI0IfGq8%2FR</a>****</p>
         */
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
