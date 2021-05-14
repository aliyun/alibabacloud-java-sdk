// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUserBackupMachinesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Machines")
    public java.util.List<DescribeUserBackupMachinesResponseBodyMachines> machines;

    public static DescribeUserBackupMachinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserBackupMachinesResponseBody self = new DescribeUserBackupMachinesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserBackupMachinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserBackupMachinesResponseBody setMachines(java.util.List<DescribeUserBackupMachinesResponseBodyMachines> machines) {
        this.machines = machines;
        return this;
    }
    public java.util.List<DescribeUserBackupMachinesResponseBodyMachines> getMachines() {
        return this.machines;
    }

    public static class DescribeUserBackupMachinesResponseBodyMachines extends TeaModel {
        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("Id")
        public Long id;

        public static DescribeUserBackupMachinesResponseBodyMachines build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserBackupMachinesResponseBodyMachines self = new DescribeUserBackupMachinesResponseBodyMachines();
            return TeaModel.build(map, self);
        }

        public DescribeUserBackupMachinesResponseBodyMachines setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeUserBackupMachinesResponseBodyMachines setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public DescribeUserBackupMachinesResponseBodyMachines setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
