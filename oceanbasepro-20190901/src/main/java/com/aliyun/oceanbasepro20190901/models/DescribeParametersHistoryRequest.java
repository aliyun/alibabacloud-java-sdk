// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeParametersHistoryRequest extends TeaModel {
    /**
     * <p>The type of the parameter.<br>Valid values: CLUSTER and TENANT.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TENANT</p>
     */
    @NameInMap("Dimension")
    public String dimension;

    /**
     * <p>The resource ID of the parameter type.<br>You can leave this parameter unspecified when you call this operation to query the modification history of cluster parameters. In the case of tenant parameters, pass the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ob2mr3oae0****</p>
     */
    @NameInMap("DimensionValue")
    public String dimensionValue;

    /**
     * <p>The end time for the query of parameter modification history.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-13 15:40:43</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the OceanBase cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ob317v4uif****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of the page to return.    </p>
     * <ul>
     * <li>Start value: 1   </li>
     * <li>Default value: 1</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of rows to return on each page.   </p>
     * <ul>
     * <li>Maximum value: 100   </li>
     * <li>Default value: 10</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start time of the time range for querying the parameter modification history.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-13 15:40:43</p>
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
