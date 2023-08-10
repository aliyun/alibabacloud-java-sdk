// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class DeleteResourceShareRequest extends TeaModel {
    /**
     * <p>The ID of the resource share.</p>
     */
    @NameInMap("ResourceShareId")
    public String resourceShareId;

    public static DeleteResourceShareRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceShareRequest self = new DeleteResourceShareRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResourceShareRequest setResourceShareId(String resourceShareId) {
        this.resourceShareId = resourceShareId;
        return this;
    }
    public String getResourceShareId() {
        return this.resourceShareId;
    }

}
