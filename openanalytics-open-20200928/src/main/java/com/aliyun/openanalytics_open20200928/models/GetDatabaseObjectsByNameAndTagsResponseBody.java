// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetDatabaseObjectsByNameAndTagsResponseBody extends TeaModel {
    // 请求的 ID	
    @NameInMap("RequestId")
    public String requestId;

    // 如果后端处理出现错误，则表示错误的类型
    @NameInMap("Code")
    public String code;

    // 如果后端处理出现错误，则表示错误的信息
    @NameInMap("Message")
    public String message;

    // 标识本次请求是否成功
    @NameInMap("Success")
    public Boolean success;

    // 返回的数据库列表
    @NameInMap("Data")
    public java.util.List<GetDatabaseObjectsByNameAndTagsResponseBodyData> data;

    public static GetDatabaseObjectsByNameAndTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseObjectsByNameAndTagsResponseBody self = new GetDatabaseObjectsByNameAndTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatabaseObjectsByNameAndTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDatabaseObjectsByNameAndTagsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDatabaseObjectsByNameAndTagsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDatabaseObjectsByNameAndTagsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDatabaseObjectsByNameAndTagsResponseBody setData(java.util.List<GetDatabaseObjectsByNameAndTagsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDatabaseObjectsByNameAndTagsResponseBodyData> getData() {
        return this.data;
    }

    public static class GetDatabaseObjectsByNameAndTagsResponseBodyData extends TeaModel {
        // 数据库描述	
        @NameInMap("Description")
        public String description;

        // 数据库位置
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

        // 更新时间
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetDatabaseObjectsByNameAndTagsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDatabaseObjectsByNameAndTagsResponseBodyData self = new GetDatabaseObjectsByNameAndTagsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDatabaseObjectsByNameAndTagsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDatabaseObjectsByNameAndTagsResponseBodyData setLocationUri(String locationUri) {
            this.locationUri = locationUri;
            return this;
        }
        public String getLocationUri() {
            return this.locationUri;
        }

        public GetDatabaseObjectsByNameAndTagsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDatabaseObjectsByNameAndTagsResponseBodyData setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetDatabaseObjectsByNameAndTagsResponseBodyData setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public GetDatabaseObjectsByNameAndTagsResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetDatabaseObjectsByNameAndTagsResponseBodyData setDBId(Long DBId) {
            this.DBId = DBId;
            return this;
        }
        public Long getDBId() {
            return this.DBId;
        }

        public GetDatabaseObjectsByNameAndTagsResponseBodyData setCatalogType(String catalogType) {
            this.catalogType = catalogType;
            return this;
        }
        public String getCatalogType() {
            return this.catalogType;
        }

        public GetDatabaseObjectsByNameAndTagsResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetDatabaseObjectsByNameAndTagsResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
