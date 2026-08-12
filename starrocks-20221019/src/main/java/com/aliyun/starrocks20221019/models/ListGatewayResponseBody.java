// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ListGatewayResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListGatewayResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParams</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid params: [instance not exists].</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>32A44F0D-BFF6-5664-999A-218BBDE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayResponseBody self = new ListGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayResponseBody setData(java.util.List<ListGatewayResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListGatewayResponseBodyData> getData() {
        return this.data;
    }

    public ListGatewayResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListGatewayResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListGatewayResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGatewayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListGatewayResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether public network access is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnablePublicNet")
        public Boolean enablePublicNet;

        /**
         * <p>The number of gateway nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("FeNodeNumber")
        public Integer feNodeNumber;

        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>13822</p>
         */
        @NameInMap("GatewayId")
        public String gatewayId;

        /**
         * <p>The gateway name.</p>
         * 
         * <strong>example:</strong>
         * <p>Gateway 1</p>
         */
        @NameInMap("GatewayName")
        public String gatewayName;

        /**
         * <p>The gateway type. Valid values are \<code>Slb\\</code> and \<code>Privatezone\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>slb</p>
         */
        @NameInMap("GatewayType")
        public String gatewayType;

        /**
         * <p>The internal endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>fe-c-b25e21e24388****-ab8sjd-internal.starrocks.aliyuncs.com</p>
         */
        @NameInMap("InternalDomain")
        public String internalDomain;

        /**
         * <p>The ID of the internal-facing Server Load Balancer (SLB) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-123abc</p>
         */
        @NameInMap("InternalSlbId")
        public String internalSlbId;

        /**
         * <p>The ID of the PrivateZone.</p>
         * 
         * <strong>example:</strong>
         * <p>a62des2123243881b9s2sa220k2l38m9</p>
         */
        @NameInMap("PrivatezoneId")
        public String privatezoneId;

        /**
         * <p>The public endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>fe-c-b25e21e24388****-8s272d.starrocks.aliyuncs.com</p>
         */
        @NameInMap("PublicDomain")
        public String publicDomain;

        /**
         * <p>The ID of the access control list (ACL) for public network access.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-hsb123ksi2</p>
         */
        @NameInMap("PublicSlbAclId")
        public String publicSlbAclId;

        /**
         * <p>The ID of the public-facing SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-abc123</p>
         */
        @NameInMap("PublicSlbId")
        public String publicSlbId;

        public static ListGatewayResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayResponseBodyData self = new ListGatewayResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGatewayResponseBodyData setEnablePublicNet(Boolean enablePublicNet) {
            this.enablePublicNet = enablePublicNet;
            return this;
        }
        public Boolean getEnablePublicNet() {
            return this.enablePublicNet;
        }

        public ListGatewayResponseBodyData setFeNodeNumber(Integer feNodeNumber) {
            this.feNodeNumber = feNodeNumber;
            return this;
        }
        public Integer getFeNodeNumber() {
            return this.feNodeNumber;
        }

        public ListGatewayResponseBodyData setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public ListGatewayResponseBodyData setGatewayName(String gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }
        public String getGatewayName() {
            return this.gatewayName;
        }

        public ListGatewayResponseBodyData setGatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }
        public String getGatewayType() {
            return this.gatewayType;
        }

        public ListGatewayResponseBodyData setInternalDomain(String internalDomain) {
            this.internalDomain = internalDomain;
            return this;
        }
        public String getInternalDomain() {
            return this.internalDomain;
        }

        public ListGatewayResponseBodyData setInternalSlbId(String internalSlbId) {
            this.internalSlbId = internalSlbId;
            return this;
        }
        public String getInternalSlbId() {
            return this.internalSlbId;
        }

        public ListGatewayResponseBodyData setPrivatezoneId(String privatezoneId) {
            this.privatezoneId = privatezoneId;
            return this;
        }
        public String getPrivatezoneId() {
            return this.privatezoneId;
        }

        public ListGatewayResponseBodyData setPublicDomain(String publicDomain) {
            this.publicDomain = publicDomain;
            return this;
        }
        public String getPublicDomain() {
            return this.publicDomain;
        }

        public ListGatewayResponseBodyData setPublicSlbAclId(String publicSlbAclId) {
            this.publicSlbAclId = publicSlbAclId;
            return this;
        }
        public String getPublicSlbAclId() {
            return this.publicSlbAclId;
        }

        public ListGatewayResponseBodyData setPublicSlbId(String publicSlbId) {
            this.publicSlbId = publicSlbId;
            return this;
        }
        public String getPublicSlbId() {
            return this.publicSlbId;
        }

    }

}
