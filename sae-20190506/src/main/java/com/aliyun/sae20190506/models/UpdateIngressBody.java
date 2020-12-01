// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateIngressBody extends TeaModel {
    @NameInMap("Rules")
    public String rules;

    public static UpdateIngressBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIngressBody self = new UpdateIngressBody();
        return TeaModel.build(map, self);
    }

    public UpdateIngressBody setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

}
