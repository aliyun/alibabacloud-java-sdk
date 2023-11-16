// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListK8sAccessInfoResponseBody extends TeaModel {
    @NameInMap("K8sAccessInfos")
    public java.util.List<ListK8sAccessInfoResponseBodyK8sAccessInfos> k8sAccessInfos;

    @NameInMap("RequestId")
    public String requestId;

    public static ListK8sAccessInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListK8sAccessInfoResponseBody self = new ListK8sAccessInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListK8sAccessInfoResponseBody setK8sAccessInfos(java.util.List<ListK8sAccessInfoResponseBodyK8sAccessInfos> k8sAccessInfos) {
        this.k8sAccessInfos = k8sAccessInfos;
        return this;
    }
    public java.util.List<ListK8sAccessInfoResponseBodyK8sAccessInfos> getK8sAccessInfos() {
        return this.k8sAccessInfos;
    }

    public ListK8sAccessInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListK8sAccessInfoResponseBodyK8sAccessInfos extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("AuditLogStore")
        public String auditLogStore;

        @NameInMap("AuditProject")
        public String auditProject;

        @NameInMap("AuditRegionId")
        public String auditRegionId;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ExpireDate")
        public Long expireDate;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstallKey")
        public String installKey;

        @NameInMap("Vendor")
        public String vendor;

        public static ListK8sAccessInfoResponseBodyK8sAccessInfos build(java.util.Map<String, ?> map) throws Exception {
            ListK8sAccessInfoResponseBodyK8sAccessInfos self = new ListK8sAccessInfoResponseBodyK8sAccessInfos();
            return TeaModel.build(map, self);
        }

        public ListK8sAccessInfoResponseBodyK8sAccessInfos setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListK8sAccessInfoResponseBodyK8sAccessInfos setAuditLogStore(String auditLogStore) {
            this.auditLogStore = auditLogStore;
            return this;
        }
        public String getAuditLogStore() {
            return this.auditLogStore;
        }

        public ListK8sAccessInfoResponseBodyK8sAccessInfos setAuditProject(String auditProject) {
            this.auditProject = auditProject;
            return this;
        }
        public String getAuditProject() {
            return this.auditProject;
        }

        public ListK8sAccessInfoResponseBodyK8sAccessInfos setAuditRegionId(String auditRegionId) {
            this.auditRegionId = auditRegionId;
            return this;
        }
        public String getAuditRegionId() {
            return this.auditRegionId;
        }

        public ListK8sAccessInfoResponseBodyK8sAccessInfos setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListK8sAccessInfoResponseBodyK8sAccessInfos setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListK8sAccessInfoResponseBodyK8sAccessInfos setExpireDate(Long expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public Long getExpireDate() {
            return this.expireDate;
        }

        public ListK8sAccessInfoResponseBodyK8sAccessInfos setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListK8sAccessInfoResponseBodyK8sAccessInfos setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListK8sAccessInfoResponseBodyK8sAccessInfos setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListK8sAccessInfoResponseBodyK8sAccessInfos setInstallKey(String installKey) {
            this.installKey = installKey;
            return this;
        }
        public String getInstallKey() {
            return this.installKey;
        }

        public ListK8sAccessInfoResponseBodyK8sAccessInfos setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

}
