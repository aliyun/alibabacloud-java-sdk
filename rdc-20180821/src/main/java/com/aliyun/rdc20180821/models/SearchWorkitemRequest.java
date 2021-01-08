// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class SearchWorkitemRequest extends TeaModel {
    @NameInMap("Stamp")
    public String stamp;

    @NameInMap("AKProjectId")
    public Integer AKProjectId;

    @NameInMap("ToPage")
    public Integer toPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CorpIdentifier")
    public String corpIdentifier;

    @NameInMap("SprintId")
    public Integer sprintId;

    @NameInMap("CreatedAtStart")
    public String createdAtStart;

    @NameInMap("CreatedAtEnd")
    public String createdAtEnd;

    public static SearchWorkitemRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchWorkitemRequest self = new SearchWorkitemRequest();
        return TeaModel.build(map, self);
    }

    public SearchWorkitemRequest setStamp(String stamp) {
        this.stamp = stamp;
        return this;
    }
    public String getStamp() {
        return this.stamp;
    }

    public SearchWorkitemRequest setAKProjectId(Integer AKProjectId) {
        this.AKProjectId = AKProjectId;
        return this;
    }
    public Integer getAKProjectId() {
        return this.AKProjectId;
    }

    public SearchWorkitemRequest setToPage(Integer toPage) {
        this.toPage = toPage;
        return this;
    }
    public Integer getToPage() {
        return this.toPage;
    }

    public SearchWorkitemRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchWorkitemRequest setCorpIdentifier(String corpIdentifier) {
        this.corpIdentifier = corpIdentifier;
        return this;
    }
    public String getCorpIdentifier() {
        return this.corpIdentifier;
    }

    public SearchWorkitemRequest setSprintId(Integer sprintId) {
        this.sprintId = sprintId;
        return this;
    }
    public Integer getSprintId() {
        return this.sprintId;
    }

    public SearchWorkitemRequest setCreatedAtStart(String createdAtStart) {
        this.createdAtStart = createdAtStart;
        return this;
    }
    public String getCreatedAtStart() {
        return this.createdAtStart;
    }

    public SearchWorkitemRequest setCreatedAtEnd(String createdAtEnd) {
        this.createdAtEnd = createdAtEnd;
        return this;
    }
    public String getCreatedAtEnd() {
        return this.createdAtEnd;
    }

}
