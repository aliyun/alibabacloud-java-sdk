// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateAliasRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("alias")
    public String alias;

    /**
     * <strong>example:</strong>
     * <p>index</p>
     */
    @NameInMap("index")
    public String index;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("newMode")
    public Boolean newMode;

    public static CreateAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAliasRequest self = new CreateAliasRequest();
        return TeaModel.build(map, self);
    }

    public CreateAliasRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public CreateAliasRequest setIndex(String index) {
        this.index = index;
        return this;
    }
    public String getIndex() {
        return this.index;
    }

    public CreateAliasRequest setNewMode(Boolean newMode) {
        this.newMode = newMode;
        return this;
    }
    public Boolean getNewMode() {
        return this.newMode;
    }

}
