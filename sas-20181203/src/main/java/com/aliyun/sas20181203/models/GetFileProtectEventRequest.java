// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileProtectEventRequest extends TeaModel {
    /**
     * <p>The event ID.</p>
     * <p>This parameter is required. If this parameter is not specified, the API returns HTTP 400 with error code -101. You can call ListFileProtectEvent to obtain valid event IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
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
