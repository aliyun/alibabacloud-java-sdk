// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListClientUserDefineRuleTypesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array consisting of the rule types that are supported.</p>
     */
    @NameInMap("UserDefineRuleTypes")
    public java.util.List<String> userDefineRuleTypes;

    public static ListClientUserDefineRuleTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClientUserDefineRuleTypesResponseBody self = new ListClientUserDefineRuleTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClientUserDefineRuleTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClientUserDefineRuleTypesResponseBody setUserDefineRuleTypes(java.util.List<String> userDefineRuleTypes) {
        this.userDefineRuleTypes = userDefineRuleTypes;
        return this;
    }
    public java.util.List<String> getUserDefineRuleTypes() {
        return this.userDefineRuleTypes;
    }

}
