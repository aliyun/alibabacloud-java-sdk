// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CopyDatabaseBetweenInstancesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>803D11AF-C370-465B-AB46-CB3A642DC303</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CopyDatabaseBetweenInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyDatabaseBetweenInstancesResponseBody self = new CopyDatabaseBetweenInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyDatabaseBetweenInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
