// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class StopProjectRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>np_4w3a****</p>
     */
    @NameInMap("Id")
    public String id;

    public static StopProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        StopProjectRequest self = new StopProjectRequest();
        return TeaModel.build(map, self);
    }

    public StopProjectRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
