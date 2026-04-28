// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeGatewayAttributeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>polar.app.g2.medium</p>
     */
    @NameInMap("ClassCode")
    public String classCode;

    /**
     * <strong>example:</strong>
     * <p>2020-02-24T11:57:54Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DbType")
    public String dbType;

    @NameInMap("Endpoints")
    public java.util.List<DescribeGatewayAttributeResponseBodyEndpoints> endpoints;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("Expired")
    public Boolean expired;

    /**
     * <strong>example:</strong>
     * <p>pg-xxxxxxx</p>
     */
    @NameInMap("GwClusterId")
    public String gwClusterId;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("GwDescription")
    public String gwDescription;

    /**
     * <strong>example:</strong>
     * <p>2025-10-07T02:19:55Z</p>
     */
    @NameInMap("ModifyTime")
    public String modifyTime;

    /**
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3E5CD764-FCCA-5C9C-838E-20E0DE84B2AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityIPArrays")
    public java.util.List<DescribeGatewayAttributeResponseBodySecurityIPArrays> securityIPArrays;

    /**
     * <strong>example:</strong>
     * <p>ACTIVATION</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>vsw-*********************</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <strong>example:</strong>
     * <p>vpc-*************</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeGatewayAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayAttributeResponseBody self = new DescribeGatewayAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayAttributeResponseBody setClassCode(String classCode) {
        this.classCode = classCode;
        return this;
    }
    public String getClassCode() {
        return this.classCode;
    }

    public DescribeGatewayAttributeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeGatewayAttributeResponseBody setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public DescribeGatewayAttributeResponseBody setEndpoints(java.util.List<DescribeGatewayAttributeResponseBodyEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<DescribeGatewayAttributeResponseBodyEndpoints> getEndpoints() {
        return this.endpoints;
    }

    public DescribeGatewayAttributeResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeGatewayAttributeResponseBody setExpired(Boolean expired) {
        this.expired = expired;
        return this;
    }
    public Boolean getExpired() {
        return this.expired;
    }

    public DescribeGatewayAttributeResponseBody setGwClusterId(String gwClusterId) {
        this.gwClusterId = gwClusterId;
        return this;
    }
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    public DescribeGatewayAttributeResponseBody setGwDescription(String gwDescription) {
        this.gwDescription = gwDescription;
        return this;
    }
    public String getGwDescription() {
        return this.gwDescription;
    }

    public DescribeGatewayAttributeResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public DescribeGatewayAttributeResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeGatewayAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeGatewayAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewayAttributeResponseBody setSecurityIPArrays(java.util.List<DescribeGatewayAttributeResponseBodySecurityIPArrays> securityIPArrays) {
        this.securityIPArrays = securityIPArrays;
        return this;
    }
    public java.util.List<DescribeGatewayAttributeResponseBodySecurityIPArrays> getSecurityIPArrays() {
        return this.securityIPArrays;
    }

    public DescribeGatewayAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeGatewayAttributeResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeGatewayAttributeResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class DescribeGatewayAttributeResponseBodyEndpoints extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>pg-xxxxx.polardbaigateway.pre.rds.aliyuncs.com</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <strong>example:</strong>
         * <p>pg-xxxxxxx</p>
         */
        @NameInMap("GwClusterId")
        public String gwClusterId;

        /**
         * <strong>example:</strong>
         * <p>Public</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <strong>example:</strong>
         * <p>1874631</p>
         */
        @NameInMap("TunnelId")
        public String tunnelId;

        /**
         * <strong>example:</strong>
         * <p>vpc-*************</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeGatewayAttributeResponseBodyEndpoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewayAttributeResponseBodyEndpoints self = new DescribeGatewayAttributeResponseBodyEndpoints();
            return TeaModel.build(map, self);
        }

        public DescribeGatewayAttributeResponseBodyEndpoints setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeGatewayAttributeResponseBodyEndpoints setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public DescribeGatewayAttributeResponseBodyEndpoints setGwClusterId(String gwClusterId) {
            this.gwClusterId = gwClusterId;
            return this;
        }
        public String getGwClusterId() {
            return this.gwClusterId;
        }

        public DescribeGatewayAttributeResponseBodyEndpoints setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeGatewayAttributeResponseBodyEndpoints setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeGatewayAttributeResponseBodyEndpoints setTunnelId(String tunnelId) {
            this.tunnelId = tunnelId;
            return this;
        }
        public String getTunnelId() {
            return this.tunnelId;
        }

        public DescribeGatewayAttributeResponseBodyEndpoints setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeGatewayAttributeResponseBodySecurityIPArrays extends TeaModel {
        @NameInMap("SecurityIPArrayName")
        public String securityIPArrayName;

        @NameInMap("SecurityIPArrayTag")
        public String securityIPArrayTag;

        @NameInMap("SecurityIPList")
        public String securityIPList;

        public static DescribeGatewayAttributeResponseBodySecurityIPArrays build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewayAttributeResponseBodySecurityIPArrays self = new DescribeGatewayAttributeResponseBodySecurityIPArrays();
            return TeaModel.build(map, self);
        }

        public DescribeGatewayAttributeResponseBodySecurityIPArrays setSecurityIPArrayName(String securityIPArrayName) {
            this.securityIPArrayName = securityIPArrayName;
            return this;
        }
        public String getSecurityIPArrayName() {
            return this.securityIPArrayName;
        }

        public DescribeGatewayAttributeResponseBodySecurityIPArrays setSecurityIPArrayTag(String securityIPArrayTag) {
            this.securityIPArrayTag = securityIPArrayTag;
            return this;
        }
        public String getSecurityIPArrayTag() {
            return this.securityIPArrayTag;
        }

        public DescribeGatewayAttributeResponseBodySecurityIPArrays setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

    }

}
