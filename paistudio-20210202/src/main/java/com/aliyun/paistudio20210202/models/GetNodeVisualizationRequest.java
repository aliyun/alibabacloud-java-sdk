// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetNodeVisualizationRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    public static GetNodeVisualizationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNodeVisualizationRequest self = new GetNodeVisualizationRequest();
        return TeaModel.build(map, self);
    }

    public GetNodeVisualizationRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

}
