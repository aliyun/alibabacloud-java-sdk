// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateSummariesResponseBody extends TeaModel {
    @NameInMap("result")
    public Boolean result;

    @NameInMap("requestId")
    public String requestId;

    public static UpdateSummariesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSummariesResponseBody self = new UpdateSummariesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSummariesResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public UpdateSummariesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
