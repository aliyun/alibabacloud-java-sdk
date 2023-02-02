// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class SearchOmsOpenAPIProjectsShrinkRequest extends TeaModel {
    /**
     * <p>The types of destination data sources.</p>
     */
    @NameInMap("DestDbTypes")
    public String destDbTypesShrink;

    /**
     * <p>The list of labels.</p>
     */
    @NameInMap("LabelIds")
    public String labelIdsShrink;

    /**
     * <p>The page number, which takes effect in a pagination query.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size, which takes effect in a pagination query.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The keyword for fuzzy search. A fuzzy search is performed based on the project ID and name.</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The types of source data sources.</p>
     */
    @NameInMap("SourceDbTypes")
    public String sourceDbTypesShrink;

    /**
     * <p>The list of project statuses.</p>
     */
    @NameInMap("StatusList")
    public String statusListShrink;

    /**
     * <p>The ID of the migration instance. Generally, if you want to create a project on a public cloud, you must first purchase a migration instance.</p>
     */
    @NameInMap("WorkerGradeId")
    public String workerGradeId;

    public static SearchOmsOpenAPIProjectsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchOmsOpenAPIProjectsShrinkRequest self = new SearchOmsOpenAPIProjectsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SearchOmsOpenAPIProjectsShrinkRequest setDestDbTypesShrink(String destDbTypesShrink) {
        this.destDbTypesShrink = destDbTypesShrink;
        return this;
    }
    public String getDestDbTypesShrink() {
        return this.destDbTypesShrink;
    }

    public SearchOmsOpenAPIProjectsShrinkRequest setLabelIdsShrink(String labelIdsShrink) {
        this.labelIdsShrink = labelIdsShrink;
        return this;
    }
    public String getLabelIdsShrink() {
        return this.labelIdsShrink;
    }

    public SearchOmsOpenAPIProjectsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchOmsOpenAPIProjectsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchOmsOpenAPIProjectsShrinkRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public SearchOmsOpenAPIProjectsShrinkRequest setSourceDbTypesShrink(String sourceDbTypesShrink) {
        this.sourceDbTypesShrink = sourceDbTypesShrink;
        return this;
    }
    public String getSourceDbTypesShrink() {
        return this.sourceDbTypesShrink;
    }

    public SearchOmsOpenAPIProjectsShrinkRequest setStatusListShrink(String statusListShrink) {
        this.statusListShrink = statusListShrink;
        return this;
    }
    public String getStatusListShrink() {
        return this.statusListShrink;
    }

    public SearchOmsOpenAPIProjectsShrinkRequest setWorkerGradeId(String workerGradeId) {
        this.workerGradeId = workerGradeId;
        return this;
    }
    public String getWorkerGradeId() {
        return this.workerGradeId;
    }

}
