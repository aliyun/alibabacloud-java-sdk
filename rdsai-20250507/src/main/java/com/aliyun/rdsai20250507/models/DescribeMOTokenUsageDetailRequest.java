// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeMOTokenUsageDetailRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>16<strong><strong><strong>4_rds_copilot</strong></strong>_public_cn-4</strong>**02</p>
     */
    @NameInMap("ConsumerName")
    public String consumerName;

    /**
     * <strong>example:</strong>
     * <p>2025-12-13T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rds_copilot***_public_cn-*********6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>qwen-flash</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <strong>example:</strong>
     * <p>2026-01-04T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeMOTokenUsageDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMOTokenUsageDetailRequest self = new DescribeMOTokenUsageDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMOTokenUsageDetailRequest setConsumerName(String consumerName) {
        this.consumerName = consumerName;
        return this;
    }
    public String getConsumerName() {
        return this.consumerName;
    }

    public DescribeMOTokenUsageDetailRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeMOTokenUsageDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeMOTokenUsageDetailRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public DescribeMOTokenUsageDetailRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public DescribeMOTokenUsageDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMOTokenUsageDetailRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeMOTokenUsageDetailRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
