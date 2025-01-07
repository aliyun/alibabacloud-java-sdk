// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdatePublishCronResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1052B989-305B-50A5-B5F5-998450******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePublishCronResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublishCronResponseBody self = new UpdatePublishCronResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePublishCronResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
