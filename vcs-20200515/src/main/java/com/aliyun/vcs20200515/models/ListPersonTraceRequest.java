// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListPersonTraceRequest extends TeaModel {
    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("DataSourceId")
    public String dataSourceId;

    @NameInMap("PersonId")
    public String personId;

    @NameInMap("GroupId")
    public String groupId;

    public static ListPersonTraceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPersonTraceRequest self = new ListPersonTraceRequest();
        return TeaModel.build(map, self);
    }

    public ListPersonTraceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListPersonTraceRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public ListPersonTraceRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListPersonTraceRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListPersonTraceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListPersonTraceRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public ListPersonTraceRequest setPersonId(String personId) {
        this.personId = personId;
        return this;
    }
    public String getPersonId() {
        return this.personId;
    }

    public ListPersonTraceRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
