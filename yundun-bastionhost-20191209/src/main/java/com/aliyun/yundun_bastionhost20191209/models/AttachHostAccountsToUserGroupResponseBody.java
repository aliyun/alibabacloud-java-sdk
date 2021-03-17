// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachHostAccountsToUserGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<AttachHostAccountsToUserGroupResponseBodyResults> results;

    public static AttachHostAccountsToUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachHostAccountsToUserGroupResponseBody self = new AttachHostAccountsToUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachHostAccountsToUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachHostAccountsToUserGroupResponseBody setResults(java.util.List<AttachHostAccountsToUserGroupResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<AttachHostAccountsToUserGroupResponseBodyResults> getResults() {
        return this.results;
    }

    public static class AttachHostAccountsToUserGroupResponseBodyResultsHostAccounts extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("HostAccountId")
        public String hostAccountId;

        public static AttachHostAccountsToUserGroupResponseBodyResultsHostAccounts build(java.util.Map<String, ?> map) throws Exception {
            AttachHostAccountsToUserGroupResponseBodyResultsHostAccounts self = new AttachHostAccountsToUserGroupResponseBodyResultsHostAccounts();
            return TeaModel.build(map, self);
        }

        public AttachHostAccountsToUserGroupResponseBodyResultsHostAccounts setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachHostAccountsToUserGroupResponseBodyResultsHostAccounts setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AttachHostAccountsToUserGroupResponseBodyResultsHostAccounts setHostAccountId(String hostAccountId) {
            this.hostAccountId = hostAccountId;
            return this;
        }
        public String getHostAccountId() {
            return this.hostAccountId;
        }

    }

    public static class AttachHostAccountsToUserGroupResponseBodyResults extends TeaModel {
        @NameInMap("UserGroupId")
        public String userGroupId;

        @NameInMap("HostAccounts")
        public java.util.List<AttachHostAccountsToUserGroupResponseBodyResultsHostAccounts> hostAccounts;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("HostId")
        public String hostId;

        public static AttachHostAccountsToUserGroupResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            AttachHostAccountsToUserGroupResponseBodyResults self = new AttachHostAccountsToUserGroupResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public AttachHostAccountsToUserGroupResponseBodyResults setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public AttachHostAccountsToUserGroupResponseBodyResults setHostAccounts(java.util.List<AttachHostAccountsToUserGroupResponseBodyResultsHostAccounts> hostAccounts) {
            this.hostAccounts = hostAccounts;
            return this;
        }
        public java.util.List<AttachHostAccountsToUserGroupResponseBodyResultsHostAccounts> getHostAccounts() {
            return this.hostAccounts;
        }

        public AttachHostAccountsToUserGroupResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachHostAccountsToUserGroupResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AttachHostAccountsToUserGroupResponseBodyResults setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

    }

}
