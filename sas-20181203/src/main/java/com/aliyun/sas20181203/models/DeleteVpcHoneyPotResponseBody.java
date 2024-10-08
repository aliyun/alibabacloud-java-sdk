// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteVpcHoneyPotResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4347E985-6E64-467B-96EC-30D4EA9E32FB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVpcHoneyPotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcHoneyPotResponseBody self = new DeleteVpcHoneyPotResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVpcHoneyPotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
