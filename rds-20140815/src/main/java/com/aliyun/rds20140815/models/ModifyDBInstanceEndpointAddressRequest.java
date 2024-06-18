// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceEndpointAddressRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The endpoint that you want to modify. The endpoint can be a public endpoint or an internal endpoint.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The prefix of the new endpoint. You can modify only the prefix of the endpoint that is specified by the ConnectionString parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp181qoj4s34m33****</p>
     */
    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    /**
     * <p>The endpoint ID of the instance. You can call the DescribeDBInstanceEndpoints operation to query the endpoint ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ep-****</p>
     */
    @NameInMap("DBInstanceEndpointId")
    public String DBInstanceEndpointId;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The port number of the new endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The IP address of the internal endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.XX.XX</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The vSwitch ID of the internal endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp12u14ecz****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The VPC ID of the internal endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp17xdic25d****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static ModifyDBInstanceEndpointAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceEndpointAddressRequest self = new ModifyDBInstanceEndpointAddressRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceEndpointAddressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDBInstanceEndpointAddressRequest setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public ModifyDBInstanceEndpointAddressRequest setConnectionStringPrefix(String connectionStringPrefix) {
        this.connectionStringPrefix = connectionStringPrefix;
        return this;
    }
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
    }

    public ModifyDBInstanceEndpointAddressRequest setDBInstanceEndpointId(String DBInstanceEndpointId) {
        this.DBInstanceEndpointId = DBInstanceEndpointId;
        return this;
    }
    public String getDBInstanceEndpointId() {
        return this.DBInstanceEndpointId;
    }

    public ModifyDBInstanceEndpointAddressRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceEndpointAddressRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public ModifyDBInstanceEndpointAddressRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public ModifyDBInstanceEndpointAddressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBInstanceEndpointAddressRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public ModifyDBInstanceEndpointAddressRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
