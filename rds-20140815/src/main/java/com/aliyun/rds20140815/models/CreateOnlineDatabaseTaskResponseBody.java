// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateOnlineDatabaseTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1B2EBD14-36F6-4645-A3F9-DE19D321C18F</p>
     */
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
