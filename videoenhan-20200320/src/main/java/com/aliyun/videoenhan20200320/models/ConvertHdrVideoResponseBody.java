// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class ConvertHdrVideoResponseBody extends TeaModel {
    @NameInMap("Data")
    public ConvertHdrVideoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>E0CF495F-E806-4B9C-B204-E1230608239D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConvertHdrVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConvertHdrVideoResponseBody self = new ConvertHdrVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public ConvertHdrVideoResponseBody setData(ConvertHdrVideoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ConvertHdrVideoResponseBodyData getData() {
        return this.data;
    }

    public ConvertHdrVideoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ConvertHdrVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ConvertHdrVideoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-vd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/hdr-enhance/20-12-22/HaKDdTI48i2GQGy7_20-12-22-06-42-45.mp4?Expires=1608621178&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=SWc90T0JHg5eWc64x8GmYHKsvX">http://vibktprfx-prod-prod-aic-vd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/hdr-enhance/20-12-22/HaKDdTI48i2GQGy7_20-12-22-06-42-45.mp4?Expires=1608621178&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=SWc90T0JHg5eWc64x8GmYHKsvX</a>****</p>
         */
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
