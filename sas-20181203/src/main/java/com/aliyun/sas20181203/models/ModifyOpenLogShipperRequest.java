// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyOpenLogShipperRequest extends TeaModel {
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
