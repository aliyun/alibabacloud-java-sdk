// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ConfirmLinkefabricFabricTechstackconfigsRequest extends TeaModel {
    @NameInMap("ConfigFlowInfo")
    public String configFlowInfo;

    @NameInMap("ConfigKey")
    public String configKey;

    public static ConfirmLinkefabricFabricTechstackconfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmLinkefabricFabricTechstackconfigsRequest self = new ConfirmLinkefabricFabricTechstackconfigsRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmLinkefabricFabricTechstackconfigsRequest setConfigFlowInfo(String configFlowInfo) {
        this.configFlowInfo = configFlowInfo;
        return this;
    }
    public String getConfigFlowInfo() {
        return this.configFlowInfo;
    }

    public ConfirmLinkefabricFabricTechstackconfigsRequest setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }
    public String getConfigKey() {
        return this.configKey;
    }

}
