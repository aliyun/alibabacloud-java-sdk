// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ReleaseWorkerInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public String id;

    public static ReleaseWorkerInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseWorkerInstanceRequest self = new ReleaseWorkerInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseWorkerInstanceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
