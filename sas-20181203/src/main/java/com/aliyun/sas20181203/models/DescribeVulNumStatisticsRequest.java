// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulNumStatisticsRequest extends TeaModel {
    /**
     * <p>The source of the request. Set the value to sas.</p>
     */
    @NameInMap("From")
    public String from;

    public static DescribeVulNumStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulNumStatisticsRequest self = new DescribeVulNumStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVulNumStatisticsRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

}
