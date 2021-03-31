// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListVpcsResponseBody extends TeaModel {
    // 代码源配置列表
    @NameInMap("Vpcs")
    public java.util.List<ListVpcsResponseBodyVpcs> vpcs;

    // 符合过滤条件的代码源配置的总数量
    @NameInMap("TotalCount")
    public Long totalCount;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    public static ListVpcsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcsResponseBody self = new ListVpcsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcsResponseBody setVpcs(java.util.List<ListVpcsResponseBodyVpcs> vpcs) {
        this.vpcs = vpcs;
        return this;
    }
    public java.util.List<ListVpcsResponseBodyVpcs> getVpcs() {
        return this.vpcs;
    }

    public ListVpcsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListVpcsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVpcsResponseBodyVpcs extends TeaModel {
        // vpc的id
        @NameInMap("VpcId")
        public String vpcId;

        // VPC的名称。
        @NameInMap("VpcName")
        public String vpcName;

        public static ListVpcsResponseBodyVpcs build(java.util.Map<String, ?> map) throws Exception {
            ListVpcsResponseBodyVpcs self = new ListVpcsResponseBodyVpcs();
            return TeaModel.build(map, self);
        }

        public ListVpcsResponseBodyVpcs setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListVpcsResponseBodyVpcs setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

}
