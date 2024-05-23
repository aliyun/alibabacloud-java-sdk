// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class StartProjectsByLabelRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public String id;

    public static StartProjectsByLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        StartProjectsByLabelRequest self = new StartProjectsByLabelRequest();
        return TeaModel.build(map, self);
    }

    public StartProjectsByLabelRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
