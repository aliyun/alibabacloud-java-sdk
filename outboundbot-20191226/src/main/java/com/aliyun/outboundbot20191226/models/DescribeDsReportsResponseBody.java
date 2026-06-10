// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeDsReportsResponseBody extends TeaModel {
    /**
     * <p>API status code</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Conversation flow information, formatted as key:{value:count}</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{\&quot;标签1\&quot;:{\&quot;标签值1\&quot;:2},\&quot;标签2\&quot;:{\&quot;标签值1\&quot;:2},\&quot;标签3\&quot;:{\&quot;标签值1\&quot;:1,\&quot;标签值2\&quot;:1}}&quot;</p>
     */
    @NameInMap("DsReports")
    public String dsReports;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>API message</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>1364f208-982d-4d0c-89aa-d56e22b47589</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call succeeded</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
