// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorksByWorkspaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryWorksByWorkspaceResponseBodyResult result;

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
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("PathId")
        public String pathId;

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
        @NameInMap("Auth3rdFlag")
        public Integer auth3rdFlag;

        @NameInMap("Description")
        public String description;

        @NameInMap("Directory")
        public QueryWorksByWorkspaceResponseBodyResultDataDirectory directory;

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
        @NameInMap("Data")
        public java.util.List<QueryWorksByWorkspaceResponseBodyResultData> data;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalNum")
        public Integer totalNum;

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
