// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class QueryScriptsByStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Scripts")
    public QueryScriptsByStatusResponseBodyScripts scripts;

    @NameInMap("Success")
    public Boolean success;

    public static QueryScriptsByStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryScriptsByStatusResponseBody self = new QueryScriptsByStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryScriptsByStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryScriptsByStatusResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryScriptsByStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryScriptsByStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryScriptsByStatusResponseBody setScripts(QueryScriptsByStatusResponseBodyScripts scripts) {
        this.scripts = scripts;
        return this;
    }
    public QueryScriptsByStatusResponseBodyScripts getScripts() {
        return this.scripts;
    }

    public QueryScriptsByStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryScriptsByStatusResponseBodyScriptsList extends TeaModel {
        @NameInMap("AppliedVersion")
        public String appliedVersion;

        @NameInMap("DebugStatus")
        public String debugStatus;

        @NameInMap("DebugVersion")
        public String debugVersion;

        @NameInMap("Industry")
        public String industry;

        @NameInMap("IsDebugDrafted")
        public Boolean isDebugDrafted;

        @NameInMap("IsDrafted")
        public Boolean isDrafted;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("ScriptDescription")
        public String scriptDescription;

        @NameInMap("ScriptId")
        public String scriptId;

        @NameInMap("ScriptName")
        public String scriptName;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static QueryScriptsByStatusResponseBodyScriptsList build(java.util.Map<String, ?> map) throws Exception {
            QueryScriptsByStatusResponseBodyScriptsList self = new QueryScriptsByStatusResponseBodyScriptsList();
            return TeaModel.build(map, self);
        }

        public QueryScriptsByStatusResponseBodyScriptsList setAppliedVersion(String appliedVersion) {
            this.appliedVersion = appliedVersion;
            return this;
        }
        public String getAppliedVersion() {
            return this.appliedVersion;
        }

        public QueryScriptsByStatusResponseBodyScriptsList setDebugStatus(String debugStatus) {
            this.debugStatus = debugStatus;
            return this;
        }
        public String getDebugStatus() {
            return this.debugStatus;
        }

        public QueryScriptsByStatusResponseBodyScriptsList setDebugVersion(String debugVersion) {
            this.debugVersion = debugVersion;
            return this;
        }
        public String getDebugVersion() {
            return this.debugVersion;
        }

        public QueryScriptsByStatusResponseBodyScriptsList setIndustry(String industry) {
            this.industry = industry;
            return this;
        }
        public String getIndustry() {
            return this.industry;
        }

        public QueryScriptsByStatusResponseBodyScriptsList setIsDebugDrafted(Boolean isDebugDrafted) {
            this.isDebugDrafted = isDebugDrafted;
            return this;
        }
        public Boolean getIsDebugDrafted() {
            return this.isDebugDrafted;
        }

        public QueryScriptsByStatusResponseBodyScriptsList setIsDrafted(Boolean isDrafted) {
            this.isDrafted = isDrafted;
            return this;
        }
        public Boolean getIsDrafted() {
            return this.isDrafted;
        }

        public QueryScriptsByStatusResponseBodyScriptsList setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryScriptsByStatusResponseBodyScriptsList setScriptDescription(String scriptDescription) {
            this.scriptDescription = scriptDescription;
            return this;
        }
        public String getScriptDescription() {
            return this.scriptDescription;
        }

        public QueryScriptsByStatusResponseBodyScriptsList setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public QueryScriptsByStatusResponseBodyScriptsList setScriptName(String scriptName) {
            this.scriptName = scriptName;
            return this;
        }
        public String getScriptName() {
            return this.scriptName;
        }

        public QueryScriptsByStatusResponseBodyScriptsList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryScriptsByStatusResponseBodyScriptsList setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class QueryScriptsByStatusResponseBodyScripts extends TeaModel {
        @NameInMap("List")
        public java.util.List<QueryScriptsByStatusResponseBodyScriptsList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static QueryScriptsByStatusResponseBodyScripts build(java.util.Map<String, ?> map) throws Exception {
            QueryScriptsByStatusResponseBodyScripts self = new QueryScriptsByStatusResponseBodyScripts();
            return TeaModel.build(map, self);
        }

        public QueryScriptsByStatusResponseBodyScripts setList(java.util.List<QueryScriptsByStatusResponseBodyScriptsList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryScriptsByStatusResponseBodyScriptsList> getList() {
            return this.list;
        }

        public QueryScriptsByStatusResponseBodyScripts setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public QueryScriptsByStatusResponseBodyScripts setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryScriptsByStatusResponseBodyScripts setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
