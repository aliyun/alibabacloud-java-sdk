// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetModelProgressResponseBody extends TeaModel {
    @NameInMap("requestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("result")
    @Validation(required = true)
    public GetModelProgressResponseBodyResult result;

    public static GetModelProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModelProgressResponseBody self = new GetModelProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public static class GetModelProgressResponseBodyResult extends TeaModel {
        @NameInMap("progress")
        @Validation(required = true)
        public Integer progress;

        @NameInMap("status")
        @Validation(required = true)
        public String status;

        public static GetModelProgressResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetModelProgressResponseBodyResult self = new GetModelProgressResponseBodyResult();
            return TeaModel.build(map, self);
        }

    }

}
