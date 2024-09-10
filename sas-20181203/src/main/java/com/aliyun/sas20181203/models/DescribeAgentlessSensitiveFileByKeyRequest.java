// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAgentlessSensitiveFileByKeyRequest extends TeaModel {
    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The UUID of the asset that is scanned. You can query the UUID on the Host or Cloud Product page. If you scan a host, set this parameter to the UUID of the scanned host. If you scan a snapshot or a custom image, set this parameter to the ID of the scanned snapshot or image.</p>
     * 
     * <strong>example:</strong>
     * <p>06293273b67d19516cfcc712194f****</p>
     */
    @NameInMap("ImageUuid")
    public String imageUuid;

    /**
     * <p>The instance ID of the asset that is scanned. To query the instance ID, go to the Task Management page, click Details of a task, and then view the value of Check On.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1fu4aqltf1huhc****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <blockquote>
     * <p> We recommend that you do not leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name or IP address of the asset.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.XX.XX</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The types of the assets that are scanned.</p>
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
     * <p>The status of the baseline risk. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: unfixed.</li>
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
