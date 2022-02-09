// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyOmsEndpointRequest extends TeaModel {
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

    @NameInMap("NewId")
    public String newId;

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

    public static ModifyOmsEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOmsEndpointRequest self = new ModifyOmsEndpointRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOmsEndpointRequest setCloudInstanceId(String cloudInstanceId) {
        this.cloudInstanceId = cloudInstanceId;
        return this;
    }
    public String getCloudInstanceId() {
        return this.cloudInstanceId;
    }

    public ModifyOmsEndpointRequest setCloudInstanceRegionId(String cloudInstanceRegionId) {
        this.cloudInstanceRegionId = cloudInstanceRegionId;
        return this;
    }
    public String getCloudInstanceRegionId() {
        return this.cloudInstanceRegionId;
    }

    public ModifyOmsEndpointRequest setCloudInstanceTenantId(String cloudInstanceTenantId) {
        this.cloudInstanceTenantId = cloudInstanceTenantId;
        return this;
    }
    public String getCloudInstanceTenantId() {
        return this.cloudInstanceTenantId;
    }

    public ModifyOmsEndpointRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ModifyOmsEndpointRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public ModifyOmsEndpointRequest setDgInstanceId(String dgInstanceId) {
        this.dgInstanceId = dgInstanceId;
        return this;
    }
    public String getDgInstanceId() {
        return this.dgInstanceId;
    }

    public ModifyOmsEndpointRequest setDomainParams(java.util.Map<String, ?> domainParams) {
        this.domainParams = domainParams;
        return this;
    }
    public java.util.Map<String, ?> getDomainParams() {
        return this.domainParams;
    }

    public ModifyOmsEndpointRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyOmsEndpointRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ModifyOmsEndpointRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ModifyOmsEndpointRequest setNewId(String newId) {
        this.newId = newId;
        return this;
    }
    public String getNewId() {
        return this.newId;
    }

    public ModifyOmsEndpointRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyOmsEndpointRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public ModifyOmsEndpointRequest setSid(String sid) {
        this.sid = sid;
        return this;
    }
    public String getSid() {
        return this.sid;
    }

    public ModifyOmsEndpointRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public ModifyOmsEndpointRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
