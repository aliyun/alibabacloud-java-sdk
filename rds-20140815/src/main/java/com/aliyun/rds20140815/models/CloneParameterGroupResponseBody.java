// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CloneParameterGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CloneParameterGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloneParameterGroupResponseBody self = new CloneParameterGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CloneParameterGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
