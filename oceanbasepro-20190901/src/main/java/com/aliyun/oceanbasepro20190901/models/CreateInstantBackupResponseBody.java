// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateInstantBackupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateInstantBackupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstantBackupResponseBody self = new CreateInstantBackupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstantBackupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
