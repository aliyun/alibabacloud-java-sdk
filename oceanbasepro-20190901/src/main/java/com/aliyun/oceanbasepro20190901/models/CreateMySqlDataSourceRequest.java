// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateMySqlDataSourceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>dg-x****</p>
     */
    @NameInMap("DgInstanceId")
    public String dgInstanceId;

    /**
     * <strong>example:</strong>
     * <p>rm-t4****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>xxx.xxx.xxx.1</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>source_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pass_word</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <strong>example:</strong>
     * <p>2883</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Schema")
    public String schema;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("Type")
    public String type;

    @NameInMap("UseSsl")
    public Boolean useSsl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_name</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <strong>example:</strong>
     * <p>vpc-bp1d2q3mhg9i23ofi****</p>
     */
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

    public CreateMySqlDataSourceRequest setUseSsl(Boolean useSsl) {
        this.useSsl = useSsl;
        return this;
    }
    public Boolean getUseSsl() {
        return this.useSsl;
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
