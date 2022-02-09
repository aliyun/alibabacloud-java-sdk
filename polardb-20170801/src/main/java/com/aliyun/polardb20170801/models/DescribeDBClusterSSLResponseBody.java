// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterSSLResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeDBClusterSSLResponseBodyItems> items;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SSLAutoRotate")
    public String SSLAutoRotate;

    public static DescribeDBClusterSSLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterSSLResponseBody self = new DescribeDBClusterSSLResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterSSLResponseBody setItems(java.util.List<DescribeDBClusterSSLResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDBClusterSSLResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeDBClusterSSLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterSSLResponseBody setSSLAutoRotate(String SSLAutoRotate) {
        this.SSLAutoRotate = SSLAutoRotate;
        return this;
    }
    public String getSSLAutoRotate() {
        return this.SSLAutoRotate;
    }

    public static class DescribeDBClusterSSLResponseBodyItems extends TeaModel {
        @NameInMap("DBEndpointId")
        public String DBEndpointId;

        @NameInMap("SSLConnectionString")
        public String SSLConnectionString;

        @NameInMap("SSLEnabled")
        public String SSLEnabled;

        @NameInMap("SSLExpireTime")
        public String SSLExpireTime;

        public static DescribeDBClusterSSLResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterSSLResponseBodyItems self = new DescribeDBClusterSSLResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterSSLResponseBodyItems setDBEndpointId(String DBEndpointId) {
            this.DBEndpointId = DBEndpointId;
            return this;
        }
        public String getDBEndpointId() {
            return this.DBEndpointId;
        }

        public DescribeDBClusterSSLResponseBodyItems setSSLConnectionString(String SSLConnectionString) {
            this.SSLConnectionString = SSLConnectionString;
            return this;
        }
        public String getSSLConnectionString() {
            return this.SSLConnectionString;
        }

        public DescribeDBClusterSSLResponseBodyItems setSSLEnabled(String SSLEnabled) {
            this.SSLEnabled = SSLEnabled;
            return this;
        }
        public String getSSLEnabled() {
            return this.SSLEnabled;
        }

        public DescribeDBClusterSSLResponseBodyItems setSSLExpireTime(String SSLExpireTime) {
            this.SSLExpireTime = SSLExpireTime;
            return this;
        }
        public String getSSLExpireTime() {
            return this.SSLExpireTime;
        }

    }

}
