// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class DescribeEventsRequest extends TeaModel {
    @NameInMap("CreateEndDate")
    public Long createEndDate;

    @NameInMap("CreateStartDate")
    public Long createStartDate;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EventAffiliation")
    public Integer eventAffiliation;

    @NameInMap("EventLevel")
    public Integer eventLevel;

    @NameInMap("EventStatus")
    public Integer eventStatus;

    @NameInMap("EventType")
    public Integer eventType;

    @NameInMap("HandleEndDate")
    public Long handleEndDate;

    @NameInMap("HandleStartDate")
    public Long handleStartDate;

    @NameInMap("HandleType")
    public Integer handleType;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PropertyName")
    public String propertyName;

    @NameInMap("PropertyPrivateIp")
    public String propertyPrivateIp;

    @NameInMap("PropertyPublicIp")
    public String propertyPublicIp;

    @NameInMap("PropertyUuid")
    public String propertyUuid;

    @NameInMap("Suspect")
    public String suspect;

    @NameInMap("SuspectSig")
    public String suspectSig;

    public static DescribeEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventsRequest self = new DescribeEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventsRequest setCreateEndDate(Long createEndDate) {
        this.createEndDate = createEndDate;
        return this;
    }
    public Long getCreateEndDate() {
        return this.createEndDate;
    }

    public DescribeEventsRequest setCreateStartDate(Long createStartDate) {
        this.createStartDate = createStartDate;
        return this;
    }
    public Long getCreateStartDate() {
        return this.createStartDate;
    }

    public DescribeEventsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeEventsRequest setEventAffiliation(Integer eventAffiliation) {
        this.eventAffiliation = eventAffiliation;
        return this;
    }
    public Integer getEventAffiliation() {
        return this.eventAffiliation;
    }

    public DescribeEventsRequest setEventLevel(Integer eventLevel) {
        this.eventLevel = eventLevel;
        return this;
    }
    public Integer getEventLevel() {
        return this.eventLevel;
    }

    public DescribeEventsRequest setEventStatus(Integer eventStatus) {
        this.eventStatus = eventStatus;
        return this;
    }
    public Integer getEventStatus() {
        return this.eventStatus;
    }

    public DescribeEventsRequest setEventType(Integer eventType) {
        this.eventType = eventType;
        return this;
    }
    public Integer getEventType() {
        return this.eventType;
    }

    public DescribeEventsRequest setHandleEndDate(Long handleEndDate) {
        this.handleEndDate = handleEndDate;
        return this;
    }
    public Long getHandleEndDate() {
        return this.handleEndDate;
    }

    public DescribeEventsRequest setHandleStartDate(Long handleStartDate) {
        this.handleStartDate = handleStartDate;
        return this;
    }
    public Long getHandleStartDate() {
        return this.handleStartDate;
    }

    public DescribeEventsRequest setHandleType(Integer handleType) {
        this.handleType = handleType;
        return this;
    }
    public Integer getHandleType() {
        return this.handleType;
    }

    public DescribeEventsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEventsRequest setPropertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }
    public String getPropertyName() {
        return this.propertyName;
    }

    public DescribeEventsRequest setPropertyPrivateIp(String propertyPrivateIp) {
        this.propertyPrivateIp = propertyPrivateIp;
        return this;
    }
    public String getPropertyPrivateIp() {
        return this.propertyPrivateIp;
    }

    public DescribeEventsRequest setPropertyPublicIp(String propertyPublicIp) {
        this.propertyPublicIp = propertyPublicIp;
        return this;
    }
    public String getPropertyPublicIp() {
        return this.propertyPublicIp;
    }

    public DescribeEventsRequest setPropertyUuid(String propertyUuid) {
        this.propertyUuid = propertyUuid;
        return this;
    }
    public String getPropertyUuid() {
        return this.propertyUuid;
    }

    public DescribeEventsRequest setSuspect(String suspect) {
        this.suspect = suspect;
        return this;
    }
    public String getSuspect() {
        return this.suspect;
    }

    public DescribeEventsRequest setSuspectSig(String suspectSig) {
        this.suspectSig = suspectSig;
        return this;
    }
    public String getSuspectSig() {
        return this.suspectSig;
    }

}
