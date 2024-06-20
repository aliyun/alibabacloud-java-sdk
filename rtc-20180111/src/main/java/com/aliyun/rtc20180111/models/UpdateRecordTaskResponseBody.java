// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateRecordTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>760bad53276431c499e30dc36f6b26be</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateRecordTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecordTaskResponseBody self = new UpdateRecordTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRecordTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
