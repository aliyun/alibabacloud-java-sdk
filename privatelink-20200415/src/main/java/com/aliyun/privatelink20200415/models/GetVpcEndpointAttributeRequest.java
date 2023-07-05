// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class GetVpcEndpointAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the endpoint that you want to query.</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The status of the endpoint. Valid values:</p>
     * <br>
     * <p>*   **Creating**: being created</p>
     * <p>*   **Active**: available</p>
     * <p>*   **Pending**: being modified</p>
     * <p>*   **Deleting**: being deleted</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetVpcEndpointAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVpcEndpointAttributeRequest self = new GetVpcEndpointAttributeRequest();
        return TeaModel.build(map, self);
    }

    public GetVpcEndpointAttributeRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public GetVpcEndpointAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
