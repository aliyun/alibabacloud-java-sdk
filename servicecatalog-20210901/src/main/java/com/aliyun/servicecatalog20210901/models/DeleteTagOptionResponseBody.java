// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class DeleteTagOptionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTagOptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTagOptionResponseBody self = new DeleteTagOptionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTagOptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
