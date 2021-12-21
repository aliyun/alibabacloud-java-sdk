// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeQualityAreaDistributionStatDataRequest extends TeaModel {
    // APP ID
    @NameInMap("AppId")
    public String appId;

    // 结束时间，秒级时间戳，如1609344000
    @NameInMap("EndDate")
    public Long endDate;

    // 父级地区名称，为空取世界范围（国家维度）的统计，如： ""->中国、英国 "中国"->北京市、广东省 "广东省"->广州市、深圳市、佛山市 "北京市"->北京市
    @NameInMap("ParentArea")
    public String parentArea;

    // 开始时间，秒级时间戳，如1609344000
    @NameInMap("StartDate")
    public Long startDate;

    public static DescribeQualityAreaDistributionStatDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeQualityAreaDistributionStatDataRequest self = new DescribeQualityAreaDistributionStatDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeQualityAreaDistributionStatDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeQualityAreaDistributionStatDataRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public DescribeQualityAreaDistributionStatDataRequest setParentArea(String parentArea) {
        this.parentArea = parentArea;
        return this;
    }
    public String getParentArea() {
        return this.parentArea;
    }

    public DescribeQualityAreaDistributionStatDataRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

}
