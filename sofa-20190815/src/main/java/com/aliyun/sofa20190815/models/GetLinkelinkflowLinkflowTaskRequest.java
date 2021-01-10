// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowTaskRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static GetLinkelinkflowLinkflowTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowTaskRequest self = new GetLinkelinkflowLinkflowTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowTaskRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
