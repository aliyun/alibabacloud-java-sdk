// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CheckAIInstanceNameResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CheckAIInstanceNameResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckAIInstanceNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckAIInstanceNameResponseBody self = new CheckAIInstanceNameResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckAIInstanceNameResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckAIInstanceNameResponseBody setData(CheckAIInstanceNameResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckAIInstanceNameResponseBodyData getData() {
        return this.data;
    }

    public CheckAIInstanceNameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckAIInstanceNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckAIInstanceNameResponseBodyData extends TeaModel {
        @NameInMap("Available")
        public Boolean available;

        public static CheckAIInstanceNameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckAIInstanceNameResponseBodyData self = new CheckAIInstanceNameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckAIInstanceNameResponseBodyData setAvailable(Boolean available) {
            this.available = available;
            return this;
        }
        public Boolean getAvailable() {
            return this.available;
        }

    }

}
