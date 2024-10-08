// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyCronDetailResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribePropertyCronDetailResponseBodyPageInfo pageInfo;

    /**
     * <p>The details of the scheduled tasks.</p>
     */
    @NameInMap("Propertys")
    public java.util.List<DescribePropertyCronDetailResponseBodyPropertys> propertys;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>B0C4E12E-CCE1-109D-9E62-7B95CBBAEF8C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePropertyCronDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyCronDetailResponseBody self = new DescribePropertyCronDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePropertyCronDetailResponseBody setPageInfo(DescribePropertyCronDetailResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribePropertyCronDetailResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribePropertyCronDetailResponseBody setPropertys(java.util.List<DescribePropertyCronDetailResponseBodyPropertys> propertys) {
        this.propertys = propertys;
        return this;
    }
    public java.util.List<DescribePropertyCronDetailResponseBodyPropertys> getPropertys() {
        return this.propertys;
    }

    public DescribePropertyCronDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePropertyCronDetailResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page. Default value: <strong>10</strong>.</p>
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

        public static DescribePropertyCronDetailResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyCronDetailResponseBodyPageInfo self = new DescribePropertyCronDetailResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribePropertyCronDetailResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribePropertyCronDetailResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribePropertyCronDetailResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribePropertyCronDetailResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribePropertyCronDetailResponseBodyPropertys extends TeaModel {
        /**
         * <p>The command that is used to run the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/lib64/sa/sa1 1 1</p>
         */
        @NameInMap("Cmd")
        public String cmd;

        /**
         * <p>The timestamp of the last fingerprint collection. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649149566000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

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
         * <p>The MD5 hash value of the path to the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>4cc8f97c2bf9cbabb2c2be2erqw****</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>The interval at which the scheduled task is performed.</p>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <p>The path to the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>/etc/cron.d/root</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The username of the account that runs the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("User")
        public String user;

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>162eb349-c2d9-4f8b-805c-75b43d4c****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribePropertyCronDetailResponseBodyPropertys build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyCronDetailResponseBodyPropertys self = new DescribePropertyCronDetailResponseBodyPropertys();
            return TeaModel.build(map, self);
        }

        public DescribePropertyCronDetailResponseBodyPropertys setCmd(String cmd) {
            this.cmd = cmd;
            return this;
        }
        public String getCmd() {
            return this.cmd;
        }

        public DescribePropertyCronDetailResponseBodyPropertys setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribePropertyCronDetailResponseBodyPropertys setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePropertyCronDetailResponseBodyPropertys setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribePropertyCronDetailResponseBodyPropertys setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribePropertyCronDetailResponseBodyPropertys setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribePropertyCronDetailResponseBodyPropertys setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribePropertyCronDetailResponseBodyPropertys setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public DescribePropertyCronDetailResponseBodyPropertys setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public DescribePropertyCronDetailResponseBodyPropertys setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribePropertyCronDetailResponseBodyPropertys setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public DescribePropertyCronDetailResponseBodyPropertys setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
