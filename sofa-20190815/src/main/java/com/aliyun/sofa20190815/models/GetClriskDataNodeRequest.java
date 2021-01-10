// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskDataNodeRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static GetClriskDataNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClriskDataNodeRequest self = new GetClriskDataNodeRequest();
        return TeaModel.build(map, self);
    }

    public GetClriskDataNodeRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
