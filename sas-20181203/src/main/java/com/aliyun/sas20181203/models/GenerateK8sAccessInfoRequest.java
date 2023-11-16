// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GenerateK8sAccessInfoRequest extends TeaModel {
    @NameInMap("AliyunYundunGatewayApiName")
    public String aliyunYundunGatewayApiName;

    @NameInMap("AliyunYundunGatewayPopName")
    public String aliyunYundunGatewayPopName;

    @NameInMap("AliyunYundunGatewayProjectName")
    public String aliyunYundunGatewayProjectName;

    @NameInMap("AuditLogStore")
    public String auditLogStore;

    @NameInMap("AuditProject")
    public String auditProject;

    @NameInMap("AuditRegionId")
    public String auditRegionId;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("ExpireDate")
    public Long expireDate;

    @NameInMap("GroupId")
    public Long groupId;

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
