// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200807.models;

import com.aliyun.tea.*;

public class UpdateEmbeddedStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public Integer result;

    public static UpdateEmbeddedStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEmbeddedStatusResponseBody self = new UpdateEmbeddedStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEmbeddedStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateEmbeddedStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateEmbeddedStatusResponseBody setResult(Integer result) {
        this.result = result;
        return this;
    }
    public Integer getResult() {
        return this.result;
    }

}
