// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateAutoGroupingConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable existing associated resources to follow the group transfer task. Valid values:</p>
     * <ul>
     * <li>false: Existing associated resources do not follow the group transfer task.</li>
     * <li>true: Existing associated resources follow the group transfer task.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableExistingResourcesTransfer")
    public Boolean enableExistingResourcesTransfer;

    public static UpdateAutoGroupingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoGroupingConfigRequest self = new UpdateAutoGroupingConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAutoGroupingConfigRequest setEnableExistingResourcesTransfer(Boolean enableExistingResourcesTransfer) {
        this.enableExistingResourcesTransfer = enableExistingResourcesTransfer;
        return this;
    }
    public Boolean getEnableExistingResourcesTransfer() {
        return this.enableExistingResourcesTransfer;
    }

}
