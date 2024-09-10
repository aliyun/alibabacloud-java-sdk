// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CopyCustomizeReportConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1EE7B150-D67E-53FD-A52D-3E8E669A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CopyCustomizeReportConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyCustomizeReportConfigResponseBody self = new CopyCustomizeReportConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyCustomizeReportConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
