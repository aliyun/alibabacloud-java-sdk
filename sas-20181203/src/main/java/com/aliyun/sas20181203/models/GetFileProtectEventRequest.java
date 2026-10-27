// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileProtectEventRequest extends TeaModel {
    /**
     * <p>The event ID.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListFileProtectEvent~~">ListFileProtectEvent</a> operation to retrieve this parameter.
     * This parameter is required. If it is not provided, the API returns HTTP 400 with error code -101.</p>
     * </blockquote>
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
