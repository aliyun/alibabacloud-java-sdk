// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeIdcProbeScanResultListResponseBody extends TeaModel {
    /**
     * <p>The instances.</p>
     */
    @NameInMap("Instances")
    public java.util.List<DescribeIdcProbeScanResultListResponseBodyInstances> instances;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeIdcProbeScanResultListResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A3D7C47D-3F11-57BB-90E8-E5C20C61****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeIdcProbeScanResultListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIdcProbeScanResultListResponseBody self = new DescribeIdcProbeScanResultListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIdcProbeScanResultListResponseBody setInstances(java.util.List<DescribeIdcProbeScanResultListResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeIdcProbeScanResultListResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public DescribeIdcProbeScanResultListResponseBody setPageInfo(DescribeIdcProbeScanResultListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeIdcProbeScanResultListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeIdcProbeScanResultListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeIdcProbeScanResultListResponseBodyInstances extends TeaModel {
        /**
         * <p>The status of the client of the instance on which the probe is installed. Valid values:</p>
         * <ul>
         * <li><strong>online</strong>: The Security Center agent on the asset is <strong>enabled</strong>.</li>
         * <li><strong>offline</strong>: The Security Center agent on the asset is <strong>disabled</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("ClientStatus")
        public String clientStatus;

        /**
         * <p>The name of the IDC.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("IdcName")
        public String idcName;

        /**
         * <p>The CIDR blocks.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.2.0/24</p>
         */
        @NameInMap("IpSegment")
        public String ipSegment;

        /**
         * <p>The timestamp when the last scan was performed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1720006818000</p>
         */
        @NameInMap("LastScanTime")
        public Long lastScanTime;

        /**
         * <p>The operating system type of the asset. Valid values:</p>
         * <ul>
         * <li><strong>windows</strong></li>
         * <li><strong>linux</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Linux</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>The private IP address of the associated instance.</p>
         * 
         * <strong>example:</strong>
         * <p>42.121.<em>.</em></p>
         */
        @NameInMap("ProbeInternetIp")
        public String probeInternetIp;

        /**
         * <p>The private IP address of the associated instance.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.<em>.</em></p>
         */
        @NameInMap("ProbeIntranetIp")
        public String probeIntranetIp;

        /**
         * <p>The name of the associated instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-xxxx</p>
         */
        @NameInMap("ProbeMachineName")
        public String probeMachineName;

        /**
         * <p>The UUID of the associated instance.</p>
         * 
         * <strong>example:</strong>
         * <p>11C96623-E106-59C9-866D-A6C82911****</p>
         */
        @NameInMap("ProbeUuid")
        public String probeUuid;

        /**
         * <p>The ID of the scan result.</p>
         * 
         * <strong>example:</strong>
         * <p>1231</p>
         */
        @NameInMap("ScanResultId")
        public Long scanResultId;

        /**
         * <p>The IP address that is scanned.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.<em>.</em></p>
         */
        @NameInMap("ScannedIp")
        public String scannedIp;

        /**
         * <p>The port that is scanned.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("ValidPort")
        public String validPort;

        public static DescribeIdcProbeScanResultListResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeIdcProbeScanResultListResponseBodyInstances self = new DescribeIdcProbeScanResultListResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeIdcProbeScanResultListResponseBodyInstances setClientStatus(String clientStatus) {
            this.clientStatus = clientStatus;
            return this;
        }
        public String getClientStatus() {
            return this.clientStatus;
        }

        public DescribeIdcProbeScanResultListResponseBodyInstances setIdcName(String idcName) {
            this.idcName = idcName;
            return this;
        }
        public String getIdcName() {
            return this.idcName;
        }

        public DescribeIdcProbeScanResultListResponseBodyInstances setIpSegment(String ipSegment) {
            this.ipSegment = ipSegment;
            return this;
        }
        public String getIpSegment() {
            return this.ipSegment;
        }

        public DescribeIdcProbeScanResultListResponseBodyInstances setLastScanTime(Long lastScanTime) {
            this.lastScanTime = lastScanTime;
            return this;
        }
        public Long getLastScanTime() {
            return this.lastScanTime;
        }

        public DescribeIdcProbeScanResultListResponseBodyInstances setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeIdcProbeScanResultListResponseBodyInstances setProbeInternetIp(String probeInternetIp) {
            this.probeInternetIp = probeInternetIp;
            return this;
        }
        public String getProbeInternetIp() {
            return this.probeInternetIp;
        }

        public DescribeIdcProbeScanResultListResponseBodyInstances setProbeIntranetIp(String probeIntranetIp) {
            this.probeIntranetIp = probeIntranetIp;
            return this;
        }
        public String getProbeIntranetIp() {
            return this.probeIntranetIp;
        }

        public DescribeIdcProbeScanResultListResponseBodyInstances setProbeMachineName(String probeMachineName) {
            this.probeMachineName = probeMachineName;
            return this;
        }
        public String getProbeMachineName() {
            return this.probeMachineName;
        }

        public DescribeIdcProbeScanResultListResponseBodyInstances setProbeUuid(String probeUuid) {
            this.probeUuid = probeUuid;
            return this;
        }
        public String getProbeUuid() {
            return this.probeUuid;
        }

        public DescribeIdcProbeScanResultListResponseBodyInstances setScanResultId(Long scanResultId) {
            this.scanResultId = scanResultId;
            return this;
        }
        public Long getScanResultId() {
            return this.scanResultId;
        }

        public DescribeIdcProbeScanResultListResponseBodyInstances setScannedIp(String scannedIp) {
            this.scannedIp = scannedIp;
            return this;
        }
        public String getScannedIp() {
            return this.scannedIp;
        }

        public DescribeIdcProbeScanResultListResponseBodyInstances setValidPort(String validPort) {
            this.validPort = validPort;
            return this;
        }
        public String getValidPort() {
            return this.validPort;
        }

    }

    public static class DescribeIdcProbeScanResultListResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
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

        public static DescribeIdcProbeScanResultListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeIdcProbeScanResultListResponseBodyPageInfo self = new DescribeIdcProbeScanResultListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeIdcProbeScanResultListResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeIdcProbeScanResultListResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeIdcProbeScanResultListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeIdcProbeScanResultListResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
