// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class BindIntervenePackageAndModelResponseBody extends TeaModel {
    @NameInMap("Message")
    public Integer message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public String success;

    public static BindIntervenePackageAndModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindIntervenePackageAndModelResponseBody self = new BindIntervenePackageAndModelResponseBody();
        return TeaModel.build(map, self);
    }

    public BindIntervenePackageAndModelResponseBody setMessage(Integer message) {
        this.message = message;
        return this;
    }
    public Integer getMessage() {
        return this.message;
    }

    public BindIntervenePackageAndModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindIntervenePackageAndModelResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public BindIntervenePackageAndModelResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
