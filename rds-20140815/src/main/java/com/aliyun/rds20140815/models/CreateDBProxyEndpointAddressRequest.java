// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBProxyEndpointAddressRequest extends TeaModel {
    /**
     * <p>The prefix of the proxy endpoint Enter a custom prefix.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1234</p>
     */
    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-t4n3axxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The network type of the proxy endpoint. Valid values:</p>
     * <ul>
     * <li><strong>Public</strong>: Internet</li>
     * <li><strong>VPC</strong>: Virtual Private Cloud (VPC)</li>
     * <li><strong>Classic</strong>: classic network</li>
     * </ul>
     * <p>Default value: <strong>Classic</strong></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("DBProxyConnectStringNetType")
    public String DBProxyConnectStringNetType;

    /**
     * <p>The proxy endpoint ID. You can call the DescribeDBProxyEndpoint operation to query the proxy endpoint ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ta9um4xxxxx</p>
     */
    @NameInMap("DBProxyEndpointId")
    public String DBProxyEndpointId;

    /**
     * <p>A reserved parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("DBProxyEngineType")
    public String DBProxyEngineType;

    /**
     * <p>The port number that is associated with the proxy endpoint.</p>
     * <ul>
     * <li>If the instance runs MySQL, the default value is <strong>3306</strong>.</li>
     * <li>If the instance runs PostgreSQL, the default value is <strong>5432</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("DBProxyNewConnectStringPort")
    public String DBProxyNewConnectStringPort;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the VPC to which the proxy endpoint belongs. You can call the DescribeDBInstanceAttribute operation to query the information.</p>
     * <blockquote>
     * <p> This parameter must be specified when <strong>DBProxyConnectStringNetType</strong> is set to <strong>VPC</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-bpxxxxxx</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The ID of the vSwitch that is associated with the specified VPC. You can call the DescribeDBInstanceAttribute operation to query the vSwitch ID.</p>
     * <blockquote>
     * <p> This parameter must be specified when <strong>DBProxyConnectStringNetType</strong> is set to <strong>VPC</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bpxxxxxx</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateDBProxyEndpointAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBProxyEndpointAddressRequest self = new CreateDBProxyEndpointAddressRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBProxyEndpointAddressRequest setConnectionStringPrefix(String connectionStringPrefix) {
        this.connectionStringPrefix = connectionStringPrefix;
        return this;
    }
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
    }

    public CreateDBProxyEndpointAddressRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateDBProxyEndpointAddressRequest setDBProxyConnectStringNetType(String DBProxyConnectStringNetType) {
        this.DBProxyConnectStringNetType = DBProxyConnectStringNetType;
        return this;
    }
    public String getDBProxyConnectStringNetType() {
        return this.DBProxyConnectStringNetType;
    }

    public CreateDBProxyEndpointAddressRequest setDBProxyEndpointId(String DBProxyEndpointId) {
        this.DBProxyEndpointId = DBProxyEndpointId;
        return this;
    }
    public String getDBProxyEndpointId() {
        return this.DBProxyEndpointId;
    }

    public CreateDBProxyEndpointAddressRequest setDBProxyEngineType(String DBProxyEngineType) {
        this.DBProxyEngineType = DBProxyEngineType;
        return this;
    }
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
    }

    public CreateDBProxyEndpointAddressRequest setDBProxyNewConnectStringPort(String DBProxyNewConnectStringPort) {
        this.DBProxyNewConnectStringPort = DBProxyNewConnectStringPort;
        return this;
    }
    public String getDBProxyNewConnectStringPort() {
        return this.DBProxyNewConnectStringPort;
    }

    public CreateDBProxyEndpointAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDBProxyEndpointAddressRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDBProxyEndpointAddressRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CreateDBProxyEndpointAddressRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
