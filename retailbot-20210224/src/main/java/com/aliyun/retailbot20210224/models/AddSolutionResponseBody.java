// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class AddSolutionResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 答案id
    @NameInMap("SolutionId")
    public Long solutionId;

    public static AddSolutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddSolutionResponseBody self = new AddSolutionResponseBody();
        return TeaModel.build(map, self);
    }

    public AddSolutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddSolutionResponseBody setSolutionId(Long solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public Long getSolutionId() {
        return this.solutionId;
    }

}
