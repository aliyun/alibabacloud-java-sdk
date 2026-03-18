// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryMinorVersionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>3.3</p>
     */
    @NameInMap("Version")
    public String version;

    public static QueryMinorVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMinorVersionRequest self = new QueryMinorVersionRequest();
        return TeaModel.build(map, self);
    }

    public QueryMinorVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryMinorVersionRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
