// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class DeleteIdleInstanceCullerResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteIdleInstanceCullerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIdleInstanceCullerResponseBody self = new DeleteIdleInstanceCullerResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIdleInstanceCullerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteIdleInstanceCullerResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteIdleInstanceCullerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteIdleInstanceCullerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteIdleInstanceCullerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
