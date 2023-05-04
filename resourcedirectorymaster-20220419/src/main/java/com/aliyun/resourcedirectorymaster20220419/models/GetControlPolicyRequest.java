// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class GetControlPolicyRequest extends TeaModel {
    @NameInMap("Language")
    public String language;

    @NameInMap("PolicyId")
    public String policyId;

    public static GetControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetControlPolicyRequest self = new GetControlPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetControlPolicyRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetControlPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
