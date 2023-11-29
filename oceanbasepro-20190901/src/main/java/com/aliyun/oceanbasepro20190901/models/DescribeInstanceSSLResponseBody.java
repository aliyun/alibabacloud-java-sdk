// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceSSLResponseBody extends TeaModel {
    @NameInMap("InstanceSSL")
    public DescribeInstanceSSLResponseBodyInstanceSSL instanceSSL;

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
        @NameInMap("CaUrl")
        public String caUrl;

        @NameInMap("EnableSSL")
        public String enableSSL;

        @NameInMap("ForceSSL")
        public String forceSSL;

        @NameInMap("ForceSSLSupport")
        public Boolean forceSSLSupport;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Status")
        public String status;

        @NameInMap("ValidPeriod")
        public String validPeriod;

        public static DescribeInstanceSSLResponseBodyInstanceSSL build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSSLResponseBodyInstanceSSL self = new DescribeInstanceSSLResponseBodyInstanceSSL();
            return TeaModel.build(map, self);
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

        public DescribeInstanceSSLResponseBodyInstanceSSL setValidPeriod(String validPeriod) {
            this.validPeriod = validPeriod;
            return this;
        }
        public String getValidPeriod() {
            return this.validPeriod;
        }

    }

}
