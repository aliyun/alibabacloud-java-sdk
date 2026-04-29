// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateUnknownThreatDetectStrategyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DurationDaysAfterInit")
    public Integer durationDaysAfterInit;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DurationDaysAfterStop")
    public Integer durationDaysAfterStop;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>strategy****</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>hash</p>
     */
    @NameInMap("StudyMode")
    public String studyMode;

    public static UpdateUnknownThreatDetectStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUnknownThreatDetectStrategyRequest self = new UpdateUnknownThreatDetectStrategyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUnknownThreatDetectStrategyRequest setDurationDaysAfterInit(Integer durationDaysAfterInit) {
        this.durationDaysAfterInit = durationDaysAfterInit;
        return this;
    }
    public Integer getDurationDaysAfterInit() {
        return this.durationDaysAfterInit;
    }

    public UpdateUnknownThreatDetectStrategyRequest setDurationDaysAfterStop(Integer durationDaysAfterStop) {
        this.durationDaysAfterStop = durationDaysAfterStop;
        return this;
    }
    public Integer getDurationDaysAfterStop() {
        return this.durationDaysAfterStop;
    }

    public UpdateUnknownThreatDetectStrategyRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateUnknownThreatDetectStrategyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateUnknownThreatDetectStrategyRequest setStudyMode(String studyMode) {
        this.studyMode = studyMode;
        return this;
    }
    public String getStudyMode() {
        return this.studyMode;
    }

}
