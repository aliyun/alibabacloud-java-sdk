// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorksByWorkspaceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returns a list of all works in the organization workspace that meet the requested criteria.</p>
     */
    @NameInMap("Result")
    public QueryWorksByWorkspaceResponseBodyResult result;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryWorksByWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryWorksByWorkspaceResponseBody self = new QueryWorksByWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryWorksByWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryWorksByWorkspaceResponseBody setResult(QueryWorksByWorkspaceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryWorksByWorkspaceResponseBodyResult getResult() {
        return this.result;
    }

    public QueryWorksByWorkspaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryWorksByWorkspaceResponseBodyResultDataDirectory extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>83d37ba6-d909-48a2-a517-f4d05c3a****</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        /**
         * <p>The hierarchical structure of the directory ID to which the directory belongs. Separate the hierarchical structure with a /.</p>
         * 
         * <strong>example:</strong>
         * <p>83d37ba6-d909-48a2-a517-f4d05c3a****</p>
         */
        @NameInMap("PathId")
        public String pathId;

        /**
         * <p>The hierarchical structure of the directory to which the directory belongs. Separate the hierarchical structure with a (/).</p>
         * 
         * <strong>example:</strong>
         * <p>Test directory</p>
         */
        @NameInMap("PathName")
        public String pathName;

        public static QueryWorksByWorkspaceResponseBodyResultDataDirectory build(java.util.Map<String, ?> map) throws Exception {
            QueryWorksByWorkspaceResponseBodyResultDataDirectory self = new QueryWorksByWorkspaceResponseBodyResultDataDirectory();
            return TeaModel.build(map, self);
        }

        public QueryWorksByWorkspaceResponseBodyResultDataDirectory setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryWorksByWorkspaceResponseBodyResultDataDirectory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryWorksByWorkspaceResponseBodyResultDataDirectory setPathId(String pathId) {
            this.pathId = pathId;
            return this;
        }
        public String getPathId() {
            return this.pathId;
        }

        public QueryWorksByWorkspaceResponseBodyResultDataDirectory setPathName(String pathName) {
            this.pathName = pathName;
            return this;
        }
        public String getPathName() {
            return this.pathName;
        }

    }

    public static class QueryWorksByWorkspaceResponseBodyResultData extends TeaModel {
        /**
         * <p>Third-party embedding status. Valid values:</p>
         * <ul>
         * <li>0: The embed service is not enabled.</li>
         * <li>1: Embed is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Auth3rdFlag")
        public Integer auth3rdFlag;

        /**
         * <p>Remarks on the work.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The directory to which the work belongs.</p>
         */
        @NameInMap("Directory")
        public QueryWorksByWorkspaceResponseBodyResultDataDirectory directory;

        /**
         * <p>The timestamp of the creation of the work in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1496651577000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The timestamp of the modification of the work in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1572334870000</p>
         */
        @NameInMap("GmtModify")
        public String gmtModify;

        /**
         * <p>Nickname of the work modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>Tom</p>
         */
        @NameInMap("ModifyName")
        public String modifyName;

        /**
         * <p>The user ID of the work owner in the Quick BI.</p>
         * 
         * <strong>example:</strong>
         * <p>The name of the workspace to which the work belongs.</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The nickname of the work owner.</p>
         * 
         * <strong>example:</strong>
         * <p>Li Si</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("PublicFlag")
        public Boolean publicFlag;

        @NameInMap("PublicInvalidTime")
        public Long publicInvalidTime;

        /**
         * <p>Security policies for collaborative authorization of works. Valid values:</p>
         * <ul>
         * <li>0: private</li>
         * <li>12: Authorize specified members</li>
         * <li>1 or 11: Authorize all workspace members</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If you use legacy permissions, the return value is 1.</p>
         * </li>
         * <li><p>If you use the new permissions, the return value is 11.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SecurityLevel")
        public String securityLevel;

        /**
         * <p>Status of dashboards, full-screen dashboards, spreadsheets. The default value of other work types is 1. Valid values:</p>
         * <ul>
         * <li>0: unpublished</li>
         * <li>1: published</li>
         * <li>2: modified but not published</li>
         * <li>3: unpublished</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The name of the work.</p>
         * 
         * <strong>example:</strong>
         * <p>Test report</p>
         */
        @NameInMap("WorkName")
        public String workName;

        /**
         * <p>The type of the work. Valid values:</p>
         * <ul>
         * <li>DATAPRODUCT: BI portal</li>
         * <li>PAGE: Dashboard</li>
         * <li>FULLPAGE: full-screen dashboards</li>
         * <li>REPORT: workbook</li>
         * <li>dashboardOfflineQuery: self-service data retrieval</li>
         * <li>Analysis: Ad hoc analysis</li>
         * <li>DATAFORM: form filling</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PAGE</p>
         */
        @NameInMap("WorkType")
        public String workType;

        /**
         * <p>The ID of the work.</p>
         * 
         * <strong>example:</strong>
         * <p>897ce25e-f993-4abd-af84-d13c5610****</p>
         */
        @NameInMap("WorksId")
        public String worksId;

        /**
         * <p>The ID of the workspace to which the work belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>87c6b145-090c-43e1-9426-8f93be23****</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <p>The name of the workspace to which the work belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Test Workspace</p>
         */
        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static QueryWorksByWorkspaceResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            QueryWorksByWorkspaceResponseBodyResultData self = new QueryWorksByWorkspaceResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public QueryWorksByWorkspaceResponseBodyResultData setAuth3rdFlag(Integer auth3rdFlag) {
            this.auth3rdFlag = auth3rdFlag;
            return this;
        }
        public Integer getAuth3rdFlag() {
            return this.auth3rdFlag;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setDirectory(QueryWorksByWorkspaceResponseBodyResultDataDirectory directory) {
            this.directory = directory;
            return this;
        }
        public QueryWorksByWorkspaceResponseBodyResultDataDirectory getDirectory() {
            return this.directory;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setModifyName(String modifyName) {
            this.modifyName = modifyName;
            return this;
        }
        public String getModifyName() {
            return this.modifyName;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setPublicFlag(Boolean publicFlag) {
            this.publicFlag = publicFlag;
            return this;
        }
        public Boolean getPublicFlag() {
            return this.publicFlag;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setPublicInvalidTime(Long publicInvalidTime) {
            this.publicInvalidTime = publicInvalidTime;
            return this;
        }
        public Long getPublicInvalidTime() {
            return this.publicInvalidTime;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setSecurityLevel(String securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public String getSecurityLevel() {
            return this.securityLevel;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setWorkName(String workName) {
            this.workName = workName;
            return this;
        }
        public String getWorkName() {
            return this.workName;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setWorkType(String workType) {
            this.workType = workType;
            return this;
        }
        public String getWorkType() {
            return this.workType;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setWorksId(String worksId) {
            this.worksId = worksId;
            return this;
        }
        public String getWorksId() {
            return this.worksId;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

    public static class QueryWorksByWorkspaceResponseBodyResult extends TeaModel {
        /**
         * <p>The details of the list of works.</p>
         */
        @NameInMap("Data")
        public java.util.List<QueryWorksByWorkspaceResponseBodyResultData> data;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of rows per page set when the interface is requested.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of rows in the table.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPages")
        public Integer totalPages;

        public static QueryWorksByWorkspaceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryWorksByWorkspaceResponseBodyResult self = new QueryWorksByWorkspaceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryWorksByWorkspaceResponseBodyResult setData(java.util.List<QueryWorksByWorkspaceResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryWorksByWorkspaceResponseBodyResultData> getData() {
            return this.data;
        }

        public QueryWorksByWorkspaceResponseBodyResult setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryWorksByWorkspaceResponseBodyResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryWorksByWorkspaceResponseBodyResult setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public QueryWorksByWorkspaceResponseBodyResult setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
