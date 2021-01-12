// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteParameterGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteParameterGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteParameterGroupResponseBody self = new DeleteParameterGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteParameterGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
