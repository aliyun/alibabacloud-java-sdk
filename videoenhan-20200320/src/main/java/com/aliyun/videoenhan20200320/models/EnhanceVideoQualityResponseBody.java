// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EnhanceVideoQualityResponseBody extends TeaModel {
    @NameInMap("Data")
    public EnhanceVideoQualityResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>881F39DC-C107-4817-A6D5-000BE833CC2A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnhanceVideoQualityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnhanceVideoQualityResponseBody self = new EnhanceVideoQualityResponseBody();
        return TeaModel.build(map, self);
    }

    public EnhanceVideoQualityResponseBody setData(EnhanceVideoQualityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EnhanceVideoQualityResponseBodyData getData() {
        return this.data;
    }

    public EnhanceVideoQualityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnhanceVideoQualityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class EnhanceVideoQualityResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-vd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/uhd-enhance/20-11-20/Wwzf9z75GO5XdisS_20-11-20-07-13-48.mp4?Expires=1605858272&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=vvY0D%2Bl5eEzp%2BD7mPOWz0zMU7v">http://vibktprfx-prod-prod-aic-vd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/uhd-enhance/20-11-20/Wwzf9z75GO5XdisS_20-11-20-07-13-48.mp4?Expires=1605858272&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=vvY0D%2Bl5eEzp%2BD7mPOWz0zMU7v</a>****</p>
         */
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
