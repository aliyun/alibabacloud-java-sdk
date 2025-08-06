// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetSdkListRequest extends TeaModel {
    @NameInMap("Group")
    public Integer group;

    @NameInMap("Product")
    public String product;

    public static GetSdkListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSdkListRequest self = new GetSdkListRequest();
        return TeaModel.build(map, self);
    }

    public GetSdkListRequest setGroup(Integer group) {
        this.group = group;
        return this;
    }
    public Integer getGroup() {
        return this.group;
    }

    public GetSdkListRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
