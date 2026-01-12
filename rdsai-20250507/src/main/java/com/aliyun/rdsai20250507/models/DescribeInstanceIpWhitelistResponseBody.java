// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeInstanceIpWhitelistResponseBody extends TeaModel {
    /**
     * <p>The ID of the RDS Supabase instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The IP address whitelists.</p>
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

    public static class DescribeInstanceIpWhitelistResponseBodyIpWhiteListGroups extends TeaModel {
        /**
         * <p>The IP address whitelist name.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The IP addresses or CIDR blocks in the whitelist.</p>
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
