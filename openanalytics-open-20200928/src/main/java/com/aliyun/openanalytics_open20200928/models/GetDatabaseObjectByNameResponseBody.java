// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetDatabaseObjectByNameResponseBody extends TeaModel {
    // 如果后端处理出现错误，则表示错误的类型
    @NameInMap("Code")
    public String code;

    // 返回的数据库结构
    @NameInMap("DatabaseModel")
    public GetDatabaseObjectByNameResponseBodyDatabaseModel databaseModel;

    // 如果后端处理出现错误，则表示错误的信息
    @NameInMap("Message")
    public String message;

    // 请求的 ID
    @NameInMap("RequestId")
    public String requestId;

    // 标识本次请求是否成功
    @NameInMap("Success")
    public Boolean success;

    public static GetDatabaseObjectByNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseObjectByNameResponseBody self = new GetDatabaseObjectByNameResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatabaseObjectByNameResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDatabaseObjectByNameResponseBody setDatabaseModel(GetDatabaseObjectByNameResponseBodyDatabaseModel databaseModel) {
        this.databaseModel = databaseModel;
        return this;
    }
    public GetDatabaseObjectByNameResponseBodyDatabaseModel getDatabaseModel() {
        return this.databaseModel;
    }

    public GetDatabaseObjectByNameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDatabaseObjectByNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDatabaseObjectByNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDatabaseObjectByNameResponseBodyDatabaseModel extends TeaModel {
        // 数据库描述
        @NameInMap("Description")
        public String description;

        // 数据库地址
        @NameInMap("LocationUri")
        public String locationUri;

        // 数据库名称
        @NameInMap("Name")
        public String name;

        // 数据库所属 DLA userName
        @NameInMap("OwnerName")
        public String ownerName;

        // 数据库参数
        @NameInMap("Parameters")
        public java.util.Map<String, String> parameters;

        // 数据库所属的阿里云UID
        @NameInMap("TenantId")
        public String tenantId;

        // 数据库的 ID
        @NameInMap("DBId")
        public Long DBId;

        // 数据库的类型
        @NameInMap("CatalogType")
        public String catalogType;

        // 创建时间
        @NameInMap("CreateTime")
        public Long createTime;

        // 修改时间
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetDatabaseObjectByNameResponseBodyDatabaseModel build(java.util.Map<String, ?> map) throws Exception {
            GetDatabaseObjectByNameResponseBodyDatabaseModel self = new GetDatabaseObjectByNameResponseBodyDatabaseModel();
            return TeaModel.build(map, self);
        }

        public GetDatabaseObjectByNameResponseBodyDatabaseModel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDatabaseObjectByNameResponseBodyDatabaseModel setLocationUri(String locationUri) {
            this.locationUri = locationUri;
            return this;
        }
        public String getLocationUri() {
            return this.locationUri;
        }

        public GetDatabaseObjectByNameResponseBodyDatabaseModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDatabaseObjectByNameResponseBodyDatabaseModel setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetDatabaseObjectByNameResponseBodyDatabaseModel setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public GetDatabaseObjectByNameResponseBodyDatabaseModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetDatabaseObjectByNameResponseBodyDatabaseModel setDBId(Long DBId) {
            this.DBId = DBId;
            return this;
        }
        public Long getDBId() {
            return this.DBId;
        }

        public GetDatabaseObjectByNameResponseBodyDatabaseModel setCatalogType(String catalogType) {
            this.catalogType = catalogType;
            return this;
        }
        public String getCatalogType() {
            return this.catalogType;
        }

        public GetDatabaseObjectByNameResponseBodyDatabaseModel setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetDatabaseObjectByNameResponseBodyDatabaseModel setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
