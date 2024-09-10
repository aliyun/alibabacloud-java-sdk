// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SendCustomizeReportResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2BEA397D-1FD0-5C79-AB24-EC051158****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SendCustomizeReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendCustomizeReportResponseBody self = new SendCustomizeReportResponseBody();
        return TeaModel.build(map, self);
    }

    public SendCustomizeReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
