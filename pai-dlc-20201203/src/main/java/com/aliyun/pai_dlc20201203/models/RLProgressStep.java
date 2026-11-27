// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLProgressStep extends TeaModel {
    /**
     * <p>The current step.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Current")
    public Integer current;

    /**
     * <p>The estimated time remaining, in seconds. This value is not provided when it cannot be estimated. A value of 0 may be returned when the training is confirmed to be complete, even if PaceSec is not provided.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EtaSec")
    public Long etaSec;

    /**
     * <p>The average time per step over the recent step progress, in seconds. This value is not provided when there is insufficient information.</p>
     * 
     * <strong>example:</strong>
     * <p>14</p>
     */
    @NameInMap("PaceSec")
    public Double paceSec;

    /**
     * <p>The training progress percentage. A value of 100% may be returned for confirmed completed progress, where Current may be less than Total. Do not determine whether the training is complete based solely on the current step number.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Pct")
    public Double pct;

    /**
     * <p>The timestamp of the latest step (in UNIX seconds).</p>
     * 
     * <strong>example:</strong>
     * <p>1787474487</p>
     */
    @NameInMap("Time")
    public Long time;

    /**
     * <p>The total number of steps (retrieved from the configuration dump).</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static RLProgressStep build(java.util.Map<String, ?> map) throws Exception {
        RLProgressStep self = new RLProgressStep();
        return TeaModel.build(map, self);
    }

    public RLProgressStep setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public RLProgressStep setEtaSec(Long etaSec) {
        this.etaSec = etaSec;
        return this;
    }
    public Long getEtaSec() {
        return this.etaSec;
    }

    public RLProgressStep setPaceSec(Double paceSec) {
        this.paceSec = paceSec;
        return this;
    }
    public Double getPaceSec() {
        return this.paceSec;
    }

    public RLProgressStep setPct(Double pct) {
        this.pct = pct;
        return this;
    }
    public Double getPct() {
        return this.pct;
    }

    public RLProgressStep setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

    public RLProgressStep setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
