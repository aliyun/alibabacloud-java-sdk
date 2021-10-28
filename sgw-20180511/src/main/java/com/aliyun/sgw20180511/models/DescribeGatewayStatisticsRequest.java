// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayStatisticsRequest extends TeaModel {
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    @NameInMap("GatewayCategory")
    public String gatewayCategory;

    @NameInMap("GatewayLocation")
    public String gatewayLocation;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    @NameInMap("TargetAccountId")
    public String targetAccountId;

    public static DescribeGatewayStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayStatisticsRequest self = new DescribeGatewayStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayStatisticsRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeGatewayStatisticsRequest setGatewayCategory(String gatewayCategory) {
        this.gatewayCategory = gatewayCategory;
        return this;
    }
    public String getGatewayCategory() {
        return this.gatewayCategory;
    }

    public DescribeGatewayStatisticsRequest setGatewayLocation(String gatewayLocation) {
        this.gatewayLocation = gatewayLocation;
        return this;
    }
    public String getGatewayLocation() {
        return this.gatewayLocation;
    }

    public DescribeGatewayStatisticsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeGatewayStatisticsRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public DescribeGatewayStatisticsRequest setTargetAccountId(String targetAccountId) {
        this.targetAccountId = targetAccountId;
        return this;
    }
    public String getTargetAccountId() {
        return this.targetAccountId;
    }

}
