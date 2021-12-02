// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreateDbRequest extends TeaModel {
    @NameInMap("CharacterSetName")
    public String characterSetName;

    @NameInMap("DbDescription")
    public String dbDescription;

    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    @NameInMap("DbName")
    public String dbName;

    public static CreateDbRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDbRequest self = new CreateDbRequest();
        return TeaModel.build(map, self);
    }

    public CreateDbRequest setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
        return this;
    }
    public String getCharacterSetName() {
        return this.characterSetName;
    }

    public CreateDbRequest setDbDescription(String dbDescription) {
        this.dbDescription = dbDescription;
        return this;
    }
    public String getDbDescription() {
        return this.dbDescription;
    }

    public CreateDbRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public CreateDbRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

}
