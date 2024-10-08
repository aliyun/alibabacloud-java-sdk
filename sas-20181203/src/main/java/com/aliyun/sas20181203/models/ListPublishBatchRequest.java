// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListPublishBatchRequest extends TeaModel {
    @NameInMap("BatchName")
    public String batchName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.9</p>
     */
    @NameInMap("UpgradeVersion")
    public String upgradeVersion;

    public static ListPublishBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPublishBatchRequest self = new ListPublishBatchRequest();
        return TeaModel.build(map, self);
    }

    public ListPublishBatchRequest setBatchName(String batchName) {
        this.batchName = batchName;
        return this;
    }
    public String getBatchName() {
        return this.batchName;
    }

    public ListPublishBatchRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListPublishBatchRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPublishBatchRequest setUpgradeVersion(String upgradeVersion) {
        this.upgradeVersion = upgradeVersion;
        return this;
    }
    public String getUpgradeVersion() {
        return this.upgradeVersion;
    }

}
