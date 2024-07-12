// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CheckInstanceDatasourceRequest extends TeaModel {
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
     * <p>Hologres</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>igraph1</p>
     */
    @NameInMap("Uri")
    public String uri;

    public static CheckInstanceDatasourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckInstanceDatasourceRequest self = new CheckInstanceDatasourceRequest();
        return TeaModel.build(map, self);
    }

    public CheckInstanceDatasourceRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CheckInstanceDatasourceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CheckInstanceDatasourceRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
