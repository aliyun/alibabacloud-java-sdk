// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetParametersRequest extends TeaModel {
    /**
     * <p>The names of the common parameters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;parameter1&quot;,&quot;parameter2&quot;]</p>
     */
    @NameInMap("Names")
    public String names;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        GetParametersRequest self = new GetParametersRequest();
        return TeaModel.build(map, self);
    }

    public GetParametersRequest setNames(String names) {
        this.names = names;
        return this;
    }
    public String getNames() {
        return this.names;
    }

    public GetParametersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
