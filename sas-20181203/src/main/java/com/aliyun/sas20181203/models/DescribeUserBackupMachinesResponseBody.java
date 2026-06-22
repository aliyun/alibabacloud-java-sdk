// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUserBackupMachinesResponseBody extends TeaModel {
    /**
     * <p>The information about servers that have backup policies enabled.</p>
     */
    @NameInMap("Machines")
    public java.util.List<DescribeUserBackupMachinesResponseBodyMachines> machines;

    /**
     * <p>The ID of the request. Alibaba Cloud generates a unique identifier for each request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>D0D6E6E4-CB8C-4897-B852-46AEFDA04B21</p>
     */
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
        /**
         * <p>The ID of the policy enabled on the server.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the policy enabled on the server.</p>
         * 
         * <strong>example:</strong>
         * <p>policy_name_A</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The UUID of the server that has a backup policy enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>D0D6E6E4-CB8C-4897-B852-46AEFDA0****</p>
         */
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
