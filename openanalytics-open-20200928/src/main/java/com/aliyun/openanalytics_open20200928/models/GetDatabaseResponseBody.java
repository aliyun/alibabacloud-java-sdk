// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetDatabaseResponseBody extends TeaModel {
    // 如果后端处理出现错误，则表示错误的类型
    @NameInMap("Code")
    public String code;

    // 返回的数据库结构
    @NameInMap("DatabaseModel")
    public GetDatabaseResponseBodyDatabaseModel databaseModel;

    // 如果后端处理出现错误，则表示错误的信息
    @NameInMap("Message")
    public String message;

    // 请求的 ID
    @NameInMap("RequestId")
    public String requestId;

    // 标识本次请求是否成功
    @NameInMap("Success")
    public Boolean success;

    public static GetDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseResponseBody self = new GetDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatabaseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDatabaseResponseBody setDatabaseModel(GetDatabaseResponseBodyDatabaseModel databaseModel) {
        this.databaseModel = databaseModel;
        return this;
    }
    public GetDatabaseResponseBodyDatabaseModel getDatabaseModel() {
        return this.databaseModel;
    }

    public GetDatabaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDatabaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDatabaseResponseBodyDatabaseModel extends TeaModel {
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

        public static GetDatabaseResponseBodyDatabaseModel build(java.util.Map<String, ?> map) throws Exception {
            GetDatabaseResponseBodyDatabaseModel self = new GetDatabaseResponseBodyDatabaseModel();
            return TeaModel.build(map, self);
        }

        public GetDatabaseResponseBodyDatabaseModel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDatabaseResponseBodyDatabaseModel setLocationUri(String locationUri) {
            this.locationUri = locationUri;
            return this;
        }
        public String getLocationUri() {
            return this.locationUri;
        }

        public GetDatabaseResponseBodyDatabaseModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDatabaseResponseBodyDatabaseModel setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetDatabaseResponseBodyDatabaseModel setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public GetDatabaseResponseBodyDatabaseModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
