// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteStateConfigurationsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>abcde3OARpx77No54nv6</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of desired-state configurations.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;sc-asfgdhj12345&quot;]</p>
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
