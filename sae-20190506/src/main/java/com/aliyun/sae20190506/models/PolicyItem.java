// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class PolicyItem extends TeaModel {
    @NameInMap("key")
    public String key;

    @NameInMap("operator")
    public String operator;

    @NameInMap("type")
    public String type;

    @NameInMap("value")
    public String value;

    public static PolicyItem build(java.util.Map<String, ?> map) throws Exception {
        PolicyItem self = new PolicyItem();
        return TeaModel.build(map, self);
    }

    public PolicyItem setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public PolicyItem setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public PolicyItem setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PolicyItem setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
