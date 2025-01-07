// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateRdDefaultSyncListResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>BA674E4B-00CF-5DEA-8B92-360862FB5133</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRdDefaultSyncListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRdDefaultSyncListResponseBody self = new CreateRdDefaultSyncListResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRdDefaultSyncListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
