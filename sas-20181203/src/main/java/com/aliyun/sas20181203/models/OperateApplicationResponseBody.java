// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateApplicationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>79B067A4-54EB-5560-B5C8-425ABEDC2784</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OperateApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateApplicationResponseBody self = new OperateApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
