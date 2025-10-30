// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class InitializeWafOperationRoleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4EC9EA6C-F80A-5D25-A8F7-***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static InitializeWafOperationRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitializeWafOperationRoleResponseBody self = new InitializeWafOperationRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public InitializeWafOperationRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
