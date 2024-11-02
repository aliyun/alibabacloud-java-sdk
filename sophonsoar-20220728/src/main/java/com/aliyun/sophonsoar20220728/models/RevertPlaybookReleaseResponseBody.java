// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class RevertPlaybookReleaseResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B3FED5B9-190A-5952-93A4-24FBF0F0C573</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RevertPlaybookReleaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevertPlaybookReleaseResponseBody self = new RevertPlaybookReleaseResponseBody();
        return TeaModel.build(map, self);
    }

    public RevertPlaybookReleaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
