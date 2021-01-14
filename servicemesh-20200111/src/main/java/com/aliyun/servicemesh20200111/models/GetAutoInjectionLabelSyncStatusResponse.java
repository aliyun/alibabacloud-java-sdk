// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetAutoInjectionLabelSyncStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    public static GetAutoInjectionLabelSyncStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAutoInjectionLabelSyncStatusResponse self = new GetAutoInjectionLabelSyncStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetAutoInjectionLabelSyncStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAutoInjectionLabelSyncStatusResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
