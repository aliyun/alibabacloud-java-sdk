// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckDBNameAvailableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CheckDBNameAvailableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDBNameAvailableResponseBody self = new CheckDBNameAvailableResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDBNameAvailableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
