// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class CreateDigitalHumanProjectResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateDigitalHumanProjectResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateDigitalHumanProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDigitalHumanProjectResponseBody self = new CreateDigitalHumanProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDigitalHumanProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDigitalHumanProjectResponseBody setData(CreateDigitalHumanProjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDigitalHumanProjectResponseBodyData getData() {
        return this.data;
    }

    public CreateDigitalHumanProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDigitalHumanProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDigitalHumanProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDigitalHumanProjectResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static CreateDigitalHumanProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDigitalHumanProjectResponseBodyData self = new CreateDigitalHumanProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDigitalHumanProjectResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
