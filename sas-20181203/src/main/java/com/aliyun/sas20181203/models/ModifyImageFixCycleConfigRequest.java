// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyImageFixCycleConfigRequest extends TeaModel {
    @NameInMap("ImageFixCycle")
    public Integer imageFixCycle;

    @NameInMap("ImageFixSwitch")
    public String imageFixSwitch;

    @NameInMap("ImageFixTarget")
    public String imageFixTarget;

    @NameInMap("ImageTimeRange")
    public Integer imageTimeRange;

    public static ModifyImageFixCycleConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageFixCycleConfigRequest self = new ModifyImageFixCycleConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyImageFixCycleConfigRequest setImageFixCycle(Integer imageFixCycle) {
        this.imageFixCycle = imageFixCycle;
        return this;
    }
    public Integer getImageFixCycle() {
        return this.imageFixCycle;
    }

    public ModifyImageFixCycleConfigRequest setImageFixSwitch(String imageFixSwitch) {
        this.imageFixSwitch = imageFixSwitch;
        return this;
    }
    public String getImageFixSwitch() {
        return this.imageFixSwitch;
    }

    public ModifyImageFixCycleConfigRequest setImageFixTarget(String imageFixTarget) {
        this.imageFixTarget = imageFixTarget;
        return this;
    }
    public String getImageFixTarget() {
        return this.imageFixTarget;
    }

    public ModifyImageFixCycleConfigRequest setImageTimeRange(Integer imageTimeRange) {
        this.imageTimeRange = imageTimeRange;
        return this;
    }
    public Integer getImageTimeRange() {
        return this.imageTimeRange;
    }

}
