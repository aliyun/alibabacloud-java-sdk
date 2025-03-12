// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceSSLResponseBody extends TeaModel {
    /**
     * <p>The SSL setting of the OceanBase cluster instance.</p>
     */
    @NameInMap("InstanceSSL")
    public DescribeInstanceSSLResponseBodyInstanceSSL instanceSSL;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-xxxx-xxxx-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceSSLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSSLResponseBody self = new DescribeInstanceSSLResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSSLResponseBody setInstanceSSL(DescribeInstanceSSLResponseBodyInstanceSSL instanceSSL) {
        this.instanceSSL = instanceSSL;
        return this;
    }
    public DescribeInstanceSSLResponseBodyInstanceSSL getInstanceSSL() {
        return this.instanceSSL;
    }

    public DescribeInstanceSSLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceSSLResponseBodyInstanceSSL extends TeaModel {
        /**
         * <p>The status of automatic update of SSL certificates. Valid values: </p>
         * <ul>
         * <li>CLOSE: The automatic update of SSL certificates is disabled. </li>
         * <li>OPEN: The automatic update of SSL certificates is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OPEN</p>
         */
        @NameInMap("AutoUpdate")
        public String autoUpdate;

        /**
         * <p>The URL of the certificate authority (CA) node.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxx">https://xxxx</a></p>
         */
        @NameInMap("CaUrl")
        public String caUrl;

        /**
         * <p>The operation to modify the SSL status. Valid values:</p>
         * <ul>
         * <li><p>open: Enable SSL encryption.</p>
         * </li>
         * <li><p>update: Update the CA certificate.</p>
         * </li>
         * <li><p>close: Disable SSL encryption.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OPEN</p>
         */
        @NameInMap("EnableSSL")
        public String enableSSL;

        /**
         * <p>The forced enabling status of SSL.</p>
         * 
         * <strong>example:</strong>
         * <p>CLOSE</p>
         */
        @NameInMap("ForceSSL")
        public String forceSSL;

        /**
         * <p>Indicates whether SSL can be forcibly enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ForceSSLSupport")
        public Boolean forceSSLSupport;

        /**
         * <p>The ID of the OceanBase cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>ob317v4uif****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The SSL status of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The validity period of the SSL certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-20 07:55:03.0</p>
         */
        @NameInMap("ValidPeriod")
        public String validPeriod;

        public static DescribeInstanceSSLResponseBodyInstanceSSL build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSSLResponseBodyInstanceSSL self = new DescribeInstanceSSLResponseBodyInstanceSSL();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSSLResponseBodyInstanceSSL setAutoUpdate(String autoUpdate) {
            this.autoUpdate = autoUpdate;
            return this;
        }
        public String getAutoUpdate() {
            return this.autoUpdate;
        }

        public DescribeInstanceSSLResponseBodyInstanceSSL setCaUrl(String caUrl) {
            this.caUrl = caUrl;
            return this;
        }
        public String getCaUrl() {
            return this.caUrl;
        }

        public DescribeInstanceSSLResponseBodyInstanceSSL setEnableSSL(String enableSSL) {
            this.enableSSL = enableSSL;
            return this;
        }
        public String getEnableSSL() {
            return this.enableSSL;
        }

        public DescribeInstanceSSLResponseBodyInstanceSSL setForceSSL(String forceSSL) {
            this.forceSSL = forceSSL;
            return this;
        }
        public String getForceSSL() {
            return this.forceSSL;
        }

        public DescribeInstanceSSLResponseBodyInstanceSSL setForceSSLSupport(Boolean forceSSLSupport) {
            this.forceSSLSupport = forceSSLSupport;
            return this;
        }
        public Boolean getForceSSLSupport() {
            return this.forceSSLSupport;
        }

        public DescribeInstanceSSLResponseBodyInstanceSSL setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceSSLResponseBodyInstanceSSL setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstanceSSLResponseBodyInstanceSSL setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeInstanceSSLResponseBodyInstanceSSL setValidPeriod(String validPeriod) {
            this.validPeriod = validPeriod;
            return this;
        }
        public String getValidPeriod() {
            return this.validPeriod;
        }

    }

}
