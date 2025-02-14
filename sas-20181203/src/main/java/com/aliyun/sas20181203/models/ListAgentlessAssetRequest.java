// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAgentlessAssetRequest extends TeaModel {
    /**
     * <p>The page number in a paginated query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The type of the cloud disk. Values:</p>
     * <ul>
     * <li><p><strong>system</strong>: System disk</p>
     * </li>
     * <li><p><strong>data</strong>: Data disk</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>data</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>The ID of the asset instance.</p>
     * 
     * <strong>example:</strong>
     * <p>s-bp1g6wxdwps7s9dz****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the asset instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ca_cpm_******</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The maximum number of items to return per page in a paginated query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the operating system.</p>
     * 
     * <strong>example:</strong>
     * <p>CentOS</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("ScanRegionId")
    public String scanRegionId;

    /**
     * <p>The type of the detection target. Values:</p>
     * <ul>
     * <li><p><strong>3</strong>: User snapshot</p>
     * </li>
     * <li><p><strong>4</strong>: User-defined image</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TargetType")
    public Integer targetType;

    public static ListAgentlessAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentlessAssetRequest self = new ListAgentlessAssetRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentlessAssetRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListAgentlessAssetRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public ListAgentlessAssetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAgentlessAssetRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ListAgentlessAssetRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAgentlessAssetRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public ListAgentlessAssetRequest setScanRegionId(String scanRegionId) {
        this.scanRegionId = scanRegionId;
        return this;
    }
    public String getScanRegionId() {
        return this.scanRegionId;
    }

    public ListAgentlessAssetRequest setTargetType(Integer targetType) {
        this.targetType = targetType;
        return this;
    }
    public Integer getTargetType() {
        return this.targetType;
    }

}
