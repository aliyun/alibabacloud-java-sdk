// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageScanAuthorizationResponseBody extends TeaModel {
    @NameInMap("AuthStatus")
    public DescribeImageScanAuthorizationResponseBodyAuthStatus authStatus;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImageScanAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageScanAuthorizationResponseBody self = new DescribeImageScanAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageScanAuthorizationResponseBody setAuthStatus(DescribeImageScanAuthorizationResponseBodyAuthStatus authStatus) {
        this.authStatus = authStatus;
        return this;
    }
    public DescribeImageScanAuthorizationResponseBodyAuthStatus getAuthStatus() {
        return this.authStatus;
    }

    public DescribeImageScanAuthorizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImageScanAuthorizationResponseBodyAuthStatus extends TeaModel {
        @NameInMap("Status")
        public Boolean status;

        public static DescribeImageScanAuthorizationResponseBodyAuthStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageScanAuthorizationResponseBodyAuthStatus self = new DescribeImageScanAuthorizationResponseBodyAuthStatus();
            return TeaModel.build(map, self);
        }

        public DescribeImageScanAuthorizationResponseBodyAuthStatus setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

    }

}
