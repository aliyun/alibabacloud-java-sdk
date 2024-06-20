// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteAppStreamingOutTemplateResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>30D41049-D02D-1C21-86AE-B3E5FD825C17</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAppStreamingOutTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppStreamingOutTemplateResponseBody self = new DeleteAppStreamingOutTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAppStreamingOutTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
