// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyCronDetailResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public DescribePropertyCronDetailResponseBodyPageInfo pageInfo;

    @NameInMap("Propertys")
    public java.util.List<DescribePropertyCronDetailResponseBodyPropertys> propertys;

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
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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
        @NameInMap("Cmd")
        public String cmd;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("Period")
        public String period;

        @NameInMap("Source")
        public String source;

        @NameInMap("User")
        public String user;

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
