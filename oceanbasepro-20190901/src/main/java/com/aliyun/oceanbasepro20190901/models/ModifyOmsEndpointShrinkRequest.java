// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyOmsEndpointShrinkRequest extends TeaModel {
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
    public String domainParamsShrink;

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

    public static ModifyOmsEndpointShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOmsEndpointShrinkRequest self = new ModifyOmsEndpointShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOmsEndpointShrinkRequest setCloudInstanceId(String cloudInstanceId) {
        this.cloudInstanceId = cloudInstanceId;
        return this;
    }
    public String getCloudInstanceId() {
        return this.cloudInstanceId;
    }

    public ModifyOmsEndpointShrinkRequest setCloudInstanceRegionId(String cloudInstanceRegionId) {
        this.cloudInstanceRegionId = cloudInstanceRegionId;
        return this;
    }
    public String getCloudInstanceRegionId() {
        return this.cloudInstanceRegionId;
    }

    public ModifyOmsEndpointShrinkRequest setCloudInstanceTenantId(String cloudInstanceTenantId) {
        this.cloudInstanceTenantId = cloudInstanceTenantId;
        return this;
    }
    public String getCloudInstanceTenantId() {
        return this.cloudInstanceTenantId;
    }

    public ModifyOmsEndpointShrinkRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ModifyOmsEndpointShrinkRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public ModifyOmsEndpointShrinkRequest setDgInstanceId(String dgInstanceId) {
        this.dgInstanceId = dgInstanceId;
        return this;
    }
    public String getDgInstanceId() {
        return this.dgInstanceId;
    }

    public ModifyOmsEndpointShrinkRequest setDomainParamsShrink(String domainParamsShrink) {
        this.domainParamsShrink = domainParamsShrink;
        return this;
    }
    public String getDomainParamsShrink() {
        return this.domainParamsShrink;
    }

    public ModifyOmsEndpointShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyOmsEndpointShrinkRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ModifyOmsEndpointShrinkRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ModifyOmsEndpointShrinkRequest setNewId(String newId) {
        this.newId = newId;
        return this;
    }
    public String getNewId() {
        return this.newId;
    }

    public ModifyOmsEndpointShrinkRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyOmsEndpointShrinkRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public ModifyOmsEndpointShrinkRequest setSid(String sid) {
        this.sid = sid;
        return this;
    }
    public String getSid() {
        return this.sid;
    }

    public ModifyOmsEndpointShrinkRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public ModifyOmsEndpointShrinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
