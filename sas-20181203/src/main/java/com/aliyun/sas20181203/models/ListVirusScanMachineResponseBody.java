// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListVirusScanMachineResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListVirusScanMachineResponseBodyData> data;

    @NameInMap("PageInfo")
    public ListVirusScanMachineResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ListVirusScanMachineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVirusScanMachineResponseBody self = new ListVirusScanMachineResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVirusScanMachineResponseBody setData(java.util.List<ListVirusScanMachineResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListVirusScanMachineResponseBodyData> getData() {
        return this.data;
    }

    public ListVirusScanMachineResponseBody setPageInfo(ListVirusScanMachineResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListVirusScanMachineResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListVirusScanMachineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVirusScanMachineResponseBodyData extends TeaModel {
        @NameInMap("EventCount")
        public Integer eventCount;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("Uuid")
        public String uuid;

        public static ListVirusScanMachineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListVirusScanMachineResponseBodyData self = new ListVirusScanMachineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListVirusScanMachineResponseBodyData setEventCount(Integer eventCount) {
            this.eventCount = eventCount;
            return this;
        }
        public Integer getEventCount() {
            return this.eventCount;
        }

        public ListVirusScanMachineResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListVirusScanMachineResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListVirusScanMachineResponseBodyData setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public ListVirusScanMachineResponseBodyData setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public ListVirusScanMachineResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class ListVirusScanMachineResponseBodyPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListVirusScanMachineResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListVirusScanMachineResponseBodyPageInfo self = new ListVirusScanMachineResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListVirusScanMachineResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListVirusScanMachineResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListVirusScanMachineResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
