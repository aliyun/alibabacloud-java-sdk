// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class EnableSceneResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 是否成功标示
    @NameInMap("Success")
    public Boolean success;

    // 返回code
    @NameInMap("Code")
    public String code;

    // 返回信息
    @NameInMap("Message")
    public String message;

    public static EnableSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableSceneResponseBody self = new EnableSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableSceneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public EnableSceneResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnableSceneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
