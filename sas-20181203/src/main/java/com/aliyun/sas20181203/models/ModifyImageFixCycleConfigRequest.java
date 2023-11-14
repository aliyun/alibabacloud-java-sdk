// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyImageFixCycleConfigRequest extends TeaModel {
    /**
     * <p>The cycle of the scheduled fix. Unit: day.</p>
     */
    @NameInMap("ImageFixCycle")
    public Integer imageFixCycle;

    /**
     * <p>Specifies whether to enable the schedule image fix.</p>
     * <br>
     * <p>*   **on**: enable</p>
     * <p>*   **off**: disable</p>
     */
    @NameInMap("ImageFixSwitch")
    public String imageFixSwitch;

    /**
     * <p>The range of the scheduled fix. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <br>
     * <p>*   **type**: The type of the image. The value is fixed to repo.</p>
     * <p>*   **target**: The content of the image. The value is in the format of Namespace/Image repository.</p>
     */
    @NameInMap("ImageFixTarget")
    public String imageFixTarget;

    /**
     * <p>The time range during which the image was modified. Unit: day.</p>
     */
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
