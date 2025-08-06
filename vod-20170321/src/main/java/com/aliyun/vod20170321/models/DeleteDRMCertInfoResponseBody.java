// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteDRMCertInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDRMCertInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDRMCertInfoResponseBody self = new DeleteDRMCertInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDRMCertInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
