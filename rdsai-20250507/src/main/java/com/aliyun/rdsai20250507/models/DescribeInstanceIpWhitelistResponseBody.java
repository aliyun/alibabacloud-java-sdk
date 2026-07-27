// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeInstanceIpWhitelistResponseBody extends TeaModel {
    @NameInMap("BranchName")
    public String branchName;

    @NameInMap("DbIpWhiteListGroups")
    public java.util.List<DescribeInstanceIpWhitelistResponseBodyDbIpWhiteListGroups> dbIpWhiteListGroups;

    /**
     * <p>The instance ID of the AI application.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The IP whitelist groups.</p>
     */
    @NameInMap("IpWhiteListGroups")
    public java.util.List<DescribeInstanceIpWhitelistResponseBodyIpWhiteListGroups> ipWhiteListGroups;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>32DEFB4A-861F-5D1D-ADD5-918E4FD7AB8C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceIpWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceIpWhitelistResponseBody self = new DescribeInstanceIpWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceIpWhitelistResponseBody setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public DescribeInstanceIpWhitelistResponseBody setDbIpWhiteListGroups(java.util.List<DescribeInstanceIpWhitelistResponseBodyDbIpWhiteListGroups> dbIpWhiteListGroups) {
        this.dbIpWhiteListGroups = dbIpWhiteListGroups;
        return this;
    }
    public java.util.List<DescribeInstanceIpWhitelistResponseBodyDbIpWhiteListGroups> getDbIpWhiteListGroups() {
        return this.dbIpWhiteListGroups;
    }

    public DescribeInstanceIpWhitelistResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeInstanceIpWhitelistResponseBody setIpWhiteListGroups(java.util.List<DescribeInstanceIpWhitelistResponseBodyIpWhiteListGroups> ipWhiteListGroups) {
        this.ipWhiteListGroups = ipWhiteListGroups;
        return this;
    }
    public java.util.List<DescribeInstanceIpWhitelistResponseBodyIpWhiteListGroups> getIpWhiteListGroups() {
        return this.ipWhiteListGroups;
    }

    public DescribeInstanceIpWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceIpWhitelistResponseBodyDbIpWhiteListGroups extends TeaModel {
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("IpWhitelist")
        public String ipWhitelist;

        public static DescribeInstanceIpWhitelistResponseBodyDbIpWhiteListGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceIpWhitelistResponseBodyDbIpWhiteListGroups self = new DescribeInstanceIpWhitelistResponseBodyDbIpWhiteListGroups();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceIpWhitelistResponseBodyDbIpWhiteListGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeInstanceIpWhitelistResponseBodyDbIpWhiteListGroups setIpWhitelist(String ipWhitelist) {
            this.ipWhitelist = ipWhitelist;
            return this;
        }
        public String getIpWhitelist() {
            return this.ipWhitelist;
        }

    }

    public static class DescribeInstanceIpWhitelistResponseBodyIpWhiteListGroups extends TeaModel {
        /**
         * <p>The group name.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The list of IP addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XXX.XXX/24,10.0.XXX.XXX/24</p>
         */
        @NameInMap("IpWhitelist")
        public String ipWhitelist;

        public static DescribeInstanceIpWhitelistResponseBodyIpWhiteListGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceIpWhitelistResponseBodyIpWhiteListGroups self = new DescribeInstanceIpWhitelistResponseBodyIpWhiteListGroups();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceIpWhitelistResponseBodyIpWhiteListGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeInstanceIpWhitelistResponseBodyIpWhiteListGroups setIpWhitelist(String ipWhitelist) {
            this.ipWhitelist = ipWhitelist;
            return this;
        }
        public String getIpWhitelist() {
            return this.ipWhitelist;
        }

    }

}
