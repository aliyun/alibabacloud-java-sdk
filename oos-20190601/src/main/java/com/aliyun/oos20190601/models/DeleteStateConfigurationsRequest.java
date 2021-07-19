// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteStateConfigurationsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StateConfigurationIds")
    public String stateConfigurationIds;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DeleteStateConfigurationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStateConfigurationsRequest self = new DeleteStateConfigurationsRequest();
        return TeaModel.build(map, self);
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

    public DeleteStateConfigurationsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
