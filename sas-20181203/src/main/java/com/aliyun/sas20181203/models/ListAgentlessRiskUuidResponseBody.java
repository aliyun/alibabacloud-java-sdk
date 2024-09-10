// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAgentlessRiskUuidResponseBody extends TeaModel {
    /**
     * <p>The information about the hosts.</p>
     */
    @NameInMap("List")
    public java.util.List<ListAgentlessRiskUuidResponseBodyList> list;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListAgentlessRiskUuidResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>05AE6B16-741A-5A75-9BF0-BC747DD9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAgentlessRiskUuidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentlessRiskUuidResponseBody self = new ListAgentlessRiskUuidResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentlessRiskUuidResponseBody setList(java.util.List<ListAgentlessRiskUuidResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListAgentlessRiskUuidResponseBodyList> getList() {
        return this.list;
    }

    public ListAgentlessRiskUuidResponseBody setPageInfo(ListAgentlessRiskUuidResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListAgentlessRiskUuidResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListAgentlessRiskUuidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAgentlessRiskUuidResponseBodyList extends TeaModel {
        /**
         * <p>The number of baseline risks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BaselineCount")
        public Integer baselineCount;

        /**
         * <p>The instance ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp1g6wxdwps7s9dz****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>sql-test-0****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>8.210.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>172.25.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The number of malicious samples.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaliciousCount")
        public Integer maliciousCount;

        /**
         * <p>The timestamp of the detection. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>168257753****</p>
         */
        @NameInMap("ScanTime")
        public Long scanTime;

        /**
         * <p>The ID of the asset that is detected.</p>
         * 
         * <strong>example:</strong>
         * <p>30****</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The name of the asset that is detected.</p>
         * 
         * <strong>example:</strong>
         * <p>test****</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>49e25e0f-bb51-4a5a-a1b3-13a4ddaa****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The number of detected vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VulCount")
        public Integer vulCount;

        public static ListAgentlessRiskUuidResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListAgentlessRiskUuidResponseBodyList self = new ListAgentlessRiskUuidResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListAgentlessRiskUuidResponseBodyList setBaselineCount(Integer baselineCount) {
            this.baselineCount = baselineCount;
            return this;
        }
        public Integer getBaselineCount() {
            return this.baselineCount;
        }

        public ListAgentlessRiskUuidResponseBodyList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAgentlessRiskUuidResponseBodyList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListAgentlessRiskUuidResponseBodyList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public ListAgentlessRiskUuidResponseBodyList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public ListAgentlessRiskUuidResponseBodyList setMaliciousCount(Integer maliciousCount) {
            this.maliciousCount = maliciousCount;
            return this;
        }
        public Integer getMaliciousCount() {
            return this.maliciousCount;
        }

        public ListAgentlessRiskUuidResponseBodyList setScanTime(Long scanTime) {
            this.scanTime = scanTime;
            return this;
        }
        public Long getScanTime() {
            return this.scanTime;
        }

        public ListAgentlessRiskUuidResponseBodyList setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ListAgentlessRiskUuidResponseBodyList setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public ListAgentlessRiskUuidResponseBodyList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public ListAgentlessRiskUuidResponseBodyList setVulCount(Integer vulCount) {
            this.vulCount = vulCount;
            return this;
        }
        public Integer getVulCount() {
            return this.vulCount;
        }

    }

    public static class ListAgentlessRiskUuidResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
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
         * <p>69</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAgentlessRiskUuidResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAgentlessRiskUuidResponseBodyPageInfo self = new ListAgentlessRiskUuidResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListAgentlessRiskUuidResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListAgentlessRiskUuidResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAgentlessRiskUuidResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
