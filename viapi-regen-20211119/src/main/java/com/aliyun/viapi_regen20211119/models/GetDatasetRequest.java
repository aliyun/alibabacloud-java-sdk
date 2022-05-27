// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetDatasetRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static GetDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetRequest self = new GetDatasetRequest();
        return TeaModel.build(map, self);
    }

    public GetDatasetRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
