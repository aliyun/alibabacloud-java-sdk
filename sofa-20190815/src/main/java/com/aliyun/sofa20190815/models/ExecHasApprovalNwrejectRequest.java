// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasApprovalNwrejectRequest extends TeaModel {
    @NameInMap("ApprovalTaskId")
    public String approvalTaskId;

    public static ExecHasApprovalNwrejectRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecHasApprovalNwrejectRequest self = new ExecHasApprovalNwrejectRequest();
        return TeaModel.build(map, self);
    }

    public ExecHasApprovalNwrejectRequest setApprovalTaskId(String approvalTaskId) {
        this.approvalTaskId = approvalTaskId;
        return this;
    }
    public String getApprovalTaskId() {
        return this.approvalTaskId;
    }

}
