// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHostWebShellResponseBody extends TeaModel {
    /**
     * <p>The webshell URL.</p>
     */
    @NameInMap("LoginUrl")
    public String loginUrl;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHostWebShellResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHostWebShellResponseBody self = new DescribeHostWebShellResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHostWebShellResponseBody setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
        return this;
    }
    public String getLoginUrl() {
        return this.loginUrl;
    }

    public DescribeHostWebShellResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
