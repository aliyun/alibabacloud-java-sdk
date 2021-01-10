// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMSDdsJobStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateMSDdsJobStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMSDdsJobStatusResponseBody self = new UpdateMSDdsJobStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMSDdsJobStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
