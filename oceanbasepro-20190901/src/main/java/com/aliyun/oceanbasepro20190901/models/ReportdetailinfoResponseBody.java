// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ReportdetailinfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ReportdetailinfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportdetailinfoResponseBody self = new ReportdetailinfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportdetailinfoResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public ReportdetailinfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReportdetailinfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
