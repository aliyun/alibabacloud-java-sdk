// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ChangeVisibilityModelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Integer result;

    @NameInMap("Success")
    public Boolean success;

    public static ChangeVisibilityModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeVisibilityModelResponseBody self = new ChangeVisibilityModelResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeVisibilityModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeVisibilityModelResponseBody setResult(Integer result) {
        this.result = result;
        return this;
    }
    public Integer getResult() {
        return this.result;
    }

    public ChangeVisibilityModelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
