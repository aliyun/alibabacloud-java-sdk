// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUnknownThreatDetectMachineResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListUnknownThreatDetectMachineResponseBodyData> data;

    @NameInMap("PageInfo")
    public ListUnknownThreatDetectMachineResponseBodyPageInfo pageInfo;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A4EB8B1C-1DEC-5E18-BCD0-XXXXXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListUnknownThreatDetectMachineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUnknownThreatDetectMachineResponseBody self = new ListUnknownThreatDetectMachineResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUnknownThreatDetectMachineResponseBody setData(java.util.List<ListUnknownThreatDetectMachineResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUnknownThreatDetectMachineResponseBodyData> getData() {
        return this.data;
    }

    public ListUnknownThreatDetectMachineResponseBody setPageInfo(ListUnknownThreatDetectMachineResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListUnknownThreatDetectMachineResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListUnknownThreatDetectMachineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUnknownThreatDetectMachineResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <strong>example:</strong>
         * <p>10.42.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProcessCount")
        public Integer processCount;

        /**
         * <strong>example:</strong>
         * <p>studying</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>hash</p>
         */
        @NameInMap("StudyMode")
        public String studyMode;

        /**
         * <strong>example:</strong>
         * <p>1766988192</p>
         */
        @NameInMap("StudyStartTime")
        public Long studyStartTime;

        /**
         * <strong>example:</strong>
         * <p>6690a46c-0edb-4663-a641-3629d1a9****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static ListUnknownThreatDetectMachineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUnknownThreatDetectMachineResponseBodyData self = new ListUnknownThreatDetectMachineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUnknownThreatDetectMachineResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListUnknownThreatDetectMachineResponseBodyData setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public ListUnknownThreatDetectMachineResponseBodyData setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public ListUnknownThreatDetectMachineResponseBodyData setProcessCount(Integer processCount) {
            this.processCount = processCount;
            return this;
        }
        public Integer getProcessCount() {
            return this.processCount;
        }

        public ListUnknownThreatDetectMachineResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUnknownThreatDetectMachineResponseBodyData setStudyMode(String studyMode) {
            this.studyMode = studyMode;
            return this;
        }
        public String getStudyMode() {
            return this.studyMode;
        }

        public ListUnknownThreatDetectMachineResponseBodyData setStudyStartTime(Long studyStartTime) {
            this.studyStartTime = studyStartTime;
            return this;
        }
        public Long getStudyStartTime() {
            return this.studyStartTime;
        }

        public ListUnknownThreatDetectMachineResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class ListUnknownThreatDetectMachineResponseBodyPageInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>149</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListUnknownThreatDetectMachineResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListUnknownThreatDetectMachineResponseBodyPageInfo self = new ListUnknownThreatDetectMachineResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListUnknownThreatDetectMachineResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListUnknownThreatDetectMachineResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListUnknownThreatDetectMachineResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListUnknownThreatDetectMachineResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
