// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachHostGroupAccountsFromUserGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<DetachHostGroupAccountsFromUserGroupResponseBodyResults> results;

    public static DetachHostGroupAccountsFromUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachHostGroupAccountsFromUserGroupResponseBody self = new DetachHostGroupAccountsFromUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachHostGroupAccountsFromUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetachHostGroupAccountsFromUserGroupResponseBody setResults(java.util.List<DetachHostGroupAccountsFromUserGroupResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<DetachHostGroupAccountsFromUserGroupResponseBodyResults> getResults() {
        return this.results;
    }

    public static class DetachHostGroupAccountsFromUserGroupResponseBodyResultsHostAccountNames extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("HostAccountName")
        public String hostAccountName;

        @NameInMap("Message")
        public String message;

        public static DetachHostGroupAccountsFromUserGroupResponseBodyResultsHostAccountNames build(java.util.Map<String, ?> map) throws Exception {
            DetachHostGroupAccountsFromUserGroupResponseBodyResultsHostAccountNames self = new DetachHostGroupAccountsFromUserGroupResponseBodyResultsHostAccountNames();
            return TeaModel.build(map, self);
        }

        public DetachHostGroupAccountsFromUserGroupResponseBodyResultsHostAccountNames setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DetachHostGroupAccountsFromUserGroupResponseBodyResultsHostAccountNames setHostAccountName(String hostAccountName) {
            this.hostAccountName = hostAccountName;
            return this;
        }
        public String getHostAccountName() {
            return this.hostAccountName;
        }

        public DetachHostGroupAccountsFromUserGroupResponseBodyResultsHostAccountNames setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class DetachHostGroupAccountsFromUserGroupResponseBodyResults extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("HostAccountNames")
        public java.util.List<DetachHostGroupAccountsFromUserGroupResponseBodyResultsHostAccountNames> hostAccountNames;

        @NameInMap("HostGroupId")
        public String hostGroupId;

        @NameInMap("Message")
        public String message;

        @NameInMap("UserGroupId")
        public String userGroupId;

        public static DetachHostGroupAccountsFromUserGroupResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            DetachHostGroupAccountsFromUserGroupResponseBodyResults self = new DetachHostGroupAccountsFromUserGroupResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public DetachHostGroupAccountsFromUserGroupResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DetachHostGroupAccountsFromUserGroupResponseBodyResults setHostAccountNames(java.util.List<DetachHostGroupAccountsFromUserGroupResponseBodyResultsHostAccountNames> hostAccountNames) {
            this.hostAccountNames = hostAccountNames;
            return this;
        }
        public java.util.List<DetachHostGroupAccountsFromUserGroupResponseBodyResultsHostAccountNames> getHostAccountNames() {
            return this.hostAccountNames;
        }

        public DetachHostGroupAccountsFromUserGroupResponseBodyResults setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public DetachHostGroupAccountsFromUserGroupResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DetachHostGroupAccountsFromUserGroupResponseBodyResults setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

    }

}
