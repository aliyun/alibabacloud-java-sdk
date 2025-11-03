// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GenerateK8sAccessInfoRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AliyunYundunGatewayApiName")
    public String aliyunYundunGatewayApiName;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AliyunYundunGatewayPopName")
    public String aliyunYundunGatewayPopName;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AliyunYundunGatewayProjectName")
    public String aliyunYundunGatewayProjectName;

    /**
     * <p>The Simple Log Service Logstore that is used to store the audit logs.</p>
     * 
     * <strong>example:</strong>
     * <p>audit-cf6baf6afa106eca665296fdf68b65bf</p>
     */
    @NameInMap("AuditLogStore")
    public String auditLogStore;

    /**
     * <p>The Simple Log Service project that is used to store the audit logs.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s-log-custom-huxintest1018-2</p>
     */
    @NameInMap("AuditProject")
    public String auditProject;

    /**
     * <p>The ID of the region in which the audit logs are stored.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("AuditRegionId")
    public String auditRegionId;

    /**
     * <p>The name of the Kubernetes cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>CPU architectures are divided into ARM architecture and x86 architecture.</p>
     * 
     * <strong>example:</strong>
     * <p>arm</p>
     */
    @NameInMap("CpuArch")
    public String cpuArch;

    /**
     * <p>The time at which the container ends to be added.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1711951508388</p>
     */
    @NameInMap("ExpireDate")
    public Long expireDate;

    /**
     * <p>The group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11341690</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The service provider of the cloud asset. Valid values:</p>
     * <ul>
     * <li><strong>Tencent</strong></li>
     * <li><strong>HUAWEICLOUD</strong></li>
     * <li><strong>Azure</strong></li>
     * <li><strong>AWS</strong></li>
     * <li><strong>Others</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Tencent</p>
     */
    @NameInMap("Vendor")
    public String vendor;

    public static GenerateK8sAccessInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateK8sAccessInfoRequest self = new GenerateK8sAccessInfoRequest();
        return TeaModel.build(map, self);
    }

    public GenerateK8sAccessInfoRequest setAliyunYundunGatewayApiName(String aliyunYundunGatewayApiName) {
        this.aliyunYundunGatewayApiName = aliyunYundunGatewayApiName;
        return this;
    }
    public String getAliyunYundunGatewayApiName() {
        return this.aliyunYundunGatewayApiName;
    }

    public GenerateK8sAccessInfoRequest setAliyunYundunGatewayPopName(String aliyunYundunGatewayPopName) {
        this.aliyunYundunGatewayPopName = aliyunYundunGatewayPopName;
        return this;
    }
    public String getAliyunYundunGatewayPopName() {
        return this.aliyunYundunGatewayPopName;
    }

    public GenerateK8sAccessInfoRequest setAliyunYundunGatewayProjectName(String aliyunYundunGatewayProjectName) {
        this.aliyunYundunGatewayProjectName = aliyunYundunGatewayProjectName;
        return this;
    }
    public String getAliyunYundunGatewayProjectName() {
        return this.aliyunYundunGatewayProjectName;
    }

    public GenerateK8sAccessInfoRequest setAuditLogStore(String auditLogStore) {
        this.auditLogStore = auditLogStore;
        return this;
    }
    public String getAuditLogStore() {
        return this.auditLogStore;
    }

    public GenerateK8sAccessInfoRequest setAuditProject(String auditProject) {
        this.auditProject = auditProject;
        return this;
    }
    public String getAuditProject() {
        return this.auditProject;
    }

    public GenerateK8sAccessInfoRequest setAuditRegionId(String auditRegionId) {
        this.auditRegionId = auditRegionId;
        return this;
    }
    public String getAuditRegionId() {
        return this.auditRegionId;
    }

    public GenerateK8sAccessInfoRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public GenerateK8sAccessInfoRequest setCpuArch(String cpuArch) {
        this.cpuArch = cpuArch;
        return this;
    }
    public String getCpuArch() {
        return this.cpuArch;
    }

    public GenerateK8sAccessInfoRequest setExpireDate(Long expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public Long getExpireDate() {
        return this.expireDate;
    }

    public GenerateK8sAccessInfoRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public GenerateK8sAccessInfoRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
