// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class IndexJsonKey extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>myAlias</p>
     */
    @NameInMap("alias")
    public String alias;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("caseSensitive")
    public Boolean caseSensitive;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("chn")
    public Boolean chn;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("doc_value")
    public Boolean docValue;

    @NameInMap("token")
    public java.util.List<String> token;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("type")
    public String type;

    public static IndexJsonKey build(java.util.Map<String, ?> map) throws Exception {
        IndexJsonKey self = new IndexJsonKey();
        return TeaModel.build(map, self);
    }

    public IndexJsonKey setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public IndexJsonKey setCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        return this;
    }
    public Boolean getCaseSensitive() {
        return this.caseSensitive;
    }

    public IndexJsonKey setChn(Boolean chn) {
        this.chn = chn;
        return this;
    }
    public Boolean getChn() {
        return this.chn;
    }

    public IndexJsonKey setDocValue(Boolean docValue) {
        this.docValue = docValue;
        return this;
    }
    public Boolean getDocValue() {
        return this.docValue;
    }

    public IndexJsonKey setToken(java.util.List<String> token) {
        this.token = token;
        return this;
    }
    public java.util.List<String> getToken() {
        return this.token;
    }

    public IndexJsonKey setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
