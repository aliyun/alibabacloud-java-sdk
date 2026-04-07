// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListMigrationOperationsShrinkRequest extends TeaModel {
    @NameInMap("businessStatus")
    public String businessStatusShrink;

    /**
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("filter")
    public String filter;

    /**
     * <strong>example:</strong>
     * <p>rmq-cn-zxu37eiqq0x</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("operationStatus")
    public String operationStatusShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IMPORT_CONSUMER_GROUP</p>
     */
    @NameInMap("operationType")
    public String operationType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
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
