// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyGroupPropertyRequest extends TeaModel {
    @NameInMap("Data")
    public String data;

    public static ModifyGroupPropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyGroupPropertyRequest self = new ModifyGroupPropertyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyGroupPropertyRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
