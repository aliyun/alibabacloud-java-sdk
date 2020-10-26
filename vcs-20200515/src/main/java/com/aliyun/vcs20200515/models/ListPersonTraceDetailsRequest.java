// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListPersonTraceDetailsRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("PersonId")
    public String personId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("SubId")
    public String subId;

    @NameInMap("DataSourceId")
    public String dataSourceId;

    public static ListPersonTraceDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPersonTraceDetailsRequest self = new ListPersonTraceDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListPersonTraceDetailsRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public ListPersonTraceDetailsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListPersonTraceDetailsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListPersonTraceDetailsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListPersonTraceDetailsRequest setPersonId(String personId) {
        this.personId = personId;
        return this;
    }
    public String getPersonId() {
        return this.personId;
    }

    public ListPersonTraceDetailsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListPersonTraceDetailsRequest setSubId(String subId) {
        this.subId = subId;
        return this;
    }
    public String getSubId() {
        return this.subId;
    }

    public ListPersonTraceDetailsRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

}
