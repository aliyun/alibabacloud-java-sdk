// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateCustomBlockRecordResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>30CBF632-109F-596F-97F2-451C8B2A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCustomBlockRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomBlockRecordResponseBody self = new CreateCustomBlockRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomBlockRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
