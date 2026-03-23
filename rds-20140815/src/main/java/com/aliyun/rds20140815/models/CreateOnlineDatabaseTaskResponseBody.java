// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateOnlineDatabaseTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateOnlineDatabaseTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOnlineDatabaseTaskResponseBody self = new CreateOnlineDatabaseTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOnlineDatabaseTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
