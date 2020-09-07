// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckAccountNameAvailableResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CheckAccountNameAvailableResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAccountNameAvailableResponse self = new CheckAccountNameAvailableResponse();
        return TeaModel.build(map, self);
    }

    public CheckAccountNameAvailableResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
