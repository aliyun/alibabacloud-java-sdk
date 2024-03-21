// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ConfirmExpertSolutionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ConfirmExpertSolutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfirmExpertSolutionResponseBody self = new ConfirmExpertSolutionResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfirmExpertSolutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
