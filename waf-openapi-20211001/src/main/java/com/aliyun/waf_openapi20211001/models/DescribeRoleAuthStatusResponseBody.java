// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRoleAuthStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AuthStatus")
    public Boolean authStatus;

    /**
     * <strong>example:</strong>
     * <p>79ECBB08-079C-57C5-A676-***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRoleAuthStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoleAuthStatusResponseBody self = new DescribeRoleAuthStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRoleAuthStatusResponseBody setAuthStatus(Boolean authStatus) {
        this.authStatus = authStatus;
        return this;
    }
    public Boolean getAuthStatus() {
        return this.authStatus;
    }

    public DescribeRoleAuthStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
