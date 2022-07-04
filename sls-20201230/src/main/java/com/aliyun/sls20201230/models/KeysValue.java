// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class KeysValue extends TeaModel {
    // 大小写敏感
    @NameInMap("caseSensitive")
    public Boolean caseSensitive;

    // 包含中文
    @NameInMap("chn")
    public Boolean chn;

    // 字段的索引类型
    @NameInMap("type")
    public String type;

    // 别名
    @NameInMap("alias")
    public String alias;

    // 分词符列表。仅当type参数取值为text时，必须设置。
    @NameInMap("token")
    public java.util.List<String> token;

    // 开启统计
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
