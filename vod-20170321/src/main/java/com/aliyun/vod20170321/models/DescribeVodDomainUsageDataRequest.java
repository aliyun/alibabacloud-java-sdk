// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainUsageDataRequest extends TeaModel {
    // The region where the data is queried. The default value is CN, which indicates mainland China. Valid values:
    // 
    // *   **CN**: mainland China.
    // *   **OverSeas**: outside mainland China.
    @NameInMap("Area")
    public String area;

    // The domain name for CDN. If you do not specify this parameter, the merged data of all your domain names for CDN is returned. You can specify multiple domain names. Separate them with commas (,).
    @NameInMap("DomainName")
    public String domainName;

    // The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
    @NameInMap("EndTime")
    public String endTime;

    // The type of the data to be queried. Valid values:
    // 
    // *   **bps**: bandwidth.
    // *   **traf**: traffic.
    @NameInMap("Field")
    public String field;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The beginning of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
    @NameInMap("StartTime")
    public String startTime;

    // The type of the content based on which the data is generated. Valid values:
    // 
    // *   **static**
    // *   **dynamic**
    // *   **all**
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
