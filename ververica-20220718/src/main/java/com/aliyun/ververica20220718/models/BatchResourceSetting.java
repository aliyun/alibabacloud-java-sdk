// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class BatchResourceSetting extends TeaModel {
    @NameInMap("basicResourceSetting")
    public BasicResourceSetting basicResourceSetting;

    @NameInMap("maxSlot")
    public Long maxSlot;

    public static BatchResourceSetting build(java.util.Map<String, ?> map) throws Exception {
        BatchResourceSetting self = new BatchResourceSetting();
        return TeaModel.build(map, self);
    }

    public BatchResourceSetting setBasicResourceSetting(BasicResourceSetting basicResourceSetting) {
        this.basicResourceSetting = basicResourceSetting;
        return this;
    }
    public BasicResourceSetting getBasicResourceSetting() {
        return this.basicResourceSetting;
    }

    public BatchResourceSetting setMaxSlot(Long maxSlot) {
        this.maxSlot = maxSlot;
        return this;
    }
    public Long getMaxSlot() {
        return this.maxSlot;
    }

}
