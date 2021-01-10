// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricSystemparameterqueryconfigbycacheRequest extends TeaModel {
    @NameInMap("ConfigKey")
    public String configKey;

    public static QueryLinkefabricFabricSystemparameterqueryconfigbycacheRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricSystemparameterqueryconfigbycacheRequest self = new QueryLinkefabricFabricSystemparameterqueryconfigbycacheRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricSystemparameterqueryconfigbycacheRequest setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }
    public String getConfigKey() {
        return this.configKey;
    }

}
