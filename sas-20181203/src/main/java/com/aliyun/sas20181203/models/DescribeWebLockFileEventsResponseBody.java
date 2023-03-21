// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockFileEventsResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("List")
    public java.util.List<DescribeWebLockFileEventsResponseBodyList> list;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeWebLockFileEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockFileEventsResponseBody self = new DescribeWebLockFileEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockFileEventsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWebLockFileEventsResponseBody setList(java.util.List<DescribeWebLockFileEventsResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeWebLockFileEventsResponseBodyList> getList() {
        return this.list;
    }

    public DescribeWebLockFileEventsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWebLockFileEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebLockFileEventsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeWebLockFileEventsResponseBodyList extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("Ds")
        public Long ds;

        @NameInMap("EventName")
        public String eventName;

        @NameInMap("EventStatus")
        public String eventStatus;

        @NameInMap("EventType")
        public String eventType;

        @NameInMap("GmtEvent")
        public Long gmtEvent;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Level")
        public String level;

        @NameInMap("Path")
        public String path;

        @NameInMap("ProcessName")
        public String processName;

        @NameInMap("ProcessPath")
        public String processPath;

        @NameInMap("Status")
        public String status;

        @NameInMap("Uuid")
        public String uuid;

        public static DescribeWebLockFileEventsResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebLockFileEventsResponseBodyList self = new DescribeWebLockFileEventsResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeWebLockFileEventsResponseBodyList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeWebLockFileEventsResponseBodyList setDs(Long ds) {
            this.ds = ds;
            return this;
        }
        public Long getDs() {
            return this.ds;
        }

        public DescribeWebLockFileEventsResponseBodyList setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeWebLockFileEventsResponseBodyList setEventStatus(String eventStatus) {
            this.eventStatus = eventStatus;
            return this;
        }
        public String getEventStatus() {
            return this.eventStatus;
        }

        public DescribeWebLockFileEventsResponseBodyList setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeWebLockFileEventsResponseBodyList setGmtEvent(Long gmtEvent) {
            this.gmtEvent = gmtEvent;
            return this;
        }
        public Long getGmtEvent() {
            return this.gmtEvent;
        }

        public DescribeWebLockFileEventsResponseBodyList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeWebLockFileEventsResponseBodyList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeWebLockFileEventsResponseBodyList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeWebLockFileEventsResponseBodyList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeWebLockFileEventsResponseBodyList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeWebLockFileEventsResponseBodyList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeWebLockFileEventsResponseBodyList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeWebLockFileEventsResponseBodyList setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public DescribeWebLockFileEventsResponseBodyList setProcessPath(String processPath) {
            this.processPath = processPath;
            return this;
        }
        public String getProcessPath() {
            return this.processPath;
        }

        public DescribeWebLockFileEventsResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeWebLockFileEventsResponseBodyList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
