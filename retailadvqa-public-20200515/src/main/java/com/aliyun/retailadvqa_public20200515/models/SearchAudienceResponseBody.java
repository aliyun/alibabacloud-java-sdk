// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class SearchAudienceResponseBody extends TeaModel {
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
    public SearchAudienceResponseBodyData data;

    public static SearchAudienceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchAudienceResponseBody self = new SearchAudienceResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchAudienceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchAudienceResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public SearchAudienceResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public SearchAudienceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SearchAudienceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchAudienceResponseBody setData(SearchAudienceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchAudienceResponseBodyData getData() {
        return this.data;
    }

    public static class SearchAudienceResponseBodyDataExtendMappingTypes extends TeaModel {
        @NameInMap("PathId")
        public String pathId;

        @NameInMap("MappingType")
        public String mappingType;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("DefaultIdType")
        public String defaultIdType;

        public static SearchAudienceResponseBodyDataExtendMappingTypes build(java.util.Map<String, ?> map) throws Exception {
            SearchAudienceResponseBodyDataExtendMappingTypes self = new SearchAudienceResponseBodyDataExtendMappingTypes();
            return TeaModel.build(map, self);
        }

        public SearchAudienceResponseBodyDataExtendMappingTypes setPathId(String pathId) {
            this.pathId = pathId;
            return this;
        }
        public String getPathId() {
            return this.pathId;
        }

        public SearchAudienceResponseBodyDataExtendMappingTypes setMappingType(String mappingType) {
            this.mappingType = mappingType;
            return this;
        }
        public String getMappingType() {
            return this.mappingType;
        }

        public SearchAudienceResponseBodyDataExtendMappingTypes setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public SearchAudienceResponseBodyDataExtendMappingTypes setDefaultIdType(String defaultIdType) {
            this.defaultIdType = defaultIdType;
            return this;
        }
        public String getDefaultIdType() {
            return this.defaultIdType;
        }

    }

    public static class SearchAudienceResponseBodyData extends TeaModel {
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

        @NameInMap("ExtendMappingTypes")
        public java.util.List<SearchAudienceResponseBodyDataExtendMappingTypes> extendMappingTypes;

        public static SearchAudienceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchAudienceResponseBodyData self = new SearchAudienceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchAudienceResponseBodyData setDataModelName(String dataModelName) {
            this.dataModelName = dataModelName;
            return this;
        }
        public String getDataModelName() {
            return this.dataModelName;
        }

        public SearchAudienceResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public SearchAudienceResponseBodyData setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public SearchAudienceResponseBodyData setNumberOfAudiences(Long numberOfAudiences) {
            this.numberOfAudiences = numberOfAudiences;
            return this;
        }
        public Long getNumberOfAudiences() {
            return this.numberOfAudiences;
        }

        public SearchAudienceResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public SearchAudienceResponseBodyData setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public SearchAudienceResponseBodyData setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
        }

        public SearchAudienceResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public SearchAudienceResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public SearchAudienceResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public SearchAudienceResponseBodyData setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public SearchAudienceResponseBodyData setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public SearchAudienceResponseBodyData setModifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }
        public String getModifyUserName() {
            return this.modifyUserName;
        }

        public SearchAudienceResponseBodyData setLatestDataModifyStatus(Integer latestDataModifyStatus) {
            this.latestDataModifyStatus = latestDataModifyStatus;
            return this;
        }
        public Integer getLatestDataModifyStatus() {
            return this.latestDataModifyStatus;
        }

        public SearchAudienceResponseBodyData set_public(Boolean _public) {
            this._public = _public;
            return this;
        }
        public Boolean get_public() {
            return this._public;
        }

        public SearchAudienceResponseBodyData setSubtype(Integer subtype) {
            this.subtype = subtype;
            return this;
        }
        public Integer getSubtype() {
            return this.subtype;
        }

        public SearchAudienceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchAudienceResponseBodyData setAutoUpdateData(Boolean autoUpdateData) {
            this.autoUpdateData = autoUpdateData;
            return this;
        }
        public Boolean getAutoUpdateData() {
            return this.autoUpdateData;
        }

        public SearchAudienceResponseBodyData setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public SearchAudienceResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SearchAudienceResponseBodyData setLatestDataModifyTime(Long latestDataModifyTime) {
            this.latestDataModifyTime = latestDataModifyTime;
            return this;
        }
        public Long getLatestDataModifyTime() {
            return this.latestDataModifyTime;
        }

        public SearchAudienceResponseBodyData setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public SearchAudienceResponseBodyData setExtendMappingTypes(java.util.List<SearchAudienceResponseBodyDataExtendMappingTypes> extendMappingTypes) {
            this.extendMappingTypes = extendMappingTypes;
            return this;
        }
        public java.util.List<SearchAudienceResponseBodyDataExtendMappingTypes> getExtendMappingTypes() {
            return this.extendMappingTypes;
        }

    }

}
