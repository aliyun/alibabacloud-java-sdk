// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeParametersHistoryRequest extends TeaModel {
    /**
     * <p>The value of the parameter after the modification.</p>
     */
    @NameInMap("Dimension")
    public String dimension;

    /**
     * <p>The list of parameter modification records.</p>
     */
    @NameInMap("DimensionValue")
    public String dimensionValue;

    /**
     * <p>Alibaba Cloud provides SDKs in different languages to help you quickly integrate Alibaba Cloud products and services by using APIs. We recommend that you use an SDK to call APIs. In this way, you do not need to sign for verification.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The name of the parameter.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>It is an Alibaba Cloud asset management and configuration tool, with which you can manage multiple Alibaba Cloud products and services by using commands. It is easy to use and a good helper in migration to cloud.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>You can call this operation to query the modification history of cluster or tenant parameters.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeParametersHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeParametersHistoryRequest self = new DescribeParametersHistoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeParametersHistoryRequest setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }
    public String getDimension() {
        return this.dimension;
    }

    public DescribeParametersHistoryRequest setDimensionValue(String dimensionValue) {
        this.dimensionValue = dimensionValue;
        return this;
    }
    public String getDimensionValue() {
        return this.dimensionValue;
    }

    public DescribeParametersHistoryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeParametersHistoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeParametersHistoryRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeParametersHistoryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeParametersHistoryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
