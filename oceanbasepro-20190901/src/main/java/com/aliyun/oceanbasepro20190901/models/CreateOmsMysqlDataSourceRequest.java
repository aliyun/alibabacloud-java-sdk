// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOmsMysqlDataSourceRequest extends TeaModel {
    /**
     * <p>The description of the data source.   </p>
     * <br>
     * <p>It must be 2 to 256 characters in length. The default value is null.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the database gateway instance.   </p>
     * <br>
     * <p>> <br>If Type is set to DG, this parameter is required.</p>
     */
    @NameInMap("DgDatabaseId")
    public String dgDatabaseId;

    /**
     * <p>The ID of the ECS instance of the data source.   </p>
     * <br>
     * <p>> <br>If Type is set to RDS, PolarDB, or DG, this parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IP address of the data source.   </p>
     * <br>
     * <p>> <br>If Type is set to INTERNET or VPC, this parameter is required.</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The name of the data source.   </p>
     * <p>It must be 2 to 128 characters in length and can contain letters, digits, underscores (_), periods (.), and hyphens (-).   </p>
     * <br>
     * <p>> <br>Invalid characters, such as slashes (/), are not allowed.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The password of the username that is used to access the database. It must be Base64 encoded.   </p>
     * <p>For example, for the password abcd123@!, the Base64-encoded value is YWJjZDEyM0Ah.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The port number of the data source.   </p>
     * <br>
     * <p>> <br>If Type is set to INTERNET or VPC, this parameter is required.</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The name of the database.   </p>
     * <br>
     * <p>> <br>If you specify this parameter, subsequent migration or synchronization operations will take effect on this database only.</p>
     */
    @NameInMap("Schema")
    public String schema;

    /**
     * <p>The type of the MySQL data source.   </p>
     * <p>Valid values: INTERNET, VPC, RDS, PolarDB, and DG.</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The username that is used to access the database.</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The ID of the VPC to which the data source belongs.   </p>
     * <br>
     * <p>> <br>If Type is set to VPC, this parameter is required.</p>
     */
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
