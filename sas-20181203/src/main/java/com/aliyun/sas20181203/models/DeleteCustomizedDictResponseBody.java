// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteCustomizedDictResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>85B5D55F-B341-528F-A2CA-AB1207F9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCustomizedDictResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomizedDictResponseBody self = new DeleteCustomizedDictResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCustomizedDictResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
