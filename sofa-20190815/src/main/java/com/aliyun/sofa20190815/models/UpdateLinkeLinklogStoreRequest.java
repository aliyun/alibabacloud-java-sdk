// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinklogStoreRequest extends TeaModel {
    @NameInMap("Begin")
    public Long begin;

    @NameInMap("BeginMills")
    public Long beginMills;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("End")
    public Long end;

    @NameInMap("EndMills")
    public Long endMills;

    @NameInMap("EnvPattern")
    public String envPattern;

    @NameInMap("GmtCreate")
    public Long gmtCreate;

    @NameInMap("GmtModified")
    public Long gmtModified;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Sorter")
    public String sorter;

    @NameInMap("StepPattern")
    public String stepPattern;

    public static UpdateLinkeLinklogStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinklogStoreRequest self = new UpdateLinkeLinklogStoreRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinklogStoreRequest setBegin(Long begin) {
        this.begin = begin;
        return this;
    }
    public Long getBegin() {
        return this.begin;
    }

    public UpdateLinkeLinklogStoreRequest setBeginMills(Long beginMills) {
        this.beginMills = beginMills;
        return this;
    }
    public Long getBeginMills() {
        return this.beginMills;
    }

    public UpdateLinkeLinklogStoreRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public UpdateLinkeLinklogStoreRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public UpdateLinkeLinklogStoreRequest setEndMills(Long endMills) {
        this.endMills = endMills;
        return this;
    }
    public Long getEndMills() {
        return this.endMills;
    }

    public UpdateLinkeLinklogStoreRequest setEnvPattern(String envPattern) {
        this.envPattern = envPattern;
        return this;
    }
    public String getEnvPattern() {
        return this.envPattern;
    }

    public UpdateLinkeLinklogStoreRequest setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public UpdateLinkeLinklogStoreRequest setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public UpdateLinkeLinklogStoreRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLinkeLinklogStoreRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLinkeLinklogStoreRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public UpdateLinkeLinklogStoreRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public UpdateLinkeLinklogStoreRequest setSorter(String sorter) {
        this.sorter = sorter;
        return this;
    }
    public String getSorter() {
        return this.sorter;
    }

    public UpdateLinkeLinklogStoreRequest setStepPattern(String stepPattern) {
        this.stepPattern = stepPattern;
        return this;
    }
    public String getStepPattern() {
        return this.stepPattern;
    }

}
