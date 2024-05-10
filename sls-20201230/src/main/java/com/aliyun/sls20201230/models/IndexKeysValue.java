// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class IndexKeysValue extends TeaModel {
    @NameInMap("chn")
    public Boolean chn;

    @NameInMap("caseSensitive")
    public Boolean caseSensitive;

    @NameInMap("token")
    public java.util.List<String> token;

    @NameInMap("alias")
    public String alias;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

    @NameInMap("doc_value")
    public Boolean docValue;

    public static IndexKeysValue build(java.util.Map<String, ?> map) throws Exception {
        IndexKeysValue self = new IndexKeysValue();
        return TeaModel.build(map, self);
    }

    public IndexKeysValue setChn(Boolean chn) {
        this.chn = chn;
        return this;
    }
    public Boolean getChn() {
        return this.chn;
    }

    public IndexKeysValue setCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        return this;
    }
    public Boolean getCaseSensitive() {
        return this.caseSensitive;
    }

    public IndexKeysValue setToken(java.util.List<String> token) {
        this.token = token;
        return this;
    }
    public java.util.List<String> getToken() {
        return this.token;
    }

    public IndexKeysValue setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public IndexKeysValue setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public IndexKeysValue setDocValue(Boolean docValue) {
        this.docValue = docValue;
        return this;
    }
    public Boolean getDocValue() {
        return this.docValue;
    }

}
