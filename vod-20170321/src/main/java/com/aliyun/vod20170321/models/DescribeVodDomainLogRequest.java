// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainLogRequest extends TeaModel {
    // The domain name.
    // 
    // > You can specify only one domain name in each query.
    @NameInMap("DomainName")
    public String domainName;

    // The end of the time range to query. The end time must be later than the start time. The time range that is specified by the StartTime and EndTime parameters cannot exceed one year. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of the page to return. Default value: **1**.
    @NameInMap("PageNumber")
    public Long pageNumber;

    // The number of entries to return on each page.
    // 
    // *   Default value: **300.**
    // *   Maximum value: **1000.**
    @NameInMap("PageSize")
    public Long pageSize;

    // The start of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVodDomainLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainLogRequest self = new DescribeVodDomainLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainLogRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodDomainLogRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodDomainLogRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVodDomainLogRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVodDomainLogRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeVodDomainLogRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
