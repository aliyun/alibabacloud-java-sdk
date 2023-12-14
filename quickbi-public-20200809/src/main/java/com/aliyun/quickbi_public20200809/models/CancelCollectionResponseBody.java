// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200809.models;

import com.aliyun.tea.*;

public class CancelCollectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    @NameInMap("Success")
    public Boolean success;

    public static CancelCollectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelCollectionResponseBody self = new CancelCollectionResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelCollectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelCollectionResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public CancelCollectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
