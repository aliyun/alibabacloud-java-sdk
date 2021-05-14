// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyPortDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageInfo")
    public DescribePropertyPortDetailResponseBodyPageInfo pageInfo;

    @NameInMap("Propertys")
    public java.util.List<DescribePropertyPortDetailResponseBodyPropertys> propertys;

    public static DescribePropertyPortDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyPortDetailResponseBody self = new DescribePropertyPortDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePropertyPortDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public static class DescribePropertyPortDetailResponseBodyPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Count")
        public Integer count;

        public static DescribePropertyPortDetailResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyPortDetailResponseBodyPageInfo self = new DescribePropertyPortDetailResponseBodyPageInfo();
            return TeaModel.build(map, self);
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

        public DescribePropertyPortDetailResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class DescribePropertyPortDetailResponseBodyPropertys extends TeaModel {
        @NameInMap("Create")
        public String create;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("BindIp")
        public String bindIp;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("ProcName")
        public String procName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Port")
        public String port;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Proto")
        public String proto;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        public static DescribePropertyPortDetailResponseBodyPropertys build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyPortDetailResponseBodyPropertys self = new DescribePropertyPortDetailResponseBodyPropertys();
            return TeaModel.build(map, self);
        }

        public DescribePropertyPortDetailResponseBodyPropertys setCreate(String create) {
            this.create = create;
            return this;
        }
        public String getCreate() {
            return this.create;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setBindIp(String bindIp) {
            this.bindIp = bindIp;
            return this;
        }
        public String getBindIp() {
            return this.bindIp;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setProcName(String procName) {
            this.procName = procName;
            return this;
        }
        public String getProcName() {
            return this.procName;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setProto(String proto) {
            this.proto = proto;
            return this;
        }
        public String getProto() {
            return this.proto;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

    }

}
