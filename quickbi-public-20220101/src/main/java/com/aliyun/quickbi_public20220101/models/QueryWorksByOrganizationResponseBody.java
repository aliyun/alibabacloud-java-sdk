// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorksByOrganizationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of all works in the organization that match the request conditions.</p>
     */
    @NameInMap("Result")
    public QueryWorksByOrganizationResponseBodyResult result;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
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

    public static QueryWorksByOrganizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryWorksByOrganizationResponseBody self = new QueryWorksByOrganizationResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryWorksByOrganizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryWorksByOrganizationResponseBody setResult(QueryWorksByOrganizationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryWorksByOrganizationResponseBodyResult getResult() {
        return this.result;
    }

    public QueryWorksByOrganizationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryWorksByOrganizationResponseBodyResultDataDirectory extends TeaModel {
        /**
         * <p>The ID of the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>83d37ba6-d909-48a2-a517-f4d05c3a****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>Test directory</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The hierarchical structure of directory IDs, separated by forward slashes (/).</p>
         * 
         * <strong>example:</strong>
         * <p>83d37ba6-d909-48a2-a517-f4d05c3a****</p>
         */
        @NameInMap("PathId")
        public String pathId;

        /**
         * <p>The hierarchical structure of directory names, separated by forward slashes (/).</p>
         * 
         * <strong>example:</strong>
         * <p>Test directory</p>
         */
        @NameInMap("PathName")
        public String pathName;

        public static QueryWorksByOrganizationResponseBodyResultDataDirectory build(java.util.Map<String, ?> map) throws Exception {
            QueryWorksByOrganizationResponseBodyResultDataDirectory self = new QueryWorksByOrganizationResponseBodyResultDataDirectory();
            return TeaModel.build(map, self);
        }

        public QueryWorksByOrganizationResponseBodyResultDataDirectory setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryWorksByOrganizationResponseBodyResultDataDirectory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryWorksByOrganizationResponseBodyResultDataDirectory setPathId(String pathId) {
            this.pathId = pathId;
            return this;
        }
        public String getPathId() {
            return this.pathId;
        }

        public QueryWorksByOrganizationResponseBodyResultDataDirectory setPathName(String pathName) {
            this.pathName = pathName;
            return this;
        }
        public String getPathName() {
            return this.pathName;
        }

    }

    public static class QueryWorksByOrganizationResponseBodyResultData extends TeaModel {
        /**
         * <p>The third-party embedding status. Valid values:</p>
         * <ul>
         * <li>0: Embedding is not enabled.</li>
         * <li>1: Embedding is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Auth3rdFlag")
        public Integer auth3rdFlag;

        /**
         * <p>The description of the work.</p>
         * 
         * <strong>example:</strong>
         * <p>Remarks</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The directory to which the work belongs.</p>
         */
        @NameInMap("Directory")
        public QueryWorksByOrganizationResponseBodyResultDataDirectory directory;

        /**
         * <p>The timestamp when the work was created, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1496651577000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The timestamp when the work was last modified, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1572334870000</p>
         */
        @NameInMap("GmtModify")
        public String gmtModify;

        /**
         * <p>The Alibaba Cloud account name of the user who last modified the work.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        @NameInMap("ModifyName")
        public String modifyName;

        /**
         * <p>The Quick BI user ID of the work owner.</p>
         * 
         * <strong>example:</strong>
         * <p>The name of the workspace to which the work belongs</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The Alibaba Cloud account name of the work owner.</p>
         * 
         * <strong>example:</strong>
         * <p>Jane</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <p>Indicates whether the work is public.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PublicFlag")
        public Boolean publicFlag;

        /**
         * <p>The expiration date for the public report, in UNIX timestamp format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1721366354000</p>
         */
        @NameInMap("PublicInvalidTime")
        public Long publicInvalidTime;

        /**
         * <p>The security policy for collaborative authorization of the work. Valid values:</p>
         * <ul>
         * <li>0: Private.</li>
         * <li>12: Authorized to specified members.</li>
         * <li>1 or 11: Authorized to all workspace members.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If you use the legacy permissions, the return value is 1.</li>
         * <li>If you use the new permissions, the return value is 11.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SecurityLevel")
        public String securityLevel;

        /**
         * <p>The report status. Valid values:</p>
         * <ul>
         * <li>0: Unpublished.</li>
         * <li>1: Published.</li>
         * <li>2: Modified but not published.</li>
         * <li>3: Offline.</li>
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
         * <li>DATAPRODUCT: data portal</li>
         * <li>PAGE: dashboard</li>
         * <li>REPORT: workbook</li>
         * <li>dashboardOfflineQuery: custom query</li>
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
         * <p>897ce25e-<strong><strong>-</strong></strong>-af84-d13c5610****</p>
         */
        @NameInMap("WorksId")
        public String worksId;

        /**
         * <p>The ID of the workspace to which the work belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>The Alibaba Cloud account name of the user who last modified the work</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <p>The name of the workspace to which the work belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Test workspace</p>
         */
        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static QueryWorksByOrganizationResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            QueryWorksByOrganizationResponseBodyResultData self = new QueryWorksByOrganizationResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public QueryWorksByOrganizationResponseBodyResultData setAuth3rdFlag(Integer auth3rdFlag) {
            this.auth3rdFlag = auth3rdFlag;
            return this;
        }
        public Integer getAuth3rdFlag() {
            return this.auth3rdFlag;
        }

        public QueryWorksByOrganizationResponseBodyResultData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryWorksByOrganizationResponseBodyResultData setDirectory(QueryWorksByOrganizationResponseBodyResultDataDirectory directory) {
            this.directory = directory;
            return this;
        }
        public QueryWorksByOrganizationResponseBodyResultDataDirectory getDirectory() {
            return this.directory;
        }

        public QueryWorksByOrganizationResponseBodyResultData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryWorksByOrganizationResponseBodyResultData setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public QueryWorksByOrganizationResponseBodyResultData setModifyName(String modifyName) {
            this.modifyName = modifyName;
            return this;
        }
        public String getModifyName() {
            return this.modifyName;
        }

        public QueryWorksByOrganizationResponseBodyResultData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public QueryWorksByOrganizationResponseBodyResultData setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public QueryWorksByOrganizationResponseBodyResultData setPublicFlag(Boolean publicFlag) {
            this.publicFlag = publicFlag;
            return this;
        }
        public Boolean getPublicFlag() {
            return this.publicFlag;
        }

        public QueryWorksByOrganizationResponseBodyResultData setPublicInvalidTime(Long publicInvalidTime) {
            this.publicInvalidTime = publicInvalidTime;
            return this;
        }
        public Long getPublicInvalidTime() {
            return this.publicInvalidTime;
        }

        public QueryWorksByOrganizationResponseBodyResultData setSecurityLevel(String securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public String getSecurityLevel() {
            return this.securityLevel;
        }

        public QueryWorksByOrganizationResponseBodyResultData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryWorksByOrganizationResponseBodyResultData setWorkName(String workName) {
            this.workName = workName;
            return this;
        }
        public String getWorkName() {
            return this.workName;
        }

        public QueryWorksByOrganizationResponseBodyResultData setWorkType(String workType) {
            this.workType = workType;
            return this;
        }
        public String getWorkType() {
            return this.workType;
        }

        public QueryWorksByOrganizationResponseBodyResultData setWorksId(String worksId) {
            this.worksId = worksId;
            return this;
        }
        public String getWorksId() {
            return this.worksId;
        }

        public QueryWorksByOrganizationResponseBodyResultData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryWorksByOrganizationResponseBodyResultData setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

    public static class QueryWorksByOrganizationResponseBodyResult extends TeaModel {
        /**
         * <p>The details of the works list.</p>
         */
        @NameInMap("Data")
        public java.util.List<QueryWorksByOrganizationResponseBodyResultData> data;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of rows per page specified in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of rows.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPages")
        public Integer totalPages;

        public static QueryWorksByOrganizationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryWorksByOrganizationResponseBodyResult self = new QueryWorksByOrganizationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryWorksByOrganizationResponseBodyResult setData(java.util.List<QueryWorksByOrganizationResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryWorksByOrganizationResponseBodyResultData> getData() {
            return this.data;
        }

        public QueryWorksByOrganizationResponseBodyResult setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryWorksByOrganizationResponseBodyResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryWorksByOrganizationResponseBodyResult setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public QueryWorksByOrganizationResponseBodyResult setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
