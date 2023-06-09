// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateSummariesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful.</p>
     */
    @NameInMap("result")
    public Boolean result;

    public static UpdateSummariesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSummariesResponseBody self = new UpdateSummariesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSummariesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSummariesResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
