// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAutoDelConfigRequest extends TeaModel {
    /**
     * <p>The number of days after which a detected vulnerability is automatically deleted. Unit: days. Valid values:</p>
     * <ul>
     * <li>7</li>
     * <li>30</li>
     * <li>90</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
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
