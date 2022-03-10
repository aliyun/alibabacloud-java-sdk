// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddUserTagMetaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    @NameInMap("Success")
    public Boolean success;

    public static AddUserTagMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddUserTagMetaResponseBody self = new AddUserTagMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public AddUserTagMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddUserTagMetaResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public AddUserTagMetaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
