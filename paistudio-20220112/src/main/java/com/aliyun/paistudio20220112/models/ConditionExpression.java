// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ConditionExpression extends TeaModel {
    @NameInMap("Key")
    public String key;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("Values")
    public java.util.List<String> values;

    public static ConditionExpression build(java.util.Map<String, ?> map) throws Exception {
        ConditionExpression self = new ConditionExpression();
        return TeaModel.build(map, self);
    }

    public ConditionExpression setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ConditionExpression setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public ConditionExpression setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

}
