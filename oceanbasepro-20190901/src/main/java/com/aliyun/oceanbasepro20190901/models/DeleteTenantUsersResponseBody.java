// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteTenantUsersResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTenantUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTenantUsersResponseBody self = new DeleteTenantUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTenantUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
