// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class DatabaseModel extends TeaModel {
    // 数据库 ID
    @NameInMap("DBId")
    public String DBId;

    // 数据库所属的阿里云UID	
    @NameInMap("TenantId")
    public String tenantId;

    // 数据库名称
    @NameInMap("Name")
    public String name;

    // 数据库地址
    @NameInMap("LocationURI ")
    public String locationURI;

    // 数据库描述	
    @NameInMap("Description")
    public String description;

    // 数据库参数	
    @NameInMap("Parameters")
    public java.util.Map<String, String> parameters;

    // 数据库所属 DLA userName	
    @NameInMap("OwnerName")
    public String ownerName;

    // 数据库所属用户类型
    @NameInMap("OwnerType")
    public String ownerType;

    // 数据库类型
    @NameInMap("CatalogType")
    public String catalogType;

    public static DatabaseModel build(java.util.Map<String, ?> map) throws Exception {
        DatabaseModel self = new DatabaseModel();
        return TeaModel.build(map, self);
    }

    public DatabaseModel setDBId(String DBId) {
        this.DBId = DBId;
        return this;
    }
    public String getDBId() {
        return this.DBId;
    }

    public DatabaseModel setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DatabaseModel setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DatabaseModel setLocationURI(String locationURI) {
        this.locationURI = locationURI;
        return this;
    }
    public String getLocationURI() {
        return this.locationURI;
    }

    public DatabaseModel setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DatabaseModel setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    public DatabaseModel setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public DatabaseModel setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public DatabaseModel setCatalogType(String catalogType) {
        this.catalogType = catalogType;
        return this;
    }
    public String getCatalogType() {
        return this.catalogType;
    }

}
