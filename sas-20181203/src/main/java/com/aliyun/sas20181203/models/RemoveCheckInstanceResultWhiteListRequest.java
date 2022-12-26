// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RemoveCheckInstanceResultWhiteListRequest extends TeaModel {
    @NameInMap("CheckId")
    public Long checkId;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    public static RemoveCheckInstanceResultWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveCheckInstanceResultWhiteListRequest self = new RemoveCheckInstanceResultWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public RemoveCheckInstanceResultWhiteListRequest setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public RemoveCheckInstanceResultWhiteListRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

}
