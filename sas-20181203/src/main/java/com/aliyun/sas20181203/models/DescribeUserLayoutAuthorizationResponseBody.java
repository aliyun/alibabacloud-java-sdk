// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUserLayoutAuthorizationResponseBody extends TeaModel {
    // The result of the query. Valid values:
    // - **true**: The brute-force attacks protection feature has been authorized.
    // - **false**: The brute-force attacks protection feature is not authorized.
    @NameInMap("Authorized")
    public Boolean authorized;

    // The ID of the request.
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
