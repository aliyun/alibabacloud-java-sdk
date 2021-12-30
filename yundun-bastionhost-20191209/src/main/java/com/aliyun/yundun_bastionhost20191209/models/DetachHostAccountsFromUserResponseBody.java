// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachHostAccountsFromUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<DetachHostAccountsFromUserResponseBodyResults> results;

    public static DetachHostAccountsFromUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachHostAccountsFromUserResponseBody self = new DetachHostAccountsFromUserResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachHostAccountsFromUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetachHostAccountsFromUserResponseBody setResults(java.util.List<DetachHostAccountsFromUserResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<DetachHostAccountsFromUserResponseBodyResults> getResults() {
        return this.results;
    }

    public static class DetachHostAccountsFromUserResponseBodyResultsHostAccounts extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("HostAccountId")
        public String hostAccountId;

        @NameInMap("Message")
        public String message;

        public static DetachHostAccountsFromUserResponseBodyResultsHostAccounts build(java.util.Map<String, ?> map) throws Exception {
            DetachHostAccountsFromUserResponseBodyResultsHostAccounts self = new DetachHostAccountsFromUserResponseBodyResultsHostAccounts();
            return TeaModel.build(map, self);
        }

        public DetachHostAccountsFromUserResponseBodyResultsHostAccounts setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DetachHostAccountsFromUserResponseBodyResultsHostAccounts setHostAccountId(String hostAccountId) {
            this.hostAccountId = hostAccountId;
            return this;
        }
        public String getHostAccountId() {
            return this.hostAccountId;
        }

        public DetachHostAccountsFromUserResponseBodyResultsHostAccounts setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class DetachHostAccountsFromUserResponseBodyResults extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("HostAccounts")
        public java.util.List<DetachHostAccountsFromUserResponseBodyResultsHostAccounts> hostAccounts;

        @NameInMap("HostId")
        public String hostId;

        @NameInMap("Message")
        public String message;

        @NameInMap("UserId")
        public String userId;

        public static DetachHostAccountsFromUserResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            DetachHostAccountsFromUserResponseBodyResults self = new DetachHostAccountsFromUserResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public DetachHostAccountsFromUserResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DetachHostAccountsFromUserResponseBodyResults setHostAccounts(java.util.List<DetachHostAccountsFromUserResponseBodyResultsHostAccounts> hostAccounts) {
            this.hostAccounts = hostAccounts;
            return this;
        }
        public java.util.List<DetachHostAccountsFromUserResponseBodyResultsHostAccounts> getHostAccounts() {
            return this.hostAccounts;
        }

        public DetachHostAccountsFromUserResponseBodyResults setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public DetachHostAccountsFromUserResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DetachHostAccountsFromUserResponseBodyResults setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
