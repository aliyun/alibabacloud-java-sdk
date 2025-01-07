// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdatePublishBatchResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3956048F-9D73-5EDB-834B-4827BB******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePublishBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublishBatchResponseBody self = new UpdatePublishBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePublishBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
