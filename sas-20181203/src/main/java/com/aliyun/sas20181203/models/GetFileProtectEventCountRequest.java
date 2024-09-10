// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileProtectEventCountRequest extends TeaModel {
    /**
     * <p>The status of the event. Valid values:</p>
     * <ul>
     * <li>0: unhandled</li>
     * <li>1: handled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static GetFileProtectEventCountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileProtectEventCountRequest self = new GetFileProtectEventCountRequest();
        return TeaModel.build(map, self);
    }

    public GetFileProtectEventCountRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
