// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeAppInstanceAttributeResponseBody extends TeaModel {
    /**
     * <p>The name of the AI application.</p>
     * 
     * <strong>example:</strong>
     * <p>test-supabase</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The application type. Currently, only <strong>supabase</strong> is supported, which indicates <a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>supabase</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <p>Reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Reserved parameter</p>
     */
    @NameInMap("BranchName")
    public String branchName;

    /**
     * <p>Reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Reserved parameter</p>
     */
    @NameInMap("BranchingEnabled")
    public String branchingEnabled;

    /**
     * <p>The list of components.</p>
     */
    @NameInMap("Components")
    public java.util.List<DescribeAppInstanceAttributeResponseBodyComponents> components;

    /**
     * <p>The ID of the RDS PostgreSQL database instance that the AI application is connected to.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-2ze49qv594vi****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The instance ID of the EIP.</p>
     * 
     * <strong>example:</strong>
     * <p>eip-wz9sfo01afag4hxc0utq0</p>
     */
    @NameInMap("EipId")
    public String eipId;

    /**
     * <p>The activation status of the EIP.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("EipStatus")
    public String eipStatus;

    /**
     * <p>The instance class of the AI application.</p>
     * 
     * <strong>example:</strong>
     * <p>rdsai.supabase.basic</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The latest minor version of the RDS AI application instance.</p>
     * 
     * <strong>example:</strong>
     * <p>20260903</p>
     */
    @NameInMap("InstanceLatestVersion")
    public String instanceLatestVersion;

    /**
     * <p>The minor version of the RDS AI application instance.</p>
     * 
     * <strong>example:</strong>
     * <p>20241231</p>
     */
    @NameInMap("InstanceMinorVersion")
    public String instanceMinorVersion;

    /**
     * <p>The instance ID of the AI application.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>Reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Reserved parameter</p>
     */
    @NameInMap("LoginToken")
    public String loginToken;

    /**
     * <p>The minor version details of each component of the RDS AI application instance.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;studio\&quot;:\&quot;20260602r1\&quot;,\&quot;storage\&quot;:\&quot;v1.48.9\&quot;,\&quot;auth\&quot;:\&quot;v2.188.1\&quot;,\&quot;kong\&quot;:\&quot;3.9.0\&quot;,\&quot;rest\&quot;:\&quot;v12.2.12\&quot;,\&quot;meta\&quot;:\&quot;v0.89.3\&quot;,\&quot;realtime-dev\&quot;:\&quot;v2.34.47\&quot;,\&quot;postgres\&quot;:\&quot;rds_postgres_1700_20260830\&quot;}</p>
     */
    @NameInMap("MinorVersionDetail")
    public String minorVersionDetail;

    /**
     * <p>The creator of the NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("NatCreatedBy")
    public String natCreatedBy;

    /**
     * <p>The ID of the NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-bp1l82hw87m2y77ci1hie</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The activation status of the NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("NatStatus")
    public String natStatus;

    /**
     * <p>The public connection string of the AI application.</p>
     * 
     * <strong>example:</strong>
     * <p>8.152. XXX.XXX:8000</p>
     */
    @NameInMap("PublicConnectionString")
    public String publicConnectionString;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Reserved parameter</p>
     */
    @NameInMap("RetentionHours")
    public String retentionHours;

    /**
     * <p>Reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Reserved parameter</p>
     */
    @NameInMap("SqlExtendMoInstanceId")
    public String sqlExtendMoInstanceId;

    /**
     * <p>The instance status. For more information, see <a href="https://help.aliyun.com/document_detail/2623972.html">Instance status table</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Reserved parameter</p>
     */
    @NameInMap("UploadKey")
    public String uploadKey;

    /**
     * <p>Reserved parameter.</p>
     */
    @NameInMap("UploadKeyList")
    public java.util.List<DescribeAppInstanceAttributeResponseBodyUploadKeyList> uploadKeyList;

    /**
     * <p>The vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-2zeaepb8k4ku05ov2****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The internal connection string of the AI application.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.XXX.XXX:8000</p>
     */
    @NameInMap("VpcConnectionString")
    public String vpcConnectionString;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-i</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeAppInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppInstanceAttributeResponseBody self = new DescribeAppInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppInstanceAttributeResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeAppInstanceAttributeResponseBody setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public DescribeAppInstanceAttributeResponseBody setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public DescribeAppInstanceAttributeResponseBody setBranchingEnabled(String branchingEnabled) {
        this.branchingEnabled = branchingEnabled;
        return this;
    }
    public String getBranchingEnabled() {
        return this.branchingEnabled;
    }

    public DescribeAppInstanceAttributeResponseBody setComponents(java.util.List<DescribeAppInstanceAttributeResponseBodyComponents> components) {
        this.components = components;
        return this;
    }
    public java.util.List<DescribeAppInstanceAttributeResponseBodyComponents> getComponents() {
        return this.components;
    }

    public DescribeAppInstanceAttributeResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeAppInstanceAttributeResponseBody setEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }
    public String getEipId() {
        return this.eipId;
    }

    public DescribeAppInstanceAttributeResponseBody setEipStatus(String eipStatus) {
        this.eipStatus = eipStatus;
        return this;
    }
    public String getEipStatus() {
        return this.eipStatus;
    }

    public DescribeAppInstanceAttributeResponseBody setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public DescribeAppInstanceAttributeResponseBody setInstanceLatestVersion(String instanceLatestVersion) {
        this.instanceLatestVersion = instanceLatestVersion;
        return this;
    }
    public String getInstanceLatestVersion() {
        return this.instanceLatestVersion;
    }

    public DescribeAppInstanceAttributeResponseBody setInstanceMinorVersion(String instanceMinorVersion) {
        this.instanceMinorVersion = instanceMinorVersion;
        return this;
    }
    public String getInstanceMinorVersion() {
        return this.instanceMinorVersion;
    }

    public DescribeAppInstanceAttributeResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeAppInstanceAttributeResponseBody setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public DescribeAppInstanceAttributeResponseBody setMinorVersionDetail(String minorVersionDetail) {
        this.minorVersionDetail = minorVersionDetail;
        return this;
    }
    public String getMinorVersionDetail() {
        return this.minorVersionDetail;
    }

    public DescribeAppInstanceAttributeResponseBody setNatCreatedBy(String natCreatedBy) {
        this.natCreatedBy = natCreatedBy;
        return this;
    }
    public String getNatCreatedBy() {
        return this.natCreatedBy;
    }

    public DescribeAppInstanceAttributeResponseBody setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public DescribeAppInstanceAttributeResponseBody setNatStatus(String natStatus) {
        this.natStatus = natStatus;
        return this;
    }
    public String getNatStatus() {
        return this.natStatus;
    }

    public DescribeAppInstanceAttributeResponseBody setPublicConnectionString(String publicConnectionString) {
        this.publicConnectionString = publicConnectionString;
        return this;
    }
    public String getPublicConnectionString() {
        return this.publicConnectionString;
    }

    public DescribeAppInstanceAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAppInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppInstanceAttributeResponseBody setRetentionHours(String retentionHours) {
        this.retentionHours = retentionHours;
        return this;
    }
    public String getRetentionHours() {
        return this.retentionHours;
    }

    public DescribeAppInstanceAttributeResponseBody setSqlExtendMoInstanceId(String sqlExtendMoInstanceId) {
        this.sqlExtendMoInstanceId = sqlExtendMoInstanceId;
        return this;
    }
    public String getSqlExtendMoInstanceId() {
        return this.sqlExtendMoInstanceId;
    }

    public DescribeAppInstanceAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeAppInstanceAttributeResponseBody setUploadKey(String uploadKey) {
        this.uploadKey = uploadKey;
        return this;
    }
    public String getUploadKey() {
        return this.uploadKey;
    }

    public DescribeAppInstanceAttributeResponseBody setUploadKeyList(java.util.List<DescribeAppInstanceAttributeResponseBodyUploadKeyList> uploadKeyList) {
        this.uploadKeyList = uploadKeyList;
        return this;
    }
    public java.util.List<DescribeAppInstanceAttributeResponseBodyUploadKeyList> getUploadKeyList() {
        return this.uploadKeyList;
    }

    public DescribeAppInstanceAttributeResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeAppInstanceAttributeResponseBody setVpcConnectionString(String vpcConnectionString) {
        this.vpcConnectionString = vpcConnectionString;
        return this;
    }
    public String getVpcConnectionString() {
        return this.vpcConnectionString;
    }

    public DescribeAppInstanceAttributeResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeAppInstanceAttributeResponseBodyComponents extends TeaModel {
        /**
         * <p>The component status.</p>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The component type.</p>
         * 
         * <strong>example:</strong>
         * <p>supabase</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeAppInstanceAttributeResponseBodyComponents build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppInstanceAttributeResponseBodyComponents self = new DescribeAppInstanceAttributeResponseBodyComponents();
            return TeaModel.build(map, self);
        }

        public DescribeAppInstanceAttributeResponseBodyComponents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAppInstanceAttributeResponseBodyComponents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeAppInstanceAttributeResponseBodyUploadKeyList extends TeaModel {
        /**
         * <p>Reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Reserved parameter</p>
         */
        @NameInMap("IsSystemKey")
        public Boolean isSystemKey;

        /**
         * <p>Reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Reserved parameter</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>Reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Reserved parameter</p>
         */
        @NameInMap("SlsStorageBytes")
        public Long slsStorageBytes;

        /**
         * <p>Reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Reserved parameter</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Reserved parameter</p>
         */
        @NameInMap("UploadKey")
        public String uploadKey;

        public static DescribeAppInstanceAttributeResponseBodyUploadKeyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppInstanceAttributeResponseBodyUploadKeyList self = new DescribeAppInstanceAttributeResponseBodyUploadKeyList();
            return TeaModel.build(map, self);
        }

        public DescribeAppInstanceAttributeResponseBodyUploadKeyList setIsSystemKey(Boolean isSystemKey) {
            this.isSystemKey = isSystemKey;
            return this;
        }
        public Boolean getIsSystemKey() {
            return this.isSystemKey;
        }

        public DescribeAppInstanceAttributeResponseBodyUploadKeyList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeAppInstanceAttributeResponseBodyUploadKeyList setSlsStorageBytes(Long slsStorageBytes) {
            this.slsStorageBytes = slsStorageBytes;
            return this;
        }
        public Long getSlsStorageBytes() {
            return this.slsStorageBytes;
        }

        public DescribeAppInstanceAttributeResponseBodyUploadKeyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAppInstanceAttributeResponseBodyUploadKeyList setUploadKey(String uploadKey) {
            this.uploadKey = uploadKey;
            return this;
        }
        public String getUploadKey() {
            return this.uploadKey;
        }

    }

}
