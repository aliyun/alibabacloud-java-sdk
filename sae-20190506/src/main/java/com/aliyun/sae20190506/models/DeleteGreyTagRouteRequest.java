// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteGreyTagRouteRequest extends TeaModel {
    /**
     * <p>1</p>
     */
    @NameInMap("GreyTagRouteId")
    public Long greyTagRouteId;

    public static DeleteGreyTagRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGreyTagRouteRequest self = new DeleteGreyTagRouteRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGreyTagRouteRequest setGreyTagRouteId(Long greyTagRouteId) {
        this.greyTagRouteId = greyTagRouteId;
        return this;
    }
    public Long getGreyTagRouteId() {
        return this.greyTagRouteId;
    }

}
