// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasApprovalNwforwardRequest extends TeaModel {
    @NameInMap("Dummy")
    public String dummy;

    @NameInMap("ApprovalTaskId")
    public String approvalTaskId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static ExecHasApprovalNwforwardRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecHasApprovalNwforwardRequest self = new ExecHasApprovalNwforwardRequest();
        return TeaModel.build(map, self);
    }

    public ExecHasApprovalNwforwardRequest setDummy(String dummy) {
        this.dummy = dummy;
        return this;
    }
    public String getDummy() {
        return this.dummy;
    }

    public ExecHasApprovalNwforwardRequest setApprovalTaskId(String approvalTaskId) {
        this.approvalTaskId = approvalTaskId;
        return this;
    }
    public String getApprovalTaskId() {
        return this.approvalTaskId;
    }

    public ExecHasApprovalNwforwardRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
