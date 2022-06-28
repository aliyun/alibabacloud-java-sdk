// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class GenerateVideoCoverResponseBody extends TeaModel {
    @NameInMap("Data")
    public GenerateVideoCoverResponseBodyData data;

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

    public GenerateVideoCoverResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateVideoCoverResponseBodyDataOutputs extends TeaModel {
        @NameInMap("Confidence")
        public Float confidence;

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
