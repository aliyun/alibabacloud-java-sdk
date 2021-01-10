// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetBuildpackRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static GetBuildpackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBuildpackRequest self = new GetBuildpackRequest();
        return TeaModel.build(map, self);
    }

    public GetBuildpackRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
