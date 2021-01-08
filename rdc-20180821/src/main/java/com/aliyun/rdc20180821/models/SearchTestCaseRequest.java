// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class SearchTestCaseRequest extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CorpIdentifier")
    public String corpIdentifier;

    @NameInMap("AkProjectId")
    public String akProjectId;

    @NameInMap("CaseTag")
    public String caseTag;

    @NameInMap("PageNum")
    public String pageNum;

    @NameInMap("CreateDateStart")
    public String createDateStart;

    @NameInMap("CreateDateEnd")
    public String createDateEnd;

    @NameInMap("UpdateDateStart")
    public String updateDateStart;

    @NameInMap("UpdateDateEnd")
    public String updateDateEnd;

    public static SearchTestCaseRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchTestCaseRequest self = new SearchTestCaseRequest();
        return TeaModel.build(map, self);
    }

    public SearchTestCaseRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchTestCaseRequest setCorpIdentifier(String corpIdentifier) {
        this.corpIdentifier = corpIdentifier;
        return this;
    }
    public String getCorpIdentifier() {
        return this.corpIdentifier;
    }

    public SearchTestCaseRequest setAkProjectId(String akProjectId) {
        this.akProjectId = akProjectId;
        return this;
    }
    public String getAkProjectId() {
        return this.akProjectId;
    }

    public SearchTestCaseRequest setCaseTag(String caseTag) {
        this.caseTag = caseTag;
        return this;
    }
    public String getCaseTag() {
        return this.caseTag;
    }

    public SearchTestCaseRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public SearchTestCaseRequest setCreateDateStart(String createDateStart) {
        this.createDateStart = createDateStart;
        return this;
    }
    public String getCreateDateStart() {
        return this.createDateStart;
    }

    public SearchTestCaseRequest setCreateDateEnd(String createDateEnd) {
        this.createDateEnd = createDateEnd;
        return this;
    }
    public String getCreateDateEnd() {
        return this.createDateEnd;
    }

    public SearchTestCaseRequest setUpdateDateStart(String updateDateStart) {
        this.updateDateStart = updateDateStart;
        return this;
    }
    public String getUpdateDateStart() {
        return this.updateDateStart;
    }

    public SearchTestCaseRequest setUpdateDateEnd(String updateDateEnd) {
        this.updateDateEnd = updateDateEnd;
        return this;
    }
    public String getUpdateDateEnd() {
        return this.updateDateEnd;
    }

}
