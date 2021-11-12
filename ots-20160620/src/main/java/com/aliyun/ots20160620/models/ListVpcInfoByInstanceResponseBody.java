// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class ListVpcInfoByInstanceResponseBody extends TeaModel {
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("VpcInfos")
    public ListVpcInfoByInstanceResponseBodyVpcInfos vpcInfos;

    public static ListVpcInfoByInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcInfoByInstanceResponseBody self = new ListVpcInfoByInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcInfoByInstanceResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ListVpcInfoByInstanceResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListVpcInfoByInstanceResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListVpcInfoByInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVpcInfoByInstanceResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListVpcInfoByInstanceResponseBody setVpcInfos(ListVpcInfoByInstanceResponseBodyVpcInfos vpcInfos) {
        this.vpcInfos = vpcInfos;
        return this;
    }
    public ListVpcInfoByInstanceResponseBodyVpcInfos getVpcInfos() {
        return this.vpcInfos;
    }

    public static class ListVpcInfoByInstanceResponseBodyVpcInfosVpcInfo extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("InstanceVpcName")
        public String instanceVpcName;

        @NameInMap("RegionNo")
        public String regionNo;

        @NameInMap("VpcId")
        public String vpcId;

        public static ListVpcInfoByInstanceResponseBodyVpcInfosVpcInfo build(java.util.Map<String, ?> map) throws Exception {
            ListVpcInfoByInstanceResponseBodyVpcInfosVpcInfo self = new ListVpcInfoByInstanceResponseBodyVpcInfosVpcInfo();
            return TeaModel.build(map, self);
        }

        public ListVpcInfoByInstanceResponseBodyVpcInfosVpcInfo setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListVpcInfoByInstanceResponseBodyVpcInfosVpcInfo setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListVpcInfoByInstanceResponseBodyVpcInfosVpcInfo setInstanceVpcName(String instanceVpcName) {
            this.instanceVpcName = instanceVpcName;
            return this;
        }
        public String getInstanceVpcName() {
            return this.instanceVpcName;
        }

        public ListVpcInfoByInstanceResponseBodyVpcInfosVpcInfo setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public ListVpcInfoByInstanceResponseBodyVpcInfosVpcInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListVpcInfoByInstanceResponseBodyVpcInfos extends TeaModel {
        @NameInMap("VpcInfo")
        public java.util.List<ListVpcInfoByInstanceResponseBodyVpcInfosVpcInfo> vpcInfo;

        public static ListVpcInfoByInstanceResponseBodyVpcInfos build(java.util.Map<String, ?> map) throws Exception {
            ListVpcInfoByInstanceResponseBodyVpcInfos self = new ListVpcInfoByInstanceResponseBodyVpcInfos();
            return TeaModel.build(map, self);
        }

        public ListVpcInfoByInstanceResponseBodyVpcInfos setVpcInfo(java.util.List<ListVpcInfoByInstanceResponseBodyVpcInfosVpcInfo> vpcInfo) {
            this.vpcInfo = vpcInfo;
            return this;
        }
        public java.util.List<ListVpcInfoByInstanceResponseBodyVpcInfosVpcInfo> getVpcInfo() {
            return this.vpcInfo;
        }

    }

}
