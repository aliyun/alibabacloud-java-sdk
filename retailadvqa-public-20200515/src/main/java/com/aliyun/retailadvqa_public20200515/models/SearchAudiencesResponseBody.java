// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class SearchAudiencesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorDesc")
    public String errorDesc;

    @NameInMap("TraceId")
    public String traceId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public SearchAudiencesResponseBodyData data;

    public static SearchAudiencesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchAudiencesResponseBody self = new SearchAudiencesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchAudiencesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchAudiencesResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public SearchAudiencesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public SearchAudiencesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SearchAudiencesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchAudiencesResponseBody setData(SearchAudiencesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchAudiencesResponseBodyData getData() {
        return this.data;
    }

    public static class SearchAudiencesResponseBodyDataContent extends TeaModel {
        @NameInMap("DataModelName")
        public String dataModelName;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("NumberOfAudiences")
        public Long numberOfAudiences;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("Permission")
        public String permission;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Version")
        public String version;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("ModifyUser")
        public String modifyUser;

        @NameInMap("ModifyUserName")
        public String modifyUserName;

        @NameInMap("LatestDataModifyStatus")
        public Integer latestDataModifyStatus;

        @NameInMap("Public")
        public Boolean _public;

        @NameInMap("Subtype")
        public Integer subtype;

        @NameInMap("Name")
        public String name;

        @NameInMap("AutoUpdateData")
        public Boolean autoUpdateData;

        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("Id")
        public String id;

        @NameInMap("LatestDataModifyTime")
        public Long latestDataModifyTime;

        @NameInMap("Desc")
        public String desc;

        public static SearchAudiencesResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            SearchAudiencesResponseBodyDataContent self = new SearchAudiencesResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public SearchAudiencesResponseBodyDataContent setDataModelName(String dataModelName) {
            this.dataModelName = dataModelName;
            return this;
        }
        public String getDataModelName() {
            return this.dataModelName;
        }

        public SearchAudiencesResponseBodyDataContent setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public SearchAudiencesResponseBodyDataContent setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public SearchAudiencesResponseBodyDataContent setNumberOfAudiences(Long numberOfAudiences) {
            this.numberOfAudiences = numberOfAudiences;
            return this;
        }
        public Long getNumberOfAudiences() {
            return this.numberOfAudiences;
        }

        public SearchAudiencesResponseBodyDataContent setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public SearchAudiencesResponseBodyDataContent setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public SearchAudiencesResponseBodyDataContent setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
        }

        public SearchAudiencesResponseBodyDataContent setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public SearchAudiencesResponseBodyDataContent setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public SearchAudiencesResponseBodyDataContent setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public SearchAudiencesResponseBodyDataContent setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public SearchAudiencesResponseBodyDataContent setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public SearchAudiencesResponseBodyDataContent setModifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }
        public String getModifyUserName() {
            return this.modifyUserName;
        }

        public SearchAudiencesResponseBodyDataContent setLatestDataModifyStatus(Integer latestDataModifyStatus) {
            this.latestDataModifyStatus = latestDataModifyStatus;
            return this;
        }
        public Integer getLatestDataModifyStatus() {
            return this.latestDataModifyStatus;
        }

        public SearchAudiencesResponseBodyDataContent set_public(Boolean _public) {
            this._public = _public;
            return this;
        }
        public Boolean get_public() {
            return this._public;
        }

        public SearchAudiencesResponseBodyDataContent setSubtype(Integer subtype) {
            this.subtype = subtype;
            return this;
        }
        public Integer getSubtype() {
            return this.subtype;
        }

        public SearchAudiencesResponseBodyDataContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchAudiencesResponseBodyDataContent setAutoUpdateData(Boolean autoUpdateData) {
            this.autoUpdateData = autoUpdateData;
            return this;
        }
        public Boolean getAutoUpdateData() {
            return this.autoUpdateData;
        }

        public SearchAudiencesResponseBodyDataContent setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public SearchAudiencesResponseBodyDataContent setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SearchAudiencesResponseBodyDataContent setLatestDataModifyTime(Long latestDataModifyTime) {
            this.latestDataModifyTime = latestDataModifyTime;
            return this;
        }
        public Long getLatestDataModifyTime() {
            return this.latestDataModifyTime;
        }

        public SearchAudiencesResponseBodyDataContent setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

    }

    public static class SearchAudiencesResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalNum")
        public Long totalNum;

        @NameInMap("Content")
        public java.util.List<SearchAudiencesResponseBodyDataContent> content;

        public static SearchAudiencesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchAudiencesResponseBodyData self = new SearchAudiencesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchAudiencesResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public SearchAudiencesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public SearchAudiencesResponseBodyData setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

        public SearchAudiencesResponseBodyData setContent(java.util.List<SearchAudiencesResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<SearchAudiencesResponseBodyDataContent> getContent() {
            return this.content;
        }

    }

}
