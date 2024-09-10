// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteInstallCodeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>D65AADFC-1D20-5A6A-8F6A-9FA53C0DC1F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteInstallCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstallCodeResponseBody self = new DeleteInstallCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInstallCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
