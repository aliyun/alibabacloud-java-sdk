// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopCreateLivePortraitModelScopeProjectResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PopCreateLivePortraitModelScopeProjectResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PopCreateLivePortraitModelScopeProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PopCreateLivePortraitModelScopeProjectResponseBody self = new PopCreateLivePortraitModelScopeProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public PopCreateLivePortraitModelScopeProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PopCreateLivePortraitModelScopeProjectResponseBody setData(PopCreateLivePortraitModelScopeProjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PopCreateLivePortraitModelScopeProjectResponseBodyData getData() {
        return this.data;
    }

    public PopCreateLivePortraitModelScopeProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PopCreateLivePortraitModelScopeProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PopCreateLivePortraitModelScopeProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PopCreateLivePortraitModelScopeProjectResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static PopCreateLivePortraitModelScopeProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PopCreateLivePortraitModelScopeProjectResponseBodyData self = new PopCreateLivePortraitModelScopeProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PopCreateLivePortraitModelScopeProjectResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
