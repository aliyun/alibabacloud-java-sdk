// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class DeleteAgentStorageResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E734979F-5A44-5993-9CE5-C23103576923</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAgentStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentStorageResponseBody self = new DeleteAgentStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAgentStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
