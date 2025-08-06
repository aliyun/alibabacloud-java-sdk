// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateDNADBRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBDescription")
    public String DBDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBRegion")
    public String DBRegion;

    @NameInMap("DBType")
    public String DBType;

    public static CreateDNADBRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDNADBRequest self = new CreateDNADBRequest();
        return TeaModel.build(map, self);
    }

    public CreateDNADBRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDNADBRequest setDBDescription(String DBDescription) {
        this.DBDescription = DBDescription;
        return this;
    }
    public String getDBDescription() {
        return this.DBDescription;
    }

    public CreateDNADBRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public CreateDNADBRequest setDBRegion(String DBRegion) {
        this.DBRegion = DBRegion;
        return this;
    }
    public String getDBRegion() {
        return this.DBRegion;
    }

    public CreateDNADBRequest setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

}
