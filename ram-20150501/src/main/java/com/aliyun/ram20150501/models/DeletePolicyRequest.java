// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DeletePolicyRequest extends TeaModel {
    /**
     * <p>Specifies whether to delete all versions of the policy. Valid values:</p>
     * <ul>
     * <li>true: deletes all versions of the policy.</li>
     * <li>false: does not delete all versions of the policy. If you set the parameter to false, the non-default versions of the policy are not deleted. Before you delete the policy, you must manually delete all non-default versions of the policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CascadingDelete")
    public Boolean cascadingDelete;

    /**
     * <p>The name of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS-Administrator</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    public static DeletePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyRequest self = new DeletePolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeletePolicyRequest setCascadingDelete(Boolean cascadingDelete) {
        this.cascadingDelete = cascadingDelete;
        return this;
    }
    public Boolean getCascadingDelete() {
        return this.cascadingDelete;
    }

    public DeletePolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

}
