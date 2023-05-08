// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteVulWhitelistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVulWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVulWhitelistResponseBody self = new DeleteVulWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVulWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
