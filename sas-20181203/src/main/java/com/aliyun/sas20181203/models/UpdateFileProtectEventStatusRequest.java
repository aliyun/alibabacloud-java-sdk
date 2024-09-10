// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateFileProtectEventStatusRequest extends TeaModel {
    /**
     * <p>The IDs of the events.</p>
     */
    @NameInMap("Id")
    public java.util.List<Long> id;

    /**
     * <p>The handling status of the event. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: unhandled</li>
     * <li><strong>1</strong>: handled</li>
     * <li><strong>2</strong>: added to the whitelist</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static UpdateFileProtectEventStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileProtectEventStatusRequest self = new UpdateFileProtectEventStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFileProtectEventStatusRequest setId(java.util.List<Long> id) {
        this.id = id;
        return this;
    }
    public java.util.List<Long> getId() {
        return this.id;
    }

    public UpdateFileProtectEventStatusRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
