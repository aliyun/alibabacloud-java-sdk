// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLProgressStages extends TeaModel {
    /**
     * <p>The index of the current stage.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("CurrentIndex")
    public Integer currentIndex;

    /**
     * <p>The disagg, colocate, or empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>colocate</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The list of stages in pipeline order.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Key&quot;:&quot;generation&quot;,&quot;Label&quot;:&quot;Generation&quot;,&quot;Marker&quot;:&quot;start/end generation&quot;,&quot;Optional&quot;:false,&quot;Status&quot;:&quot;done&quot;,&quot;StartTime&quot;:1787474487,&quot;EndTime&quot;:1787474487,&quot;Duration&quot;:0.483}]</p>
     */
    @NameInMap("Stages")
    public java.util.List<RLProgressStage> stages;

    /**
     * <p>Indicates whether the stage pipeline for this step is completed.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("StepDone")
    public Boolean stepDone;

    public static RLProgressStages build(java.util.Map<String, ?> map) throws Exception {
        RLProgressStages self = new RLProgressStages();
        return TeaModel.build(map, self);
    }

    public RLProgressStages setCurrentIndex(Integer currentIndex) {
        this.currentIndex = currentIndex;
        return this;
    }
    public Integer getCurrentIndex() {
        return this.currentIndex;
    }

    public RLProgressStages setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public RLProgressStages setStages(java.util.List<RLProgressStage> stages) {
        this.stages = stages;
        return this;
    }
    public java.util.List<RLProgressStage> getStages() {
        return this.stages;
    }

    public RLProgressStages setStepDone(Boolean stepDone) {
        this.stepDone = stepDone;
        return this;
    }
    public Boolean getStepDone() {
        return this.stepDone;
    }

}
