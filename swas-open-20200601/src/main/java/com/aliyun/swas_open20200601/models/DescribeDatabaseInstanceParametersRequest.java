// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeDatabaseInstanceParametersRequest extends TeaModel {
    /**
     * <p>The ID of the Simple Database Service instance.</p>
     */
    @NameInMap("DatabaseInstanceId")
    public String databaseInstanceId;

    /**
     * <p>The region ID of the Simple Database Service instance. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDatabaseInstanceParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatabaseInstanceParametersRequest self = new DescribeDatabaseInstanceParametersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDatabaseInstanceParametersRequest setDatabaseInstanceId(String databaseInstanceId) {
        this.databaseInstanceId = databaseInstanceId;
        return this;
    }
    public String getDatabaseInstanceId() {
        return this.databaseInstanceId;
    }

    public DescribeDatabaseInstanceParametersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
