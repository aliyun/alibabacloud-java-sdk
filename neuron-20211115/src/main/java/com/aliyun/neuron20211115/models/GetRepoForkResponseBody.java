// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetRepoForkResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public ReposFork result;

    public static GetRepoForkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRepoForkResponseBody self = new GetRepoForkResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRepoForkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRepoForkResponseBody setResult(ReposFork result) {
        this.result = result;
        return this;
    }
    public ReposFork getResult() {
        return this.result;
    }

}
