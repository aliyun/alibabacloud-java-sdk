// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyOpenLogShipperRequest extends TeaModel {
    // The ID of the request source. The default value is **aegis**. Valid values:
    // - **aegis**: Server Guard
    // - **sas**: Security Center
    // 
    // > If you use Server Guard, set the value to **aegis**. If you use Security Center, set the value to **sas**.
    @NameInMap("From")
    public String from;

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

}
