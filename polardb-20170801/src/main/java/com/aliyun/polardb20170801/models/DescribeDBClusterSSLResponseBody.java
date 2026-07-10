// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterSSLResponseBody extends TeaModel {
    /**
     * <p>The list of SSL connection information.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeDBClusterSSLResponseBodyItems> items;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C890995A-CF06-4F4D-8DB8-DD26C2******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether automatic SSL certificate rotation is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>Enable</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>Disable</strong>: Disabled.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is supported only for PolarDB for MySQL.</p>
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
         * <p>The cluster endpoint ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pe-************</p>
         */
        @NameInMap("DBEndpointId")
        public String DBEndpointId;

        /**
         * <p>Indicates whether automatic SSL certificate rotation is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>Enable</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>Disable</strong>: Disabled.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is supported only when the database engine is PostgreSQL-compatible or Oracle-syntax-compatible.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("SSLAutoRotate")
        public String SSLAutoRotate;

        /**
         * <p>The SSL connection address.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-************.mysql.polardb.rds.aliyuncs.com</p>
         */
        @NameInMap("SSLConnectionString")
        public String SSLConnectionString;

        /**
         * <p>Indicates whether Secure Sockets Layer (SSL) encryption is enabled. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Shutdown.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("SSLEnabled")
        public String SSLEnabled;

        /**
         * <p>The expiration time of the SSL certificate. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format (UTC).</p>
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

        public DescribeDBClusterSSLResponseBodyItems setSSLAutoRotate(String SSLAutoRotate) {
            this.SSLAutoRotate = SSLAutoRotate;
            return this;
        }
        public String getSSLAutoRotate() {
            return this.SSLAutoRotate;
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
