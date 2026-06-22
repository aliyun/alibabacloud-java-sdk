// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListVirusScanMachineEventResponseBody extends TeaModel {
    /**
     * <p>The details of the alert events.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListVirusScanMachineEventResponseBodyData> data;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListVirusScanMachineEventResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request. Alibaba Cloud generates a unique identifier for each request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>2DAEF40F-8E1A-550D-8793-99C61C401DD0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListVirusScanMachineEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVirusScanMachineEventResponseBody self = new ListVirusScanMachineEventResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVirusScanMachineEventResponseBody setData(java.util.List<ListVirusScanMachineEventResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListVirusScanMachineEventResponseBodyData> getData() {
        return this.data;
    }

    public ListVirusScanMachineEventResponseBody setPageInfo(ListVirusScanMachineEventResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListVirusScanMachineEventResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListVirusScanMachineEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVirusScanMachineEventResponseBodyDataDetails extends TeaModel {
        /**
         * <p>The display type of valueDisplay.
         * Valid values:</p>
         * <ul>
         * <li><strong>download_url</strong>: download link.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>download_url</p>
         */
        @NameInMap("InfoType")
        public String infoType;

        /**
         * <p>The display name of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>Trojan Path</p>
         */
        @NameInMap("NameDisplay")
        public String nameDisplay;

        /**
         * <p>The display format of the exception event details.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>text</strong>: plain text</li>
         * <li><strong>html</strong>: rich text.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>html</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The additional attribute information of the exception event.
         * For example, the logon time or logon location of an unusual logon alert, or the trojan file path or trojan type of an alert.</p>
         * 
         * <strong>example:</strong>
         * <p>getopt</p>
         */
        @NameInMap("ValueDisplay")
        public String valueDisplay;

        public static ListVirusScanMachineEventResponseBodyDataDetails build(java.util.Map<String, ?> map) throws Exception {
            ListVirusScanMachineEventResponseBodyDataDetails self = new ListVirusScanMachineEventResponseBodyDataDetails();
            return TeaModel.build(map, self);
        }

        public ListVirusScanMachineEventResponseBodyDataDetails setInfoType(String infoType) {
            this.infoType = infoType;
            return this;
        }
        public String getInfoType() {
            return this.infoType;
        }

        public ListVirusScanMachineEventResponseBodyDataDetails setNameDisplay(String nameDisplay) {
            this.nameDisplay = nameDisplay;
            return this;
        }
        public String getNameDisplay() {
            return this.nameDisplay;
        }

        public ListVirusScanMachineEventResponseBodyDataDetails setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListVirusScanMachineEventResponseBodyDataDetails setValueDisplay(String valueDisplay) {
            this.valueDisplay = valueDisplay;
            return this;
        }
        public String getValueDisplay() {
            return this.valueDisplay;
        }

    }

    public static class ListVirusScanMachineEventResponseBodyData extends TeaModel {
        /**
         * <p>The details of the exception event.</p>
         */
        @NameInMap("Details")
        public java.util.List<ListVirusScanMachineEventResponseBodyDataDetails> details;

        /**
         * <p>The ID of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>911273</p>
         */
        @NameInMap("EventId")
        public Long eventId;

        /**
         * <p>The name (subtype) of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>恶意脚本代码执行</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>i-wz92q7m5hsbgfhdss***</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.42.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The timestamp of the last occurrence, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1682046733628</p>
         */
        @NameInMap("LastTimeStamp")
        public Long lastTimeStamp;

        /**
         * <p>The risk level of the alert event. Valid values:</p>
         * <ul>
         * <li><strong>serious</strong>: Critical.</li>
         * <li><strong>suspicious</strong>: Suspicious.</li>
         * <li><strong>remind</strong>: Reminder.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>serious</p>
         */
        @NameInMap("Level")
        public String level;

        public static ListVirusScanMachineEventResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListVirusScanMachineEventResponseBodyData self = new ListVirusScanMachineEventResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListVirusScanMachineEventResponseBodyData setDetails(java.util.List<ListVirusScanMachineEventResponseBodyDataDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<ListVirusScanMachineEventResponseBodyDataDetails> getDetails() {
            return this.details;
        }

        public ListVirusScanMachineEventResponseBodyData setEventId(Long eventId) {
            this.eventId = eventId;
            return this;
        }
        public Long getEventId() {
            return this.eventId;
        }

        public ListVirusScanMachineEventResponseBodyData setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public ListVirusScanMachineEventResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListVirusScanMachineEventResponseBodyData setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public ListVirusScanMachineEventResponseBodyData setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public ListVirusScanMachineEventResponseBodyData setLastTimeStamp(Long lastTimeStamp) {
            this.lastTimeStamp = lastTimeStamp;
            return this;
        }
        public Long getLastTimeStamp() {
            return this.lastTimeStamp;
        }

        public ListVirusScanMachineEventResponseBodyData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class ListVirusScanMachineEventResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The page number of the current page in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The maximum number of entries per page in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of alert events returned.</p>
         * 
         * <strong>example:</strong>
         * <p>149</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListVirusScanMachineEventResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListVirusScanMachineEventResponseBodyPageInfo self = new ListVirusScanMachineEventResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListVirusScanMachineEventResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListVirusScanMachineEventResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListVirusScanMachineEventResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
