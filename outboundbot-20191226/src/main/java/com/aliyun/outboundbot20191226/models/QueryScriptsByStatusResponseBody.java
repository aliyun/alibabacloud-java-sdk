// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class QueryScriptsByStatusResponseBody extends TeaModel {
    /**
     * <p>The API status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The scenarios.</p>
     */
    @NameInMap("Scripts")
    public QueryScriptsByStatusResponseBodyScripts scripts;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1579055782000</p>
         */
        @NameInMap("AppliedVersion")
        public String appliedVersion;

        /**
         * <p>The debug status.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLISHED</p>
         */
        @NameInMap("DebugStatus")
        public String debugStatus;

        /**
         * <p>The debug version.</p>
         * 
         * <strong>example:</strong>
         * <p>01bb2df2-a273-42bb-a214-d3c626b13296</p>
         */
        @NameInMap("DebugVersion")
        public String debugVersion;

        /**
         * <p>The industry.</p>
         * 
         * <strong>example:</strong>
         * <p>通用</p>
         */
        @NameInMap("Industry")
        public String industry;

        /**
         * <p>Indicates whether the debug version is a draft.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDebugDrafted")
        public Boolean isDebugDrafted;

        /**
         * <p>Indicates whether the version is a draft.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDrafted")
        public Boolean isDrafted;

        /**
         * <p>The scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>电销</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The script description.</p>
         * 
         * <strong>example:</strong>
         * <p>销售话术</p>
         */
        @NameInMap("ScriptDescription")
        public String scriptDescription;

        /**
         * <p>The scenario ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fa0e21e9-caab-4629-9121-1e341243d599</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <p>The scenario name.</p>
         * 
         * <strong>example:</strong>
         * <p>销售话术</p>
         */
        @NameInMap("ScriptName")
        public String scriptName;

        /**
         * <p>The status of the application version. Valid values:</p>
         * <ul>
         * <li><p><strong>DRAFTED</strong>: The script is a draft.</p>
         * </li>
         * <li><p><strong>INITIALIZE_IN_PROGRESS</strong>: The script is being initialized.</p>
         * </li>
         * <li><p><strong>PUBLISHED</strong>: The script is published.</p>
         * </li>
         * <li><p><strong>PUBLISH_IN_PROGRESS</strong>: The script is being published.</p>
         * </li>
         * <li><p><strong>ROLLBACK_IN_PROGRESS</strong>: The script is being rolled back.</p>
         * </li>
         * <li><p><strong>EXAMINE_IN_PROGRESS</strong>: The script is pending approval.</p>
         * </li>
         * <li><p><strong>PUBLISHED_AND_EXAMINE_IN_PROGRESS</strong>: The script is published and pending approval.</p>
         * </li>
         * <li><p><strong>PUBLISH_FAILED</strong>: The script failed to be published.</p>
         * </li>
         * <li><p><strong>ROLLBACK_FAILED</strong>: The script failed to be rolled back.</p>
         * </li>
         * <li><p><strong>IMPORT_IN_PROGRESS</strong>: The script is being imported.</p>
         * </li>
         * <li><p><strong>IMPORT_FAILED</strong>: The script failed to be imported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLISHED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the script was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1579055782000</p>
         */
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
        /**
         * <p>The list of scenarios.</p>
         */
        @NameInMap("List")
        public java.util.List<QueryScriptsByStatusResponseBodyScriptsList> list;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
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
