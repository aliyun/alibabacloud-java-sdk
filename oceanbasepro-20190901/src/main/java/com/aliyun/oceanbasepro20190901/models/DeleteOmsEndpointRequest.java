// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteOmsEndpointRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static DeleteOmsEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOmsEndpointRequest self = new DeleteOmsEndpointRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOmsEndpointRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
