// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachHostGroupAccountsToUserGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<AttachHostGroupAccountsToUserGroupResponseBodyResults> results;

    public static AttachHostGroupAccountsToUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachHostGroupAccountsToUserGroupResponseBody self = new AttachHostGroupAccountsToUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachHostGroupAccountsToUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachHostGroupAccountsToUserGroupResponseBody setResults(java.util.List<AttachHostGroupAccountsToUserGroupResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<AttachHostGroupAccountsToUserGroupResponseBodyResults> getResults() {
        return this.results;
    }

    public static class AttachHostGroupAccountsToUserGroupResponseBodyResultsHostAccountNames extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("HostAccountName")
        public String hostAccountName;

        public static AttachHostGroupAccountsToUserGroupResponseBodyResultsHostAccountNames build(java.util.Map<String, ?> map) throws Exception {
            AttachHostGroupAccountsToUserGroupResponseBodyResultsHostAccountNames self = new AttachHostGroupAccountsToUserGroupResponseBodyResultsHostAccountNames();
            return TeaModel.build(map, self);
        }

        public AttachHostGroupAccountsToUserGroupResponseBodyResultsHostAccountNames setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachHostGroupAccountsToUserGroupResponseBodyResultsHostAccountNames setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AttachHostGroupAccountsToUserGroupResponseBodyResultsHostAccountNames setHostAccountName(String hostAccountName) {
            this.hostAccountName = hostAccountName;
            return this;
        }
        public String getHostAccountName() {
            return this.hostAccountName;
        }

    }

    public static class AttachHostGroupAccountsToUserGroupResponseBodyResults extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("HostGroupId")
        public String hostGroupId;

        @NameInMap("UserGroupId")
        public String userGroupId;

        @NameInMap("HostAccountNames")
        public java.util.List<AttachHostGroupAccountsToUserGroupResponseBodyResultsHostAccountNames> hostAccountNames;

        public static AttachHostGroupAccountsToUserGroupResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            AttachHostGroupAccountsToUserGroupResponseBodyResults self = new AttachHostGroupAccountsToUserGroupResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public AttachHostGroupAccountsToUserGroupResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachHostGroupAccountsToUserGroupResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AttachHostGroupAccountsToUserGroupResponseBodyResults setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public AttachHostGroupAccountsToUserGroupResponseBodyResults setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public AttachHostGroupAccountsToUserGroupResponseBodyResults setHostAccountNames(java.util.List<AttachHostGroupAccountsToUserGroupResponseBodyResultsHostAccountNames> hostAccountNames) {
            this.hostAccountNames = hostAccountNames;
            return this;
        }
        public java.util.List<AttachHostGroupAccountsToUserGroupResponseBodyResultsHostAccountNames> getHostAccountNames() {
            return this.hostAccountNames;
        }

    }

}
