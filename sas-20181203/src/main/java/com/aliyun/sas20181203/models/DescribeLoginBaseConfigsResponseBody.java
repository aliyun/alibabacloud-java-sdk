// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLoginBaseConfigsResponseBody extends TeaModel {
    @NameInMap("BaseConfigs")
    public java.util.List<DescribeLoginBaseConfigsResponseBodyBaseConfigs> baseConfigs;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Target")
        public String target;

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
        @NameInMap("Account")
        public String account;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Location")
        public String location;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("TargetList")
        public java.util.List<DescribeLoginBaseConfigsResponseBodyBaseConfigsTargetList> targetList;

        @NameInMap("TotalCount")
        public Integer totalCount;

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
