// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateConfigRequest extends TeaModel {
    // updateConfigParam
    @NameInMap("updateConfigParam")
    public UpdateConfigParam updateConfigParam;

    public static UpdateConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigRequest self = new UpdateConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConfigRequest setUpdateConfigParam(UpdateConfigParam updateConfigParam) {
        this.updateConfigParam = updateConfigParam;
        return this;
    }
    public UpdateConfigParam getUpdateConfigParam() {
        return this.updateConfigParam;
    }

}
