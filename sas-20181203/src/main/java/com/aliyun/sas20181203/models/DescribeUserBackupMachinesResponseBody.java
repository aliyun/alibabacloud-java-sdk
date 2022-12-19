// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUserBackupMachinesResponseBody extends TeaModel {
    // An array consisting of the servers to which the anti-ransomware policy is applied.
    @NameInMap("Machines")
    public java.util.List<DescribeUserBackupMachinesResponseBodyMachines> machines;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserBackupMachinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserBackupMachinesResponseBody self = new DescribeUserBackupMachinesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserBackupMachinesResponseBody setMachines(java.util.List<DescribeUserBackupMachinesResponseBodyMachines> machines) {
        this.machines = machines;
        return this;
    }
    public java.util.List<DescribeUserBackupMachinesResponseBodyMachines> getMachines() {
        return this.machines;
    }

    public DescribeUserBackupMachinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUserBackupMachinesResponseBodyMachines extends TeaModel {
        // The ID of the anti-ransomware policy that is applied to the server.
        @NameInMap("Id")
        public Long id;

        // The name of the anti-ransomware policy that is applied to the server.
        @NameInMap("PolicyName")
        public String policyName;

        // The UUID of the server to which the anti-ransomware policy is applied.
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeUserBackupMachinesResponseBodyMachines build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserBackupMachinesResponseBodyMachines self = new DescribeUserBackupMachinesResponseBodyMachines();
            return TeaModel.build(map, self);
        }

        public DescribeUserBackupMachinesResponseBodyMachines setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeUserBackupMachinesResponseBodyMachines setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public DescribeUserBackupMachinesResponseBodyMachines setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
