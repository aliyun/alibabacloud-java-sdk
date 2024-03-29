// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ListInstanceStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Statistics")
    public java.util.Map<String, java.util.Map<String, ?>> statistics;

    @NameInMap("Success")
    public Boolean success;

    public static ListInstanceStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceStatisticsResponseBody self = new ListInstanceStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstanceStatisticsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListInstanceStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstanceStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceStatisticsResponseBody setStatistics(java.util.Map<String, java.util.Map<String, ?>> statistics) {
        this.statistics = statistics;
        return this;
    }
    public java.util.Map<String, java.util.Map<String, ?>> getStatistics() {
        return this.statistics;
    }

    public ListInstanceStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
