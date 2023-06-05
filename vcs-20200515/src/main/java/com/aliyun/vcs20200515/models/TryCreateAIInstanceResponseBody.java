// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class TryCreateAIInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public TryCreateAIInstanceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static TryCreateAIInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TryCreateAIInstanceResponseBody self = new TryCreateAIInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public TryCreateAIInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TryCreateAIInstanceResponseBody setData(TryCreateAIInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TryCreateAIInstanceResponseBodyData getData() {
        return this.data;
    }

    public TryCreateAIInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TryCreateAIInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TryCreateAIInstanceResponseBodyData extends TeaModel {
        @NameInMap("AcuUsed")
        public Long acuUsed;

        @NameInMap("Storage")
        public String storage;

        public static TryCreateAIInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TryCreateAIInstanceResponseBodyData self = new TryCreateAIInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TryCreateAIInstanceResponseBodyData setAcuUsed(Long acuUsed) {
            this.acuUsed = acuUsed;
            return this;
        }
        public Long getAcuUsed() {
            return this.acuUsed;
        }

        public TryCreateAIInstanceResponseBodyData setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public String getStorage() {
            return this.storage;
        }

    }

}
