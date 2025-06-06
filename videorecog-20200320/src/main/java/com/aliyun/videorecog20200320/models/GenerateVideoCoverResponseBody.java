// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class GenerateVideoCoverResponseBody extends TeaModel {
    @NameInMap("Data")
    public GenerateVideoCoverResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>5B95B724-C5B9-4F77-A743-0CA4EA95CC82</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateVideoCoverResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateVideoCoverResponseBody self = new GenerateVideoCoverResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateVideoCoverResponseBody setData(GenerateVideoCoverResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateVideoCoverResponseBodyData getData() {
        return this.data;
    }

    public GenerateVideoCoverResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateVideoCoverResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateVideoCoverResponseBodyDataOutputs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>6.1819260887924425</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <strong>example:</strong>
         * <p><a href="http://algo-app-aic-vd-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/video-cover/2020-05-11-07/pic_lOyxGGAqQYSANGxP.mp4_202_544_960_c9f88b2a5f75e17c093d1a65f5edff4d_beautified.png?Expires=1589185385&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=PAalKsfeZC4UQzYDTU%2F3D1G7Xt">http://algo-app-aic-vd-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/video-cover/2020-05-11-07/pic_lOyxGGAqQYSANGxP.mp4_202_544_960_c9f88b2a5f75e17c093d1a65f5edff4d_beautified.png?Expires=1589185385&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=PAalKsfeZC4UQzYDTU%2F3D1G7Xt</a>****</p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        public static GenerateVideoCoverResponseBodyDataOutputs build(java.util.Map<String, ?> map) throws Exception {
            GenerateVideoCoverResponseBodyDataOutputs self = new GenerateVideoCoverResponseBodyDataOutputs();
            return TeaModel.build(map, self);
        }

        public GenerateVideoCoverResponseBodyDataOutputs setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public GenerateVideoCoverResponseBodyDataOutputs setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

    public static class GenerateVideoCoverResponseBodyData extends TeaModel {
        @NameInMap("Outputs")
        public java.util.List<GenerateVideoCoverResponseBodyDataOutputs> outputs;

        public static GenerateVideoCoverResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateVideoCoverResponseBodyData self = new GenerateVideoCoverResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateVideoCoverResponseBodyData setOutputs(java.util.List<GenerateVideoCoverResponseBodyDataOutputs> outputs) {
            this.outputs = outputs;
            return this;
        }
        public java.util.List<GenerateVideoCoverResponseBodyDataOutputs> getOutputs() {
            return this.outputs;
        }

    }

}
