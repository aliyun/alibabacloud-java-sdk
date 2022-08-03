// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class RoutingRuleCondition extends TeaModel {
    @NameInMap("HttpErrorCodeReturnedEquals")
    public Long httpErrorCodeReturnedEquals;

    @NameInMap("KeyPrefixEquals")
    public String keyPrefixEquals;

    public static RoutingRuleCondition build(java.util.Map<String, ?> map) throws Exception {
        RoutingRuleCondition self = new RoutingRuleCondition();
        return TeaModel.build(map, self);
    }

    public RoutingRuleCondition setHttpErrorCodeReturnedEquals(Long httpErrorCodeReturnedEquals) {
        this.httpErrorCodeReturnedEquals = httpErrorCodeReturnedEquals;
        return this;
    }
    public Long getHttpErrorCodeReturnedEquals() {
        return this.httpErrorCodeReturnedEquals;
    }

    public RoutingRuleCondition setKeyPrefixEquals(String keyPrefixEquals) {
        this.keyPrefixEquals = keyPrefixEquals;
        return this;
    }
    public String getKeyPrefixEquals() {
        return this.keyPrefixEquals;
    }

}
