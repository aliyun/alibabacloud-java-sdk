// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOmsMysqlDataSourceRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("DgDatabaseId")
    public String dgDatabaseId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Ip")
    public String ip;

    /**
     * <p>```</p>
     * <p>http(s)://[Endpoint]/?Action=CreateOmsMysqlDataSource</p>
     * <p>&Name=oms-mysql</p>
     * <p>&Type=INTERNET</p>
     * <p>&VpcId=vpc-12345abcde*******</p>
     * <p>&InstanceId=pc-12ab34cd56******</p>
     * <p>&DgDatabaseId=dg-yhss6sdlaff****</p>
     * <p>&Ip=10.0.****</p>
     * <p>&Port=3306</p>
     * <p>&Schema=test</p>
     * <p>&Username=omsTestUser</p>
     * <p>&Password=YWJjZDEyM0Ah</p>
     * <p>&Description=MySQL data source for OMS testing</p>
     * <p>&Common request parameters</p>
     * <p>```</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Password")
    public String password;

    @NameInMap("Port")
    public String port;

    @NameInMap("Schema")
    public String schema;

    @NameInMap("Type")
    public String type;

    @NameInMap("Username")
    public String username;

    @NameInMap("VpcId")
    public String vpcId;

    public static CreateOmsMysqlDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOmsMysqlDataSourceRequest self = new CreateOmsMysqlDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateOmsMysqlDataSourceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateOmsMysqlDataSourceRequest setDgDatabaseId(String dgDatabaseId) {
        this.dgDatabaseId = dgDatabaseId;
        return this;
    }
    public String getDgDatabaseId() {
        return this.dgDatabaseId;
    }

    public CreateOmsMysqlDataSourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateOmsMysqlDataSourceRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public CreateOmsMysqlDataSourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateOmsMysqlDataSourceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateOmsMysqlDataSourceRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public CreateOmsMysqlDataSourceRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public CreateOmsMysqlDataSourceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateOmsMysqlDataSourceRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public CreateOmsMysqlDataSourceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
