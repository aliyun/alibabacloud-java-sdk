// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class InventorySchedule extends TeaModel {
    @NameInMap("Frequency")
    public String frequency;

    public static InventorySchedule build(java.util.Map<String, ?> map) throws Exception {
        InventorySchedule self = new InventorySchedule();
        return TeaModel.build(map, self);
    }

    public InventorySchedule setFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }
    public String getFrequency() {
        return this.frequency;
    }

}
