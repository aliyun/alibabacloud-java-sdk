// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class CreateTaskOrderByEventReportResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // 返回信息
    @NameInMap("Data")
    public String data;

    // msg
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static CreateTaskOrderByEventReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskOrderByEventReportResponseBody self = new CreateTaskOrderByEventReportResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTaskOrderByEventReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTaskOrderByEventReportResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateTaskOrderByEventReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTaskOrderByEventReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTaskOrderByEventReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
