// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateAuthorizationUserResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public Boolean resultObject;

    public static CreateAuthorizationUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthorizationUserResponseBody self = new CreateAuthorizationUserResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAuthorizationUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAuthorizationUserResponseBody setResultObject(Boolean resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Boolean getResultObject() {
        return this.resultObject;
    }

}
