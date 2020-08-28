// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class SuperResolveVideoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SuperResolveVideoResponseData data;

    public static SuperResolveVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        SuperResolveVideoResponse self = new SuperResolveVideoResponse();
        return TeaModel.build(map, self);
    }

    public static class SuperResolveVideoResponseData extends TeaModel {
        @NameInMap("VideoUrl")
        @Validation(required = true)
        public String videoUrl;

        public static SuperResolveVideoResponseData build(java.util.Map<String, ?> map) throws Exception {
            SuperResolveVideoResponseData self = new SuperResolveVideoResponseData();
            return TeaModel.build(map, self);
        }

    }

}
