// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class CreateDatasourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;host&quot;:&quot;rm-bp1f03mxxxxx.mysql.rds.aliyuncs.com&quot;,&quot;port&quot;:3306,&quot;userName&quot;:&quot;test01&quot;,&quot;database&quot;:&quot;test01&quot;,&quot;other&quot;:{&quot;useSSL&quot;:&quot;false&quot;}}</p>
     */
    @NameInMap("ConnectionParams")
    public String connectionParams;

    /**
     * <strong>example:</strong>
     * <p>my first datasource</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myDatasouce</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static CreateDatasourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasourceRequest self = new CreateDatasourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasourceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateDatasourceRequest setConnectionParams(String connectionParams) {
        this.connectionParams = connectionParams;
        return this;
    }
    public String getConnectionParams() {
        return this.connectionParams;
    }

    public CreateDatasourceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDatasourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDatasourceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateDatasourceRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
