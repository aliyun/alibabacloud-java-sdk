// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListSystemClientRuleTypesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the rule types.</p>
     */
    @NameInMap("RuleTypes")
    public java.util.List<String> ruleTypes;

    public static ListSystemClientRuleTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSystemClientRuleTypesResponseBody self = new ListSystemClientRuleTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSystemClientRuleTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSystemClientRuleTypesResponseBody setRuleTypes(java.util.List<String> ruleTypes) {
        this.ruleTypes = ruleTypes;
        return this;
    }
    public java.util.List<String> getRuleTypes() {
        return this.ruleTypes;
    }

}
