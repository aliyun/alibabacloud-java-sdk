// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UploadLabelDataResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UploadLabelDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadLabelDataResponseBody self = new UploadLabelDataResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadLabelDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
