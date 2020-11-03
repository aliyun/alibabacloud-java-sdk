// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class BindIntervenePackageAndModelResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("Message")
    @Validation(required = true)
    public Integer message;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static BindIntervenePackageAndModelResponse build(java.util.Map<String, ?> map) throws Exception {
        BindIntervenePackageAndModelResponse self = new BindIntervenePackageAndModelResponse();
        return TeaModel.build(map, self);
    }

    public BindIntervenePackageAndModelResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public BindIntervenePackageAndModelResponse setMessage(Integer message) {
        this.message = message;
        return this;
    }
    public Integer getMessage() {
        return this.message;
    }

    public BindIntervenePackageAndModelResponse setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public BindIntervenePackageAndModelResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
