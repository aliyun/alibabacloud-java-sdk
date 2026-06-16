// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTasksRequest extends TeaModel {
    /**
     * <p>Specifies whether cancellation is allowed. Valid values:</p>
     * <ul>
     * <li><strong>-1</strong>: All O&amp;M events can be canceled.</li>
     * <li><strong>0</strong>: Not allowed. </li>
     * <li><strong>1</strong>: Allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("AllowCancel")
    public Long allowCancel;

    /**
     * <p>Specifies whether the time can be modified. Valid values:</p>
     * <ul>
     * <li><strong>-1</strong>: The time of all O&amp;M events can be modified.</li>
     * <li><strong>0</strong>: Not allowed. </li>
     * <li><strong>1</strong>: Allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("AllowChange")
    public Long allowChange;

    /**
     * <p>The change level. Default value: all. Valid values:</p>
     * <ul>
     * <li><strong>all</strong>: All levels of exception recovery and system O&amp;M.</li>
     * <li><strong>S0</strong>: Exception recovery.</li>
     * <li><strong>S1</strong>: System O&amp;M.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("ChangeLevel")
    public String changeLevel;

    /**
     * <p>The database type. Set this parameter to polarx.</p>
     * 
     * <strong>example:</strong>
     * <p>polarx</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The instance name. Default value: empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-xxxxx</p>
     */
    @NameInMap("InsName")
    public String insName;

    /**
     * <p>The page number. The value must be greater than 0. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Default value: 25.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The product name. Default value: polarx.</p>
     * 
     * <strong>example:</strong>
     * <p>polarx</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li><strong>-1</strong>: All pending and running tasks.  </li>
     * <li><strong>3</strong>: Pending. </li>
     * <li><strong>4</strong>: Running.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("Status")
    public Long status;

    /**
     * <p>The task type. A value of all indicates that all tasks of the user are queried. Set this parameter to all.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static DescribeActiveOperationTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationTasksRequest self = new DescribeActiveOperationTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationTasksRequest setAllowCancel(Long allowCancel) {
        this.allowCancel = allowCancel;
        return this;
    }
    public Long getAllowCancel() {
        return this.allowCancel;
    }

    public DescribeActiveOperationTasksRequest setAllowChange(Long allowChange) {
        this.allowChange = allowChange;
        return this;
    }
    public Long getAllowChange() {
        return this.allowChange;
    }

    public DescribeActiveOperationTasksRequest setChangeLevel(String changeLevel) {
        this.changeLevel = changeLevel;
        return this;
    }
    public String getChangeLevel() {
        return this.changeLevel;
    }

    public DescribeActiveOperationTasksRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public DescribeActiveOperationTasksRequest setInsName(String insName) {
        this.insName = insName;
        return this;
    }
    public String getInsName() {
        return this.insName;
    }

    public DescribeActiveOperationTasksRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeActiveOperationTasksRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeActiveOperationTasksRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public DescribeActiveOperationTasksRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeActiveOperationTasksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeActiveOperationTasksRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public DescribeActiveOperationTasksRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
