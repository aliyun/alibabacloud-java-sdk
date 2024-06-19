// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTasksRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("AllowCancel")
    public Long allowCancel;

    /**
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("AllowChange")
    public Long allowChange;

    /**
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("ChangeLevel")
    public String changeLevel;

    /**
     * <strong>example:</strong>
     * <p>polarx</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <strong>example:</strong>
     * <p>pxc-xxxxx</p>
     */
    @NameInMap("InsName")
    public String insName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>polarx</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("Status")
    public Long status;

    /**
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
