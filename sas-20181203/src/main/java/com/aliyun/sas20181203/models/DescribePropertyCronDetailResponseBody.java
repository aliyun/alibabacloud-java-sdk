// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyCronDetailResponseBody extends TeaModel {
    /**
     * <p>The username of the account that runs the scheduled task.</p>
     */
    @NameInMap("PageInfo")
    public DescribePropertyCronDetailResponseBodyPageInfo pageInfo;

    /**
     * <p>10</p>
     */
    @NameInMap("Propertys")
    public java.util.List<DescribePropertyCronDetailResponseBodyPropertys> propertys;

    /**
     * <p>The username of the account that runs the scheduled task.</p>
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
         * <p>The path to the scheduled task.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The UUID of the server.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The interval at which the scheduled task is performed.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The number of entries returned on the current page.</p>
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
         * <p>The number of the page to return. Default value: **1**.</p>
         */
        @NameInMap("Cmd")
        public String cmd;

        /**
         * <p>DescribePropertyCronDetail</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The IP addresses of the server.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The pagination information.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The name of the server.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The ID of the server.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>Queries the details of scheduled tasks on the Host page.</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>The number of entries returned per page. Default value: **10**.</p>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <p>The MD5 hash value of the path to the scheduled task.</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>root</p>
         */
        @NameInMap("User")
        public String user;

        /**
         * <p>The UUID of the server.</p>
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
