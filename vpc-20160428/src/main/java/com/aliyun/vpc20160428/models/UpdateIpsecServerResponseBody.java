// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateIpsecServerResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B61C08E5-403A-46A2-96C1-F7B1216DB10C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateIpsecServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpsecServerResponseBody self = new UpdateIpsecServerResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIpsecServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
