// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowProcessRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static GetLinkelinkflowLinkflowProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowProcessRequest self = new GetLinkelinkflowLinkflowProcessRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowProcessRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
