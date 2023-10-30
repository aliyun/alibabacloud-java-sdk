// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DeleteHostAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteHostAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHostAccountResponseBody self = new DeleteHostAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHostAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
