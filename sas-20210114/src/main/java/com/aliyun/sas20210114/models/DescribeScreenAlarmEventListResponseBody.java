// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenAlarmEventListResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public DescribeScreenAlarmEventListResponseBodyPageInfo pageInfo;

    /**
     * <strong>example:</strong>
     * <p>09969D2C-4FAD-429E-BFBF-9A60DEF8BF6F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuspEvents")
    public java.util.List<DescribeScreenAlarmEventListResponseBodySuspEvents> suspEvents;

    public static DescribeScreenAlarmEventListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenAlarmEventListResponseBody self = new DescribeScreenAlarmEventListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScreenAlarmEventListResponseBody setPageInfo(DescribeScreenAlarmEventListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeScreenAlarmEventListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeScreenAlarmEventListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScreenAlarmEventListResponseBody setSuspEvents(java.util.List<DescribeScreenAlarmEventListResponseBodySuspEvents> suspEvents) {
        this.suspEvents = suspEvents;
        return this;
    }
    public java.util.List<DescribeScreenAlarmEventListResponseBodySuspEvents> getSuspEvents() {
        return this.suspEvents;
    }

    public static class DescribeScreenAlarmEventListResponseBodyPageInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeScreenAlarmEventListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeScreenAlarmEventListResponseBodyPageInfo self = new DescribeScreenAlarmEventListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeScreenAlarmEventListResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeScreenAlarmEventListResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeScreenAlarmEventListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeScreenAlarmEventListResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeScreenAlarmEventListResponseBodySuspEvents extends TeaModel {
        @NameInMap("AlarmEventName")
        public String alarmEventName;

        @NameInMap("AlarmEventType")
        public String alarmEventType;

        /**
         * <strong>example:</strong>
         * <p>8df914418f4211fbf756efe7a6f4****</p>
         */
        @NameInMap("AlarmUniqueInfo")
        public String alarmUniqueInfo;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanBeDealOnLine")
        public Boolean canBeDealOnLine;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CanCancelFault")
        public Boolean canCancelFault;

        /**
         * <strong>example:</strong>
         * <p>sas</p>
         */
        @NameInMap("DataSource")
        public String dataSource;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Dealed")
        public Boolean dealed;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;Type\&quot;: \&quot;text\&quot;, \&quot;Value\&quot;: u\&quot;\u5efa\u8bae\u8fdb\u884c\u79c1\u7f51\u767d\u540d\u5355\u914d\u7f6e\uff0c\u786e\u4fdd\u8bbf\u95ee\u5b89\u5168\u3002\&quot;}</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1543740301000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>fzerp-dev</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>123.21.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <strong>example:</strong>
         * <p>100.100.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <strong>example:</strong>
         * <p>serious</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SaleVersion")
        public String saleVersion;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;Type\&quot;: \&quot;text\&quot;, \&quot;Value\&quot;: \&quot;Enter NAS console - monitoring and auditing - log analysis - log management - new log dump to create a log recording service for the file system.\&quot;}</p>
         */
        @NameInMap("Solution")
        public String solution;

        /**
         * <strong>example:</strong>
         * <p>1543740301000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuspiciousEventCount")
        public Integer suspiciousEventCount;

        /**
         * <strong>example:</strong>
         * <p>bf6b30d3-eea8-4924-9f0a-****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeScreenAlarmEventListResponseBodySuspEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeScreenAlarmEventListResponseBodySuspEvents self = new DescribeScreenAlarmEventListResponseBodySuspEvents();
            return TeaModel.build(map, self);
        }

        public DescribeScreenAlarmEventListResponseBodySuspEvents setAlarmEventName(String alarmEventName) {
            this.alarmEventName = alarmEventName;
            return this;
        }
        public String getAlarmEventName() {
            return this.alarmEventName;
        }

        public DescribeScreenAlarmEventListResponseBodySuspEvents setAlarmEventType(String alarmEventType) {
            this.alarmEventType = alarmEventType;
            return this;
        }
        public String getAlarmEventType() {
            return this.alarmEventType;
        }

        public DescribeScreenAlarmEventListResponseBodySuspEvents setAlarmUniqueInfo(String alarmUniqueInfo) {
            this.alarmUniqueInfo = alarmUniqueInfo;
            return this;
        }
        public String getAlarmUniqueInfo() {
            return this.alarmUniqueInfo;
        }

        public DescribeScreenAlarmEventListResponseBodySuspEvents setCanBeDealOnLine(Boolean canBeDealOnLine) {
            this.canBeDealOnLine = canBeDealOnLine;
            return this;
        }
        public Boolean getCanBeDealOnLine() {
            return this.canBeDealOnLine;
        }

        public DescribeScreenAlarmEventListResponseBodySuspEvents setCanCancelFault(Boolean canCancelFault) {
            this.canCancelFault = canCancelFault;
            return this;
        }
        public Boolean getCanCancelFault() {
            return this.canCancelFault;
        }

        public DescribeScreenAlarmEventListResponseBodySuspEvents setDataSource(String dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public String getDataSource() {
            return this.dataSource;
        }

        public DescribeScreenAlarmEventListResponseBodySuspEvents setDealed(Boolean dealed) {
            this.dealed = dealed;
            return this;
        }
        public Boolean getDealed() {
            return this.dealed;
        }

        public DescribeScreenAlarmEventListResponseBodySuspEvents setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeScreenAlarmEventListResponseBodySuspEvents setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeScreenAlarmEventListResponseBodySuspEvents setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeScreenAlarmEventListResponseBodySuspEvents setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeScreenAlarmEventListResponseBodySuspEvents setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeScreenAlarmEventListResponseBodySuspEvents setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeScreenAlarmEventListResponseBodySuspEvents setSaleVersion(String saleVersion) {
            this.saleVersion = saleVersion;
            return this;
        }
        public String getSaleVersion() {
            return this.saleVersion;
        }

        public DescribeScreenAlarmEventListResponseBodySuspEvents setSolution(String solution) {
            this.solution = solution;
            return this;
        }
        public String getSolution() {
            return this.solution;
        }

        public DescribeScreenAlarmEventListResponseBodySuspEvents setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeScreenAlarmEventListResponseBodySuspEvents setSuspiciousEventCount(Integer suspiciousEventCount) {
            this.suspiciousEventCount = suspiciousEventCount;
            return this;
        }
        public Integer getSuspiciousEventCount() {
            return this.suspiciousEventCount;
        }

        public DescribeScreenAlarmEventListResponseBodySuspEvents setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
