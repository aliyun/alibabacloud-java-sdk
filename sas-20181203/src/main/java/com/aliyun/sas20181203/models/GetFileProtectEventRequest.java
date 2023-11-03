// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileProtectEventRequest extends TeaModel {
    /**
     * <p>The ID of the event.</p>
     */
    @NameInMap("Id")
    public Long id;

    public static GetFileProtectEventRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileProtectEventRequest self = new GetFileProtectEventRequest();
        return TeaModel.build(map, self);
    }

    public GetFileProtectEventRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
