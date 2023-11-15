// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class UpdateProduceResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static UpdateProduceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProduceResponseBody self = new UpdateProduceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProduceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
