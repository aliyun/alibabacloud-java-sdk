// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteStorageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteStorageResponseBody self = new DeleteStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
