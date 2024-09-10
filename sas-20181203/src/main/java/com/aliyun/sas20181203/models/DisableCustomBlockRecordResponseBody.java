// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DisableCustomBlockRecordResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>F749D54C-3CA0-5F68-835C-AD35A2BD29EA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableCustomBlockRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableCustomBlockRecordResponseBody self = new DisableCustomBlockRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableCustomBlockRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
