// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200805.models;

import com.aliyun.tea.*;

public class DeleteRowLevelByTagResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public Boolean result;

    public static DeleteRowLevelByTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRowLevelByTagResponseBody self = new DeleteRowLevelByTagResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRowLevelByTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRowLevelByTagResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteRowLevelByTagResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
