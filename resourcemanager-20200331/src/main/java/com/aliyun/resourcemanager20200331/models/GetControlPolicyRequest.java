// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetControlPolicyRequest extends TeaModel {
    /**
     * <p>The language in which you want to return the description of the access control policy. Valid values:</p>
     * <ul>
     * <li>zh-CN (default value): Chinese</li>
     * <li>en: English</li>
     * <li>ja: Japanese</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is valid only for system access control policies.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The ID of the access control policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cp-SImPt8GCEwiq****</p>
     */
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
