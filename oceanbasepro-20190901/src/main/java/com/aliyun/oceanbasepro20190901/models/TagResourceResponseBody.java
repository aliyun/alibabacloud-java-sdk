// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class TagResourceResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static TagResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TagResourceResponseBody self = new TagResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public TagResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TagResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
