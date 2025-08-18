// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeAppInstanceAttributeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test-supabase</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>supabase</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <strong>example:</strong>
     * <p>pgm-2ze49qv594vi****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <strong>example:</strong>
     * <p>rdsai.supabase.basic</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <strong>example:</strong>
     * <p>20241231</p>
     */
    @NameInMap("InstanceMinorVersion")
    public String instanceMinorVersion;

    /**
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <p>8.152. XXX.XXX:8000</p>
     */
    @NameInMap("PublicConnectionString")
    public String publicConnectionString;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>vsw-2zeaepb8k4ku05ov2****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <strong>example:</strong>
     * <p>172.16.XXX.XXX:8000</p>
     */
    @NameInMap("VpcConnectionString")
    public String vpcConnectionString;

    /**
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

    public DescribeAppInstanceAttributeResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeAppInstanceAttributeResponseBody setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
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

    public DescribeAppInstanceAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
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

}
