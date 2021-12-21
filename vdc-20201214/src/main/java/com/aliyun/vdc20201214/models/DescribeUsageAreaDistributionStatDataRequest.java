// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeUsageAreaDistributionStatDataRequest extends TeaModel {
    // APP ID
    @NameInMap("AppId")
    public String appId;

    // 结束时间，秒级时间戳，如1609344000
    @NameInMap("EndDate")
    public String endDate;

    // 父级地区名称，为空取世界范围（国家维度）的统计，如： ""->中国、英国 "中国"->北京市、广东省 "广东省"->广州市、深圳市、佛山市 "北京市"->北京市
    @NameInMap("ParentArea")
    public String parentArea;

    // 开始时间，秒级时间戳，如1609344000
    @NameInMap("StartDate")
    public String startDate;

    public static DescribeUsageAreaDistributionStatDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsageAreaDistributionStatDataRequest self = new DescribeUsageAreaDistributionStatDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUsageAreaDistributionStatDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeUsageAreaDistributionStatDataRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeUsageAreaDistributionStatDataRequest setParentArea(String parentArea) {
        this.parentArea = parentArea;
        return this;
    }
    public String getParentArea() {
        return this.parentArea;
    }

    public DescribeUsageAreaDistributionStatDataRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
