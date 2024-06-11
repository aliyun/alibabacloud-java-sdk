// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulDefendCountStatisticsRequest extends TeaModel {
    @NameInMap("VulType")
    public String vulType;

    public static DescribeVulDefendCountStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulDefendCountStatisticsRequest self = new DescribeVulDefendCountStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVulDefendCountStatisticsRequest setVulType(String vulType) {
        this.vulType = vulType;
        return this;
    }
    public String getVulType() {
        return this.vulType;
    }

}
