// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class CreateAvatarTalkProjectResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateAvatarTalkProjectResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateAvatarTalkProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAvatarTalkProjectResponseBody self = new CreateAvatarTalkProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAvatarTalkProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAvatarTalkProjectResponseBody setData(CreateAvatarTalkProjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAvatarTalkProjectResponseBodyData getData() {
        return this.data;
    }

    public CreateAvatarTalkProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAvatarTalkProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAvatarTalkProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateAvatarTalkProjectResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static CreateAvatarTalkProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAvatarTalkProjectResponseBodyData self = new CreateAvatarTalkProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAvatarTalkProjectResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
