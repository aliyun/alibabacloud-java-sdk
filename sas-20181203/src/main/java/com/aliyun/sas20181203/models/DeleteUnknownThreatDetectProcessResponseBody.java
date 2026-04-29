// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteUnknownThreatDetectProcessResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3956048F-9D73-5EDB-834B-4827BB******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUnknownThreatDetectProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUnknownThreatDetectProcessResponseBody self = new DeleteUnknownThreatDetectProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUnknownThreatDetectProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
