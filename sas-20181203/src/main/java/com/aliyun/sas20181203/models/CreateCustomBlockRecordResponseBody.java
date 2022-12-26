// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateCustomBlockRecordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCustomBlockRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomBlockRecordResponseBody self = new CreateCustomBlockRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomBlockRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
