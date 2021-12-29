// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryModuleSwitchStatusResponseBody extends TeaModel {
    // 错误码
    @NameInMap("Code")
    public String code;

    // 开关状态
    @NameInMap("Data")
    public Integer data;

    // 错误信息
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 是否成功
    @NameInMap("Success")
    public Boolean success;

    public static QueryModuleSwitchStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryModuleSwitchStatusResponseBody self = new QueryModuleSwitchStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryModuleSwitchStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryModuleSwitchStatusResponseBody setData(Integer data) {
        this.data = data;
        return this;
    }
    public Integer getData() {
        return this.data;
    }

    public QueryModuleSwitchStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryModuleSwitchStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryModuleSwitchStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
