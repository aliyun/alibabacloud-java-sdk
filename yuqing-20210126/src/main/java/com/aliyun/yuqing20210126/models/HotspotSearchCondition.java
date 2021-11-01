// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class HotspotSearchCondition extends TeaModel {
    // 是否在榜
    @NameInMap("active")
    public Boolean active;

    // 爬取时间的最大值（不含）
    @NameInMap("crawlerTimeEndFilter")
    public Long crawlerTimeEndFilter;

    // 爬取时间的最小值（含）
    @NameInMap("crawlerTimeStartFilter")
    public Long crawlerTimeStartFilter;

    // 是否要进行关键词高亮显示
    @NameInMap("enableKeywordHighlight")
    public Boolean enableKeywordHighlight;

    // 媒体子类型：头条热搜，微博热搜
    @NameInMap("mediaSubType")
    public String mediaSubType;

    // 媒体类型：热搜、热榜还是话题
    @NameInMap("mediaType")
    public String mediaType;

    // 当前页
    @NameInMap("pageNow")
    public Integer pageNow;

    // 页大小
    @NameInMap("pageSize")
    public Integer pageSize;

    // 关键词
    @NameInMap("posKeywords")
    public String posKeywords;

    // 默认false，表示需要指定关键词来查询
    @NameInMap("queryWithoutKeyword")
    public Boolean queryWithoutKeyword;

    // 排序字段
    @NameInMap("sortBy")
    public String sortBy;

    // 排序方式： 正序(+)、倒序(-)
    @NameInMap("sortByDirection")
    public String sortByDirection;

    // 标题包含词
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
