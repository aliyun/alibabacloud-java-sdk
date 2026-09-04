// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLProgressStage extends TeaModel {
    /**
     * <p>阶段耗时（秒，保留 3 位小数）；一个 step 常整体落在同一秒内，故不取整</p>
     * 
     * <strong>example:</strong>
     * <p>0.483</p>
     */
    @NameInMap("Duration")
    public Double duration;

    /**
     * <p>阶段结束时间（unix 秒）</p>
     * 
     * <strong>example:</strong>
     * <p>1787474487</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>阶段标识</p>
     * 
     * <strong>example:</strong>
     * <p>traj</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>阶段中文名</p>
     * 
     * <strong>example:</strong>
     * <p>生成轨迹</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>匹配该阶段的日志标记文案</p>
     * 
     * <strong>example:</strong>
     * <p>start/end generation</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>是否为可选阶段；可选阶段未出现时状态记为 skipped</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Optional")
    public Boolean optional;

    /**
     * <p>阶段开始时间（unix 秒）</p>
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
