// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class GetDbProxyInstanceSslRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DbInstanceId")
    @Validation(required = true)
    public String dbInstanceId;

    public static GetDbProxyInstanceSslRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDbProxyInstanceSslRequest self = new GetDbProxyInstanceSslRequest();
        return TeaModel.build(map, self);
    }

    public GetDbProxyInstanceSslRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetDbProxyInstanceSslRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

}
