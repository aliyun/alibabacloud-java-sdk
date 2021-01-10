// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutVcsmembersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<QueryLinkeBahamutVcsmembersResponseBodyResult> result;

    public static QueryLinkeBahamutVcsmembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutVcsmembersResponseBody self = new QueryLinkeBahamutVcsmembersResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutVcsmembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutVcsmembersResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutVcsmembersResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutVcsmembersResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutVcsmembersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutVcsmembersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutVcsmembersResponseBody setResult(java.util.List<QueryLinkeBahamutVcsmembersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryLinkeBahamutVcsmembersResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryLinkeBahamutVcsmembersResponseBodyResult extends TeaModel {
        @NameInMap("AccessLevel")
        public Long accessLevel;

        @NameInMap("Email")
        public String email;

        @NameInMap("ExternUid")
        public String externUid;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Username")
        public String username;

        public static QueryLinkeBahamutVcsmembersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutVcsmembersResponseBodyResult self = new QueryLinkeBahamutVcsmembersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutVcsmembersResponseBodyResult setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public QueryLinkeBahamutVcsmembersResponseBodyResult setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryLinkeBahamutVcsmembersResponseBodyResult setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public QueryLinkeBahamutVcsmembersResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeBahamutVcsmembersResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeBahamutVcsmembersResponseBodyResult setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
