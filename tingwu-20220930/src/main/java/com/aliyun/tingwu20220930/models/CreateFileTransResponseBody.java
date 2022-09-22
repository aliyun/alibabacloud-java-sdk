// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20220930.models;

import com.aliyun.tea.*;

public class CreateFileTransResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateFileTransResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateFileTransResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFileTransResponseBody self = new CreateFileTransResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFileTransResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateFileTransResponseBody setData(CreateFileTransResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateFileTransResponseBodyData getData() {
        return this.data;
    }

    public CreateFileTransResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateFileTransResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateFileTransResponseBodyData extends TeaModel {
        @NameInMap("TransId")
        public String transId;

        @NameInMap("TransKey")
        public String transKey;

        public static CreateFileTransResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateFileTransResponseBodyData self = new CreateFileTransResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateFileTransResponseBodyData setTransId(String transId) {
            this.transId = transId;
            return this;
        }
        public String getTransId() {
            return this.transId;
        }

        public CreateFileTransResponseBodyData setTransKey(String transKey) {
            this.transKey = transKey;
            return this;
        }
        public String getTransKey() {
            return this.transKey;
        }

    }

}
