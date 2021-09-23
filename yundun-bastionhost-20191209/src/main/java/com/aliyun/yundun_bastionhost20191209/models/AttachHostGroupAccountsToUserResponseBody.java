// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachHostGroupAccountsToUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<AttachHostGroupAccountsToUserResponseBodyResults> results;

    public static AttachHostGroupAccountsToUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachHostGroupAccountsToUserResponseBody self = new AttachHostGroupAccountsToUserResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachHostGroupAccountsToUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachHostGroupAccountsToUserResponseBody setResults(java.util.List<AttachHostGroupAccountsToUserResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<AttachHostGroupAccountsToUserResponseBodyResults> getResults() {
        return this.results;
    }

    public static class AttachHostGroupAccountsToUserResponseBodyResultsHostAccountNames extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("HostAccountName")
        public String hostAccountName;

        public static AttachHostGroupAccountsToUserResponseBodyResultsHostAccountNames build(java.util.Map<String, ?> map) throws Exception {
            AttachHostGroupAccountsToUserResponseBodyResultsHostAccountNames self = new AttachHostGroupAccountsToUserResponseBodyResultsHostAccountNames();
            return TeaModel.build(map, self);
        }

        public AttachHostGroupAccountsToUserResponseBodyResultsHostAccountNames setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachHostGroupAccountsToUserResponseBodyResultsHostAccountNames setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AttachHostGroupAccountsToUserResponseBodyResultsHostAccountNames setHostAccountName(String hostAccountName) {
            this.hostAccountName = hostAccountName;
            return this;
        }
        public String getHostAccountName() {
            return this.hostAccountName;
        }

    }

    public static class AttachHostGroupAccountsToUserResponseBodyResults extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("HostGroupId")
        public String hostGroupId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("HostAccountNames")
        public java.util.List<AttachHostGroupAccountsToUserResponseBodyResultsHostAccountNames> hostAccountNames;

        public static AttachHostGroupAccountsToUserResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            AttachHostGroupAccountsToUserResponseBodyResults self = new AttachHostGroupAccountsToUserResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public AttachHostGroupAccountsToUserResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachHostGroupAccountsToUserResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AttachHostGroupAccountsToUserResponseBodyResults setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public AttachHostGroupAccountsToUserResponseBodyResults setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public AttachHostGroupAccountsToUserResponseBodyResults setHostAccountNames(java.util.List<AttachHostGroupAccountsToUserResponseBodyResultsHostAccountNames> hostAccountNames) {
            this.hostAccountNames = hostAccountNames;
            return this;
        }
        public java.util.List<AttachHostGroupAccountsToUserResponseBodyResultsHostAccountNames> getHostAccountNames() {
            return this.hostAccountNames;
        }

    }

}
