// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class SearchAudienceResponseBody extends TeaModel {
    @NameInMap("Data")
    public SearchAudienceResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorDesc")
    public String errorDesc;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static SearchAudienceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchAudienceResponseBody self = new SearchAudienceResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchAudienceResponseBody setData(SearchAudienceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchAudienceResponseBodyData getData() {
        return this.data;
    }

    public SearchAudienceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SearchAudienceResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public SearchAudienceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchAudienceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchAudienceResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class SearchAudienceResponseBodyDataExtendMappingTypes extends TeaModel {
        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("DefaultIdType")
        public String defaultIdType;

        @NameInMap("MappingType")
        public String mappingType;

        @NameInMap("PathId")
        public String pathId;

        public static SearchAudienceResponseBodyDataExtendMappingTypes build(java.util.Map<String, ?> map) throws Exception {
            SearchAudienceResponseBodyDataExtendMappingTypes self = new SearchAudienceResponseBodyDataExtendMappingTypes();
            return TeaModel.build(map, self);
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

        public SearchAudienceResponseBodyDataExtendMappingTypes setMappingType(String mappingType) {
            this.mappingType = mappingType;
            return this;
        }
        public String getMappingType() {
            return this.mappingType;
        }

        public SearchAudienceResponseBodyDataExtendMappingTypes setPathId(String pathId) {
            this.pathId = pathId;
            return this;
        }
        public String getPathId() {
            return this.pathId;
        }

    }

    public static class SearchAudienceResponseBodyData extends TeaModel {
        @NameInMap("AutoUpdateData")
        public Boolean autoUpdateData;

        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("DataModelName")
        public String dataModelName;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ExtendMappingTypes")
        public java.util.List<SearchAudienceResponseBodyDataExtendMappingTypes> extendMappingTypes;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("LatestDataModifyStatus")
        public Integer latestDataModifyStatus;

        @NameInMap("LatestDataModifyTime")
        public Long latestDataModifyTime;

        @NameInMap("ModifyUser")
        public String modifyUser;

        @NameInMap("ModifyUserName")
        public String modifyUserName;

        @NameInMap("Name")
        public String name;

        @NameInMap("NumberOfAudiences")
        public Long numberOfAudiences;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("Permission")
        public String permission;

        @NameInMap("Public")
        public Boolean _public;

        @NameInMap("Subtype")
        public Integer subtype;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("Version")
        public String version;

        public static SearchAudienceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchAudienceResponseBodyData self = new SearchAudienceResponseBodyData();
            return TeaModel.build(map, self);
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

        public SearchAudienceResponseBodyData setDataModelName(String dataModelName) {
            this.dataModelName = dataModelName;
            return this;
        }
        public String getDataModelName() {
            return this.dataModelName;
        }

        public SearchAudienceResponseBodyData setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public SearchAudienceResponseBodyData setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public SearchAudienceResponseBodyData setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public SearchAudienceResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public SearchAudienceResponseBodyData setExtendMappingTypes(java.util.List<SearchAudienceResponseBodyDataExtendMappingTypes> extendMappingTypes) {
            this.extendMappingTypes = extendMappingTypes;
            return this;
        }
        public java.util.List<SearchAudienceResponseBodyDataExtendMappingTypes> getExtendMappingTypes() {
            return this.extendMappingTypes;
        }

        public SearchAudienceResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public SearchAudienceResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public SearchAudienceResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SearchAudienceResponseBodyData setLatestDataModifyStatus(Integer latestDataModifyStatus) {
            this.latestDataModifyStatus = latestDataModifyStatus;
            return this;
        }
        public Integer getLatestDataModifyStatus() {
            return this.latestDataModifyStatus;
        }

        public SearchAudienceResponseBodyData setLatestDataModifyTime(Long latestDataModifyTime) {
            this.latestDataModifyTime = latestDataModifyTime;
            return this;
        }
        public Long getLatestDataModifyTime() {
            return this.latestDataModifyTime;
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

        public SearchAudienceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchAudienceResponseBodyData setNumberOfAudiences(Long numberOfAudiences) {
            this.numberOfAudiences = numberOfAudiences;
            return this;
        }
        public Long getNumberOfAudiences() {
            return this.numberOfAudiences;
        }

        public SearchAudienceResponseBodyData setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public SearchAudienceResponseBodyData setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
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

        public SearchAudienceResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public SearchAudienceResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
