// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasInspectParamRequest extends TeaModel {
    @NameInMap("ConfigKey")
    public String configKey;

    public static DeleteHasInspectParamRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasInspectParamRequest self = new DeleteHasInspectParamRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHasInspectParamRequest setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }
    public String getConfigKey() {
        return this.configKey;
    }

}
