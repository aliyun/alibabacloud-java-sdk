// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopCreateObjectGenerationProjectResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PopCreateObjectGenerationProjectResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PopCreateObjectGenerationProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PopCreateObjectGenerationProjectResponseBody self = new PopCreateObjectGenerationProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public PopCreateObjectGenerationProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PopCreateObjectGenerationProjectResponseBody setData(PopCreateObjectGenerationProjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PopCreateObjectGenerationProjectResponseBodyData getData() {
        return this.data;
    }

    public PopCreateObjectGenerationProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PopCreateObjectGenerationProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PopCreateObjectGenerationProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PopCreateObjectGenerationProjectResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static PopCreateObjectGenerationProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PopCreateObjectGenerationProjectResponseBodyData self = new PopCreateObjectGenerationProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PopCreateObjectGenerationProjectResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
