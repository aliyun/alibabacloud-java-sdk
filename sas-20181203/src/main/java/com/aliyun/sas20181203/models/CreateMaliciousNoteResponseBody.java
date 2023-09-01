// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateMaliciousNoteResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateMaliciousNoteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMaliciousNoteResponseBody self = new CreateMaliciousNoteResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMaliciousNoteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
