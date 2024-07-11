// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetOpsItemRequest extends TeaModel {
    /**
     * <p>The O\&amp;M item ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oi-d52b08695e2b46ae8413</p>
     */
    @NameInMap("OpsItemId")
    public String opsItemId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetOpsItemRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOpsItemRequest self = new GetOpsItemRequest();
        return TeaModel.build(map, self);
    }

    public GetOpsItemRequest setOpsItemId(String opsItemId) {
        this.opsItemId = opsItemId;
        return this;
    }
    public String getOpsItemId() {
        return this.opsItemId;
    }

    public GetOpsItemRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
