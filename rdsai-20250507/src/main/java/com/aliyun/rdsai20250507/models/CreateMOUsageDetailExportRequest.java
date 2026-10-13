// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateMOUsageDetailExportRequest extends TeaModel {
    /**
     * <p>The API key to use.</p>
     * 
     * <strong>example:</strong>
     * <p>sk-rds-*****</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <p>The inspection end time in the YYYY-MM-DDTHH:mm:ssZ format. The time range between StartTime and EndTime cannot exceed 30 days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-10T02:02:20Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The instance name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rds_copilot***_public_cn-*********6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The model to call.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-flash</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The inspection start time in the YYYY-MM-DDTHH:mm:ssZ format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-03-05T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The view type.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("UsageType")
    public String usageType;

    public static CreateMOUsageDetailExportRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMOUsageDetailExportRequest self = new CreateMOUsageDetailExportRequest();
        return TeaModel.build(map, self);
    }

    public CreateMOUsageDetailExportRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public CreateMOUsageDetailExportRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateMOUsageDetailExportRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateMOUsageDetailExportRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public CreateMOUsageDetailExportRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateMOUsageDetailExportRequest setUsageType(String usageType) {
        this.usageType = usageType;
        return this;
    }
    public String getUsageType() {
        return this.usageType;
    }

}
