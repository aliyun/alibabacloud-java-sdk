// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeDashboardResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Overview")
    public String overview;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDashboardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDashboardResponseBody self = new DescribeDashboardResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDashboardResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDashboardResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDashboardResponseBody setOverview(String overview) {
        this.overview = overview;
        return this;
    }
    public String getOverview() {
        return this.overview;
    }

    public DescribeDashboardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDashboardResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
