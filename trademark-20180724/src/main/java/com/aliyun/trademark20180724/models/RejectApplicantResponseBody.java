// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class RejectApplicantResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RejectApplicantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RejectApplicantResponseBody self = new RejectApplicantResponseBody();
        return TeaModel.build(map, self);
    }

    public RejectApplicantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
