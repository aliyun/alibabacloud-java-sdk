// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyAliasRequest extends TeaModel {
    /**
     * <p>alias name</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("alias")
    public String alias;

    /**
     * <p>index name</p>
     * 
     * <strong>example:</strong>
     * <p>index</p>
     */
    @NameInMap("index")
    public String index;

    public static ModifyAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAliasRequest self = new ModifyAliasRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAliasRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public ModifyAliasRequest setIndex(String index) {
        this.index = index;
        return this;
    }
    public String getIndex() {
        return this.index;
    }

}
