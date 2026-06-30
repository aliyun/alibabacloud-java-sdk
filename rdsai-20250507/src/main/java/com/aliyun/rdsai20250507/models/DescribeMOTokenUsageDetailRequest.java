// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeMOTokenUsageDetailRequest extends TeaModel {
    /**
     * <p>The API key used for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>sk-rds-*****</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <p>The consumer associated with the API key.</p>
     * 
     * <strong>example:</strong>
     * <p>16<strong><strong><strong>4_rds_copilot</strong></strong>_public_cn-4</strong>**02</p>
     */
    @NameInMap("ConsumerName")
    public String consumerName;

    /**
     * <p>The cursor-based pagination token. This parameter takes priority over Page. Leave this parameter empty for the first call. For subsequent calls, use the NextCursor value returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJpZCI6MTIzNDUsInRzIjoiMjAyNi0wNC0wOFQwMDowMDowMFoifQ==</p>
     */
    @NameInMap("Cursor")
    public String cursor;

    /**
     * <p>The end time in ISO 8601 format (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2025-12-13T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rds_copilot***_public_cn-*********6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The model that was called.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-flash</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The page number. Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The number of records per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region in which the instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The start time in ISO 8601 format (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-04T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The type of usage to query.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("UsageType")
    public String usageType;

    public static DescribeMOTokenUsageDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMOTokenUsageDetailRequest self = new DescribeMOTokenUsageDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMOTokenUsageDetailRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public DescribeMOTokenUsageDetailRequest setConsumerName(String consumerName) {
        this.consumerName = consumerName;
        return this;
    }
    public String getConsumerName() {
        return this.consumerName;
    }

    public DescribeMOTokenUsageDetailRequest setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
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

    public DescribeMOTokenUsageDetailRequest setUsageType(String usageType) {
        this.usageType = usageType;
        return this;
    }
    public String getUsageType() {
        return this.usageType;
    }

}
