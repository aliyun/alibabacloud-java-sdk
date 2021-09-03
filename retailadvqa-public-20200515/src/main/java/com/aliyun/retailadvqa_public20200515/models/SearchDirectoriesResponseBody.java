// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class SearchDirectoriesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorDesc")
    public String errorDesc;

    @NameInMap("TraceId")
    public String traceId;

    @NameInMap("Data")
    public SearchDirectoriesResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    public static SearchDirectoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchDirectoriesResponseBody self = new SearchDirectoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchDirectoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchDirectoriesResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public SearchDirectoriesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public SearchDirectoriesResponseBody setData(SearchDirectoriesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchDirectoriesResponseBodyData getData() {
        return this.data;
    }

    public SearchDirectoriesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SearchDirectoriesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchDirectoriesResponseBodyDataContent extends TeaModel {
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("CreateUserName")
        public String createUserName;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("ModifyUser")
        public String modifyUser;

        @NameInMap("ModifyUserName")
        public String modifyUserName;

        @NameInMap("DefaultCube")
        public String defaultCube;

        @NameInMap("Subtype")
        public String subtype;

        @NameInMap("AiplSubType")
        public String aiplSubType;

        @NameInMap("TypeSource")
        public Integer typeSource;

        @NameInMap("FactTable")
        public String factTable;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("DsId")
        public String dsId;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("Permission")
        public String permission;

        @NameInMap("FuseCube")
        public Boolean fuseCube;

        @NameInMap("Version")
        public String version;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("IsMark")
        public Integer isMark;

        @NameInMap("Desc")
        public String desc;

        public static SearchDirectoriesResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            SearchDirectoriesResponseBodyDataContent self = new SearchDirectoriesResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public SearchDirectoriesResponseBodyDataContent setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public SearchDirectoriesResponseBodyDataContent setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public SearchDirectoriesResponseBodyDataContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchDirectoriesResponseBodyDataContent setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SearchDirectoriesResponseBodyDataContent setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public SearchDirectoriesResponseBodyDataContent setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public SearchDirectoriesResponseBodyDataContent setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public SearchDirectoriesResponseBodyDataContent setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public SearchDirectoriesResponseBodyDataContent setModifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }
        public String getModifyUserName() {
            return this.modifyUserName;
        }

        public SearchDirectoriesResponseBodyDataContent setDefaultCube(String defaultCube) {
            this.defaultCube = defaultCube;
            return this;
        }
        public String getDefaultCube() {
            return this.defaultCube;
        }

        public SearchDirectoriesResponseBodyDataContent setSubtype(String subtype) {
            this.subtype = subtype;
            return this;
        }
        public String getSubtype() {
            return this.subtype;
        }

        public SearchDirectoriesResponseBodyDataContent setAiplSubType(String aiplSubType) {
            this.aiplSubType = aiplSubType;
            return this;
        }
        public String getAiplSubType() {
            return this.aiplSubType;
        }

        public SearchDirectoriesResponseBodyDataContent setTypeSource(Integer typeSource) {
            this.typeSource = typeSource;
            return this;
        }
        public Integer getTypeSource() {
            return this.typeSource;
        }

        public SearchDirectoriesResponseBodyDataContent setFactTable(String factTable) {
            this.factTable = factTable;
            return this;
        }
        public String getFactTable() {
            return this.factTable;
        }

        public SearchDirectoriesResponseBodyDataContent setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public SearchDirectoriesResponseBodyDataContent setDsId(String dsId) {
            this.dsId = dsId;
            return this;
        }
        public String getDsId() {
            return this.dsId;
        }

        public SearchDirectoriesResponseBodyDataContent setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public SearchDirectoriesResponseBodyDataContent setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public SearchDirectoriesResponseBodyDataContent setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
        }

        public SearchDirectoriesResponseBodyDataContent setFuseCube(Boolean fuseCube) {
            this.fuseCube = fuseCube;
            return this;
        }
        public Boolean getFuseCube() {
            return this.fuseCube;
        }

        public SearchDirectoriesResponseBodyDataContent setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public SearchDirectoriesResponseBodyDataContent setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public SearchDirectoriesResponseBodyDataContent setIsMark(Integer isMark) {
            this.isMark = isMark;
            return this;
        }
        public Integer getIsMark() {
            return this.isMark;
        }

        public SearchDirectoriesResponseBodyDataContent setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

    }

    public static class SearchDirectoriesResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public String pageNum;

        @NameInMap("PageSize")
        public String pageSize;

        @NameInMap("TotalNum")
        public String totalNum;

        @NameInMap("Content")
        public java.util.List<SearchDirectoriesResponseBodyDataContent> content;

        public static SearchDirectoriesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchDirectoriesResponseBodyData self = new SearchDirectoriesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchDirectoriesResponseBodyData setPageNum(String pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public String getPageNum() {
            return this.pageNum;
        }

        public SearchDirectoriesResponseBodyData setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public SearchDirectoriesResponseBodyData setTotalNum(String totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public String getTotalNum() {
            return this.totalNum;
        }

        public SearchDirectoriesResponseBodyData setContent(java.util.List<SearchDirectoriesResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<SearchDirectoriesResponseBodyDataContent> getContent() {
            return this.content;
        }

    }

}
