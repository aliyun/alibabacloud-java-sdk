// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifyQueryProcessorRequest extends TeaModel {
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static ModifyQueryProcessorRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyQueryProcessorRequest self = new ModifyQueryProcessorRequest();
        return TeaModel.build(map, self);
    }

    public ModifyQueryProcessorRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
