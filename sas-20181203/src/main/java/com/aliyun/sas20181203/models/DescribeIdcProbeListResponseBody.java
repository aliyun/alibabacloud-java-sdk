// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeIdcProbeListResponseBody extends TeaModel {
    /**
     * <p>IDC probe list.</p>
     */
    @NameInMap("IdcProbes")
    public java.util.List<DescribeIdcProbeListResponseBodyIdcProbes> idcProbes;

    /**
     * <p>Pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeIdcProbeListResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of this call request, which is a unique identifier generated by Alibaba Cloud for the request and can be used for troubleshooting and problem localization.</p>
     * 
     * <strong>example:</strong>
     * <p>0C8487EF-50C2-54BB-8634-10F8C35D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeIdcProbeListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIdcProbeListResponseBody self = new DescribeIdcProbeListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIdcProbeListResponseBody setIdcProbes(java.util.List<DescribeIdcProbeListResponseBodyIdcProbes> idcProbes) {
        this.idcProbes = idcProbes;
        return this;
    }
    public java.util.List<DescribeIdcProbeListResponseBodyIdcProbes> getIdcProbes() {
        return this.idcProbes;
    }

    public DescribeIdcProbeListResponseBody setPageInfo(DescribeIdcProbeListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeIdcProbeListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeIdcProbeListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeIdcProbeListResponseBodyIdcProbes extends TeaModel {
        /**
         * <p>IDC data center name.</p>
         * 
         * <strong>example:</strong>
         * <p>3K IDC</p>
         */
        @NameInMap("IdcName")
        public String idcName;

        /**
         * <p>Region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("IdcRegion")
        public String idcRegion;

        /**
         * <p>Instance ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>i-xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>oraclexxx</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>47.98.<em>.</em></p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>Scan period.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("IntervalPeriod")
        public Integer intervalPeriod;

        /**
         * <p>Private IP of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10.68.<em>.</em></p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>IP segment range.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24</p>
         */
        @NameInMap("IpSegments")
        public String ipSegments;

        /**
         * <p>Linux port.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("LinuxPort")
        public String linuxPort;

        /**
         * <p>The unit of the scan period, with values:</p>
         * <ul>
         * <li><strong>day</strong>: day.</li>
         * <li><strong>hour</strong>: hour.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <p>Probe service status. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Active</li>
         * <li><strong>1</strong>: Inactive</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ServiceStatus")
        public Integer serviceStatus;

        /**
         * <p>Probe status. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Enabled</li>
         * <li><strong>1</strong>: Disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>Server UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>inet-eae02b9a-1dbd-44a6-844c-69072b27****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>Windows port.</p>
         * 
         * <strong>example:</strong>
         * <p>3389</p>
         */
        @NameInMap("WinPort")
        public String winPort;

        public static DescribeIdcProbeListResponseBodyIdcProbes build(java.util.Map<String, ?> map) throws Exception {
            DescribeIdcProbeListResponseBodyIdcProbes self = new DescribeIdcProbeListResponseBodyIdcProbes();
            return TeaModel.build(map, self);
        }

        public DescribeIdcProbeListResponseBodyIdcProbes setIdcName(String idcName) {
            this.idcName = idcName;
            return this;
        }
        public String getIdcName() {
            return this.idcName;
        }

        public DescribeIdcProbeListResponseBodyIdcProbes setIdcRegion(String idcRegion) {
            this.idcRegion = idcRegion;
            return this;
        }
        public String getIdcRegion() {
            return this.idcRegion;
        }

        public DescribeIdcProbeListResponseBodyIdcProbes setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeIdcProbeListResponseBodyIdcProbes setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeIdcProbeListResponseBodyIdcProbes setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeIdcProbeListResponseBodyIdcProbes setIntervalPeriod(Integer intervalPeriod) {
            this.intervalPeriod = intervalPeriod;
            return this;
        }
        public Integer getIntervalPeriod() {
            return this.intervalPeriod;
        }

        public DescribeIdcProbeListResponseBodyIdcProbes setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeIdcProbeListResponseBodyIdcProbes setIpSegments(String ipSegments) {
            this.ipSegments = ipSegments;
            return this;
        }
        public String getIpSegments() {
            return this.ipSegments;
        }

        public DescribeIdcProbeListResponseBodyIdcProbes setLinuxPort(String linuxPort) {
            this.linuxPort = linuxPort;
            return this;
        }
        public String getLinuxPort() {
            return this.linuxPort;
        }

        public DescribeIdcProbeListResponseBodyIdcProbes setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DescribeIdcProbeListResponseBodyIdcProbes setServiceStatus(Integer serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public Integer getServiceStatus() {
            return this.serviceStatus;
        }

        public DescribeIdcProbeListResponseBodyIdcProbes setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeIdcProbeListResponseBodyIdcProbes setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeIdcProbeListResponseBodyIdcProbes setWinPort(String winPort) {
            this.winPort = winPort;
            return this;
        }
        public String getWinPort() {
            return this.winPort;
        }

    }

    public static class DescribeIdcProbeListResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of data entries displayed on the current page in a paginated query.</p>
         * 
         * <strong>example:</strong>
         * <p>17</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number in a paginated query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The maximum number of data entries to display per page in a paginated query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeIdcProbeListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeIdcProbeListResponseBodyPageInfo self = new DescribeIdcProbeListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeIdcProbeListResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeIdcProbeListResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeIdcProbeListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeIdcProbeListResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
