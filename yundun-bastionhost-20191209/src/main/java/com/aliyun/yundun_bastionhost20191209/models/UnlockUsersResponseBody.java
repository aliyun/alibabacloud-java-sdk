// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class UnlockUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<UnlockUsersResponseBodyResults> results;

    public static UnlockUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnlockUsersResponseBody self = new UnlockUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public UnlockUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnlockUsersResponseBody setResults(java.util.List<UnlockUsersResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<UnlockUsersResponseBodyResults> getResults() {
        return this.results;
    }

    public static class UnlockUsersResponseBodyResults extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("UserId")
        public String userId;

        public static UnlockUsersResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            UnlockUsersResponseBodyResults self = new UnlockUsersResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public UnlockUsersResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UnlockUsersResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UnlockUsersResponseBodyResults setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
