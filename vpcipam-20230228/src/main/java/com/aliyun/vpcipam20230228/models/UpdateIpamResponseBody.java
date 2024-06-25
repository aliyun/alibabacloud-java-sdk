// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class UpdateIpamResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F4650E33-895C-53F0-9CD5-D1338F322DE8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateIpamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpamResponseBody self = new UpdateIpamResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIpamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
