// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListVirusScanMachineEventResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListVirusScanMachineEventResponseBodyData> data;

    @NameInMap("PageInfo")
    public ListVirusScanMachineEventResponseBodyPageInfo pageInfo;

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
        @NameInMap("InfoType")
        public String infoType;

        @NameInMap("NameDisplay")
        public String nameDisplay;

        @NameInMap("Type")
        public String type;

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
        @NameInMap("Details")
        public java.util.List<ListVirusScanMachineEventResponseBodyDataDetails> details;

        @NameInMap("EventId")
        public Long eventId;

        @NameInMap("EventName")
        public String eventName;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("LastTimeStamp")
        public Long lastTimeStamp;

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
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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
