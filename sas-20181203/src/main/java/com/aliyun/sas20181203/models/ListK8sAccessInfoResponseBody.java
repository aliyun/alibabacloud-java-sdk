// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListK8sAccessInfoResponseBody extends TeaModel {
    /**
     * <p>The list of K8s access information.</p>
     */
    @NameInMap("K8sAccessInfos")
    public java.util.List<ListK8sAccessInfoResponseBodyK8sAccessInfos> k8sAccessInfos;

    /**
     * <p>The ID of the request. The China Chinese Cloud generates a unique ID for each request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>0B48AB3C-84FC-424D-A01D-B9270EF46038</p>
     */
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
        /**
         * <p>The Alibaba Cloud UID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>1960721413485****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The Simple Log Service Logstore for audit logs.</p>
         * 
         * <strong>example:</strong>
         * <p>audit-cf6baf6afa106eca665296fdf68b****</p>
         */
        @NameInMap("AuditLogStore")
        public String auditLogStore;

        /**
         * <p>The Simple Log Service project for audit logs.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-log-custom-your-project-sd89eh****</p>
         */
        @NameInMap("AuditProject")
        public String auditProject;

        /**
         * <p>The region ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("AuditRegionId")
        public String auditRegionId;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c0da5e4cb82a848c4a57c4dc9f49a****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The CPU architecture. Valid values: ARM architecture and x86 architecture.</p>
         * 
         * <strong>example:</strong>
         * <p>arm</p>
         */
        @NameInMap("CpuArch")
        public String cpuArch;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>1690596321613</p>
         */
        @NameInMap("ExpireDate")
        public Long expireDate;

        /**
         * <p>The server group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11088522</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The server group name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The unique ID of the access information.</p>
         * 
         * <strong>example:</strong>
         * <p>67070</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The K8s installation key.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("InstallKey")
        public String installKey;

        /**
         * <p>The vendor.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
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

        public ListK8sAccessInfoResponseBodyK8sAccessInfos setCpuArch(String cpuArch) {
            this.cpuArch = cpuArch;
            return this;
        }
        public String getCpuArch() {
            return this.cpuArch;
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
