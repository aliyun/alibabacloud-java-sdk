// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowProcessmodelRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static GetLinkelinkflowLinkflowProcessmodelRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowProcessmodelRequest self = new GetLinkelinkflowLinkflowProcessmodelRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowProcessmodelRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
