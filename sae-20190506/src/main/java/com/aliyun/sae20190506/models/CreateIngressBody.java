// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateIngressBody extends TeaModel {
    @NameInMap("Rules")
    @Validation(required = true)
    public String rules;

    public static CreateIngressBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIngressBody self = new CreateIngressBody();
        return TeaModel.build(map, self);
    }

    public CreateIngressBody setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

}
