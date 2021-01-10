// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasAdminConfigRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static DeleteHasAdminConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasAdminConfigRequest self = new DeleteHasAdminConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHasAdminConfigRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
