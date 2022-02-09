// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteOmsEndpointsRequest extends TeaModel {
    @NameInMap("Ids")
    public String ids;

    public static DeleteOmsEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOmsEndpointsRequest self = new DeleteOmsEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOmsEndpointsRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

}
