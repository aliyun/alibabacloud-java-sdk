// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class UpdateDataMaskingUsersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7C6D8E9F-1234-5678-ABCD-0123456789AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDataMaskingUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataMaskingUsersResponseBody self = new UpdateDataMaskingUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDataMaskingUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
