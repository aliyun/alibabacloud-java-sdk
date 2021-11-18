// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeHuYaTranscodeByDomainRequest extends TeaModel {
    @NameInMap("BusinessType")
    public String businessType;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeHuYaTranscodeByDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHuYaTranscodeByDomainRequest self = new DescribeHuYaTranscodeByDomainRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHuYaTranscodeByDomainRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public DescribeHuYaTranscodeByDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeHuYaTranscodeByDomainRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeHuYaTranscodeByDomainRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
