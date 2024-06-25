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
     * 
     * <strong>example:</strong>
     * <p>C890995A-CF06-4F4D-8DB8-DD26C2******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether automatic rotation of SSL certificates is enabled. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong>: The feature is enabled.</li>
     * <li><strong>Disable</strong>: The feature is disabled.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is valid only for a PolarDB for MySQL cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
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
         * 
         * <strong>example:</strong>
         * <p>pe-************</p>
         */
        @NameInMap("DBEndpointId")
        public String DBEndpointId;

        /**
         * <p>The SSL connection string.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-************.mysql.polardb.rds.aliyuncs.com</p>
         */
        @NameInMap("SSLConnectionString")
        public String SSLConnectionString;

        /**
         * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: SSL is enabled.</li>
         * <li><strong>Disable</strong>: SSL is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("SSLEnabled")
        public String SSLEnabled;

        /**
         * <p>The time when the server certificate expires. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-13T07:14:22Z</p>
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
