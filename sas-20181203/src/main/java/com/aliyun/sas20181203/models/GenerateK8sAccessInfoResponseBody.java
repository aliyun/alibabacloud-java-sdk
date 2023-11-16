// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GenerateK8sAccessInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public GenerateK8sAccessInfoResponseBodyData data;

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
