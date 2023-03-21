// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyPortDetailResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public DescribePropertyPortDetailResponseBodyPageInfo pageInfo;

    @NameInMap("Propertys")
    public java.util.List<DescribePropertyPortDetailResponseBodyPropertys> propertys;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePropertyPortDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyPortDetailResponseBody self = new DescribePropertyPortDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePropertyPortDetailResponseBody setPageInfo(DescribePropertyPortDetailResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribePropertyPortDetailResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribePropertyPortDetailResponseBody setPropertys(java.util.List<DescribePropertyPortDetailResponseBodyPropertys> propertys) {
        this.propertys = propertys;
        return this;
    }
    public java.util.List<DescribePropertyPortDetailResponseBodyPropertys> getPropertys() {
        return this.propertys;
    }

    public DescribePropertyPortDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePropertyPortDetailResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribePropertyPortDetailResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyPortDetailResponseBodyPageInfo self = new DescribePropertyPortDetailResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribePropertyPortDetailResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribePropertyPortDetailResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribePropertyPortDetailResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribePropertyPortDetailResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribePropertyPortDetailResponseBodyPropertys extends TeaModel {
        @NameInMap("BindIp")
        public String bindIp;

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

        @NameInMap("Pid")
        public String pid;

        @NameInMap("Port")
        public String port;

        @NameInMap("ProcName")
        public String procName;

        @NameInMap("Proto")
        public String proto;

        @NameInMap("Uuid")
        public String uuid;

        public static DescribePropertyPortDetailResponseBodyPropertys build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyPortDetailResponseBodyPropertys self = new DescribePropertyPortDetailResponseBodyPropertys();
            return TeaModel.build(map, self);
        }

        public DescribePropertyPortDetailResponseBodyPropertys setBindIp(String bindIp) {
            this.bindIp = bindIp;
            return this;
        }
        public String getBindIp() {
            return this.bindIp;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setProcName(String procName) {
            this.procName = procName;
            return this;
        }
        public String getProcName() {
            return this.procName;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setProto(String proto) {
            this.proto = proto;
            return this;
        }
        public String getProto() {
            return this.proto;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
