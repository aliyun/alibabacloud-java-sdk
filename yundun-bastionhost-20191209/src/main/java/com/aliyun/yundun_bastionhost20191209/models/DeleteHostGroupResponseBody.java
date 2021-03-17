// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DeleteHostGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteHostGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHostGroupResponseBody self = new DeleteHostGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHostGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
