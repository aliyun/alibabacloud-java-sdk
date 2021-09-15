// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetWindowConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("ObjectString")
    public String objectString;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrMessage")
    public String errMessage;

    public static GetWindowConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWindowConfigResponseBody self = new GetWindowConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWindowConfigResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public GetWindowConfigResponseBody setObjectString(String objectString) {
        this.objectString = objectString;
        return this;
    }
    public String getObjectString() {
        return this.objectString;
    }

    public GetWindowConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWindowConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetWindowConfigResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

}
