// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateCheckPolicyRequest extends TeaModel {
    /**
     * <p>ID of the associated parent policy.</p>
     * <p>(The specific dependency hierarchy, from low to high, is Section -&gt; Requirement -&gt; Standard).</p>
     * 
     * <strong>example:</strong>
     * <p>1000000000002</p>
     */
    @NameInMap("DependentPolicyId")
    public Long dependentPolicyId;

    /**
     * <p>ID of the custom policy.</p>
     * <blockquote>
     * <p>You can obtain this parameter by calling the <a href="~~ListCheckPolicies~~">ListCheckPolicies</a> API.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000000001</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    /**
     * <p>Name of the custom classification.</p>
     * 
     * <strong>example:</strong>
     * <p>testPolicyName</p>
     */
    @NameInMap("PolicyShowName")
    public String policyShowName;

    /**
     * <p>Classification type of the custom check item rule:</p>
     * <ul>
     * <li><strong>STANDARD</strong>: Add to standard.</li>
     * <li><strong>REQUIREMENT</strong>: Add to requirement.</li>
     * <li><strong>SECTION</strong>: Add to section.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>STANDARD</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    /**
     * <p>Name of the associated major policy category (required when PolicyType is STANDARD):</p>
     * <ul>
     * <li><strong>AISPM</strong>: AI Configuration Management (AISPM).</li>
     * <li><strong>RISK</strong>: Security Risk.</li>
     * <li><strong>COMPLIANCE</strong>: Compliance Risk.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AISPM</p>
     */
    @NameInMap("Type")
    public String type;

    public static UpdateCheckPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCheckPolicyRequest self = new UpdateCheckPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCheckPolicyRequest setDependentPolicyId(Long dependentPolicyId) {
        this.dependentPolicyId = dependentPolicyId;
        return this;
    }
    public Long getDependentPolicyId() {
        return this.dependentPolicyId;
    }

    public UpdateCheckPolicyRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public UpdateCheckPolicyRequest setPolicyShowName(String policyShowName) {
        this.policyShowName = policyShowName;
        return this;
    }
    public String getPolicyShowName() {
        return this.policyShowName;
    }

    public UpdateCheckPolicyRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public UpdateCheckPolicyRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
