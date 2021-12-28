// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetAutoInjectionLabelSyncStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static GetAutoInjectionLabelSyncStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAutoInjectionLabelSyncStatusResponseBody self = new GetAutoInjectionLabelSyncStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAutoInjectionLabelSyncStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAutoInjectionLabelSyncStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
