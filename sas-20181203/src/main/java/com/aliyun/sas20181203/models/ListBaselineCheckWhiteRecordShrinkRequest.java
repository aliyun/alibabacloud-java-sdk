// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListBaselineCheckWhiteRecordShrinkRequest extends TeaModel {
    /**
     * <p>The IDs of check items.</p>
     */
    @NameInMap("CheckIds")
    public String checkIdsShrink;

    /**
     * <p>The name of the check item. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>redis</p>
     */
    @NameInMap("CheckItemFuzzy")
    public String checkItemFuzzy;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The IDs of the whitelist rules.</p>
     */
    @NameInMap("RecordIds")
    public String recordIdsShrink;

    /**
     * <p>The data source. If you leave this parameter empty, the default value is used. Valid values:</p>
     * <ul>
     * <li><strong>default</strong>: server</li>
     * <li><strong>agentless</strong>: agentless detection</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>agentless</p>
     */
    @NameInMap("Source")
    public String source;

    public static ListBaselineCheckWhiteRecordShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBaselineCheckWhiteRecordShrinkRequest self = new ListBaselineCheckWhiteRecordShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListBaselineCheckWhiteRecordShrinkRequest setCheckIdsShrink(String checkIdsShrink) {
        this.checkIdsShrink = checkIdsShrink;
        return this;
    }
    public String getCheckIdsShrink() {
        return this.checkIdsShrink;
    }

    public ListBaselineCheckWhiteRecordShrinkRequest setCheckItemFuzzy(String checkItemFuzzy) {
        this.checkItemFuzzy = checkItemFuzzy;
        return this;
    }
    public String getCheckItemFuzzy() {
        return this.checkItemFuzzy;
    }

    public ListBaselineCheckWhiteRecordShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListBaselineCheckWhiteRecordShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListBaselineCheckWhiteRecordShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBaselineCheckWhiteRecordShrinkRequest setRecordIdsShrink(String recordIdsShrink) {
        this.recordIdsShrink = recordIdsShrink;
        return this;
    }
    public String getRecordIdsShrink() {
        return this.recordIdsShrink;
    }

    public ListBaselineCheckWhiteRecordShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
