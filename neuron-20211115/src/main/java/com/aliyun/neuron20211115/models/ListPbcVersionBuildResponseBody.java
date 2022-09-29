// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPbcVersionBuildResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PbcVersionListResult result;

    public static ListPbcVersionBuildResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPbcVersionBuildResponseBody self = new ListPbcVersionBuildResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPbcVersionBuildResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPbcVersionBuildResponseBody setResult(PbcVersionListResult result) {
        this.result = result;
        return this;
    }
    public PbcVersionListResult getResult() {
        return this.result;
    }

}
