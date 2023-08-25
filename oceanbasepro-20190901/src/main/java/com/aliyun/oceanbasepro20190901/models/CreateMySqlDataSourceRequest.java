// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateMySqlDataSourceRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("DgInstanceId")
    public String dgInstanceId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Name")
    public String name;

    @NameInMap("Password")
    public String password;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("Schema")
    public String schema;

    @NameInMap("Type")
    public String type;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("VpcId")
    public String vpcId;

    public static CreateMySqlDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMySqlDataSourceRequest self = new CreateMySqlDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateMySqlDataSourceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMySqlDataSourceRequest setDgInstanceId(String dgInstanceId) {
        this.dgInstanceId = dgInstanceId;
        return this;
    }
    public String getDgInstanceId() {
        return this.dgInstanceId;
    }

    public CreateMySqlDataSourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateMySqlDataSourceRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public CreateMySqlDataSourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMySqlDataSourceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateMySqlDataSourceRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public CreateMySqlDataSourceRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public CreateMySqlDataSourceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateMySqlDataSourceRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateMySqlDataSourceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
