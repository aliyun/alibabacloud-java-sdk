// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class UpdateDatasourceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;address&quot;: &quot;&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>datasource1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>igraph_instance1</p>
     */
    @NameInMap("Uri")
    public String uri;

    public static UpdateDatasourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasourceRequest self = new UpdateDatasourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDatasourceRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateDatasourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDatasourceRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
