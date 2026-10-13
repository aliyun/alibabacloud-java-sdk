// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListLLMTokenUsageRequest extends TeaModel {
    /**
     * <p>The end time of the inspection in UTC. Specify the time in the ISO 8601 standard. Format: YYYY-MM-DDTHH:mm:ssZ. The end time must be at least 2 hours later than the start time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-02-03T02:10:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The instance ID of the AI application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The model to query.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-flash</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time of the inspection in UTC. Specify the time in the ISO 8601 standard. Format: YYYY-MM-DDTHH:mm:ssZ.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-03-31T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ListLLMTokenUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLLMTokenUsageRequest self = new ListLLMTokenUsageRequest();
        return TeaModel.build(map, self);
    }

    public ListLLMTokenUsageRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListLLMTokenUsageRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ListLLMTokenUsageRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ListLLMTokenUsageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListLLMTokenUsageRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
