// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasApprovalNwcancelRequest extends TeaModel {
    @NameInMap("ApprovalTaskId")
    public String approvalTaskId;

    public static ExecHasApprovalNwcancelRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecHasApprovalNwcancelRequest self = new ExecHasApprovalNwcancelRequest();
        return TeaModel.build(map, self);
    }

    public ExecHasApprovalNwcancelRequest setApprovalTaskId(String approvalTaskId) {
        this.approvalTaskId = approvalTaskId;
        return this;
    }
    public String getApprovalTaskId() {
        return this.approvalTaskId;
    }

}
