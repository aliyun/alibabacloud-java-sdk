// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GenerateK8sAccessInfoResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GenerateK8sAccessInfoResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateK8sAccessInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateK8sAccessInfoResponseBody self = new GenerateK8sAccessInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateK8sAccessInfoResponseBody setData(GenerateK8sAccessInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateK8sAccessInfoResponseBodyData getData() {
        return this.data;
    }

    public GenerateK8sAccessInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateK8sAccessInfoResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The Simple Log Service Logstore that is used to store the audit logs.</p>
         */
        @NameInMap("AuditLogStore")
        public String auditLogStore;

        /**
         * <p>The Simple Log Service project that is used to store the audit logs.</p>
         */
        @NameInMap("AuditProject")
        public String auditProject;

        /**
         * <p>The ID of the region in which the server is deployed.</p>
         */
        @NameInMap("AuditRegionId")
        public String auditRegionId;

        /**
         * <p>The cluster ID.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The cluster name.</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The expiration time. Unit: milliseconds.</p>
         */
        @NameInMap("ExpireDate")
        public Long expireDate;

        /**
         * <p>The server group ID.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The installation key of the server.</p>
         */
        @NameInMap("InstallKey")
        public String installKey;

        public static GenerateK8sAccessInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateK8sAccessInfoResponseBodyData self = new GenerateK8sAccessInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateK8sAccessInfoResponseBodyData setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public GenerateK8sAccessInfoResponseBodyData setAuditLogStore(String auditLogStore) {
            this.auditLogStore = auditLogStore;
            return this;
        }
        public String getAuditLogStore() {
            return this.auditLogStore;
        }

        public GenerateK8sAccessInfoResponseBodyData setAuditProject(String auditProject) {
            this.auditProject = auditProject;
            return this;
        }
        public String getAuditProject() {
            return this.auditProject;
        }

        public GenerateK8sAccessInfoResponseBodyData setAuditRegionId(String auditRegionId) {
            this.auditRegionId = auditRegionId;
            return this;
        }
        public String getAuditRegionId() {
            return this.auditRegionId;
        }

        public GenerateK8sAccessInfoResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GenerateK8sAccessInfoResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public GenerateK8sAccessInfoResponseBodyData setExpireDate(Long expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public Long getExpireDate() {
            return this.expireDate;
        }

        public GenerateK8sAccessInfoResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GenerateK8sAccessInfoResponseBodyData setInstallKey(String installKey) {
            this.installKey = installKey;
            return this;
        }
        public String getInstallKey() {
            return this.installKey;
        }

    }

}
