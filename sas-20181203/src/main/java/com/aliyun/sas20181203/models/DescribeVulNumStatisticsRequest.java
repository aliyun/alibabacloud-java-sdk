// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulNumStatisticsRequest extends TeaModel {
    /**
     * <p>The source of the request.</p>
     * <ul>
     * <li>If you want to query Security Center-related data, set the value to <strong>sas</strong>.</li>
     * <li>If you want to query Server Guard-related data, you do not need to specify this parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
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
