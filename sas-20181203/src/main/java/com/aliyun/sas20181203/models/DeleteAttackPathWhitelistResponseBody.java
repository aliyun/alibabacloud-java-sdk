// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteAttackPathWhitelistResponseBody extends TeaModel {
    /**
     * <p>The request ID. Alibaba Cloud generates a unique ID for each request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>898F7AA7-CECD-5EC7-AF4D-664C601B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAttackPathWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAttackPathWhitelistResponseBody self = new DeleteAttackPathWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAttackPathWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
