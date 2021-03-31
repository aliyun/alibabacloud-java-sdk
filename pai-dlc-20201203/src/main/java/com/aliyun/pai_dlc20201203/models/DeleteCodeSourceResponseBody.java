// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DeleteCodeSourceResponseBody extends TeaModel {
    // 被删除的代码源配置ID
    @NameInMap("CodeSourceId")
    public String codeSourceId;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCodeSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCodeSourceResponseBody self = new DeleteCodeSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCodeSourceResponseBody setCodeSourceId(String codeSourceId) {
        this.codeSourceId = codeSourceId;
        return this;
    }
    public String getCodeSourceId() {
        return this.codeSourceId;
    }

    public DeleteCodeSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
