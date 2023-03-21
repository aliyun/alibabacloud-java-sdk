// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteLoginBaseConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLoginBaseConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLoginBaseConfigResponseBody self = new DeleteLoginBaseConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLoginBaseConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
