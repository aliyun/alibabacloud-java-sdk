// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteEditingProjectResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEditingProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEditingProjectResponseBody self = new DeleteEditingProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEditingProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
