// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteCheckPolicyRequest extends TeaModel {
    /**
     * <p>Array of policies to delete</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PolicyIds")
    public java.util.List<Long> policyIds;

    /**
     * <p>Policy type for custom check rule:</p>
     * <ul>
     * <li><strong>STANDARD</strong>: Standard-level policy</li>
     * <li><strong>REQUIREMENT</strong>: Requirement-level policy</li>
     * <li><strong>SECTION</strong>: Section-level policy</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>STANDARD</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    public static DeleteCheckPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCheckPolicyRequest self = new DeleteCheckPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCheckPolicyRequest setPolicyIds(java.util.List<Long> policyIds) {
        this.policyIds = policyIds;
        return this;
    }
    public java.util.List<Long> getPolicyIds() {
        return this.policyIds;
    }

    public DeleteCheckPolicyRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

}
