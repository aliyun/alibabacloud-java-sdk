// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeWhitelistIpsResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeWhitelistIpsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeWhitelistIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhitelistIpsResponseBody self = new DescribeWhitelistIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWhitelistIpsResponseBody setData(DescribeWhitelistIpsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeWhitelistIpsResponseBodyData getData() {
        return this.data;
    }

    public DescribeWhitelistIpsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeWhitelistIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWhitelistIpsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeWhitelistIpsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://www.test123.com">www.test123.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>127.0.0.1,192.168.1.0/24</p>
         */
        @NameInMap("IpWhitelist")
        public String ipWhitelist;

        public static DescribeWhitelistIpsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeWhitelistIpsResponseBodyData self = new DescribeWhitelistIpsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeWhitelistIpsResponseBodyData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeWhitelistIpsResponseBodyData setIpWhitelist(String ipWhitelist) {
            this.ipWhitelist = ipWhitelist;
            return this;
        }
        public String getIpWhitelist() {
            return this.ipWhitelist;
        }

    }

}
