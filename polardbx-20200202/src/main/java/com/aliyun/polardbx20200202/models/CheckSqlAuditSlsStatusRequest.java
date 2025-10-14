// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CheckSqlAuditSlsStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CheckSqlAuditSlsStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckSqlAuditSlsStatusRequest self = new CheckSqlAuditSlsStatusRequest();
        return TeaModel.build(map, self);
    }

    public CheckSqlAuditSlsStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
