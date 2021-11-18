// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeHuYaRecordByDomainRequest extends TeaModel {
    @NameInMap("BusinessType")
    public String businessType;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeHuYaRecordByDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHuYaRecordByDomainRequest self = new DescribeHuYaRecordByDomainRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHuYaRecordByDomainRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public DescribeHuYaRecordByDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeHuYaRecordByDomainRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeHuYaRecordByDomainRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
