// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateCheckPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the parent policy.</p>
     * <p>(The specific dependency order from low to high is Section -&gt; Requirement -&gt; Standard)</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("DependentPolicyId")
    public Long dependentPolicyId;

    /**
     * <p>The name of the custom policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TestPolicyName</p>
     */
    @NameInMap("PolicyShowName")
    public String policyShowName;

    /**
     * <p>The policy category type for custom check rules:</p>
     * <ul>
     * <li><strong>STANDARD</strong>: Add to a standard.</li>
     * <li><strong>REQUIREMENT</strong>: Add to a requirement.</li>
     * <li><strong>SECTION</strong>: Add to a section.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>STANDARD</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    /**
     * <p>The name of the major policy category (required when PolicyType is STANDARD):</p>
     * <ul>
     * <li><strong>AISPM</strong>: AI Configuration Management (AISPM).</li>
     * <li><strong>IDENTITY_PERMISSION</strong>: Identity and Permission Management (CIEM).</li>
     * <li><strong>RISK</strong>: Security Risk.</li>
     * <li><strong>COMPLIANCE</strong>: Compliance Risk.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AISPM</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateCheckPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCheckPolicyRequest self = new CreateCheckPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateCheckPolicyRequest setDependentPolicyId(Long dependentPolicyId) {
        this.dependentPolicyId = dependentPolicyId;
        return this;
    }
    public Long getDependentPolicyId() {
        return this.dependentPolicyId;
    }

    public CreateCheckPolicyRequest setPolicyShowName(String policyShowName) {
        this.policyShowName = policyShowName;
        return this;
    }
    public String getPolicyShowName() {
        return this.policyShowName;
    }

    public CreateCheckPolicyRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public CreateCheckPolicyRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
