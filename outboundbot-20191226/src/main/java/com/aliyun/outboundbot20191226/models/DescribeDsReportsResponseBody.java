// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeDsReportsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DsReports")
    public String dsReports;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDsReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDsReportsResponseBody self = new DescribeDsReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDsReportsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDsReportsResponseBody setDsReports(String dsReports) {
        this.dsReports = dsReports;
        return this;
    }
    public String getDsReports() {
        return this.dsReports;
    }

    public DescribeDsReportsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDsReportsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDsReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDsReportsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
