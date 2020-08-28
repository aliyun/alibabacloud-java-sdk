// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AdjustVideoColorResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public AdjustVideoColorResponseData data;

    public static AdjustVideoColorResponse build(java.util.Map<String, ?> map) throws Exception {
        AdjustVideoColorResponse self = new AdjustVideoColorResponse();
        return TeaModel.build(map, self);
    }

    public static class AdjustVideoColorResponseData extends TeaModel {
        @NameInMap("VideoUrl")
        @Validation(required = true)
        public String videoUrl;

        public static AdjustVideoColorResponseData build(java.util.Map<String, ?> map) throws Exception {
            AdjustVideoColorResponseData self = new AdjustVideoColorResponseData();
            return TeaModel.build(map, self);
        }

    }

}
