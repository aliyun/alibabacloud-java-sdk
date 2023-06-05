// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateWatchPolicyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateWatchPolicyResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateWatchPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWatchPolicyResponseBody self = new CreateWatchPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWatchPolicyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateWatchPolicyResponseBody setData(CreateWatchPolicyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateWatchPolicyResponseBodyData getData() {
        return this.data;
    }

    public CreateWatchPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateWatchPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWatchPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateWatchPolicyResponseBodyData extends TeaModel {
        @NameInMap("WatchPolicyId")
        public String watchPolicyId;

        public static CreateWatchPolicyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateWatchPolicyResponseBodyData self = new CreateWatchPolicyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateWatchPolicyResponseBodyData setWatchPolicyId(String watchPolicyId) {
            this.watchPolicyId = watchPolicyId;
            return this;
        }
        public String getWatchPolicyId() {
            return this.watchPolicyId;
        }

    }

}
