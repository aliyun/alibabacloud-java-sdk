// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateJobConfigParam extends TeaModel {
    @NameInMap("newFlinkConf")
    public java.util.Map<String, ?> newFlinkConf;

    public static UpdateJobConfigParam build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobConfigParam self = new UpdateJobConfigParam();
        return TeaModel.build(map, self);
    }

    public UpdateJobConfigParam setNewFlinkConf(java.util.Map<String, ?> newFlinkConf) {
        this.newFlinkConf = newFlinkConf;
        return this;
    }
    public java.util.Map<String, ?> getNewFlinkConf() {
        return this.newFlinkConf;
    }

}
