// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasApprovalNwacceptRequest extends TeaModel {
    @NameInMap("ApprovalTaskId")
    public String approvalTaskId;

    public static ExecHasApprovalNwacceptRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecHasApprovalNwacceptRequest self = new ExecHasApprovalNwacceptRequest();
        return TeaModel.build(map, self);
    }

    public ExecHasApprovalNwacceptRequest setApprovalTaskId(String approvalTaskId) {
        this.approvalTaskId = approvalTaskId;
        return this;
    }
    public String getApprovalTaskId() {
        return this.approvalTaskId;
    }

}
