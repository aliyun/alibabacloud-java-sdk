// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809.models;

import com.aliyun.tea.*;

public class QueryConfigRequest extends TeaModel {
    @NameInMap("ConfigKey")
    public String configKey;

    @NameInMap("ItemKey")
    public String itemKey;

    public static QueryConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConfigRequest self = new QueryConfigRequest();
        return TeaModel.build(map, self);
    }

    public QueryConfigRequest setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }
    public String getConfigKey() {
        return this.configKey;
    }

    public QueryConfigRequest setItemKey(String itemKey) {
        this.itemKey = itemKey;
        return this;
    }
    public String getItemKey() {
        return this.itemKey;
    }

}
