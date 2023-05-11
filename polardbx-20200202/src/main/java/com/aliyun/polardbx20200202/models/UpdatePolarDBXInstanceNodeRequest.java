// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpdatePolarDBXInstanceNodeRequest extends TeaModel {
    @NameInMap("CNNodeCount")
    public String CNNodeCount;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("DNNodeCount")
    public String DNNodeCount;

    @NameInMap("DbInstanceNodeCount")
    public String dbInstanceNodeCount;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdatePolarDBXInstanceNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolarDBXInstanceNodeRequest self = new UpdatePolarDBXInstanceNodeRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePolarDBXInstanceNodeRequest setCNNodeCount(String CNNodeCount) {
        this.CNNodeCount = CNNodeCount;
        return this;
    }
    public String getCNNodeCount() {
        return this.CNNodeCount;
    }

    public UpdatePolarDBXInstanceNodeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdatePolarDBXInstanceNodeRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public UpdatePolarDBXInstanceNodeRequest setDNNodeCount(String DNNodeCount) {
        this.DNNodeCount = DNNodeCount;
        return this;
    }
    public String getDNNodeCount() {
        return this.DNNodeCount;
    }

    public UpdatePolarDBXInstanceNodeRequest setDbInstanceNodeCount(String dbInstanceNodeCount) {
        this.dbInstanceNodeCount = dbInstanceNodeCount;
        return this;
    }
    public String getDbInstanceNodeCount() {
        return this.dbInstanceNodeCount;
    }

    public UpdatePolarDBXInstanceNodeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
