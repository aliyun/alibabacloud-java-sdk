// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteVulWhitelistResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9FBC6E47-7508-58C9-9E76-528E118CB1CC</p>
     */
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
