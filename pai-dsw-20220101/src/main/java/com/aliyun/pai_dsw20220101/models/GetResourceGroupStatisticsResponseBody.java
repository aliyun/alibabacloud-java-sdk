// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetResourceGroupStatisticsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;XXX&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>E7D55162-4489-1619-AAF5-3F97D5FCA948</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Statistics")
    public java.util.Map<String, java.util.Map<String, ?>> statistics;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetResourceGroupStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupStatisticsResponseBody self = new GetResourceGroupStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetResourceGroupStatisticsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetResourceGroupStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetResourceGroupStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceGroupStatisticsResponseBody setStatistics(java.util.Map<String, java.util.Map<String, ?>> statistics) {
        this.statistics = statistics;
        return this;
    }
    public java.util.Map<String, java.util.Map<String, ?>> getStatistics() {
        return this.statistics;
    }

    public GetResourceGroupStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
