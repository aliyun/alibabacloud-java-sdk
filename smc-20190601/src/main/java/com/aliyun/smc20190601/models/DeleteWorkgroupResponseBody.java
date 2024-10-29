// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class DeleteWorkgroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>410E6073-66D0-45D3-AB3E-4DC3F5E4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteWorkgroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkgroupResponseBody self = new DeleteWorkgroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWorkgroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
