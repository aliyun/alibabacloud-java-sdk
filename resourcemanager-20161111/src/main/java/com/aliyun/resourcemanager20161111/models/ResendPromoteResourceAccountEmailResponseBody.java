// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class ResendPromoteResourceAccountEmailResponseBody extends TeaModel {
    @NameInMap("RecordId")
    public String recordId;

    @NameInMap("RequestId")
    public String requestId;

    public static ResendPromoteResourceAccountEmailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResendPromoteResourceAccountEmailResponseBody self = new ResendPromoteResourceAccountEmailResponseBody();
        return TeaModel.build(map, self);
    }

    public ResendPromoteResourceAccountEmailResponseBody setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public ResendPromoteResourceAccountEmailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
