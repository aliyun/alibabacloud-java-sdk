// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteStateConfigurationsRequest extends TeaModel {
    /**
     * <p>Deletes desired-state configurations in batches</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>## Debugging</p>
     * <br>
     * <p>[OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.](https://api.aliyun.com/#product=oos\&api=DeleteStateConfigurations\&type=RPC\&version=2019-06-01)</p>
     */
    @NameInMap("StateConfigurationIds")
    public String stateConfigurationIds;

    public static DeleteStateConfigurationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStateConfigurationsRequest self = new DeleteStateConfigurationsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStateConfigurationsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteStateConfigurationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteStateConfigurationsRequest setStateConfigurationIds(String stateConfigurationIds) {
        this.stateConfigurationIds = stateConfigurationIds;
        return this;
    }
    public String getStateConfigurationIds() {
        return this.stateConfigurationIds;
    }

}
