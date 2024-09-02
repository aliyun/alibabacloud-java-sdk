// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class IndexKey extends TeaModel {
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

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("index_all")
    public Boolean indexAll;

    @NameInMap("json_keys")
    public java.util.Map<String, IndexJsonKey> jsonKeys;

    @NameInMap("max_depth")
    public Long maxDepth;

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

    public static IndexKey build(java.util.Map<String, ?> map) throws Exception {
        IndexKey self = new IndexKey();
        return TeaModel.build(map, self);
    }

    public IndexKey setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public IndexKey setCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        return this;
    }
    public Boolean getCaseSensitive() {
        return this.caseSensitive;
    }

    public IndexKey setChn(Boolean chn) {
        this.chn = chn;
        return this;
    }
    public Boolean getChn() {
        return this.chn;
    }

    public IndexKey setDocValue(Boolean docValue) {
        this.docValue = docValue;
        return this;
    }
    public Boolean getDocValue() {
        return this.docValue;
    }

    public IndexKey setIndexAll(Boolean indexAll) {
        this.indexAll = indexAll;
        return this;
    }
    public Boolean getIndexAll() {
        return this.indexAll;
    }

    public IndexKey setJsonKeys(java.util.Map<String, IndexJsonKey> jsonKeys) {
        this.jsonKeys = jsonKeys;
        return this;
    }
    public java.util.Map<String, IndexJsonKey> getJsonKeys() {
        return this.jsonKeys;
    }

    public IndexKey setMaxDepth(Long maxDepth) {
        this.maxDepth = maxDepth;
        return this;
    }
    public Long getMaxDepth() {
        return this.maxDepth;
    }

    public IndexKey setToken(java.util.List<String> token) {
        this.token = token;
        return this;
    }
    public java.util.List<String> getToken() {
        return this.token;
    }

    public IndexKey setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
