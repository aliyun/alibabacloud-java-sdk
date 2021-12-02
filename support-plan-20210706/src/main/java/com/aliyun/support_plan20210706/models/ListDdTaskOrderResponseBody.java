// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class ListDdTaskOrderResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // data
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

    public static ListDdTaskOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDdTaskOrderResponseBody self = new ListDdTaskOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDdTaskOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDdTaskOrderResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ListDdTaskOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDdTaskOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDdTaskOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
