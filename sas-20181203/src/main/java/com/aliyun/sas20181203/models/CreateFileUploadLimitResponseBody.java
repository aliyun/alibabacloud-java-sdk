// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateFileUploadLimitResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateFileUploadLimitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFileUploadLimitResponseBody self = new CreateFileUploadLimitResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFileUploadLimitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
