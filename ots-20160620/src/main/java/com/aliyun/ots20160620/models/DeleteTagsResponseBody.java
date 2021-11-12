// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class DeleteTagsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTagsResponseBody self = new DeleteTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
