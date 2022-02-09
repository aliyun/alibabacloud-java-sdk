// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateMigrationEndpointRequest extends TeaModel {
    @NameInMap("CloudInstanceId")
    public String cloudInstanceId;

    @NameInMap("CloudInstanceRegionId")
    public String cloudInstanceRegionId;

    @NameInMap("CloudInstanceTenantId")
    public String cloudInstanceTenantId;

    @NameInMap("DbEngine")
    public String dbEngine;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DgInstanceId")
    public String dgInstanceId;

    @NameInMap("EndpointName")
    public String endpointName;

    @NameInMap("EndpointType")
    public String endpointType;

    @NameInMap("Host")
    public String host;

    @NameInMap("Password")
    public String password;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("Sid")
    public String sid;

    @NameInMap("Username")
    public String username;

    @NameInMap("VpcId")
    public String vpcId;

    public static CreateMigrationEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrationEndpointRequest self = new CreateMigrationEndpointRequest();
        return TeaModel.build(map, self);
    }

    public CreateMigrationEndpointRequest setCloudInstanceId(String cloudInstanceId) {
        this.cloudInstanceId = cloudInstanceId;
        return this;
    }
    public String getCloudInstanceId() {
        return this.cloudInstanceId;
    }

    public CreateMigrationEndpointRequest setCloudInstanceRegionId(String cloudInstanceRegionId) {
        this.cloudInstanceRegionId = cloudInstanceRegionId;
        return this;
    }
    public String getCloudInstanceRegionId() {
        return this.cloudInstanceRegionId;
    }

    public CreateMigrationEndpointRequest setCloudInstanceTenantId(String cloudInstanceTenantId) {
        this.cloudInstanceTenantId = cloudInstanceTenantId;
        return this;
    }
    public String getCloudInstanceTenantId() {
        return this.cloudInstanceTenantId;
    }

    public CreateMigrationEndpointRequest setDbEngine(String dbEngine) {
        this.dbEngine = dbEngine;
        return this;
    }
    public String getDbEngine() {
        return this.dbEngine;
    }

    public CreateMigrationEndpointRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public CreateMigrationEndpointRequest setDgInstanceId(String dgInstanceId) {
        this.dgInstanceId = dgInstanceId;
        return this;
    }
    public String getDgInstanceId() {
        return this.dgInstanceId;
    }

    public CreateMigrationEndpointRequest setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public CreateMigrationEndpointRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public CreateMigrationEndpointRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public CreateMigrationEndpointRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateMigrationEndpointRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public CreateMigrationEndpointRequest setSid(String sid) {
        this.sid = sid;
        return this;
    }
    public String getSid() {
        return this.sid;
    }

    public CreateMigrationEndpointRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public CreateMigrationEndpointRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
