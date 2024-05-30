// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyOpenLogShipperRequest extends TeaModel {
    /**
     * <p>The ID of the request source. Default value: **aegis**. Valid values:</p>
     * <br>
     * <p>*   **aegis**: Server Guard</p>
     * <p>*   **sas**: Security Center</p>
     * <br>
     * <p>>  If you use Server Guard, set the value to **aegis**. If you use Security Center, set the value to **sas**.</p>
     */
    @NameInMap("From")
    public String from;

    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    public static ModifyOpenLogShipperRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOpenLogShipperRequest self = new ModifyOpenLogShipperRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOpenLogShipperRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public ModifyOpenLogShipperRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

}
