// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileProtectClientEventRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>131231</p>
     */
    @NameInMap("Id")
    public Long id;

    public static GetFileProtectClientEventRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileProtectClientEventRequest self = new GetFileProtectClientEventRequest();
        return TeaModel.build(map, self);
    }

    public GetFileProtectClientEventRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
