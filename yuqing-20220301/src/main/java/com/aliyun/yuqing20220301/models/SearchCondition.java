// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class SearchCondition extends TeaModel {
    // 搭配词
    @NameInMap("assKeywords")
    public String assKeywords;

    // 被@的用户名称
    @NameInMap("atAuthorName")
    public String atAuthorName;

    // 作者名称
    @NameInMap("authorName")
    public String authorName;

    // 抓取截止时间
    @NameInMap("createTimeEnd")
    public String createTimeEnd;

    // 抓取起始时间
    @NameInMap("createTimeStart")
    public String createTimeStart;

    // 舆情文章唯一docId
    @NameInMap("docId")
    public String docId;

    // 排除作者名称
    @NameInMap("excludeAuthorName")
    public String excludeAuthorName;

    // 排除网站域名
    @NameInMap("excludeHostName")
    public String excludeHostName;

    // 排除词
    @NameInMap("excludeKeywords")
    public String excludeKeywords;

    // 标题排除词
    @NameInMap("excludeKeywordsInTitle")
    public String excludeKeywordsInTitle;

    // 网站域名
    @NameInMap("hostName")
    public String hostName;

    // 关键词标签Id列表
    @NameInMap("keywordTagIds")
    public String keywordTagIds;

    // 媒体库id列表
    @NameInMap("mediaLibraryIds")
    public String mediaLibraryIds;

    // 媒体名称
    @NameInMap("mediaName")
    public String mediaName;

    // 媒体类型，枚举值
    @NameInMap("mediaType")
    public String mediaType;

    // 消息类型，枚举值
    @NameInMap("messageType")
    public String messageType;

    // 当前页
    @NameInMap("pageNow")
    public Integer pageNow;

    // 页大小
    @NameInMap("pageSize")
    public Integer pageSize;

    // 舆情父文章的docId，一般用于查看某篇文章的评论
    @NameInMap("parentDocId")
    public String parentDocId;

    // 关键词
    @NameInMap("posKeywords")
    public String posKeywords;

    // 标题关键词
    @NameInMap("posKeywordsInTitle")
    public String posKeywordsInTitle;

    // 截止发布时间
    @NameInMap("publishTimeEnd")
    public String publishTimeEnd;

    // 起始发布时间
    @NameInMap("publishTimeStart")
    public String publishTimeStart;

    // 排序字段
    @NameInMap("sortBy")
    public String sortBy;

    // 指定正反向排序
    @NameInMap("sortByDirection")
    public String sortByDirection;

    // 嵌套查询AND条件
    @NameInMap("subCondition")
    public SearchCondition subCondition;

    // 舆情文章截止更新时间
    @NameInMap("updateTimeEnd")
    public String updateTimeEnd;

    // 舆情文章起始更新时间
    @NameInMap("updateTimeStart")
    public String updateTimeStart;

    public static SearchCondition build(java.util.Map<String, ?> map) throws Exception {
        SearchCondition self = new SearchCondition();
        return TeaModel.build(map, self);
    }

    public SearchCondition setAssKeywords(String assKeywords) {
        this.assKeywords = assKeywords;
        return this;
    }
    public String getAssKeywords() {
        return this.assKeywords;
    }

    public SearchCondition setAtAuthorName(String atAuthorName) {
        this.atAuthorName = atAuthorName;
        return this;
    }
    public String getAtAuthorName() {
        return this.atAuthorName;
    }

    public SearchCondition setAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }
    public String getAuthorName() {
        return this.authorName;
    }

    public SearchCondition setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public SearchCondition setCreateTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public String getCreateTimeStart() {
        return this.createTimeStart;
    }

    public SearchCondition setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public SearchCondition setExcludeAuthorName(String excludeAuthorName) {
        this.excludeAuthorName = excludeAuthorName;
        return this;
    }
    public String getExcludeAuthorName() {
        return this.excludeAuthorName;
    }

    public SearchCondition setExcludeHostName(String excludeHostName) {
        this.excludeHostName = excludeHostName;
        return this;
    }
    public String getExcludeHostName() {
        return this.excludeHostName;
    }

    public SearchCondition setExcludeKeywords(String excludeKeywords) {
        this.excludeKeywords = excludeKeywords;
        return this;
    }
    public String getExcludeKeywords() {
        return this.excludeKeywords;
    }

    public SearchCondition setExcludeKeywordsInTitle(String excludeKeywordsInTitle) {
        this.excludeKeywordsInTitle = excludeKeywordsInTitle;
        return this;
    }
    public String getExcludeKeywordsInTitle() {
        return this.excludeKeywordsInTitle;
    }

    public SearchCondition setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public SearchCondition setKeywordTagIds(String keywordTagIds) {
        this.keywordTagIds = keywordTagIds;
        return this;
    }
    public String getKeywordTagIds() {
        return this.keywordTagIds;
    }

    public SearchCondition setMediaLibraryIds(String mediaLibraryIds) {
        this.mediaLibraryIds = mediaLibraryIds;
        return this;
    }
    public String getMediaLibraryIds() {
        return this.mediaLibraryIds;
    }

    public SearchCondition setMediaName(String mediaName) {
        this.mediaName = mediaName;
        return this;
    }
    public String getMediaName() {
        return this.mediaName;
    }

    public SearchCondition setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public SearchCondition setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public SearchCondition setPageNow(Integer pageNow) {
        this.pageNow = pageNow;
        return this;
    }
    public Integer getPageNow() {
        return this.pageNow;
    }

    public SearchCondition setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchCondition setParentDocId(String parentDocId) {
        this.parentDocId = parentDocId;
        return this;
    }
    public String getParentDocId() {
        return this.parentDocId;
    }

    public SearchCondition setPosKeywords(String posKeywords) {
        this.posKeywords = posKeywords;
        return this;
    }
    public String getPosKeywords() {
        return this.posKeywords;
    }

    public SearchCondition setPosKeywordsInTitle(String posKeywordsInTitle) {
        this.posKeywordsInTitle = posKeywordsInTitle;
        return this;
    }
    public String getPosKeywordsInTitle() {
        return this.posKeywordsInTitle;
    }

    public SearchCondition setPublishTimeEnd(String publishTimeEnd) {
        this.publishTimeEnd = publishTimeEnd;
        return this;
    }
    public String getPublishTimeEnd() {
        return this.publishTimeEnd;
    }

    public SearchCondition setPublishTimeStart(String publishTimeStart) {
        this.publishTimeStart = publishTimeStart;
        return this;
    }
    public String getPublishTimeStart() {
        return this.publishTimeStart;
    }

    public SearchCondition setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public SearchCondition setSortByDirection(String sortByDirection) {
        this.sortByDirection = sortByDirection;
        return this;
    }
    public String getSortByDirection() {
        return this.sortByDirection;
    }

    public SearchCondition setSubCondition(SearchCondition subCondition) {
        this.subCondition = subCondition;
        return this;
    }
    public SearchCondition getSubCondition() {
        return this.subCondition;
    }

    public SearchCondition setUpdateTimeEnd(String updateTimeEnd) {
        this.updateTimeEnd = updateTimeEnd;
        return this;
    }
    public String getUpdateTimeEnd() {
        return this.updateTimeEnd;
    }

    public SearchCondition setUpdateTimeStart(String updateTimeStart) {
        this.updateTimeStart = updateTimeStart;
        return this;
    }
    public String getUpdateTimeStart() {
        return this.updateTimeStart;
    }

}
