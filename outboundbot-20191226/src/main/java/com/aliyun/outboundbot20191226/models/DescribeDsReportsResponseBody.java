// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeDsReportsResponseBody extends TeaModel {
    /**
     * <p>The API status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The dialog flow information in the format: key:{value:aaa}}, where aaa indicates the number of occurrences.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{\&quot;Label1\&quot;:{\&quot;LabelValue1\&quot;:2},\&quot;Label2\&quot;:{\&quot;LabelValue1\&quot;:2},\&quot;Label3\&quot;:{\&quot;LabelValue1\&quot;:1,\&quot;LabelValue2\&quot;:1}}&quot;</p>
     */
    @NameInMap("DsReports")
    public String dsReports;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The API response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1364f208-982d-4d0c-89aa-d56e22b47589</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
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
