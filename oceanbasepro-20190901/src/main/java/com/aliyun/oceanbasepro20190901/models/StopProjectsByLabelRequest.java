// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class StopProjectsByLabelRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>l_****</p>
     */
    @NameInMap("Id")
    public String id;

    public static StopProjectsByLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        StopProjectsByLabelRequest self = new StopProjectsByLabelRequest();
        return TeaModel.build(map, self);
    }

    public StopProjectsByLabelRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
