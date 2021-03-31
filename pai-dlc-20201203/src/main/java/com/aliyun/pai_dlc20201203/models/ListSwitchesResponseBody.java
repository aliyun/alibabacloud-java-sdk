// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListSwitchesResponseBody extends TeaModel {
    // 代码源配置列表
    @NameInMap("Switches")
    public java.util.List<ListSwitchesResponseBodySwitches> switches;

    // 符合过滤条件的代码源配置的总数量
    @NameInMap("TotalCount")
    public Long totalCount;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    public static ListSwitchesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSwitchesResponseBody self = new ListSwitchesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSwitchesResponseBody setSwitches(java.util.List<ListSwitchesResponseBodySwitches> switches) {
        this.switches = switches;
        return this;
    }
    public java.util.List<ListSwitchesResponseBodySwitches> getSwitches() {
        return this.switches;
    }

    public ListSwitchesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListSwitchesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSwitchesResponseBodySwitches extends TeaModel {
        // 交换机id
        @NameInMap("VSwitchId")
        public String vSwitchId;

        // 交换机名称
        @NameInMap("VSwitchName")
        public String vSwitchName;

        // 所属VPCid
        @NameInMap("VpcId")
        public String vpcId;

        // 描述
        @NameInMap("Description")
        public String description;

        // 网段
        @NameInMap("CidrBlock")
        public String cidrBlock;

        public static ListSwitchesResponseBodySwitches build(java.util.Map<String, ?> map) throws Exception {
            ListSwitchesResponseBodySwitches self = new ListSwitchesResponseBodySwitches();
            return TeaModel.build(map, self);
        }

        public ListSwitchesResponseBodySwitches setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListSwitchesResponseBodySwitches setVSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }
        public String getVSwitchName() {
            return this.vSwitchName;
        }

        public ListSwitchesResponseBodySwitches setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListSwitchesResponseBodySwitches setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSwitchesResponseBodySwitches setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

    }

}
