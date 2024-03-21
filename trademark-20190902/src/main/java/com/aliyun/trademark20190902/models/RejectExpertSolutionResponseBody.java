// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class RejectExpertSolutionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RejectExpertSolutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RejectExpertSolutionResponseBody self = new RejectExpertSolutionResponseBody();
        return TeaModel.build(map, self);
    }

    public RejectExpertSolutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
