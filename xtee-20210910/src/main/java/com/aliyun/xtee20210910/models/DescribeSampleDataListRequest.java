// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleDataListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("currentPage")
    public String currentPage;

    @NameInMap("deleteTag")
    public String deleteTag;

    @NameInMap("pageSize")
    public String pageSize;

    @NameInMap("queryContent")
    public String queryContent;

    @NameInMap("regId")
    public String regId;

    @NameInMap("sampleId")
    public Long sampleId;

    @NameInMap("scene")
    public String scene;

    @NameInMap("status")
    public String status;

    public static DescribeSampleDataListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleDataListRequest self = new DescribeSampleDataListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSampleDataListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSampleDataListRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSampleDataListRequest setDeleteTag(String deleteTag) {
        this.deleteTag = deleteTag;
        return this;
    }
    public String getDeleteTag() {
        return this.deleteTag;
    }

    public DescribeSampleDataListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeSampleDataListRequest setQueryContent(String queryContent) {
        this.queryContent = queryContent;
        return this;
    }
    public String getQueryContent() {
        return this.queryContent;
    }

    public DescribeSampleDataListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeSampleDataListRequest setSampleId(Long sampleId) {
        this.sampleId = sampleId;
        return this;
    }
    public Long getSampleId() {
        return this.sampleId;
    }

    public DescribeSampleDataListRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public DescribeSampleDataListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
