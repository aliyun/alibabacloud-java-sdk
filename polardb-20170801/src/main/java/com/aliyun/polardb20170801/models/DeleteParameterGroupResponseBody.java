// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteParameterGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4F7195E7-5F74-479D-AF59-1B4BF9******</p>
     */
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
