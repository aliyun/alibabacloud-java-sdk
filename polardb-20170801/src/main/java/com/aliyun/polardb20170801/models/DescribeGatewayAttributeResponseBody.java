// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeGatewayAttributeResponseBody extends TeaModel {
    /**
     * <p>The specification code for the gateway instance.</p>
     * 
     * <strong>example:</strong>
     * <p>polar.app.g2.medium</p>
     */
    @NameInMap("ClassCode")
    public String classCode;

    /**
     * <p>The time when the gateway instance was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-02-24T11:57:54Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CurrentVersion")
    public String currentVersion;

    /**
     * <p>The database type.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>A list of endpoints for the gateway instance.</p>
     */
    @NameInMap("Endpoints")
    public java.util.List<DescribeGatewayAttributeResponseBodyEndpoints> endpoints;

    /**
     * <p>The time when the subscription for the gateway instance expires.</p>
     * <p>This parameter is empty for pay-as-you-go instances.</p>
     * 
     * <strong>example:</strong>
     * <p>2027-04-22T16:00:00Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>Indicates whether the subscription for the gateway instance has expired. Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("Expired")
    public Boolean expired;

    /**
     * <p>The ID of the gateway instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-xxxxxxx</p>
     */
    @NameInMap("GwClusterId")
    public String gwClusterId;

    /**
     * <p>The description of the gateway instance.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("GwDescription")
    public String gwDescription;

    @NameInMap("LatestVersion")
    public String latestVersion;

    /**
     * <p>The time when the gateway instance was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-10-07T02:19:55Z</p>
     */
    @NameInMap("ModifyTime")
    public String modifyTime;

    /**
     * <p>The billing method of the gateway instance. Valid values:</p>
     * <ul>
     * <li><p><strong>Postpaid</strong>: pay-as-you-go.</p>
     * </li>
     * <li><p><strong>Prepaid</strong>: subscription.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3E5CD764-FCCA-5C9C-838E-20E0DE84B2AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RunningVersion")
    public String runningVersion;

    /**
     * <p>A list of IP whitelists for the gateway instance.</p>
     */
    @NameInMap("SecurityIPArrays")
    public java.util.List<DescribeGatewayAttributeResponseBodySecurityIPArrays> securityIPArrays;

    /**
     * <p>The status of the gateway instance. Valid values:</p>
     * <ul>
     * <li><p><strong>CREATE</strong>: The gateway instance is being created.</p>
     * </li>
     * <li><p><strong>ACTIVATION</strong>: The gateway instance is running.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACTIVATION</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the VSwitch where the gateway instance is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-*********************</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC where the gateway instance is deployed.</p>
     * 
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

    public DescribeGatewayAttributeResponseBody setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }
    public String getCurrentVersion() {
        return this.currentVersion;
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

    public DescribeGatewayAttributeResponseBody setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }
    public String getLatestVersion() {
        return this.latestVersion;
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

    public DescribeGatewayAttributeResponseBody setRunningVersion(String runningVersion) {
        this.runningVersion = runningVersion;
        return this;
    }
    public String getRunningVersion() {
        return this.runningVersion;
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
         * <p>The endpoint address.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-xxxxx.polardbaigateway.pre.rds.aliyuncs.com</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The ID of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The ID of the gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-xxxxxxx</p>
         */
        @NameInMap("GwClusterId")
        public String gwClusterId;

        /**
         * <p>The network type of the endpoint. Valid values:</p>
         * <ul>
         * <li><p><strong>Private</strong>: VPC endpoint.</p>
         * </li>
         * <li><p><strong>Public</strong>: public endpoint.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The port number.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The tunnel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1874631</p>
         */
        @NameInMap("TunnelId")
        public String tunnelId;

        /**
         * <p>The ID of the VPC to which the endpoint belongs.</p>
         * 
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
        /**
         * <p>The name of the IP whitelist. The default value is <code>default</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("SecurityIPArrayName")
        public String securityIPArrayName;

        /**
         * <p>The tag of the IP whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>mytag</p>
         */
        @NameInMap("SecurityIPArrayTag")
        public String securityIPArrayTag;

        /**
         * <p>A comma-separated list of IP addresses in the IP whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
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
