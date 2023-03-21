// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUserLayoutAuthorizationResponseBody extends TeaModel {
    @NameInMap("Authorized")
    public Boolean authorized;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserLayoutAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserLayoutAuthorizationResponseBody self = new DescribeUserLayoutAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserLayoutAuthorizationResponseBody setAuthorized(Boolean authorized) {
        this.authorized = authorized;
        return this;
    }
    public Boolean getAuthorized() {
        return this.authorized;
    }

    public DescribeUserLayoutAuthorizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
