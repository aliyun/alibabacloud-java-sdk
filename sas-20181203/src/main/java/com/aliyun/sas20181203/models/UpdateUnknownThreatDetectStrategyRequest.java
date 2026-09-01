// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateUnknownThreatDetectStrategyRequest extends TeaModel {
    /**
     * <p>The number of days after the model is initially created before learning stops.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DurationDaysAfterInit")
    public Integer durationDaysAfterInit;

    /**
     * <p>The number of days after which the model ends if no new processes are added.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DurationDaysAfterStop")
    public Integer durationDaysAfterStop;

    /**
     * <p>The ID of the policy to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>strategy****</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The whitelist mode. Valid values:</p>
     * <ul>
     * <li><strong>hash</strong>: process hash</li>
     * <li><strong>path</strong>: process path</li>
     * </ul>
     * 
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
