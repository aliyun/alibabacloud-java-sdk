// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateResourceRuleItemResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceRuleItemId")
    public String resourceRuleItemId;

    public static CreateResourceRuleItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceRuleItemResponseBody self = new CreateResourceRuleItemResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateResourceRuleItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateResourceRuleItemResponseBody setResourceRuleItemId(String resourceRuleItemId) {
        this.resourceRuleItemId = resourceRuleItemId;
        return this;
    }
    public String getResourceRuleItemId() {
        return this.resourceRuleItemId;
    }

}
