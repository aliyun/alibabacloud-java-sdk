// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeGreyTagRouteRequest extends TeaModel {
    /**
     * <p>The ID of the canary release rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GreyTagRouteId")
    public Long greyTagRouteId;

    public static DescribeGreyTagRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGreyTagRouteRequest self = new DescribeGreyTagRouteRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGreyTagRouteRequest setGreyTagRouteId(Long greyTagRouteId) {
        this.greyTagRouteId = greyTagRouteId;
        return this;
    }
    public Long getGreyTagRouteId() {
        return this.greyTagRouteId;
    }

}
