// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class SearchDirectoriesResponseBody extends TeaModel {
    @NameInMap("Data")
    public SearchDirectoriesResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorDesc")
    public String errorDesc;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static SearchDirectoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchDirectoriesResponseBody self = new SearchDirectoriesResponseBody();
        return TeaModel.build(map, self);
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

    public SearchDirectoriesResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public SearchDirectoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchDirectoriesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchDirectoriesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class SearchDirectoriesResponseBodyDataContent extends TeaModel {
        @NameInMap("AiplSubType")
        public String aiplSubType;

        @NameInMap("CreateUserName")
        public String createUserName;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("DefaultCube")
        public String defaultCube;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("DsId")
        public String dsId;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("FactTable")
        public String factTable;

        @NameInMap("FuseCube")
        public Boolean fuseCube;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("IsMark")
        public Integer isMark;

        @NameInMap("ModifyUser")
        public String modifyUser;

        @NameInMap("ModifyUserName")
        public String modifyUserName;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("Permission")
        public String permission;

        @NameInMap("Subtype")
        public String subtype;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("TypeSource")
        public Integer typeSource;

        @NameInMap("Version")
        public String version;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static SearchDirectoriesResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            SearchDirectoriesResponseBodyDataContent self = new SearchDirectoriesResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public SearchDirectoriesResponseBodyDataContent setAiplSubType(String aiplSubType) {
            this.aiplSubType = aiplSubType;
            return this;
        }
        public String getAiplSubType() {
            return this.aiplSubType;
        }

        public SearchDirectoriesResponseBodyDataContent setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public SearchDirectoriesResponseBodyDataContent setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public SearchDirectoriesResponseBodyDataContent setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public SearchDirectoriesResponseBodyDataContent setDefaultCube(String defaultCube) {
            this.defaultCube = defaultCube;
            return this;
        }
        public String getDefaultCube() {
            return this.defaultCube;
        }

        public SearchDirectoriesResponseBodyDataContent setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
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

        public SearchDirectoriesResponseBodyDataContent setFactTable(String factTable) {
            this.factTable = factTable;
            return this;
        }
        public String getFactTable() {
            return this.factTable;
        }

        public SearchDirectoriesResponseBodyDataContent setFuseCube(Boolean fuseCube) {
            this.fuseCube = fuseCube;
            return this;
        }
        public Boolean getFuseCube() {
            return this.fuseCube;
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

        public SearchDirectoriesResponseBodyDataContent setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SearchDirectoriesResponseBodyDataContent setIsMark(Integer isMark) {
            this.isMark = isMark;
            return this;
        }
        public Integer getIsMark() {
            return this.isMark;
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

        public SearchDirectoriesResponseBodyDataContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchDirectoriesResponseBodyDataContent setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public SearchDirectoriesResponseBodyDataContent setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
        }

        public SearchDirectoriesResponseBodyDataContent setSubtype(String subtype) {
            this.subtype = subtype;
            return this;
        }
        public String getSubtype() {
            return this.subtype;
        }

        public SearchDirectoriesResponseBodyDataContent setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public SearchDirectoriesResponseBodyDataContent setTypeSource(Integer typeSource) {
            this.typeSource = typeSource;
            return this;
        }
        public Integer getTypeSource() {
            return this.typeSource;
        }

        public SearchDirectoriesResponseBodyDataContent setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public SearchDirectoriesResponseBodyDataContent setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class SearchDirectoriesResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public java.util.List<SearchDirectoriesResponseBodyDataContent> content;

        @NameInMap("PageNum")
        public String pageNum;

        @NameInMap("PageSize")
        public String pageSize;

        @NameInMap("TotalNum")
        public String totalNum;

        public static SearchDirectoriesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchDirectoriesResponseBodyData self = new SearchDirectoriesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchDirectoriesResponseBodyData setContent(java.util.List<SearchDirectoriesResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<SearchDirectoriesResponseBodyDataContent> getContent() {
            return this.content;
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

    }

}
