// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class UpdateResourceShareRequest extends TeaModel {
    @NameInMap("ResourceShareId")
    public String resourceShareId;

    @NameInMap("ResourceShareName")
    public String resourceShareName;

    public static UpdateResourceShareRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceShareRequest self = new UpdateResourceShareRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceShareRequest setResourceShareId(String resourceShareId) {
        this.resourceShareId = resourceShareId;
        return this;
    }
    public String getResourceShareId() {
        return this.resourceShareId;
    }

    public UpdateResourceShareRequest setResourceShareName(String resourceShareName) {
        this.resourceShareName = resourceShareName;
        return this;
    }
    public String getResourceShareName() {
        return this.resourceShareName;
    }

}
