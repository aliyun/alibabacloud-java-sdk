// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListFileProtectClientEventResponseBody extends TeaModel {
    /**
     * <p>The file monitoring events.</p>
     */
    @NameInMap("EventList")
    public java.util.List<ListFileProtectClientEventResponseBodyEventList> eventList;

    /**
     * <p>The pagination information of the query result.</p>
     */
    @NameInMap("PageInfo")
    public ListFileProtectClientEventResponseBodyPageInfo pageInfo;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>ACF97412-FD09-4D1F-994F-34DF12B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListFileProtectClientEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFileProtectClientEventResponseBody self = new ListFileProtectClientEventResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFileProtectClientEventResponseBody setEventList(java.util.List<ListFileProtectClientEventResponseBodyEventList> eventList) {
        this.eventList = eventList;
        return this;
    }
    public java.util.List<ListFileProtectClientEventResponseBodyEventList> getEventList() {
        return this.eventList;
    }

    public ListFileProtectClientEventResponseBody setPageInfo(ListFileProtectClientEventResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListFileProtectClientEventResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListFileProtectClientEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFileProtectClientEventResponseBodyEventList extends TeaModel {
        /**
         * <p>The alert notification level. Valid values:</p>
         * <ul>
         * <li><p>0: no alert</p>
         * </li>
         * <li><p>1: reminder</p>
         * </li>
         * <li><p>2: suspicious</p>
         * </li>
         * <li><p>3: high-risk.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlertLevel")
        public Integer alertLevel;

        /**
         * <p>The command line of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;touch&quot;,&quot;/test/aaaa&quot;]</p>
         */
        @NameInMap("CmdLine")
        public String cmdLine;

        /**
         * <p>The number of times the event occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The file path.</p>
         * 
         * <strong>example:</strong>
         * <p>/data/*</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <p>The timestamp when the event was first detected. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1694576692000</p>
         */
        @NameInMap("FirstTime")
        public Long firstTime;

        /**
         * <p>The time when the event was handled.</p>
         * 
         * <strong>example:</strong>
         * <p>1694576692000</p>
         */
        @NameInMap("HandleTime")
        public Long handleTime;

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3719</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the server instance.</p>
         * 
         * <strong>example:</strong>
         * <p>kyy-admin-01</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>121.40.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>172.22.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The most recent time the event occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>1694576692000</p>
         */
        @NameInMap("LatestTime")
        public Long latestTime;

        /**
         * <p>The type of operation performed on the file. Valid values:</p>
         * <ul>
         * <li><strong>DELETE</strong>: deletes the file.</li>
         * <li><strong>WRITE</strong>: writes to the file.</li>
         * <li><strong>READ</strong>: reads the file.</li>
         * <li><strong>RENAME</strong>: renames the file.</li>
         * <li><strong>CHOWN</strong>: changes the file owner and associated group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DELETE</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>The operating system type. Valid values:</p>
         * <ul>
         * <li><strong>windows</strong>: Windows</li>
         * <li><strong>linux</strong>: Linux.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The process path.</p>
         * 
         * <strong>example:</strong>
         * <p>c:/<em>Unity</em></p>
         */
        @NameInMap("ProcPath")
        public String procPath;

        /**
         * <p>The process permission.</p>
         * 
         * <strong>example:</strong>
         * <p>rwxr-xr-x</p>
         */
        @NameInMap("ProcPermission")
        public String procPermission;

        /**
         * <p>The process ID of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>52636</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The rule action. Valid values:</p>
         * <ul>
         * <li><p><strong>block</strong>: Block.</p>
         * </li>
         * <li><p><strong>monitor</strong>: Monitor.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("RuleAction")
        public String ruleAction;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-rule-1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The event status. Valid values:</p>
         * <ul>
         * <li>0: unhandled </li>
         * <li>1: handled</li>
         * <li>2: whitelisted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>94b44720-d982-4d20-a4e1-80a1a57b****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static ListFileProtectClientEventResponseBodyEventList build(java.util.Map<String, ?> map) throws Exception {
            ListFileProtectClientEventResponseBodyEventList self = new ListFileProtectClientEventResponseBodyEventList();
            return TeaModel.build(map, self);
        }

        public ListFileProtectClientEventResponseBodyEventList setAlertLevel(Integer alertLevel) {
            this.alertLevel = alertLevel;
            return this;
        }
        public Integer getAlertLevel() {
            return this.alertLevel;
        }

        public ListFileProtectClientEventResponseBodyEventList setCmdLine(String cmdLine) {
            this.cmdLine = cmdLine;
            return this;
        }
        public String getCmdLine() {
            return this.cmdLine;
        }

        public ListFileProtectClientEventResponseBodyEventList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListFileProtectClientEventResponseBodyEventList setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListFileProtectClientEventResponseBodyEventList setFirstTime(Long firstTime) {
            this.firstTime = firstTime;
            return this;
        }
        public Long getFirstTime() {
            return this.firstTime;
        }

        public ListFileProtectClientEventResponseBodyEventList setHandleTime(Long handleTime) {
            this.handleTime = handleTime;
            return this;
        }
        public Long getHandleTime() {
            return this.handleTime;
        }

        public ListFileProtectClientEventResponseBodyEventList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListFileProtectClientEventResponseBodyEventList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListFileProtectClientEventResponseBodyEventList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public ListFileProtectClientEventResponseBodyEventList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public ListFileProtectClientEventResponseBodyEventList setLatestTime(Long latestTime) {
            this.latestTime = latestTime;
            return this;
        }
        public Long getLatestTime() {
            return this.latestTime;
        }

        public ListFileProtectClientEventResponseBodyEventList setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListFileProtectClientEventResponseBodyEventList setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListFileProtectClientEventResponseBodyEventList setProcPath(String procPath) {
            this.procPath = procPath;
            return this;
        }
        public String getProcPath() {
            return this.procPath;
        }

        public ListFileProtectClientEventResponseBodyEventList setProcPermission(String procPermission) {
            this.procPermission = procPermission;
            return this;
        }
        public String getProcPermission() {
            return this.procPermission;
        }

        public ListFileProtectClientEventResponseBodyEventList setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public ListFileProtectClientEventResponseBodyEventList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListFileProtectClientEventResponseBodyEventList setRuleAction(String ruleAction) {
            this.ruleAction = ruleAction;
            return this;
        }
        public String getRuleAction() {
            return this.ruleAction;
        }

        public ListFileProtectClientEventResponseBodyEventList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListFileProtectClientEventResponseBodyEventList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListFileProtectClientEventResponseBodyEventList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class ListFileProtectClientEventResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The page number of the current page when paging is used in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The maximum number of entries per page when paging is used in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>263</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListFileProtectClientEventResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListFileProtectClientEventResponseBodyPageInfo self = new ListFileProtectClientEventResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListFileProtectClientEventResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListFileProtectClientEventResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFileProtectClientEventResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
