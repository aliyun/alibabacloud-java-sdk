// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateServiceLinkedRoleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateServiceLinkedRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceLinkedRoleResponseBody self = new CreateServiceLinkedRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceLinkedRoleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateServiceLinkedRoleResponseBody setData(CreateServiceLinkedRoleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateServiceLinkedRoleResponseBodyData getData() {
        return this.data;
    }

    public CreateServiceLinkedRoleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateServiceLinkedRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServiceLinkedRoleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateServiceLinkedRoleResponseBodyDataBody extends TeaModel {
        @NameInMap("RequestId")
        public String requestId;

        public static CreateServiceLinkedRoleResponseBodyDataBody build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceLinkedRoleResponseBodyDataBody self = new CreateServiceLinkedRoleResponseBodyDataBody();
            return TeaModel.build(map, self);
        }

        public CreateServiceLinkedRoleResponseBodyDataBody setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

    public static class CreateServiceLinkedRoleResponseBodyData extends TeaModel {
        @NameInMap("Body")
        public CreateServiceLinkedRoleResponseBodyDataBody body;

        public static CreateServiceLinkedRoleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceLinkedRoleResponseBodyData self = new CreateServiceLinkedRoleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateServiceLinkedRoleResponseBodyData setBody(CreateServiceLinkedRoleResponseBodyDataBody body) {
            this.body = body;
            return this;
        }
        public CreateServiceLinkedRoleResponseBodyDataBody getBody() {
            return this.body;
        }

    }

}
