// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BackupPolicyDetail")
    public DescribeBackupPolicyResponseBodyBackupPolicyDetail backupPolicyDetail;

    public static DescribeBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPolicyResponseBody self = new DescribeBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupPolicyResponseBody setBackupPolicyDetail(DescribeBackupPolicyResponseBodyBackupPolicyDetail backupPolicyDetail) {
        this.backupPolicyDetail = backupPolicyDetail;
        return this;
    }
    public DescribeBackupPolicyResponseBodyBackupPolicyDetail getBackupPolicyDetail() {
        return this.backupPolicyDetail;
    }

    public static class DescribeBackupPolicyResponseBodyBackupPolicyDetail extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("PolicyVersion")
        public String policyVersion;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("ClientStatus")
        public String clientStatus;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("UuidList")
        public java.util.List<String> uuidList;

        public static DescribeBackupPolicyResponseBodyBackupPolicyDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPolicyResponseBodyBackupPolicyDetail self = new DescribeBackupPolicyResponseBodyBackupPolicyDetail();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDetail setPolicyVersion(String policyVersion) {
            this.policyVersion = policyVersion;
            return this;
        }
        public String getPolicyVersion() {
            return this.policyVersion;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDetail setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDetail setClientStatus(String clientStatus) {
            this.clientStatus = clientStatus;
            return this;
        }
        public String getClientStatus() {
            return this.clientStatus;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDetail setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDetail setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDetail setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeBackupPolicyResponseBodyBackupPolicyDetail setUuidList(java.util.List<String> uuidList) {
            this.uuidList = uuidList;
            return this;
        }
        public java.util.List<String> getUuidList() {
            return this.uuidList;
        }

    }

}
