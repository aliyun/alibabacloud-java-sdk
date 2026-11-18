// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInspectionTasksRequest extends TeaModel {
    /**
     * <p>The ID of the assistant instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ta-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The summary of risk levels for inspection results. You can specify multiple values. Valid values:</p>
     * <ul>
     * <li>Normal: Normal.</li>
     * <li>Warning: Warning.</li>
     * <li>Error: High-risk.</li>
     * <li>Failed: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Error</p>
     */
    @NameInMap("LevelSummary")
    public String levelSummary;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public String pageNum;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li>1: Manual task.</li>
     * <li>2: Scheduled task.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeInspectionTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInspectionTasksRequest self = new DescribeInspectionTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInspectionTasksRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInspectionTasksRequest setLevelSummary(String levelSummary) {
        this.levelSummary = levelSummary;
        return this;
    }
    public String getLevelSummary() {
        return this.levelSummary;
    }

    public DescribeInspectionTasksRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public DescribeInspectionTasksRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeInspectionTasksRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeInspectionTasksRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
