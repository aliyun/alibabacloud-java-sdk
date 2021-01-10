// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DescribeUisNetworkInterfacesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("NetworkInterfaces")
    public DescribeUisNetworkInterfacesResponseBodyNetworkInterfaces networkInterfaces;

    public static DescribeUisNetworkInterfacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUisNetworkInterfacesResponseBody self = new DescribeUisNetworkInterfacesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUisNetworkInterfacesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeUisNetworkInterfacesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeUisNetworkInterfacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUisNetworkInterfacesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeUisNetworkInterfacesResponseBody setNetworkInterfaces(DescribeUisNetworkInterfacesResponseBodyNetworkInterfaces networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
        return this;
    }
    public DescribeUisNetworkInterfacesResponseBodyNetworkInterfaces getNetworkInterfaces() {
        return this.networkInterfaces;
    }

    public static class DescribeUisNetworkInterfacesResponseBodyNetworkInterfacesNetworkInterface extends TeaModel {
        @NameInMap("UisEniId")
        public String uisEniId;

        @NameInMap("UisNodeId")
        public String uisNodeId;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("Description")
        public String description;

        @NameInMap("VswitchId")
        public String vswitchId;

        @NameInMap("State")
        public String state;

        @NameInMap("SecurityGroupID")
        public String securityGroupID;

        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Log")
        public String log;

        public static DescribeUisNetworkInterfacesResponseBodyNetworkInterfacesNetworkInterface build(java.util.Map<String, ?> map) throws Exception {
            DescribeUisNetworkInterfacesResponseBodyNetworkInterfacesNetworkInterface self = new DescribeUisNetworkInterfacesResponseBodyNetworkInterfacesNetworkInterface();
            return TeaModel.build(map, self);
        }

        public DescribeUisNetworkInterfacesResponseBodyNetworkInterfacesNetworkInterface setUisEniId(String uisEniId) {
            this.uisEniId = uisEniId;
            return this;
        }
        public String getUisEniId() {
            return this.uisEniId;
        }

        public DescribeUisNetworkInterfacesResponseBodyNetworkInterfacesNetworkInterface setUisNodeId(String uisNodeId) {
            this.uisNodeId = uisNodeId;
            return this;
        }
        public String getUisNodeId() {
            return this.uisNodeId;
        }

        public DescribeUisNetworkInterfacesResponseBodyNetworkInterfacesNetworkInterface setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeUisNetworkInterfacesResponseBodyNetworkInterfacesNetworkInterface setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeUisNetworkInterfacesResponseBodyNetworkInterfacesNetworkInterface setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeUisNetworkInterfacesResponseBodyNetworkInterfacesNetworkInterface setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeUisNetworkInterfacesResponseBodyNetworkInterfacesNetworkInterface setSecurityGroupID(String securityGroupID) {
            this.securityGroupID = securityGroupID;
            return this;
        }
        public String getSecurityGroupID() {
            return this.securityGroupID;
        }

        public DescribeUisNetworkInterfacesResponseBodyNetworkInterfacesNetworkInterface setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public DescribeUisNetworkInterfacesResponseBodyNetworkInterfacesNetworkInterface setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeUisNetworkInterfacesResponseBodyNetworkInterfacesNetworkInterface setLog(String log) {
            this.log = log;
            return this;
        }
        public String getLog() {
            return this.log;
        }

    }

    public static class DescribeUisNetworkInterfacesResponseBodyNetworkInterfaces extends TeaModel {
        @NameInMap("NetworkInterface")
        public java.util.List<DescribeUisNetworkInterfacesResponseBodyNetworkInterfacesNetworkInterface> networkInterface;

        public static DescribeUisNetworkInterfacesResponseBodyNetworkInterfaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeUisNetworkInterfacesResponseBodyNetworkInterfaces self = new DescribeUisNetworkInterfacesResponseBodyNetworkInterfaces();
            return TeaModel.build(map, self);
        }

        public DescribeUisNetworkInterfacesResponseBodyNetworkInterfaces setNetworkInterface(java.util.List<DescribeUisNetworkInterfacesResponseBodyNetworkInterfacesNetworkInterface> networkInterface) {
            this.networkInterface = networkInterface;
            return this;
        }
        public java.util.List<DescribeUisNetworkInterfacesResponseBodyNetworkInterfacesNetworkInterface> getNetworkInterface() {
            return this.networkInterface;
        }

    }

}
