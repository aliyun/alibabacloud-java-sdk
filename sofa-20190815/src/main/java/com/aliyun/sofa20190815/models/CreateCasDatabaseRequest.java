// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateCasDatabaseRequest extends TeaModel {
    @NameInMap("DatabaseSchemaJsonStr")
    public String databaseSchemaJsonStr;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("InstanceCount")
    public Long instanceCount;

    @NameInMap("Name")
    public String name;

    @NameInMap("SpecId")
    public String specId;

    @NameInMap("StorageSize")
    public Long storageSize;

    @NameInMap("Type")
    public String type;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("Workspace")
    public String workspace;

    @NameInMap("AppIdsRepeatList")
    public java.util.List<String> appIdsRepeatList;

    @NameInMap("AppServiceIdsRepeatList")
    public java.util.List<String> appServiceIdsRepeatList;

    @NameInMap("DatabaseAccounts")
    public java.util.List<CreateCasDatabaseRequestDatabaseAccounts> databaseAccounts;

    public static CreateCasDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCasDatabaseRequest self = new CreateCasDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateCasDatabaseRequest setDatabaseSchemaJsonStr(String databaseSchemaJsonStr) {
        this.databaseSchemaJsonStr = databaseSchemaJsonStr;
        return this;
    }
    public String getDatabaseSchemaJsonStr() {
        return this.databaseSchemaJsonStr;
    }

    public CreateCasDatabaseRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateCasDatabaseRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateCasDatabaseRequest setInstanceCount(Long instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Long getInstanceCount() {
        return this.instanceCount;
    }

    public CreateCasDatabaseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCasDatabaseRequest setSpecId(String specId) {
        this.specId = specId;
        return this;
    }
    public String getSpecId() {
        return this.specId;
    }

    public CreateCasDatabaseRequest setStorageSize(Long storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    public Long getStorageSize() {
        return this.storageSize;
    }

    public CreateCasDatabaseRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateCasDatabaseRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateCasDatabaseRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public CreateCasDatabaseRequest setAppIdsRepeatList(java.util.List<String> appIdsRepeatList) {
        this.appIdsRepeatList = appIdsRepeatList;
        return this;
    }
    public java.util.List<String> getAppIdsRepeatList() {
        return this.appIdsRepeatList;
    }

    public CreateCasDatabaseRequest setAppServiceIdsRepeatList(java.util.List<String> appServiceIdsRepeatList) {
        this.appServiceIdsRepeatList = appServiceIdsRepeatList;
        return this;
    }
    public java.util.List<String> getAppServiceIdsRepeatList() {
        return this.appServiceIdsRepeatList;
    }

    public CreateCasDatabaseRequest setDatabaseAccounts(java.util.List<CreateCasDatabaseRequestDatabaseAccounts> databaseAccounts) {
        this.databaseAccounts = databaseAccounts;
        return this;
    }
    public java.util.List<CreateCasDatabaseRequestDatabaseAccounts> getDatabaseAccounts() {
        return this.databaseAccounts;
    }

    public static class CreateCasDatabaseRequestDatabaseAccounts extends TeaModel {
        @NameInMap("Password")
        public String password;

        @NameInMap("Privilege")
        public String privilege;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        public static CreateCasDatabaseRequestDatabaseAccounts build(java.util.Map<String, ?> map) throws Exception {
            CreateCasDatabaseRequestDatabaseAccounts self = new CreateCasDatabaseRequestDatabaseAccounts();
            return TeaModel.build(map, self);
        }

        public CreateCasDatabaseRequestDatabaseAccounts setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateCasDatabaseRequestDatabaseAccounts setPrivilege(String privilege) {
            this.privilege = privilege;
            return this;
        }
        public String getPrivilege() {
            return this.privilege;
        }

        public CreateCasDatabaseRequestDatabaseAccounts setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateCasDatabaseRequestDatabaseAccounts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
