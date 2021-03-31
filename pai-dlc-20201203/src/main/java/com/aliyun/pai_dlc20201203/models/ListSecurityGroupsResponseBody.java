// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListSecurityGroupsResponseBody extends TeaModel {
    // 代码源配置列表
    @NameInMap("SecurityGroups")
    public java.util.List<ListSecurityGroupsResponseBodySecurityGroups> securityGroups;

    // 符合过滤条件的代码源配置的总数量
    @NameInMap("TotalCount")
    public Long totalCount;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    public static ListSecurityGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityGroupsResponseBody self = new ListSecurityGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSecurityGroupsResponseBody setSecurityGroups(java.util.List<ListSecurityGroupsResponseBodySecurityGroups> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }
    public java.util.List<ListSecurityGroupsResponseBodySecurityGroups> getSecurityGroups() {
        return this.securityGroups;
    }

    public ListSecurityGroupsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListSecurityGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSecurityGroupsResponseBodySecurityGroups extends TeaModel {
        // 安全组Id
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        // 安全组名称
        @NameInMap("SecurityGroupName")
        public String securityGroupName;

        // 所属VPC ID
        @NameInMap("VpcId")
        public String vpcId;

        // 描述
        @NameInMap("Description")
        public String description;

        public static ListSecurityGroupsResponseBodySecurityGroups build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityGroupsResponseBodySecurityGroups self = new ListSecurityGroupsResponseBodySecurityGroups();
            return TeaModel.build(map, self);
        }

        public ListSecurityGroupsResponseBodySecurityGroups setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListSecurityGroupsResponseBodySecurityGroups setSecurityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        public ListSecurityGroupsResponseBodySecurityGroups setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListSecurityGroupsResponseBodySecurityGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
