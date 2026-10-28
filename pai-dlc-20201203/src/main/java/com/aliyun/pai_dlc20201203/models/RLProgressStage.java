// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLProgressStage extends TeaModel {
    /**
     * <p>The duration of the stage in seconds, with three decimal places. A step often falls entirely within the same second, so the value is not rounded to an integer.</p>
     * 
     * <strong>example:</strong>
     * <p>0.483</p>
     */
    @NameInMap("Duration")
    public Double duration;

    /**
     * <p>The end time of the stage in UNIX seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1787474487</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The stage identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>traj</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The Chinese name of the stage.</p>
     * 
     * <strong>example:</strong>
     * <p>Generate trace</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>The log marker text used to match the stage.</p>
     * 
     * <strong>example:</strong>
     * <p>start/end generation</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>Specifies whether the stage is optional. If an optional stage does not occur, its status is recorded as skipped.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Optional")
    public Boolean optional;

    /**
     * <p>The start time of the stage in UNIX seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1787474487</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>done / running / waiting / pending / skipped</p>
     * 
     * <strong>example:</strong>
     * <p>done</p>
     */
    @NameInMap("Status")
    public String status;

    public static RLProgressStage build(java.util.Map<String, ?> map) throws Exception {
        RLProgressStage self = new RLProgressStage();
        return TeaModel.build(map, self);
    }

    public RLProgressStage setDuration(Double duration) {
        this.duration = duration;
        return this;
    }
    public Double getDuration() {
        return this.duration;
    }

    public RLProgressStage setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public RLProgressStage setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public RLProgressStage setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public RLProgressStage setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public RLProgressStage setOptional(Boolean optional) {
        this.optional = optional;
        return this;
    }
    public Boolean getOptional() {
        return this.optional;
    }

    public RLProgressStage setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public RLProgressStage setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
