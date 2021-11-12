// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class ListVpcInfoByVpcResponseBody extends TeaModel {
    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VpcInfos")
    public ListVpcInfoByVpcResponseBodyVpcInfos vpcInfos;

    public static ListVpcInfoByVpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcInfoByVpcResponseBody self = new ListVpcInfoByVpcResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcInfoByVpcResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListVpcInfoByVpcResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListVpcInfoByVpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVpcInfoByVpcResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListVpcInfoByVpcResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public ListVpcInfoByVpcResponseBody setVpcInfos(ListVpcInfoByVpcResponseBodyVpcInfos vpcInfos) {
        this.vpcInfos = vpcInfos;
        return this;
    }
    public ListVpcInfoByVpcResponseBodyVpcInfos getVpcInfos() {
        return this.vpcInfos;
    }

    public static class ListVpcInfoByVpcResponseBodyVpcInfosVpcInfo extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceVpcName")
        public String instanceVpcName;

        @NameInMap("RegionNo")
        public String regionNo;

        public static ListVpcInfoByVpcResponseBodyVpcInfosVpcInfo build(java.util.Map<String, ?> map) throws Exception {
            ListVpcInfoByVpcResponseBodyVpcInfosVpcInfo self = new ListVpcInfoByVpcResponseBodyVpcInfosVpcInfo();
            return TeaModel.build(map, self);
        }

        public ListVpcInfoByVpcResponseBodyVpcInfosVpcInfo setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListVpcInfoByVpcResponseBodyVpcInfosVpcInfo setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListVpcInfoByVpcResponseBodyVpcInfosVpcInfo setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListVpcInfoByVpcResponseBodyVpcInfosVpcInfo setInstanceVpcName(String instanceVpcName) {
            this.instanceVpcName = instanceVpcName;
            return this;
        }
        public String getInstanceVpcName() {
            return this.instanceVpcName;
        }

        public ListVpcInfoByVpcResponseBodyVpcInfosVpcInfo setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

    }

    public static class ListVpcInfoByVpcResponseBodyVpcInfos extends TeaModel {
        @NameInMap("VpcInfo")
        public java.util.List<ListVpcInfoByVpcResponseBodyVpcInfosVpcInfo> vpcInfo;

        public static ListVpcInfoByVpcResponseBodyVpcInfos build(java.util.Map<String, ?> map) throws Exception {
            ListVpcInfoByVpcResponseBodyVpcInfos self = new ListVpcInfoByVpcResponseBodyVpcInfos();
            return TeaModel.build(map, self);
        }

        public ListVpcInfoByVpcResponseBodyVpcInfos setVpcInfo(java.util.List<ListVpcInfoByVpcResponseBodyVpcInfosVpcInfo> vpcInfo) {
            this.vpcInfo = vpcInfo;
            return this;
        }
        public java.util.List<ListVpcInfoByVpcResponseBodyVpcInfosVpcInfo> getVpcInfo() {
            return this.vpcInfo;
        }

    }

}
