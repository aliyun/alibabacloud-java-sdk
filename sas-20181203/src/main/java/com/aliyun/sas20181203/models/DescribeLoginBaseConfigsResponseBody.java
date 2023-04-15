// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLoginBaseConfigsResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the information about the configurations.</p>
     */
    @NameInMap("BaseConfigs")
    public java.util.List<DescribeLoginBaseConfigsResponseBodyBaseConfigs> baseConfigs;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries returned per page. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
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
        /**
         * <p>The UUID or group ID of the server.</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The type of the server to which the configuration is applied. Valid values:</p>
         * <br>
         * <p>*   **uuid**: a server</p>
         * <p>*   **groupId**: a server group</p>
         * <p>*   **global**: all servers</p>
         */
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
        /**
         * <p>The common logon account.</p>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <p>The end time of the common logon time range.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The common logon IP address.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The common logon location.</p>
         */
        @NameInMap("Location")
        public String location;

        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The start time of the common logon time range.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The details of the servers to which the configuration is applied.</p>
         */
        @NameInMap("TargetList")
        public java.util.List<DescribeLoginBaseConfigsResponseBodyBaseConfigsTargetList> targetList;

        /**
         * <p>The total number of servers.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The number of servers to which the configuration is applied.</p>
         */
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

        public DescribeLoginBaseConfigsResponseBodyBaseConfigs setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
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
