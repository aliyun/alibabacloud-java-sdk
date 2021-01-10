// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ConfirmLinkefabricFabricDockerruleconfigsRequest extends TeaModel {
    @NameInMap("ConfigFlowInfo")
    public String configFlowInfo;

    @NameInMap("ConfigKey")
    public String configKey;

    public static ConfirmLinkefabricFabricDockerruleconfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmLinkefabricFabricDockerruleconfigsRequest self = new ConfirmLinkefabricFabricDockerruleconfigsRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmLinkefabricFabricDockerruleconfigsRequest setConfigFlowInfo(String configFlowInfo) {
        this.configFlowInfo = configFlowInfo;
        return this;
    }
    public String getConfigFlowInfo() {
        return this.configFlowInfo;
    }

    public ConfirmLinkefabricFabricDockerruleconfigsRequest setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }
    public String getConfigKey() {
        return this.configKey;
    }

}
