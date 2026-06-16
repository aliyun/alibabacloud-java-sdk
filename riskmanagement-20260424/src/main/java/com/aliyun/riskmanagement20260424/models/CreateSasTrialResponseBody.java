// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class CreateSasTrialResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateSasTrialResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateSasTrialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSasTrialResponseBody self = new CreateSasTrialResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSasTrialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSasTrialResponseBody setData(CreateSasTrialResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSasTrialResponseBodyData getData() {
        return this.data;
    }

    public CreateSasTrialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSasTrialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSasTrialResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateSasTrialResponseBodyDataBody extends TeaModel {
        @NameInMap("RequestId")
        public String requestId;

        public static CreateSasTrialResponseBodyDataBody build(java.util.Map<String, ?> map) throws Exception {
            CreateSasTrialResponseBodyDataBody self = new CreateSasTrialResponseBodyDataBody();
            return TeaModel.build(map, self);
        }

        public CreateSasTrialResponseBodyDataBody setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

    public static class CreateSasTrialResponseBodyData extends TeaModel {
        @NameInMap("Body")
        public CreateSasTrialResponseBodyDataBody body;

        public static CreateSasTrialResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSasTrialResponseBodyData self = new CreateSasTrialResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSasTrialResponseBodyData setBody(CreateSasTrialResponseBodyDataBody body) {
            this.body = body;
            return this;
        }
        public CreateSasTrialResponseBodyDataBody getBody() {
            return this.body;
        }

    }

}
