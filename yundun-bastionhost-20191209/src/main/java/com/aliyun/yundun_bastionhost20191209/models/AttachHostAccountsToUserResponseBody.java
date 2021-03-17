// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachHostAccountsToUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<AttachHostAccountsToUserResponseBodyResults> results;

    public static AttachHostAccountsToUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachHostAccountsToUserResponseBody self = new AttachHostAccountsToUserResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachHostAccountsToUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachHostAccountsToUserResponseBody setResults(java.util.List<AttachHostAccountsToUserResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<AttachHostAccountsToUserResponseBodyResults> getResults() {
        return this.results;
    }

    public static class AttachHostAccountsToUserResponseBodyResultsHostAccounts extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("HostAccountId")
        public String hostAccountId;

        public static AttachHostAccountsToUserResponseBodyResultsHostAccounts build(java.util.Map<String, ?> map) throws Exception {
            AttachHostAccountsToUserResponseBodyResultsHostAccounts self = new AttachHostAccountsToUserResponseBodyResultsHostAccounts();
            return TeaModel.build(map, self);
        }

        public AttachHostAccountsToUserResponseBodyResultsHostAccounts setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachHostAccountsToUserResponseBodyResultsHostAccounts setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AttachHostAccountsToUserResponseBodyResultsHostAccounts setHostAccountId(String hostAccountId) {
            this.hostAccountId = hostAccountId;
            return this;
        }
        public String getHostAccountId() {
            return this.hostAccountId;
        }

    }

    public static class AttachHostAccountsToUserResponseBodyResults extends TeaModel {
        @NameInMap("HostAccounts")
        public java.util.List<AttachHostAccountsToUserResponseBodyResultsHostAccounts> hostAccounts;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("HostId")
        public String hostId;

        public static AttachHostAccountsToUserResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            AttachHostAccountsToUserResponseBodyResults self = new AttachHostAccountsToUserResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public AttachHostAccountsToUserResponseBodyResults setHostAccounts(java.util.List<AttachHostAccountsToUserResponseBodyResultsHostAccounts> hostAccounts) {
            this.hostAccounts = hostAccounts;
            return this;
        }
        public java.util.List<AttachHostAccountsToUserResponseBodyResultsHostAccounts> getHostAccounts() {
            return this.hostAccounts;
        }

        public AttachHostAccountsToUserResponseBodyResults setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public AttachHostAccountsToUserResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachHostAccountsToUserResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AttachHostAccountsToUserResponseBodyResults setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

    }

}
