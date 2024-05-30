// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBruteForceRecordsRequest extends TeaModel {
    /**
     * <p>The IP address that is blocked.</p>
     */
    @NameInMap("BlockIp")
    public String blockIp;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the server.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page. We recommend that you do not leave this parameter empty.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name or IP address of the server to query.</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The status of the defense rule. Valid values:</p>
     * <br>
     * <p>*   **0**: invalid</p>
     * <p>*   **1**: enabled</p>
     * <p>*   **2**: failed</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static DescribeBruteForceRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBruteForceRecordsRequest self = new DescribeBruteForceRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBruteForceRecordsRequest setBlockIp(String blockIp) {
        this.blockIp = blockIp;
        return this;
    }
    public String getBlockIp() {
        return this.blockIp;
    }

    public DescribeBruteForceRecordsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeBruteForceRecordsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeBruteForceRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBruteForceRecordsRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeBruteForceRecordsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeBruteForceRecordsRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
