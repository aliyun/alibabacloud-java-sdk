// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class GenerateVideoCoverResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GenerateVideoCoverResponseData data;

    public static GenerateVideoCoverResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateVideoCoverResponse self = new GenerateVideoCoverResponse();
        return TeaModel.build(map, self);
    }

    public static class GenerateVideoCoverResponseDataOutputs extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        @NameInMap("Confidence")
        @Validation(required = true)
        public Double confidence;

        public static GenerateVideoCoverResponseDataOutputs build(java.util.Map<String, ?> map) throws Exception {
            GenerateVideoCoverResponseDataOutputs self = new GenerateVideoCoverResponseDataOutputs();
            return TeaModel.build(map, self);
        }

    }

    public static class GenerateVideoCoverResponseData extends TeaModel {
        @NameInMap("Outputs")
        @Validation(required = true)
        public java.util.List<GenerateVideoCoverResponseDataOutputs> outputs;

        public static GenerateVideoCoverResponseData build(java.util.Map<String, ?> map) throws Exception {
            GenerateVideoCoverResponseData self = new GenerateVideoCoverResponseData();
            return TeaModel.build(map, self);
        }

    }

}
