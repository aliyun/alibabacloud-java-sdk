// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetAutoInjectionLabelSyncStatusResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAutoInjectionLabelSyncStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAutoInjectionLabelSyncStatusResponseBody self = new GetAutoInjectionLabelSyncStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAutoInjectionLabelSyncStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetAutoInjectionLabelSyncStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
