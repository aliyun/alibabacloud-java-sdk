// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetPolicyRequest extends TeaModel {
    /**
     * <p>The language that is used to return the description of the system policy. Valid values:</p>
     * <br>
     * <p>*   en: English</p>
     * <p>*   zh-CN: Chinese</p>
     * <p>*   ja: Japanese</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The name of the policy.</p>
     * <br>
     * <p>The name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The type of the policy. Valid values:</p>
     * <br>
     * <p>*   Custom: custom policy</p>
     * <p>*   System: system policy</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    public static GetPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyRequest self = new GetPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetPolicyRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public GetPolicyRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

}
