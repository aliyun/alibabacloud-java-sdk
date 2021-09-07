// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpdatePolarDBXInstanceNodeRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("DbInstanceNodeCount")
    public String dbInstanceNodeCount;

    @NameInMap("ClientToken")
    public String clientToken;

    public static UpdatePolarDBXInstanceNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolarDBXInstanceNodeRequest self = new UpdatePolarDBXInstanceNodeRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePolarDBXInstanceNodeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdatePolarDBXInstanceNodeRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public UpdatePolarDBXInstanceNodeRequest setDbInstanceNodeCount(String dbInstanceNodeCount) {
        this.dbInstanceNodeCount = dbInstanceNodeCount;
        return this;
    }
    public String getDbInstanceNodeCount() {
        return this.dbInstanceNodeCount;
    }

    public UpdatePolarDBXInstanceNodeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
