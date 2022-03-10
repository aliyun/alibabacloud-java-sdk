// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorksByOrganizationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryWorksByOrganizationResponseBodyResult result;

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
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("PathId")
        public String pathId;

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
        @NameInMap("Auth3rdFlag")
        public Integer auth3rdFlag;

        @NameInMap("Description")
        public String description;

        @NameInMap("Directory")
        public QueryWorksByOrganizationResponseBodyResultDataDirectory directory;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModify")
        public String gmtModify;

        @NameInMap("ModifyName")
        public String modifyName;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("SecurityLevel")
        public String securityLevel;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("WorkName")
        public String workName;

        @NameInMap("WorkType")
        public String workType;

        @NameInMap("WorksId")
        public String worksId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

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
        @NameInMap("Data")
        public java.util.List<QueryWorksByOrganizationResponseBodyResultData> data;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalNum")
        public Integer totalNum;

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
