// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ValidateOmsEndpointConnectionByInfoRequest extends TeaModel {
    @NameInMap("CloudInstanceId")
    public String cloudInstanceId;

    @NameInMap("CloudInstanceRegionId")
    public String cloudInstanceRegionId;

    @NameInMap("CloudInstanceTenantId")
    public String cloudInstanceTenantId;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("DgInstanceId")
    public String dgInstanceId;

    @NameInMap("DomainParams")
    public java.util.Map<String, ?> domainParams;

    @NameInMap("Id")
    public String id;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Password")
    public String password;

    @NameInMap("Port")
    public String port;

    @NameInMap("Sid")
    public String sid;

    @NameInMap("Username")
    public String username;

    @NameInMap("VpcId")
    public String vpcId;

    public static ValidateOmsEndpointConnectionByInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateOmsEndpointConnectionByInfoRequest self = new ValidateOmsEndpointConnectionByInfoRequest();
        return TeaModel.build(map, self);
    }

    public ValidateOmsEndpointConnectionByInfoRequest setCloudInstanceId(String cloudInstanceId) {
        this.cloudInstanceId = cloudInstanceId;
        return this;
    }
    public String getCloudInstanceId() {
        return this.cloudInstanceId;
    }

    public ValidateOmsEndpointConnectionByInfoRequest setCloudInstanceRegionId(String cloudInstanceRegionId) {
        this.cloudInstanceRegionId = cloudInstanceRegionId;
        return this;
    }
    public String getCloudInstanceRegionId() {
        return this.cloudInstanceRegionId;
    }

    public ValidateOmsEndpointConnectionByInfoRequest setCloudInstanceTenantId(String cloudInstanceTenantId) {
        this.cloudInstanceTenantId = cloudInstanceTenantId;
        return this;
    }
    public String getCloudInstanceTenantId() {
        return this.cloudInstanceTenantId;
    }

    public ValidateOmsEndpointConnectionByInfoRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ValidateOmsEndpointConnectionByInfoRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public ValidateOmsEndpointConnectionByInfoRequest setDgInstanceId(String dgInstanceId) {
        this.dgInstanceId = dgInstanceId;
        return this;
    }
    public String getDgInstanceId() {
        return this.dgInstanceId;
    }

    public ValidateOmsEndpointConnectionByInfoRequest setDomainParams(java.util.Map<String, ?> domainParams) {
        this.domainParams = domainParams;
        return this;
    }
    public java.util.Map<String, ?> getDomainParams() {
        return this.domainParams;
    }

    public ValidateOmsEndpointConnectionByInfoRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ValidateOmsEndpointConnectionByInfoRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ValidateOmsEndpointConnectionByInfoRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ValidateOmsEndpointConnectionByInfoRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ValidateOmsEndpointConnectionByInfoRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public ValidateOmsEndpointConnectionByInfoRequest setSid(String sid) {
        this.sid = sid;
        return this;
    }
    public String getSid() {
        return this.sid;
    }

    public ValidateOmsEndpointConnectionByInfoRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public ValidateOmsEndpointConnectionByInfoRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
