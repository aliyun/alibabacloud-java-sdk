// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class KeysValue extends TeaModel {
    /**
     * <p>Specifies whether to enable case sensitivity. This parameter is required only when **type** is set to **text**. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false (default)</p>
     */
    @NameInMap("caseSensitive")
    public Boolean caseSensitive;

    /**
     * <p>Specifies whether to include Chinese characters. This parameter is required only when **type** is set to **text**. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false (default)</p>
     */
    @NameInMap("chn")
    public Boolean chn;

    /**
     * <p>The data type of the field value. Valid values: text, json, double, and long.</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The alias of the field.</p>
     */
    @NameInMap("alias")
    public String alias;

    /**
     * <p>The delimiters that are used to split text.</p>
     */
    @NameInMap("token")
    public java.util.List<String> token;

    /**
     * <p>Specifies whether to turn on Enable Analytics for the field.</p>
     */
    @NameInMap("doc_value")
    public Boolean docValue;

    public static KeysValue build(java.util.Map<String, ?> map) throws Exception {
        KeysValue self = new KeysValue();
        return TeaModel.build(map, self);
    }

    public KeysValue setCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        return this;
    }
    public Boolean getCaseSensitive() {
        return this.caseSensitive;
    }

    public KeysValue setChn(Boolean chn) {
        this.chn = chn;
        return this;
    }
    public Boolean getChn() {
        return this.chn;
    }

    public KeysValue setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public KeysValue setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public KeysValue setToken(java.util.List<String> token) {
        this.token = token;
        return this;
    }
    public java.util.List<String> getToken() {
        return this.token;
    }

    public KeysValue setDocValue(Boolean docValue) {
        this.docValue = docValue;
        return this;
    }
    public Boolean getDocValue() {
        return this.docValue;
    }

}
