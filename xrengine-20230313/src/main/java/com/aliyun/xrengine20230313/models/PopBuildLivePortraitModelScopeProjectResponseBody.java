// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopBuildLivePortraitModelScopeProjectResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PopBuildLivePortraitModelScopeProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PopBuildLivePortraitModelScopeProjectResponseBody self = new PopBuildLivePortraitModelScopeProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public PopBuildLivePortraitModelScopeProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PopBuildLivePortraitModelScopeProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PopBuildLivePortraitModelScopeProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PopBuildLivePortraitModelScopeProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
