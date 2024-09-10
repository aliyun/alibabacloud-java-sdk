// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteIdcProbeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5DFD6277-CC36-57F7-ACE6-F5952XXXXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIdcProbeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIdcProbeResponseBody self = new DeleteIdcProbeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIdcProbeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
