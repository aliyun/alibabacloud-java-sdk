// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockFileEventsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>An array that consists of events on web tamper proofing returned.</p>
     */
    @NameInMap("List")
    public java.util.List<DescribeWebLockFileEventsResponseBodyList> list;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of events on web tamper proofing returned.</p>
     */
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
        /**
         * <p>The number of attempts.</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The timestamp at which the event on web tamper proofing was first detected.</p>
         */
        @NameInMap("Ds")
        public Long ds;

        /**
         * <p>The name of the event on web tamper proofing.</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The status of the event on web tamper proofing. Valid values:</p>
         * <br>
         * <p>*   **1**: unhandled</p>
         * <p>*   **2**: ignored</p>
         * <p>*   **4**: deprecated</p>
         * <p>*   **8**: marked as false positive</p>
         * <p>*   **10**: added to the whitelist</p>
         * <p>*   **16**: handling</p>
         * <p>*   **32**: defended</p>
         * <p>*   **64**: invalid</p>
         * <p>*   **128**: deleted</p>
         * <p>*   **512**: automatically handled</p>
         */
        @NameInMap("EventStatus")
        public String eventStatus;

        /**
         * <p>The prevention mode. Valid values:</p>
         * <br>
         * <p>*   **audit**: Interception Mode</p>
         * <p>*   **web_lock**: Alert Mode</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The timestamp at which the event on web tamper proofing was last detected.</p>
         */
        @NameInMap("GmtEvent")
        public Long gmtEvent;

        /**
         * <p>The ID of the event on web tamper proofing.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the asset.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the affected asset.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the asset.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The IP address of the asset.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The severity of the event on web tamper proofing. Valid values: **medium**</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The file path.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The name of the process.</p>
         */
        @NameInMap("ProcessName")
        public String processName;

        /**
         * <p>The path to the process.</p>
         */
        @NameInMap("ProcessPath")
        public String processPath;

        /**
         * <p>The status of the event on web tamper proofing. Valid values:</p>
         * <br>
         * <p>*   **1**: unhandled</p>
         * <p>*   **2**: ignored</p>
         * <p>*   **4**: deprecated</p>
         * <p>*   **8**: marked as false positive</p>
         * <p>*   **10**: added to the whitelist</p>
         * <p>*   **16**: handling</p>
         * <p>*   **32**: defended</p>
         * <p>*   **64**: invalid</p>
         * <p>*   **128**: deleted</p>
         * <p>*   **512**: automatically handled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The UUID of the asset.</p>
         */
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
