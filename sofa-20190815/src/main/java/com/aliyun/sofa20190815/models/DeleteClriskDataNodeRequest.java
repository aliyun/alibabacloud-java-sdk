// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteClriskDataNodeRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static DeleteClriskDataNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClriskDataNodeRequest self = new DeleteClriskDataNodeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClriskDataNodeRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
