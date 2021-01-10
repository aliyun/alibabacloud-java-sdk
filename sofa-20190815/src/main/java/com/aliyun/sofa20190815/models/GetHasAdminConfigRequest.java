// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasAdminConfigRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static GetHasAdminConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasAdminConfigRequest self = new GetHasAdminConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetHasAdminConfigRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
