// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ResetAccountPasswordResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>58E21E11-90FF-50F8-A615-8DEB193676E0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResetAccountPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetAccountPasswordResponseBody self = new ResetAccountPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetAccountPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
