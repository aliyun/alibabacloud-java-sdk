// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetSceneDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrMessage")
    @Validation(required = true)
    public String errMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.Map<String, ?> data;

    @NameInMap("ObjectString")
    @Validation(required = true)
    public String objectString;

    public static GetSceneDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSceneDataResponse self = new GetSceneDataResponse();
        return TeaModel.build(map, self);
    }

    public GetSceneDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSceneDataResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetSceneDataResponse setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetSceneDataResponse setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public GetSceneDataResponse setObjectString(String objectString) {
        this.objectString = objectString;
        return this;
    }
    public String getObjectString() {
        return this.objectString;
    }

}
