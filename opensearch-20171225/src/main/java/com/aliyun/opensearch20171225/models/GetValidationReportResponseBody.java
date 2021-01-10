// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetValidationReportResponseBody extends TeaModel {
    @NameInMap("result")
    public java.util.List<java.util.Map<String, ?>> result;

    @NameInMap("requestId")
    public String requestId;

    public static GetValidationReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetValidationReportResponseBody self = new GetValidationReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetValidationReportResponseBody setResult(java.util.List<java.util.Map<String, ?>> result) {
        this.result = result;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getResult() {
        return this.result;
    }

    public GetValidationReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
