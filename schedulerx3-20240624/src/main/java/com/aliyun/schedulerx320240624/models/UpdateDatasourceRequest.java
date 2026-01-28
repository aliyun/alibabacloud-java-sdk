// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class UpdateDatasourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;host&quot;:&quot;rm-bp1f03mxxxxx.mysql.rds.aliyuncs.com&quot;,&quot;port&quot;:3306,&quot;userName&quot;:&quot;test01&quot;,&quot;database&quot;:&quot;test01&quot;,&quot;other&quot;:{&quot;useSSL&quot;:&quot;false&quot;}}</p>
     */
    @NameInMap("ConnectionParams")
    public String connectionParams;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DatasourceId")
    public Long datasourceId;

    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>2F9e9@a69c!e18b569c8</p>
     */
    @NameInMap("Password")
    public String password;

    public static UpdateDatasourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasourceRequest self = new UpdateDatasourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDatasourceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateDatasourceRequest setConnectionParams(String connectionParams) {
        this.connectionParams = connectionParams;
        return this;
    }
    public String getConnectionParams() {
        return this.connectionParams;
    }

    public UpdateDatasourceRequest setDatasourceId(Long datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }
    public Long getDatasourceId() {
        return this.datasourceId;
    }

    public UpdateDatasourceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDatasourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDatasourceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
