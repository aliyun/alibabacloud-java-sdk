// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class YuqingHotspotMessage extends TeaModel {
    // 分类
    @NameInMap("category")
    public String category;

    // 评论数
    @NameInMap("commentsCount")
    public Long commentsCount;

    // 爬虫爬取的时间
    @NameInMap("crawlerTimeFmt")
    public String crawlerTimeFmt;

    // 讨论数
    @NameInMap("discussesCount")
    public Long discussesCount;

    // 内容，热榜数据中存在着文章，热文就是有内容的
    @NameInMap("docContent")
    public String docContent;

    // 文档id
    @NameInMap("docId")
    public String docId;

    // 标题，例如话题的标题就是话题本身
    @NameInMap("docTitle")
    public String docTitle;

    // 链接地址
    @NameInMap("docUrl")
    public String docUrl;

    // 第一次上榜的时间
    @NameInMap("firstExistTimestamp")
    public Long firstExistTimestamp;

    // 首次上榜热度
    @NameInMap("firstHotValue")
    public Long firstHotValue;

    // 首次上榜排名
    @NameInMap("firstRank")
    public Integer firstRank;

    // 跟随量
    @NameInMap("followersCount")
    public Long followersCount;

    // 热度值
    @NameInMap("hotValue")
    public Long hotValue;

    // 热搜内容类型
    @NameInMap("hotspotType")
    public String hotspotType;

    // 最后一次上榜的时间
    @NameInMap("lastExistTimestamp")
    public Long lastExistTimestamp;

    // 下榜排名
    @NameInMap("lastRank")
    public Integer lastRank;

    // 最大的热度值
    @NameInMap("maxHotValue")
    public Long maxHotValue;

    // 在榜单中的最高排名
    @NameInMap("maxRank")
    public Integer maxRank;

    // 渠道子类型
    @NameInMap("mediaSubType")
    public String mediaSubType;

    // 渠道类型
    @NameInMap("mediaType")
    public String mediaType;

    // 原创人数
    @NameInMap("originalCount")
    public Long originalCount;

    // 热搜在热搜榜的位置
    @NameInMap("rank")
    public Integer rank;

    // 阅读数
    @NameInMap("readsCount")
    public Long readsCount;

    // 用户名
    @NameInMap("screenName")
    public String screenName;

    // 在榜总时间
    @NameInMap("totalExistTimestamp")
    public Long totalExistTimestamp;

    // 用户id
    @NameInMap("userId")
    public String userId;

    // 视频量
    @NameInMap("videoCount")
    public Long videoCount;

    public static YuqingHotspotMessage build(java.util.Map<String, ?> map) throws Exception {
        YuqingHotspotMessage self = new YuqingHotspotMessage();
        return TeaModel.build(map, self);
    }

    public YuqingHotspotMessage setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public YuqingHotspotMessage setCommentsCount(Long commentsCount) {
        this.commentsCount = commentsCount;
        return this;
    }
    public Long getCommentsCount() {
        return this.commentsCount;
    }

    public YuqingHotspotMessage setCrawlerTimeFmt(String crawlerTimeFmt) {
        this.crawlerTimeFmt = crawlerTimeFmt;
        return this;
    }
    public String getCrawlerTimeFmt() {
        return this.crawlerTimeFmt;
    }

    public YuqingHotspotMessage setDiscussesCount(Long discussesCount) {
        this.discussesCount = discussesCount;
        return this;
    }
    public Long getDiscussesCount() {
        return this.discussesCount;
    }

    public YuqingHotspotMessage setDocContent(String docContent) {
        this.docContent = docContent;
        return this;
    }
    public String getDocContent() {
        return this.docContent;
    }

    public YuqingHotspotMessage setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public YuqingHotspotMessage setDocTitle(String docTitle) {
        this.docTitle = docTitle;
        return this;
    }
    public String getDocTitle() {
        return this.docTitle;
    }

    public YuqingHotspotMessage setDocUrl(String docUrl) {
        this.docUrl = docUrl;
        return this;
    }
    public String getDocUrl() {
        return this.docUrl;
    }

    public YuqingHotspotMessage setFirstExistTimestamp(Long firstExistTimestamp) {
        this.firstExistTimestamp = firstExistTimestamp;
        return this;
    }
    public Long getFirstExistTimestamp() {
        return this.firstExistTimestamp;
    }

    public YuqingHotspotMessage setFirstHotValue(Long firstHotValue) {
        this.firstHotValue = firstHotValue;
        return this;
    }
    public Long getFirstHotValue() {
        return this.firstHotValue;
    }

    public YuqingHotspotMessage setFirstRank(Integer firstRank) {
        this.firstRank = firstRank;
        return this;
    }
    public Integer getFirstRank() {
        return this.firstRank;
    }

    public YuqingHotspotMessage setFollowersCount(Long followersCount) {
        this.followersCount = followersCount;
        return this;
    }
    public Long getFollowersCount() {
        return this.followersCount;
    }

    public YuqingHotspotMessage setHotValue(Long hotValue) {
        this.hotValue = hotValue;
        return this;
    }
    public Long getHotValue() {
        return this.hotValue;
    }

    public YuqingHotspotMessage setHotspotType(String hotspotType) {
        this.hotspotType = hotspotType;
        return this;
    }
    public String getHotspotType() {
        return this.hotspotType;
    }

    public YuqingHotspotMessage setLastExistTimestamp(Long lastExistTimestamp) {
        this.lastExistTimestamp = lastExistTimestamp;
        return this;
    }
    public Long getLastExistTimestamp() {
        return this.lastExistTimestamp;
    }

    public YuqingHotspotMessage setLastRank(Integer lastRank) {
        this.lastRank = lastRank;
        return this;
    }
    public Integer getLastRank() {
        return this.lastRank;
    }

    public YuqingHotspotMessage setMaxHotValue(Long maxHotValue) {
        this.maxHotValue = maxHotValue;
        return this;
    }
    public Long getMaxHotValue() {
        return this.maxHotValue;
    }

    public YuqingHotspotMessage setMaxRank(Integer maxRank) {
        this.maxRank = maxRank;
        return this;
    }
    public Integer getMaxRank() {
        return this.maxRank;
    }

    public YuqingHotspotMessage setMediaSubType(String mediaSubType) {
        this.mediaSubType = mediaSubType;
        return this;
    }
    public String getMediaSubType() {
        return this.mediaSubType;
    }

    public YuqingHotspotMessage setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public YuqingHotspotMessage setOriginalCount(Long originalCount) {
        this.originalCount = originalCount;
        return this;
    }
    public Long getOriginalCount() {
        return this.originalCount;
    }

    public YuqingHotspotMessage setRank(Integer rank) {
        this.rank = rank;
        return this;
    }
    public Integer getRank() {
        return this.rank;
    }

    public YuqingHotspotMessage setReadsCount(Long readsCount) {
        this.readsCount = readsCount;
        return this;
    }
    public Long getReadsCount() {
        return this.readsCount;
    }

    public YuqingHotspotMessage setScreenName(String screenName) {
        this.screenName = screenName;
        return this;
    }
    public String getScreenName() {
        return this.screenName;
    }

    public YuqingHotspotMessage setTotalExistTimestamp(Long totalExistTimestamp) {
        this.totalExistTimestamp = totalExistTimestamp;
        return this;
    }
    public Long getTotalExistTimestamp() {
        return this.totalExistTimestamp;
    }

    public YuqingHotspotMessage setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public YuqingHotspotMessage setVideoCount(Long videoCount) {
        this.videoCount = videoCount;
        return this;
    }
    public Long getVideoCount() {
        return this.videoCount;
    }

}
