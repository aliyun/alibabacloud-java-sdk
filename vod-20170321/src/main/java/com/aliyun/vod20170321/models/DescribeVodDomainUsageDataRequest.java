// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainUsageDataRequest extends TeaModel {
    @NameInMap("Area")
    public String area;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Field")
    public String field;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Type")
    public String type;

    public static DescribeVodDomainUsageDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainUsageDataRequest self = new DescribeVodDomainUsageDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainUsageDataRequest setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public DescribeVodDomainUsageDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodDomainUsageDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodDomainUsageDataRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public DescribeVodDomainUsageDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVodDomainUsageDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeVodDomainUsageDataRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
