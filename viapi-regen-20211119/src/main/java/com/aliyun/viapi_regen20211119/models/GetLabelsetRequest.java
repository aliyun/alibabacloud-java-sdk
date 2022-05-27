// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetLabelsetRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static GetLabelsetRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLabelsetRequest self = new GetLabelsetRequest();
        return TeaModel.build(map, self);
    }

    public GetLabelsetRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
