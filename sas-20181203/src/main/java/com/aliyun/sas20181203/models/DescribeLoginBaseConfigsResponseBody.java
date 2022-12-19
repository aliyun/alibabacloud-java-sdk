// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLoginBaseConfigsResponseBody extends TeaModel {
    // An array that consists of the information about the configurations.
    @NameInMap("BaseConfigs")
    public java.util.List<DescribeLoginBaseConfigsResponseBodyBaseConfigs> baseConfigs;

    // The page number of the returned page.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The number of entries returned per page. Default value: **20**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of entries returned.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeLoginBaseConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoginBaseConfigsResponseBody self = new DescribeLoginBaseConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoginBaseConfigsResponseBody setBaseConfigs(java.util.List<DescribeLoginBaseConfigsResponseBodyBaseConfigs> baseConfigs) {
        this.baseConfigs = baseConfigs;
        return this;
    }
    public java.util.List<DescribeLoginBaseConfigsResponseBodyBaseConfigs> getBaseConfigs() {
        return this.baseConfigs;
    }

    public DescribeLoginBaseConfigsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeLoginBaseConfigsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLoginBaseConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLoginBaseConfigsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeLoginBaseConfigsResponseBodyBaseConfigsTargetList extends TeaModel {
        // The UUID or group ID of the server.
        @NameInMap("Target")
        public String target;

        // The type of the server to which the configuration is applied. Valid values:
        // 
        // *   **uuid**: a server
        // *   **groupId**: a server group
        // *   **global**: all servers
        @NameInMap("TargetType")
        public String targetType;

        public static DescribeLoginBaseConfigsResponseBodyBaseConfigsTargetList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoginBaseConfigsResponseBodyBaseConfigsTargetList self = new DescribeLoginBaseConfigsResponseBodyBaseConfigsTargetList();
            return TeaModel.build(map, self);
        }

        public DescribeLoginBaseConfigsResponseBodyBaseConfigsTargetList setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public DescribeLoginBaseConfigsResponseBodyBaseConfigsTargetList setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class DescribeLoginBaseConfigsResponseBodyBaseConfigs extends TeaModel {
        // The common logon account.
        @NameInMap("Account")
        public String account;

        // The end time of the common logon time range.
        @NameInMap("EndTime")
        public String endTime;

        // The common logon IP address.
        @NameInMap("Ip")
        public String ip;

        // The common logon location.
        @NameInMap("Location")
        public String location;

        // The start time of the common logon time range.
        @NameInMap("StartTime")
        public String startTime;

        // The details of the servers to which the configuration is applied.
        @NameInMap("TargetList")
        public java.util.List<DescribeLoginBaseConfigsResponseBodyBaseConfigsTargetList> targetList;

        // The total number of servers.
        @NameInMap("TotalCount")
        public Integer totalCount;

        // The number of servers to which the configuration is applied.
        @NameInMap("UuidCount")
        public Integer uuidCount;

        public static DescribeLoginBaseConfigsResponseBodyBaseConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoginBaseConfigsResponseBodyBaseConfigs self = new DescribeLoginBaseConfigsResponseBodyBaseConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeLoginBaseConfigsResponseBodyBaseConfigs setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public DescribeLoginBaseConfigsResponseBodyBaseConfigs setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeLoginBaseConfigsResponseBodyBaseConfigs setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeLoginBaseConfigsResponseBodyBaseConfigs setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeLoginBaseConfigsResponseBodyBaseConfigs setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeLoginBaseConfigsResponseBodyBaseConfigs setTargetList(java.util.List<DescribeLoginBaseConfigsResponseBodyBaseConfigsTargetList> targetList) {
            this.targetList = targetList;
            return this;
        }
        public java.util.List<DescribeLoginBaseConfigsResponseBodyBaseConfigsTargetList> getTargetList() {
            return this.targetList;
        }

        public DescribeLoginBaseConfigsResponseBodyBaseConfigs setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeLoginBaseConfigsResponseBodyBaseConfigs setUuidCount(Integer uuidCount) {
            this.uuidCount = uuidCount;
            return this;
        }
        public Integer getUuidCount() {
            return this.uuidCount;
        }

    }

}
