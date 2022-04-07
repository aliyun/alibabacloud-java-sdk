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

    // 评论级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
    @NameInMap("commentsLevel")
    public Integer commentsLevel;

    // 内容长度级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
    @NameInMap("contentLenLevel")
    public Integer contentLenLevel;

    // 抓取截止时间
    @NameInMap("createTimeEnd")
    public Long createTimeEnd;

    // 抓取起始时间
    @NameInMap("createTimeStart")
    public Long createTimeStart;

    // 文章签名
    @NameInMap("docContentSign")
    public String docContentSign;

    // 舆情文章唯一docId
    @NameInMap("docId")
    public String docId;

    // 是否去重
    @NameInMap("duplicateRemoval")
    public Boolean duplicateRemoval;

    // 情感类型，1非负，-1负面
    @NameInMap("emotionType")
    public Integer emotionType;

    // 是否高亮关键词
    @NameInMap("enableKeywordHighlight")
    public Boolean enableKeywordHighlight;

    // 排除被@的用户名称
    @NameInMap("excludeAtAuthorName")
    public String excludeAtAuthorName;

    // 排除作者名称
    @NameInMap("excludeAuthorName")
    public String excludeAuthorName;

    // 排除网站域名
    @NameInMap("excludeHostName")
    public String excludeHostName;

    // 排除关键词标签Id列表
    @NameInMap("excludeKeywordTagIds")
    public String excludeKeywordTagIds;

    // 排除词
    @NameInMap("excludeKeywords")
    public String excludeKeywords;

    // 标题排除词
    @NameInMap("excludeKeywordsInTitle")
    public String excludeKeywordsInTitle;

    // 排除媒体库id列表
    @NameInMap("excludeMediaLibraryIds")
    public String excludeMediaLibraryIds;

    // 排除媒体名称
    @NameInMap("excludeMediaName")
    public String excludeMediaName;

    // 排除媒体类型，枚举值
    @NameInMap("excludeMediaType")
    public String excludeMediaType;

    // 排除消息类型，枚举值
    @NameInMap("excludeMessageType")
    public String excludeMessageType;

    // 其他过滤条件
    @NameInMap("fieldConditions")
    public java.util.List<FieldCondition> fieldConditions;

    // 文章是否含有图片
    @NameInMap("hasImage")
    public Boolean hasImage;

    // 是否含有视频
    @NameInMap("hasVideo")
    public Boolean hasVideo;

    // 网站域名
    @NameInMap("hostName")
    public String hostName;

    // 关键词标签Id列表
    @NameInMap("keywordTagIds")
    public String keywordTagIds;

    // 点赞级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
    @NameInMap("likesLevel")
    public Integer likesLevel;

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
    public Long publishTimeEnd;

    // 起始发布时间
    @NameInMap("publishTimeStart")
    public Long publishTimeStart;

    // 阅读级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
    @NameInMap("readsLevel")
    public Integer readsLevel;

    // 相关性等级，1：低，2：中，3：高，4：低级别以上
    @NameInMap("relevanceLevel")
    public Integer relevanceLevel;

    // 转发级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
    @NameInMap("repostLevel")
    public Integer repostLevel;

    // 排序字段
    @NameInMap("sortBy")
    public String sortBy;

    // 指定正反向排序
    @NameInMap("sortByDirection")
    public String sortByDirection;

    // #话题
    @NameInMap("topics")
    public String topics;

    // 舆情文章截止更新时间
    @NameInMap("updateTimeEnd")
    public Long updateTimeEnd;

    // 舆情文章起始更新时间
    @NameInMap("updateTimeStart")
    public Long updateTimeStart;

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

    public SearchCondition setCommentsLevel(Integer commentsLevel) {
        this.commentsLevel = commentsLevel;
        return this;
    }
    public Integer getCommentsLevel() {
        return this.commentsLevel;
    }

    public SearchCondition setContentLenLevel(Integer contentLenLevel) {
        this.contentLenLevel = contentLenLevel;
        return this;
    }
    public Integer getContentLenLevel() {
        return this.contentLenLevel;
    }

    public SearchCondition setCreateTimeEnd(Long createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public Long getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public SearchCondition setCreateTimeStart(Long createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public Long getCreateTimeStart() {
        return this.createTimeStart;
    }

    public SearchCondition setDocContentSign(String docContentSign) {
        this.docContentSign = docContentSign;
        return this;
    }
    public String getDocContentSign() {
        return this.docContentSign;
    }

    public SearchCondition setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public SearchCondition setDuplicateRemoval(Boolean duplicateRemoval) {
        this.duplicateRemoval = duplicateRemoval;
        return this;
    }
    public Boolean getDuplicateRemoval() {
        return this.duplicateRemoval;
    }

    public SearchCondition setEmotionType(Integer emotionType) {
        this.emotionType = emotionType;
        return this;
    }
    public Integer getEmotionType() {
        return this.emotionType;
    }

    public SearchCondition setEnableKeywordHighlight(Boolean enableKeywordHighlight) {
        this.enableKeywordHighlight = enableKeywordHighlight;
        return this;
    }
    public Boolean getEnableKeywordHighlight() {
        return this.enableKeywordHighlight;
    }

    public SearchCondition setExcludeAtAuthorName(String excludeAtAuthorName) {
        this.excludeAtAuthorName = excludeAtAuthorName;
        return this;
    }
    public String getExcludeAtAuthorName() {
        return this.excludeAtAuthorName;
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

    public SearchCondition setExcludeKeywordTagIds(String excludeKeywordTagIds) {
        this.excludeKeywordTagIds = excludeKeywordTagIds;
        return this;
    }
    public String getExcludeKeywordTagIds() {
        return this.excludeKeywordTagIds;
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

    public SearchCondition setExcludeMediaLibraryIds(String excludeMediaLibraryIds) {
        this.excludeMediaLibraryIds = excludeMediaLibraryIds;
        return this;
    }
    public String getExcludeMediaLibraryIds() {
        return this.excludeMediaLibraryIds;
    }

    public SearchCondition setExcludeMediaName(String excludeMediaName) {
        this.excludeMediaName = excludeMediaName;
        return this;
    }
    public String getExcludeMediaName() {
        return this.excludeMediaName;
    }

    public SearchCondition setExcludeMediaType(String excludeMediaType) {
        this.excludeMediaType = excludeMediaType;
        return this;
    }
    public String getExcludeMediaType() {
        return this.excludeMediaType;
    }

    public SearchCondition setExcludeMessageType(String excludeMessageType) {
        this.excludeMessageType = excludeMessageType;
        return this;
    }
    public String getExcludeMessageType() {
        return this.excludeMessageType;
    }

    public SearchCondition setFieldConditions(java.util.List<FieldCondition> fieldConditions) {
        this.fieldConditions = fieldConditions;
        return this;
    }
    public java.util.List<FieldCondition> getFieldConditions() {
        return this.fieldConditions;
    }

    public SearchCondition setHasImage(Boolean hasImage) {
        this.hasImage = hasImage;
        return this;
    }
    public Boolean getHasImage() {
        return this.hasImage;
    }

    public SearchCondition setHasVideo(Boolean hasVideo) {
        this.hasVideo = hasVideo;
        return this;
    }
    public Boolean getHasVideo() {
        return this.hasVideo;
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

    public SearchCondition setLikesLevel(Integer likesLevel) {
        this.likesLevel = likesLevel;
        return this;
    }
    public Integer getLikesLevel() {
        return this.likesLevel;
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

    public SearchCondition setPublishTimeEnd(Long publishTimeEnd) {
        this.publishTimeEnd = publishTimeEnd;
        return this;
    }
    public Long getPublishTimeEnd() {
        return this.publishTimeEnd;
    }

    public SearchCondition setPublishTimeStart(Long publishTimeStart) {
        this.publishTimeStart = publishTimeStart;
        return this;
    }
    public Long getPublishTimeStart() {
        return this.publishTimeStart;
    }

    public SearchCondition setReadsLevel(Integer readsLevel) {
        this.readsLevel = readsLevel;
        return this;
    }
    public Integer getReadsLevel() {
        return this.readsLevel;
    }

    public SearchCondition setRelevanceLevel(Integer relevanceLevel) {
        this.relevanceLevel = relevanceLevel;
        return this;
    }
    public Integer getRelevanceLevel() {
        return this.relevanceLevel;
    }

    public SearchCondition setRepostLevel(Integer repostLevel) {
        this.repostLevel = repostLevel;
        return this;
    }
    public Integer getRepostLevel() {
        return this.repostLevel;
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

    public SearchCondition setTopics(String topics) {
        this.topics = topics;
        return this;
    }
    public String getTopics() {
        return this.topics;
    }

    public SearchCondition setUpdateTimeEnd(Long updateTimeEnd) {
        this.updateTimeEnd = updateTimeEnd;
        return this;
    }
    public Long getUpdateTimeEnd() {
        return this.updateTimeEnd;
    }

    public SearchCondition setUpdateTimeStart(Long updateTimeStart) {
        this.updateTimeStart = updateTimeStart;
        return this;
    }
    public Long getUpdateTimeStart() {
        return this.updateTimeStart;
    }

}
