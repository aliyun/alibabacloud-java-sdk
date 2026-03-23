// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstanceVncUrlResponseBody extends TeaModel {
    @NameInMap("LoginUrl")
    public String loginUrl;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRCInstanceVncUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCInstanceVncUrlResponseBody self = new DescribeRCInstanceVncUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCInstanceVncUrlResponseBody setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
        return this;
    }
    public String getLoginUrl() {
        return this.loginUrl;
    }

    public DescribeRCInstanceVncUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
