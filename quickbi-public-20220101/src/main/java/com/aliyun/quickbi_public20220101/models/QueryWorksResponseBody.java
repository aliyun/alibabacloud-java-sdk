// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorksResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the work.</p>
     */
    @NameInMap("Result")
    public QueryWorksResponseBodyResult result;

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

    public static QueryWorksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryWorksResponseBody self = new QueryWorksResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryWorksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryWorksResponseBody setResult(QueryWorksResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryWorksResponseBodyResult getResult() {
        return this.result;
    }

    public QueryWorksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryWorksResponseBodyResultDirectory extends TeaModel {
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

        public static QueryWorksResponseBodyResultDirectory build(java.util.Map<String, ?> map) throws Exception {
            QueryWorksResponseBodyResultDirectory self = new QueryWorksResponseBodyResultDirectory();
            return TeaModel.build(map, self);
        }

        public QueryWorksResponseBodyResultDirectory setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryWorksResponseBodyResultDirectory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryWorksResponseBodyResultDirectory setPathId(String pathId) {
            this.pathId = pathId;
            return this;
        }
        public String getPathId() {
            return this.pathId;
        }

        public QueryWorksResponseBodyResultDirectory setPathName(String pathName) {
            this.pathName = pathName;
            return this;
        }
        public String getPathName() {
            return this.pathName;
        }

    }

    public static class QueryWorksResponseBodyResult extends TeaModel {
        /**
         * <p>Third-party embedding status. Valid values:</p>
         * <ul>
         * <li>0: The embed service is not enabled.</li>
         * <li>1: Embed is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
        public QueryWorksResponseBodyResultDirectory directory;

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
         * <p>1496651577000</p>
         */
        @NameInMap("GmtModify")
        public String gmtModify;

        /**
         * <p>The Alibaba Cloud account name of the person who modified the work.</p>
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
         * <p>9187a612aa474e2a8ac1414d5529****</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The Alibaba Cloud account name of the work owner.</p>
         * 
         * <strong>example:</strong>
         * <p>Tom</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <p>Is it public</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PublicFlag")
        public Boolean publicFlag;

        /**
         * <p>Deadline for the public release of the report</p>
         * 
         * <strong>example:</strong>
         * <p>1721366354000</p>
         */
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
         * <p>The status of the report. Valid values:</p>
         * <ul>
         * <li>0: unpublished</li>
         * <li>1: published</li>
         * <li>2: modified but not published</li>
         * <li>3: unpublished</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>Queries the types of works. Fill in the blanks to query all types. Valid values:</p>
         * <ul>
         * <li>DATAPRODUCT: BI portal</li>
         * <li>PAGE: Dashboard</li>
         * <li>FULLPAGE: full-screen dashboards</li>
         * <li>REPORT: workbook</li>
         * <li>dashboardOfflineQuery: self-service data retrieval</li>
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
         * <p>95296e95-ca89-4c7d-8af9-dedf0ad0****</p>
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
         * <p>Test Space</p>
         */
        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static QueryWorksResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryWorksResponseBodyResult self = new QueryWorksResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryWorksResponseBodyResult setAuth3rdFlag(Integer auth3rdFlag) {
            this.auth3rdFlag = auth3rdFlag;
            return this;
        }
        public Integer getAuth3rdFlag() {
            return this.auth3rdFlag;
        }

        public QueryWorksResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryWorksResponseBodyResult setDirectory(QueryWorksResponseBodyResultDirectory directory) {
            this.directory = directory;
            return this;
        }
        public QueryWorksResponseBodyResultDirectory getDirectory() {
            return this.directory;
        }

        public QueryWorksResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryWorksResponseBodyResult setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public QueryWorksResponseBodyResult setModifyName(String modifyName) {
            this.modifyName = modifyName;
            return this;
        }
        public String getModifyName() {
            return this.modifyName;
        }

        public QueryWorksResponseBodyResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public QueryWorksResponseBodyResult setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public QueryWorksResponseBodyResult setPublicFlag(Boolean publicFlag) {
            this.publicFlag = publicFlag;
            return this;
        }
        public Boolean getPublicFlag() {
            return this.publicFlag;
        }

        public QueryWorksResponseBodyResult setPublicInvalidTime(Long publicInvalidTime) {
            this.publicInvalidTime = publicInvalidTime;
            return this;
        }
        public Long getPublicInvalidTime() {
            return this.publicInvalidTime;
        }

        public QueryWorksResponseBodyResult setSecurityLevel(String securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public String getSecurityLevel() {
            return this.securityLevel;
        }

        public QueryWorksResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryWorksResponseBodyResult setWorkName(String workName) {
            this.workName = workName;
            return this;
        }
        public String getWorkName() {
            return this.workName;
        }

        public QueryWorksResponseBodyResult setWorkType(String workType) {
            this.workType = workType;
            return this;
        }
        public String getWorkType() {
            return this.workType;
        }

        public QueryWorksResponseBodyResult setWorksId(String worksId) {
            this.worksId = worksId;
            return this;
        }
        public String getWorksId() {
            return this.worksId;
        }

        public QueryWorksResponseBodyResult setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryWorksResponseBodyResult setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

}
