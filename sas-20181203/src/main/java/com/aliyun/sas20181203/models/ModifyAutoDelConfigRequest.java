// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAutoDelConfigRequest extends TeaModel {
    /**
     * <p>The number of days after which a detected vulnerability is automatically deleted. Unit: days. Valid values:</p>
     * <br>
     * <p>*   7</p>
     * <p>*   30</p>
     * <p>*   90</p>
     */
    @NameInMap("Days")
    public Integer days;

    public static ModifyAutoDelConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoDelConfigRequest self = new ModifyAutoDelConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAutoDelConfigRequest setDays(Integer days) {
        this.days = days;
        return this;
    }
    public Integer getDays() {
        return this.days;
    }

}
