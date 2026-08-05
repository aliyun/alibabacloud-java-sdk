// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class DeleteCredentialsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2423C841-91C4-5E51-B296-590D367967FC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteCredentialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCredentialsResponseBody self = new DeleteCredentialsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCredentialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
