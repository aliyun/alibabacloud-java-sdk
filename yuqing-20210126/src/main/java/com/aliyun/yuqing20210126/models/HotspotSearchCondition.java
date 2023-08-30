// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class HotspotSearchCondition extends TeaModel {
    @NameInMap("active")
    public Boolean active;

    @NameInMap("cities")
    public String cities;

    @NameInMap("crawlerTimeEndFilter")
    public Long crawlerTimeEndFilter;

    @NameInMap("crawlerTimeStartFilter")
    public Long crawlerTimeStartFilter;

    @NameInMap("enableKeywordHighlight")
    public Boolean enableKeywordHighlight;

    @NameInMap("hotspotCategory")
    public String hotspotCategory;

    @NameInMap("mediaSubType")
    public String mediaSubType;

    @NameInMap("mediaType")
    public String mediaType;

    @NameInMap("pageNow")
    public Integer pageNow;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("posKeywords")
    public String posKeywords;

    @NameInMap("queryWithoutKeyword")
    public Boolean queryWithoutKeyword;

    @NameInMap("sortBy")
    public String sortBy;

    @NameInMap("sortByDirection")
    public String sortByDirection;

    @NameInMap("titleIncludingWordsIdx")
    public String titleIncludingWordsIdx;

    public static HotspotSearchCondition build(java.util.Map<String, ?> map) throws Exception {
        HotspotSearchCondition self = new HotspotSearchCondition();
        return TeaModel.build(map, self);
    }

    public HotspotSearchCondition setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

    public HotspotSearchCondition setCities(String cities) {
        this.cities = cities;
        return this;
    }
    public String getCities() {
        return this.cities;
    }

    public HotspotSearchCondition setCrawlerTimeEndFilter(Long crawlerTimeEndFilter) {
        this.crawlerTimeEndFilter = crawlerTimeEndFilter;
        return this;
    }
    public Long getCrawlerTimeEndFilter() {
        return this.crawlerTimeEndFilter;
    }

    public HotspotSearchCondition setCrawlerTimeStartFilter(Long crawlerTimeStartFilter) {
        this.crawlerTimeStartFilter = crawlerTimeStartFilter;
        return this;
    }
    public Long getCrawlerTimeStartFilter() {
        return this.crawlerTimeStartFilter;
    }

    public HotspotSearchCondition setEnableKeywordHighlight(Boolean enableKeywordHighlight) {
        this.enableKeywordHighlight = enableKeywordHighlight;
        return this;
    }
    public Boolean getEnableKeywordHighlight() {
        return this.enableKeywordHighlight;
    }

    public HotspotSearchCondition setHotspotCategory(String hotspotCategory) {
        this.hotspotCategory = hotspotCategory;
        return this;
    }
    public String getHotspotCategory() {
        return this.hotspotCategory;
    }

    public HotspotSearchCondition setMediaSubType(String mediaSubType) {
        this.mediaSubType = mediaSubType;
        return this;
    }
    public String getMediaSubType() {
        return this.mediaSubType;
    }

    public HotspotSearchCondition setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public HotspotSearchCondition setPageNow(Integer pageNow) {
        this.pageNow = pageNow;
        return this;
    }
    public Integer getPageNow() {
        return this.pageNow;
    }

    public HotspotSearchCondition setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public HotspotSearchCondition setPosKeywords(String posKeywords) {
        this.posKeywords = posKeywords;
        return this;
    }
    public String getPosKeywords() {
        return this.posKeywords;
    }

    public HotspotSearchCondition setQueryWithoutKeyword(Boolean queryWithoutKeyword) {
        this.queryWithoutKeyword = queryWithoutKeyword;
        return this;
    }
    public Boolean getQueryWithoutKeyword() {
        return this.queryWithoutKeyword;
    }

    public HotspotSearchCondition setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public HotspotSearchCondition setSortByDirection(String sortByDirection) {
        this.sortByDirection = sortByDirection;
        return this;
    }
    public String getSortByDirection() {
        return this.sortByDirection;
    }

    public HotspotSearchCondition setTitleIncludingWordsIdx(String titleIncludingWordsIdx) {
        this.titleIncludingWordsIdx = titleIncludingWordsIdx;
        return this;
    }
    public String getTitleIncludingWordsIdx() {
        return this.titleIncludingWordsIdx;
    }

}
