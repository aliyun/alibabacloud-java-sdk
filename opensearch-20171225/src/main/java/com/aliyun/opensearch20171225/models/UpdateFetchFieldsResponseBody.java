// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateFetchFieldsResponseBody extends TeaModel {
    @NameInMap("result")
    public Boolean result;

    @NameInMap("requestId")
    public String requestId;

    public static UpdateFetchFieldsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFetchFieldsResponseBody self = new UpdateFetchFieldsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFetchFieldsResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public UpdateFetchFieldsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
