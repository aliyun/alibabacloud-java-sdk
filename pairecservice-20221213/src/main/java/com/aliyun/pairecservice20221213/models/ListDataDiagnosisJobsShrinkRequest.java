// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListDataDiagnosisJobsShrinkRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-test1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li><p>Initializing: The job is being initialized.</p>
     * </li>
     * <li><p>Running: The job is in progress.</p>
     * </li>
     * <li><p>Success: The job succeeded.</p>
     * </li>
     * <li><p>Failure: The job failed to complete.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Initializing</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>A list of data diagnosis types.</p>
     */
    @NameInMap("Types")
    public String typesShrink;

    public static ListDataDiagnosisJobsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataDiagnosisJobsShrinkRequest self = new ListDataDiagnosisJobsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDataDiagnosisJobsShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDataDiagnosisJobsShrinkRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListDataDiagnosisJobsShrinkRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListDataDiagnosisJobsShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListDataDiagnosisJobsShrinkRequest setTypesShrink(String typesShrink) {
        this.typesShrink = typesShrink;
        return this;
    }
    public String getTypesShrink() {
        return this.typesShrink;
    }

}
