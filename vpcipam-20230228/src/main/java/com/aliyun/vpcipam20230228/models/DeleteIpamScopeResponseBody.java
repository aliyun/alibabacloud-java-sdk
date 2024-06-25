// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class DeleteIpamScopeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9F8315CB-560E-5F1E-B069-6E44B440CAF8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIpamScopeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpamScopeResponseBody self = new DeleteIpamScopeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIpamScopeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
