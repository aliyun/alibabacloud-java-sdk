// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricSystemparameterconfigRequest extends TeaModel {
    @NameInMap("ConfigKey")
    public String configKey;

    @NameInMap("ConfigType")
    public String configType;

    public static QueryLinkefabricFabricSystemparameterconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricSystemparameterconfigRequest self = new QueryLinkefabricFabricSystemparameterconfigRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricSystemparameterconfigRequest setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }
    public String getConfigKey() {
        return this.configKey;
    }

    public QueryLinkefabricFabricSystemparameterconfigRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

}
