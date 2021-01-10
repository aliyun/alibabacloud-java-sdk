// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasAdminSshResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasAdminSshResponseBodyResultContent resultContent;

    public static QueryHasAdminSshResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasAdminSshResponseBody self = new QueryHasAdminSshResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasAdminSshResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasAdminSshResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasAdminSshResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasAdminSshResponseBody setResultContent(QueryHasAdminSshResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasAdminSshResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasAdminSshResponseBodyResultContentData extends TeaModel {
        @NameInMap("Dimension")
        public String dimension;

        @NameInMap("Id")
        public String id;

        @NameInMap("LoginPriStr")
        public String loginPriStr;

        @NameInMap("LoginType")
        public String loginType;

        @NameInMap("LoginUser")
        public String loginUser;

        @NameInMap("Memo")
        public String memo;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Port")
        public Long port;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Type")
        public Long type;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        public static QueryHasAdminSshResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasAdminSshResponseBodyResultContentData self = new QueryHasAdminSshResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasAdminSshResponseBodyResultContentData setDimension(String dimension) {
            this.dimension = dimension;
            return this;
        }
        public String getDimension() {
            return this.dimension;
        }

        public QueryHasAdminSshResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasAdminSshResponseBodyResultContentData setLoginPriStr(String loginPriStr) {
            this.loginPriStr = loginPriStr;
            return this;
        }
        public String getLoginPriStr() {
            return this.loginPriStr;
        }

        public QueryHasAdminSshResponseBodyResultContentData setLoginType(String loginType) {
            this.loginType = loginType;
            return this;
        }
        public String getLoginType() {
            return this.loginType;
        }

        public QueryHasAdminSshResponseBodyResultContentData setLoginUser(String loginUser) {
            this.loginUser = loginUser;
            return this;
        }
        public String getLoginUser() {
            return this.loginUser;
        }

        public QueryHasAdminSshResponseBodyResultContentData setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public QueryHasAdminSshResponseBodyResultContentData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryHasAdminSshResponseBodyResultContentData setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public QueryHasAdminSshResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryHasAdminSshResponseBodyResultContentData setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public QueryHasAdminSshResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasAdminSshResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class QueryHasAdminSshResponseBodyResultContentTopErrorCode extends TeaModel {
        @NameInMap("ExceptionCode")
        public String exceptionCode;

        @NameInMap("ExceptionCodeDescription")
        public String exceptionCodeDescription;

        @NameInMap("Level")
        public String level;

        @NameInMap("Prefix")
        public String prefix;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("Type")
        public String type;

        @NameInMap("Version")
        public String version;

        public static QueryHasAdminSshResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasAdminSshResponseBodyResultContentTopErrorCode self = new QueryHasAdminSshResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasAdminSshResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasAdminSshResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasAdminSshResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasAdminSshResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasAdminSshResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasAdminSshResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasAdminSshResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasAdminSshResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasAdminSshResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasAdminSshResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasAdminSshResponseBodyResultContentTopErrorReason self = new QueryHasAdminSshResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasAdminSshResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasAdminSshResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasAdminSshResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("Message")
        public String message;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("Data")
        public java.util.List<QueryHasAdminSshResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasAdminSshResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasAdminSshResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasAdminSshResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasAdminSshResponseBodyResultContent self = new QueryHasAdminSshResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasAdminSshResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasAdminSshResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasAdminSshResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasAdminSshResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasAdminSshResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasAdminSshResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasAdminSshResponseBodyResultContent setData(java.util.List<QueryHasAdminSshResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasAdminSshResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasAdminSshResponseBodyResultContent setTopErrorCode(QueryHasAdminSshResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasAdminSshResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasAdminSshResponseBodyResultContent setTopErrorReason(QueryHasAdminSshResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasAdminSshResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
