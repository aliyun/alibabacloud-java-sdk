// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeHuYaScreenshotByDomainRequest extends TeaModel {
    @NameInMap("BusinessType")
    public String businessType;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeHuYaScreenshotByDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHuYaScreenshotByDomainRequest self = new DescribeHuYaScreenshotByDomainRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHuYaScreenshotByDomainRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public DescribeHuYaScreenshotByDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeHuYaScreenshotByDomainRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeHuYaScreenshotByDomainRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
