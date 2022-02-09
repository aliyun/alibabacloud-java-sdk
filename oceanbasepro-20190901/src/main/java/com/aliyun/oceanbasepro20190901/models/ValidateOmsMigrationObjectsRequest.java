// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ValidateOmsMigrationObjectsRequest extends TeaModel {
    @NameInMap("CheckDependency")
    public Boolean checkDependency;

    @NameInMap("Id")
    public String id;

    @NameInMap("MigrationObject")
    public String migrationObject;

    @NameInMap("WithPkOrNotNullUk")
    public Boolean withPkOrNotNullUk;

    public static ValidateOmsMigrationObjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateOmsMigrationObjectsRequest self = new ValidateOmsMigrationObjectsRequest();
        return TeaModel.build(map, self);
    }

    public ValidateOmsMigrationObjectsRequest setCheckDependency(Boolean checkDependency) {
        this.checkDependency = checkDependency;
        return this;
    }
    public Boolean getCheckDependency() {
        return this.checkDependency;
    }

    public ValidateOmsMigrationObjectsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ValidateOmsMigrationObjectsRequest setMigrationObject(String migrationObject) {
        this.migrationObject = migrationObject;
        return this;
    }
    public String getMigrationObject() {
        return this.migrationObject;
    }

    public ValidateOmsMigrationObjectsRequest setWithPkOrNotNullUk(Boolean withPkOrNotNullUk) {
        this.withPkOrNotNullUk = withPkOrNotNullUk;
        return this;
    }
    public Boolean getWithPkOrNotNullUk() {
        return this.withPkOrNotNullUk;
    }

}
