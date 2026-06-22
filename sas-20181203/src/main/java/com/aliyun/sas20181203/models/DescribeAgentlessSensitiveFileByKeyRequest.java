// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAgentlessSensitiveFileByKeyRequest extends TeaModel {
    /**
     * <p>The page number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The UUID of the asset to scan. You can obtain this value from the Host Assets and Cloud Products page. In host security detection scenarios, this parameter specifies the UUID of the host to scan. In snapshot security detection and custom image security detection scenarios, this parameter specifies the ID of the image or snapshot to scan.</p>
     * 
     * <strong>example:</strong>
     * <p>06293273b67d19516cfcc712194f****</p>
     */
    @NameInMap("ImageUuid")
    public String imageUuid;

    /**
     * <p>The instance ID of the asset to query. You can obtain this value from Node Management &gt; Details &gt; Detection Objects.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1fu4aqltf1huhc****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum number of entries per page in a paging query. Default value: 20. If you leave this parameter empty, 20 entries are returned per page.</p>
     * <blockquote>
     * <p>Do not leave PageSize empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The asset name or IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.XX.XX</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The collection of scan ranges.</p>
     */
    @NameInMap("ScanRange")
    public java.util.List<String> scanRange;

    /**
     * <p>The type of the sensitive file.</p>
     * 
     * <strong>example:</strong>
     * <p>sshpasswd</p>
     */
    @NameInMap("SensitiveFileKey")
    public String sensitiveFileKey;

    /**
     * <p>The fix status of the baseline risk. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: unfixed</li>
     * <li><strong>1</strong>: fixed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeAgentlessSensitiveFileByKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgentlessSensitiveFileByKeyRequest self = new DescribeAgentlessSensitiveFileByKeyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAgentlessSensitiveFileByKeyRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAgentlessSensitiveFileByKeyRequest setImageUuid(String imageUuid) {
        this.imageUuid = imageUuid;
        return this;
    }
    public String getImageUuid() {
        return this.imageUuid;
    }

    public DescribeAgentlessSensitiveFileByKeyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeAgentlessSensitiveFileByKeyRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAgentlessSensitiveFileByKeyRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeAgentlessSensitiveFileByKeyRequest setScanRange(java.util.List<String> scanRange) {
        this.scanRange = scanRange;
        return this;
    }
    public java.util.List<String> getScanRange() {
        return this.scanRange;
    }

    public DescribeAgentlessSensitiveFileByKeyRequest setSensitiveFileKey(String sensitiveFileKey) {
        this.sensitiveFileKey = sensitiveFileKey;
        return this;
    }
    public String getSensitiveFileKey() {
        return this.sensitiveFileKey;
    }

    public DescribeAgentlessSensitiveFileByKeyRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
