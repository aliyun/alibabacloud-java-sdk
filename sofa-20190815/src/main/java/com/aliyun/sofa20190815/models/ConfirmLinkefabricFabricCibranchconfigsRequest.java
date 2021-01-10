// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ConfirmLinkefabricFabricCibranchconfigsRequest extends TeaModel {
    @NameInMap("ConfigFlowInfo")
    public String configFlowInfo;

    @NameInMap("ConfigKey")
    public String configKey;

    public static ConfirmLinkefabricFabricCibranchconfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmLinkefabricFabricCibranchconfigsRequest self = new ConfirmLinkefabricFabricCibranchconfigsRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmLinkefabricFabricCibranchconfigsRequest setConfigFlowInfo(String configFlowInfo) {
        this.configFlowInfo = configFlowInfo;
        return this;
    }
    public String getConfigFlowInfo() {
        return this.configFlowInfo;
    }

    public ConfirmLinkefabricFabricCibranchconfigsRequest setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }
    public String getConfigKey() {
        return this.configKey;
    }

}
