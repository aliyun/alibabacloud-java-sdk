// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteCostRuleResponseBody extends TeaModel {
    /**
     * <p>The list of model API IDs affected by the deletion.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;ma-2ze3x6i1d7g5rto28&quot;]</p>
     */
    @NameInMap("AffectedModelApiIds")
    public java.util.List<String> affectedModelApiIds;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7E2FE3BB-C677-5FF9-9FC5-9CF364BD6BE5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the deletion was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteCostRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCostRuleResponseBody self = new DeleteCostRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCostRuleResponseBody setAffectedModelApiIds(java.util.List<String> affectedModelApiIds) {
        this.affectedModelApiIds = affectedModelApiIds;
        return this;
    }
    public java.util.List<String> getAffectedModelApiIds() {
        return this.affectedModelApiIds;
    }

    public DeleteCostRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCostRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
