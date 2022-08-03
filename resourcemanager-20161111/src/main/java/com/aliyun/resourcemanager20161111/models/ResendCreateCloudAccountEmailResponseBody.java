// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class ResendCreateCloudAccountEmailResponseBody extends TeaModel {
    @NameInMap("RecordId")
    public String recordId;

    @NameInMap("RequestId")
    public String requestId;

    public static ResendCreateCloudAccountEmailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResendCreateCloudAccountEmailResponseBody self = new ResendCreateCloudAccountEmailResponseBody();
        return TeaModel.build(map, self);
    }

    public ResendCreateCloudAccountEmailResponseBody setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public ResendCreateCloudAccountEmailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
