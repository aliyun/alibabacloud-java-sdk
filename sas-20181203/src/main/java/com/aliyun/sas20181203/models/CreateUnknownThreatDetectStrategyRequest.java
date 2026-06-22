// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateUnknownThreatDetectStrategyRequest extends TeaModel {
    /**
     * <p>The asset selection type.</p>
     * 
     * <strong>example:</strong>
     * <p>UNKNOWN_THREAT_DETECT_CONFIG_****</p>
     */
    @NameInMap("AssetSelectionType")
    public String assetSelectionType;

    /**
     * <p>The duration of the initial learning period, in days.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DurationDaysAfterInit")
    public Integer durationDaysAfterInit;

    /**
     * <p>The number of consecutive days without detecting new processes before the learning process stops.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DurationDaysAfterStop")
    public Integer durationDaysAfterStop;

    /**
     * <p>The strategy name.</p>
     * 
     * <strong>example:</strong>
     * <p>strategy****</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The whitelist mode. Valid values:</p>
     * <ul>
     * <li><p><strong>hash</strong>: The process hash.</p>
     * </li>
     * <li><p><strong>path</strong>: The process path.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hash</p>
     */
    @NameInMap("StudyMode")
    public String studyMode;

    public static CreateUnknownThreatDetectStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUnknownThreatDetectStrategyRequest self = new CreateUnknownThreatDetectStrategyRequest();
        return TeaModel.build(map, self);
    }

    public CreateUnknownThreatDetectStrategyRequest setAssetSelectionType(String assetSelectionType) {
        this.assetSelectionType = assetSelectionType;
        return this;
    }
    public String getAssetSelectionType() {
        return this.assetSelectionType;
    }

    public CreateUnknownThreatDetectStrategyRequest setDurationDaysAfterInit(Integer durationDaysAfterInit) {
        this.durationDaysAfterInit = durationDaysAfterInit;
        return this;
    }
    public Integer getDurationDaysAfterInit() {
        return this.durationDaysAfterInit;
    }

    public CreateUnknownThreatDetectStrategyRequest setDurationDaysAfterStop(Integer durationDaysAfterStop) {
        this.durationDaysAfterStop = durationDaysAfterStop;
        return this;
    }
    public Integer getDurationDaysAfterStop() {
        return this.durationDaysAfterStop;
    }

    public CreateUnknownThreatDetectStrategyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateUnknownThreatDetectStrategyRequest setStudyMode(String studyMode) {
        this.studyMode = studyMode;
        return this;
    }
    public String getStudyMode() {
        return this.studyMode;
    }

}
