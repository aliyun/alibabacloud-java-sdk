// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinklogConfigRequest extends TeaModel {
    @NameInMap("Begin")
    public Long begin;

    @NameInMap("BeginMills")
    public Long beginMills;

    @NameInMap("ConfigType")
    public String configType;

    @NameInMap("ConfigValNum")
    public Long configValNum;

    @NameInMap("ConfigValStr")
    public String configValStr;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("End")
    public Long end;

    @NameInMap("EndMills")
    public Long endMills;

    @NameInMap("GmtCreate")
    public Long gmtCreate;

    @NameInMap("GmtModified")
    public Long gmtModified;

    @NameInMap("Id")
    public Long id;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Sorter")
    public String sorter;

    public static UpdateLinkeLinklogConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinklogConfigRequest self = new UpdateLinkeLinklogConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinklogConfigRequest setBegin(Long begin) {
        this.begin = begin;
        return this;
    }
    public Long getBegin() {
        return this.begin;
    }

    public UpdateLinkeLinklogConfigRequest setBeginMills(Long beginMills) {
        this.beginMills = beginMills;
        return this;
    }
    public Long getBeginMills() {
        return this.beginMills;
    }

    public UpdateLinkeLinklogConfigRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public UpdateLinkeLinklogConfigRequest setConfigValNum(Long configValNum) {
        this.configValNum = configValNum;
        return this;
    }
    public Long getConfigValNum() {
        return this.configValNum;
    }

    public UpdateLinkeLinklogConfigRequest setConfigValStr(String configValStr) {
        this.configValStr = configValStr;
        return this;
    }
    public String getConfigValStr() {
        return this.configValStr;
    }

    public UpdateLinkeLinklogConfigRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public UpdateLinkeLinklogConfigRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public UpdateLinkeLinklogConfigRequest setEndMills(Long endMills) {
        this.endMills = endMills;
        return this;
    }
    public Long getEndMills() {
        return this.endMills;
    }

    public UpdateLinkeLinklogConfigRequest setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public UpdateLinkeLinklogConfigRequest setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public UpdateLinkeLinklogConfigRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLinkeLinklogConfigRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public UpdateLinkeLinklogConfigRequest setSorter(String sorter) {
        this.sorter = sorter;
        return this;
    }
    public String getSorter() {
        return this.sorter;
    }

}
