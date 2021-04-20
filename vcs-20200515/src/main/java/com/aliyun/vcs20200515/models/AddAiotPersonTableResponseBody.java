// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddAiotPersonTableResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PersonTableId")
    public String personTableId;

    public static AddAiotPersonTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAiotPersonTableResponseBody self = new AddAiotPersonTableResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAiotPersonTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddAiotPersonTableResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddAiotPersonTableResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddAiotPersonTableResponseBody setPersonTableId(String personTableId) {
        this.personTableId = personTableId;
        return this;
    }
    public String getPersonTableId() {
        return this.personTableId;
    }

}
