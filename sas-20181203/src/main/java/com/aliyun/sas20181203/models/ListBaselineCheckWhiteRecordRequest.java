// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListBaselineCheckWhiteRecordRequest extends TeaModel {
    /**
     * <p>The IDs of check items.</p>
     */
    @NameInMap("CheckIds")
    public java.util.List<Long> checkIds;

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
    public java.util.List<Long> recordIds;

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

    public static ListBaselineCheckWhiteRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBaselineCheckWhiteRecordRequest self = new ListBaselineCheckWhiteRecordRequest();
        return TeaModel.build(map, self);
    }

    public ListBaselineCheckWhiteRecordRequest setCheckIds(java.util.List<Long> checkIds) {
        this.checkIds = checkIds;
        return this;
    }
    public java.util.List<Long> getCheckIds() {
        return this.checkIds;
    }

    public ListBaselineCheckWhiteRecordRequest setCheckItemFuzzy(String checkItemFuzzy) {
        this.checkItemFuzzy = checkItemFuzzy;
        return this;
    }
    public String getCheckItemFuzzy() {
        return this.checkItemFuzzy;
    }

    public ListBaselineCheckWhiteRecordRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListBaselineCheckWhiteRecordRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListBaselineCheckWhiteRecordRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBaselineCheckWhiteRecordRequest setRecordIds(java.util.List<Long> recordIds) {
        this.recordIds = recordIds;
        return this;
    }
    public java.util.List<Long> getRecordIds() {
        return this.recordIds;
    }

    public ListBaselineCheckWhiteRecordRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
