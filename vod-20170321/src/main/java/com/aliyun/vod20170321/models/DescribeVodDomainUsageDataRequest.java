// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainUsageDataRequest extends TeaModel {
    /**
     * <p>The region where you want to query data. Default value: CN. Valid values:</p>
     * <br>
     * <p>*   **CN**: Chinese mainland</p>
     * <p>*   **OverSeas**: outside the Chinese mainland</p>
     */
    @NameInMap("Area")
    public String area;

    /**
     * <p>The accelerated domain name. If you leave this parameter empty, the merged data of all your accelerated domain names is returned. Separate multiple accelerated domain names with commas (,).</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The type of the data to return. Valid values:</p>
     * <br>
     * <p>*   **bps**: bandwidth</p>
     * <p>*   **traf**: traffic</p>
     */
    @NameInMap("Field")
    public String field;

    @NameInMap("Interval")
    public String interval;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The type of content that you want to query. Valid values:</p>
     * <br>
     * <p>*   **static**: static content</p>
     * <p>*   **dynamic**: dynamic content</p>
     * <p>*   **all**: all content</p>
     */
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

    public DescribeVodDomainUsageDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
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
