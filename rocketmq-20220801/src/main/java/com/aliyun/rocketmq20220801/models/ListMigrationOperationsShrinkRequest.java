// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListMigrationOperationsShrinkRequest extends TeaModel {
    /**
     * <p>The operation business status.</p>
     */
    @NameInMap("businessStatus")
    public String businessStatusShrink;

    /**
     * <p>The filter condition for the query.</p>
     * <blockquote>
     * <ul>
     * <li>Supports filtering by operationKey, which is the topic name.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("filter")
    public String filter;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rmq-cn-zxu37eiqq0x</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The operation status.</p>
     */
    @NameInMap("operationStatus")
    public String operationStatusShrink;

    /**
     * <p>The operation type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MIGRATE_MESSAGE</p>
     */
    @NameInMap("operationType")
    public String operationType;

    /**
     * <p>The page number of the results to return.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size, which specifies the maximum number of results to return per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListMigrationOperationsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMigrationOperationsShrinkRequest self = new ListMigrationOperationsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListMigrationOperationsShrinkRequest setBusinessStatusShrink(String businessStatusShrink) {
        this.businessStatusShrink = businessStatusShrink;
        return this;
    }
    public String getBusinessStatusShrink() {
        return this.businessStatusShrink;
    }

    public ListMigrationOperationsShrinkRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListMigrationOperationsShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListMigrationOperationsShrinkRequest setOperationStatusShrink(String operationStatusShrink) {
        this.operationStatusShrink = operationStatusShrink;
        return this;
    }
    public String getOperationStatusShrink() {
        return this.operationStatusShrink;
    }

    public ListMigrationOperationsShrinkRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public ListMigrationOperationsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMigrationOperationsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
