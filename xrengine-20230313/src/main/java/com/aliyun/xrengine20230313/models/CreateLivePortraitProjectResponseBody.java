// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class CreateLivePortraitProjectResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateLivePortraitProjectResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateLivePortraitProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLivePortraitProjectResponseBody self = new CreateLivePortraitProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLivePortraitProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateLivePortraitProjectResponseBody setData(CreateLivePortraitProjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateLivePortraitProjectResponseBodyData getData() {
        return this.data;
    }

    public CreateLivePortraitProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateLivePortraitProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLivePortraitProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateLivePortraitProjectResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static CreateLivePortraitProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateLivePortraitProjectResponseBodyData self = new CreateLivePortraitProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateLivePortraitProjectResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
