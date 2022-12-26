// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteInterceptionTargetRequest extends TeaModel {
    @NameInMap("TargetIds")
    public String targetIds;

    public static DeleteInterceptionTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInterceptionTargetRequest self = new DeleteInterceptionTargetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInterceptionTargetRequest setTargetIds(String targetIds) {
        this.targetIds = targetIds;
        return this;
    }
    public String getTargetIds() {
        return this.targetIds;
    }

}
