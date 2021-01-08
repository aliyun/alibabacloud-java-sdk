// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class SearchWorkitemWithTotalCountRequest extends TeaModel {
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

    public static SearchWorkitemWithTotalCountRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchWorkitemWithTotalCountRequest self = new SearchWorkitemWithTotalCountRequest();
        return TeaModel.build(map, self);
    }

    public SearchWorkitemWithTotalCountRequest setStamp(String stamp) {
        this.stamp = stamp;
        return this;
    }
    public String getStamp() {
        return this.stamp;
    }

    public SearchWorkitemWithTotalCountRequest setAKProjectId(Integer AKProjectId) {
        this.AKProjectId = AKProjectId;
        return this;
    }
    public Integer getAKProjectId() {
        return this.AKProjectId;
    }

    public SearchWorkitemWithTotalCountRequest setToPage(Integer toPage) {
        this.toPage = toPage;
        return this;
    }
    public Integer getToPage() {
        return this.toPage;
    }

    public SearchWorkitemWithTotalCountRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchWorkitemWithTotalCountRequest setCorpIdentifier(String corpIdentifier) {
        this.corpIdentifier = corpIdentifier;
        return this;
    }
    public String getCorpIdentifier() {
        return this.corpIdentifier;
    }

    public SearchWorkitemWithTotalCountRequest setSprintId(Integer sprintId) {
        this.sprintId = sprintId;
        return this;
    }
    public Integer getSprintId() {
        return this.sprintId;
    }

}
