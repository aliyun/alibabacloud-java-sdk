// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BindDirectoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3CB843A9-DD34-4881-B8D6-B0D539D111E4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BindDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindDirectoryResponseBody self = new BindDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public BindDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
