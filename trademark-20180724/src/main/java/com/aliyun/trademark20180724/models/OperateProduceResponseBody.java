// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class OperateProduceResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static OperateProduceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateProduceResponseBody self = new OperateProduceResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateProduceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
