// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckDBNameAvailableResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * <blockquote>
     * <p>If only the request ID is returned, the database name is available. Otherwise, an error message is returned, indicating that the database name is duplicate or does not comply with naming conventions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>6EF82B07-28D2-48D1-B5D6-7E78FED277C7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckDBNameAvailableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDBNameAvailableResponseBody self = new CheckDBNameAvailableResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDBNameAvailableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
