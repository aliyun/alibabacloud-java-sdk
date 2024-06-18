// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class GrantOperatorPermissionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>842B73C8-5776-4BD9-9872-69C8C46DD7D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GrantOperatorPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantOperatorPermissionResponseBody self = new GrantOperatorPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantOperatorPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
