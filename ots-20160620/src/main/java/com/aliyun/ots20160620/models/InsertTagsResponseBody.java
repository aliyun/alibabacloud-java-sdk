// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class InsertTagsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static InsertTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertTagsResponseBody self = new InsertTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public InsertTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
