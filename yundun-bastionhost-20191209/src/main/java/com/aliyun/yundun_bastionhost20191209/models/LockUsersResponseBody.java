// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class LockUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<LockUsersResponseBodyResults> results;

    public static LockUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LockUsersResponseBody self = new LockUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public LockUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LockUsersResponseBody setResults(java.util.List<LockUsersResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<LockUsersResponseBodyResults> getResults() {
        return this.results;
    }

    public static class LockUsersResponseBodyResults extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("UserId")
        public String userId;

        public static LockUsersResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            LockUsersResponseBodyResults self = new LockUsersResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public LockUsersResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public LockUsersResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public LockUsersResponseBodyResults setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
