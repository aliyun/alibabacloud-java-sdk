// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasAdminSshRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static DeleteHasAdminSshRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasAdminSshRequest self = new DeleteHasAdminSshRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHasAdminSshRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
