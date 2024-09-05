// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunScriptPlanningRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>故事尽可能狗血</p>
     */
    @NameInMap("additionalNote")
    public String additionalNote;

    @NameInMap("dialogueInScene")
    public Boolean dialogueInScene;

    @NameInMap("plotConflict")
    public Boolean plotConflict;

    /**
     * <strong>example:</strong>
     * <p>都市战神</p>
     */
    @NameInMap("scriptName")
    public String scriptName;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("scriptShotCount")
    public Integer scriptShotCount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>在一个宁静的小镇上，每个家庭都在同一天收到一个神秘的、没有标记的包裹。</p>
     */
    @NameInMap("scriptSummary")
    public String scriptSummary;

    /**
     * <strong>example:</strong>
     * <p>现代，都市，爱情，玄幻</p>
     */
    @NameInMap("scriptTypeKeyword")
    public String scriptTypeKeyword;

    public static RunScriptPlanningRequest build(java.util.Map<String, ?> map) throws Exception {
        RunScriptPlanningRequest self = new RunScriptPlanningRequest();
        return TeaModel.build(map, self);
    }

    public RunScriptPlanningRequest setAdditionalNote(String additionalNote) {
        this.additionalNote = additionalNote;
        return this;
    }
    public String getAdditionalNote() {
        return this.additionalNote;
    }

    public RunScriptPlanningRequest setDialogueInScene(Boolean dialogueInScene) {
        this.dialogueInScene = dialogueInScene;
        return this;
    }
    public Boolean getDialogueInScene() {
        return this.dialogueInScene;
    }

    public RunScriptPlanningRequest setPlotConflict(Boolean plotConflict) {
        this.plotConflict = plotConflict;
        return this;
    }
    public Boolean getPlotConflict() {
        return this.plotConflict;
    }

    public RunScriptPlanningRequest setScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }
    public String getScriptName() {
        return this.scriptName;
    }

    public RunScriptPlanningRequest setScriptShotCount(Integer scriptShotCount) {
        this.scriptShotCount = scriptShotCount;
        return this;
    }
    public Integer getScriptShotCount() {
        return this.scriptShotCount;
    }

    public RunScriptPlanningRequest setScriptSummary(String scriptSummary) {
        this.scriptSummary = scriptSummary;
        return this;
    }
    public String getScriptSummary() {
        return this.scriptSummary;
    }

    public RunScriptPlanningRequest setScriptTypeKeyword(String scriptTypeKeyword) {
        this.scriptTypeKeyword = scriptTypeKeyword;
        return this;
    }
    public String getScriptTypeKeyword() {
        return this.scriptTypeKeyword;
    }

}
