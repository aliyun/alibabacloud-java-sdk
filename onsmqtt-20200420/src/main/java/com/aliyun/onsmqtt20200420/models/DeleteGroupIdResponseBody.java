// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class DeleteGroupIdResponseBody extends TeaModel {
    /**
     * <p>The request ID. This parameter is a common parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>0621DDD7-F0E9-4D35-8900-518116D6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteGroupIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupIdResponseBody self = new DeleteGroupIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGroupIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
