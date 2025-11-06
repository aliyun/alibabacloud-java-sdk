// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteAppViewTemplateResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>30D41049-D02D-1C21-86AE-B3E5FD825C17</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAppViewTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppViewTemplateResponseBody self = new DeleteAppViewTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAppViewTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
