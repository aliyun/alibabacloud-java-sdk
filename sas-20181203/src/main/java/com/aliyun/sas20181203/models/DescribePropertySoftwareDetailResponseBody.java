// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertySoftwareDetailResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribePropertySoftwareDetailResponseBodyPageInfo pageInfo;

    /**
     * <p>The details of the software asset.</p>
     */
    @NameInMap("Propertys")
    public java.util.List<DescribePropertySoftwareDetailResponseBodyPropertys> propertys;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6AEE7412-0065-1135-B790-AE2C38BA68FB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePropertySoftwareDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertySoftwareDetailResponseBody self = new DescribePropertySoftwareDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePropertySoftwareDetailResponseBody setPageInfo(DescribePropertySoftwareDetailResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribePropertySoftwareDetailResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribePropertySoftwareDetailResponseBody setPropertys(java.util.List<DescribePropertySoftwareDetailResponseBodyPropertys> propertys) {
        this.propertys = propertys;
        return this;
    }
    public java.util.List<DescribePropertySoftwareDetailResponseBodyPropertys> getPropertys() {
        return this.propertys;
    }

    public DescribePropertySoftwareDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePropertySoftwareDetailResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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

        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The number of entries per page. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribePropertySoftwareDetailResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertySoftwareDetailResponseBodyPageInfo self = new DescribePropertySoftwareDetailResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribePropertySoftwareDetailResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribePropertySoftwareDetailResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribePropertySoftwareDetailResponseBodyPageInfo setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribePropertySoftwareDetailResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribePropertySoftwareDetailResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribePropertySoftwareDetailResponseBodyPropertys extends TeaModel {
        /**
         * <p>The timestamp generated when the last asset fingerprint collection is performed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649149566000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The time at which the software is installed.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-07 10:54:49</p>
         */
        @NameInMap("InstallTime")
        public String installTime;

        /**
         * <p>The timestamp generated when the software is installed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649066826000</p>
         */
        @NameInMap("InstallTimeDt")
        public Long installTimeDt;

        /**
         * <p>The ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>i-hp35tftuh52wbp1g****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>hc-host-****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>100.104.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The IP addresses of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The name of the software.</p>
         * 
         * <strong>example:</strong>
         * <p>aaa_base</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The installation path of the software.</p>
         * 
         * <strong>example:</strong>
         * <p>/etc/test</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>162eb349-c2d9-4f8b-805c-75b43d4c****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The version of the software.</p>
         * 
         * <strong>example:</strong>
         * <p>3.10.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribePropertySoftwareDetailResponseBodyPropertys build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertySoftwareDetailResponseBodyPropertys self = new DescribePropertySoftwareDetailResponseBodyPropertys();
            return TeaModel.build(map, self);
        }

        public DescribePropertySoftwareDetailResponseBodyPropertys setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribePropertySoftwareDetailResponseBodyPropertys setInstallTime(String installTime) {
            this.installTime = installTime;
            return this;
        }
        public String getInstallTime() {
            return this.installTime;
        }

        public DescribePropertySoftwareDetailResponseBodyPropertys setInstallTimeDt(Long installTimeDt) {
            this.installTimeDt = installTimeDt;
            return this;
        }
        public Long getInstallTimeDt() {
            return this.installTimeDt;
        }

        public DescribePropertySoftwareDetailResponseBodyPropertys setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePropertySoftwareDetailResponseBodyPropertys setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribePropertySoftwareDetailResponseBodyPropertys setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribePropertySoftwareDetailResponseBodyPropertys setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribePropertySoftwareDetailResponseBodyPropertys setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribePropertySoftwareDetailResponseBodyPropertys setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePropertySoftwareDetailResponseBodyPropertys setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribePropertySoftwareDetailResponseBodyPropertys setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribePropertySoftwareDetailResponseBodyPropertys setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
