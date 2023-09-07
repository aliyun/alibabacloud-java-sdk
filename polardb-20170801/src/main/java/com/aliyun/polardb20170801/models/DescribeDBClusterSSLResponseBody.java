// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterSSLResponseBody extends TeaModel {
    /**
     * <p>The list of SSL connections.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeDBClusterSSLResponseBodyItems> items;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether automatic rotation of SSL certificates is enabled. Valid values:</p>
     * <br>
     * <p>*   **Enable**: The feature is enabled.</p>
     * <p>*   **Disable**: The feature is disabled.</p>
     * <br>
     * <p>> This parameter is valid only for a PolarDB for MySQL cluster.</p>
     */
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
        /**
         * <p>The ID of the endpoint.</p>
         */
        @NameInMap("DBEndpointId")
        public String DBEndpointId;

        /**
         * <p>The SSL connection string.</p>
         */
        @NameInMap("SSLConnectionString")
        public String SSLConnectionString;

        /**
         * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
         * <br>
         * <p>*   **Enabled**: SSL is enabled.</p>
         * <p>*   **Disable**: SSL is disabled.</p>
         */
        @NameInMap("SSLEnabled")
        public String SSLEnabled;

        /**
         * <p>The time when the server certificate expires. The time is in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.</p>
         */
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
