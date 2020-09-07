// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckDBNameAvailableResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CheckDBNameAvailableResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDBNameAvailableResponse self = new CheckDBNameAvailableResponse();
        return TeaModel.build(map, self);
    }

    public CheckDBNameAvailableResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
