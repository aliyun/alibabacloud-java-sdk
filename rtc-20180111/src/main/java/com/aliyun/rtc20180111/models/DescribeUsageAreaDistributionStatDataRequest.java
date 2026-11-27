// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeUsageAreaDistributionStatDataRequest extends TeaModel {
    /**
     * <p>APP ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0rbd****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The end time of the query, expressed as a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1615910399</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The parent region name. For example, the parent of Hangzhou City is Zhejiang Province, and the parameter should be set to China_Zhejiang Province. An empty parameter indicates statistics at the global scope (country dimension), such as China or the United Kingdom.</p>
     * 
     * <strong>example:</strong>
     * <p>中国_浙江省</p>
     */
    @NameInMap("ParentArea")
    public String parentArea;

    /**
     * <p>The start time of the query, expressed as a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1615824000</p>
     */
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
