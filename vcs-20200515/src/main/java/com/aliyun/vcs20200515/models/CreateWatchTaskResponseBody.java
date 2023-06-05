// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateWatchTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateWatchTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateWatchTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWatchTaskResponseBody self = new CreateWatchTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWatchTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateWatchTaskResponseBody setData(CreateWatchTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateWatchTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateWatchTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateWatchTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWatchTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateWatchTaskResponseBodyData extends TeaModel {
        @NameInMap("WatchTaskId")
        public String watchTaskId;

        public static CreateWatchTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateWatchTaskResponseBodyData self = new CreateWatchTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateWatchTaskResponseBodyData setWatchTaskId(String watchTaskId) {
            this.watchTaskId = watchTaskId;
            return this;
        }
        public String getWatchTaskId() {
            return this.watchTaskId;
        }

    }

}
