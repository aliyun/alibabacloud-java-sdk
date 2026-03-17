// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class RevokeInstanceFromVbrResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D085AE49-51DC-4E8A-9F06-2D99C4E374F7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RevokeInstanceFromVbrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeInstanceFromVbrResponseBody self = new RevokeInstanceFromVbrResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeInstanceFromVbrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
