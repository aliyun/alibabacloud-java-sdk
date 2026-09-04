// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLProgressEval extends TeaModel {
    /**
     * <p>Indicates whether Total is greater than 0 and Finished is not less than Total.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Done")
    public Boolean done;

    /**
     * <p>The number of finished samples.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("Finished")
    public Integer finished;

    /**
     * <p>The progress percentage, which is the ratio of Progress to Total.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Pct")
    public Double pct;

    /**
     * <p>The progress count, which is the greater value of Ready and Finished.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("Progress")
    public Integer progress;

    /**
     * <p>The number of ready samples.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("Ready")
    public Integer ready;

    /**
     * <p>The target number of samples.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static RLProgressEval build(java.util.Map<String, ?> map) throws Exception {
        RLProgressEval self = new RLProgressEval();
        return TeaModel.build(map, self);
    }

    public RLProgressEval setDone(Boolean done) {
        this.done = done;
        return this;
    }
    public Boolean getDone() {
        return this.done;
    }

    public RLProgressEval setFinished(Integer finished) {
        this.finished = finished;
        return this;
    }
    public Integer getFinished() {
        return this.finished;
    }

    public RLProgressEval setPct(Double pct) {
        this.pct = pct;
        return this;
    }
    public Double getPct() {
        return this.pct;
    }

    public RLProgressEval setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }
    public Integer getProgress() {
        return this.progress;
    }

    public RLProgressEval setReady(Integer ready) {
        this.ready = ready;
        return this;
    }
    public Integer getReady() {
        return this.ready;
    }

    public RLProgressEval setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
