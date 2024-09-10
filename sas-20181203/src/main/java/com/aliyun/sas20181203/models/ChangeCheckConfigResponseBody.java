// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeCheckConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6EBB8614-746D-555D-AB69-C801AEC7DCE0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ChangeCheckConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeCheckConfigResponseBody self = new ChangeCheckConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeCheckConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
