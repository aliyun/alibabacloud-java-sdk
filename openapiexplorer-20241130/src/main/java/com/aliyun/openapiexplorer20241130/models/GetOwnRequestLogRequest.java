// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class GetOwnRequestLogRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123E4567-E89B-12D3-A456-426614174000</p>
     */
    @NameInMap("logRequestId")
    public String logRequestId;

    public static GetOwnRequestLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOwnRequestLogRequest self = new GetOwnRequestLogRequest();
        return TeaModel.build(map, self);
    }

    public GetOwnRequestLogRequest setLogRequestId(String logRequestId) {
        this.logRequestId = logRequestId;
        return this;
    }
    public String getLogRequestId() {
        return this.logRequestId;
    }

}
