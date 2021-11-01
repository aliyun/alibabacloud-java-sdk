// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class YuqingMessage extends TeaModel {
    // 广告
    @NameInMap("advertisement")
    public Boolean advertisement;

    // 2088账号
    @NameInMap("alipayAccount")
    public Long alipayAccount;

    // 应用名称
    @NameInMap("appStoreAppName")
    public String appStoreAppName;

    // appstore应用评分
    @NameInMap("appStoreAppScore")
    public Long appStoreAppScore;

    // 应用市场名称
    @NameInMap("appStoreName")
    public String appStoreName;

    // 被at的用户名列表
    @NameInMap("atAuthorNames")
    public java.util.List<String> atAuthorNames;

    // 用户头像地址
    @NameInMap("authorAvatarUrl")
    public String authorAvatarUrl;

    // 作者粉丝数
    @NameInMap("authorFollowersCount")
    public Long authorFollowersCount;

    // 作者好友数
    @NameInMap("authorFriendsCount")
    public Long authorFriendsCount;

    // 外部平台作者id
    @NameInMap("authorId")
    public String authorId;

    // 作者名称
    @NameInMap("authorName")
    public String authorName;

    // 个人主页地址
    @NameInMap("authorProfileUrl")
    public String authorProfileUrl;

    // 发布微博数
    @NameInMap("authorStatusesCount")
    public Long authorStatusesCount;

    // 作者认证类型
    @NameInMap("authorVerifyType")
    public String authorVerifyType;

    // 敏感暴恐政
    @NameInMap("bkz")
    public Boolean bkz;

    // 音频识别出来的文字
    @NameInMap("contentAudioText")
    public String contentAudioText;

    // 音频地址
    @NameInMap("contentAudioUrls")
    public String contentAudioUrls;

    // 情感的正负面，-1代表负面，1代表非负面
    @NameInMap("contentEmotionType")
    public Integer contentEmotionType;

    // 从图片识别出来文字
    @NameInMap("contentImageText")
    public String contentImageText;

    // 内容中的图片列表
    @NameInMap("contentImageUrls")
    public String contentImageUrls;

    // 视频识别出来的文字
    @NameInMap("contentVideoText")
    public String contentVideoText;

    // 视频地址
    @NameInMap("contentVideoUrls")
    public String contentVideoUrls;

    // 回答数
    @NameInMap("docAnswersCount")
    public Long docAnswersCount;

    // 新闻用内容提取的地名,微博用用户的地名,映射归一化
    @NameInMap("docAreas")
    public java.util.List<String> docAreas;

    // 文章评论数
    @NameInMap("docCommentsCount")
    public Long docCommentsCount;

    // 舆情消息内容
    @NameInMap("docContent")
    public String docContent;

    // 文章内容概要，无Html标签，最长保留200个字
    @NameInMap("docContentBrief")
    public String docContentBrief;

    // 文章内容签名，如果是转发微博或者其他有父内容的doc，计算的是父文章的得分。一般用于去重，相同的doc_content_sign说明内容相同
    @NameInMap("docContentSign")
    public String docContentSign;

    // 舆情文章入库时间戳
    @NameInMap("docCreateTime")
    public Long docCreateTime;

    // 文章的关注数
    @NameInMap("docFocusArticleCount")
    public Long docFocusArticleCount;

    // 舆情文章唯一ID
    @NameInMap("docId")
    public String docId;

    // 文章点赞数
    @NameInMap("docLikesCount")
    public Long docLikesCount;

    // 舆情消息类型:转发,评论/回复, 原文,群聊等
    @NameInMap("docMessageType")
    public String docMessageType;

    // 父文章DocID, 比如转发微博的父Id是源微博DocId
    @NameInMap("docParentId")
    public String docParentId;

    // 舆情文章的发布时间戳
    @NameInMap("docPublishTime")
    public Long docPublishTime;

    // 阅读数
    @NameInMap("docReadsCount")
    public Long docReadsCount;

    // 转载数
    @NameInMap("docRepostsCount")
    public Long docRepostsCount;

    // 文章自身的内容签名，转发微博计算的是转发内容的contentSign，与父微博无关
    @NameInMap("docSelfContentSign")
    public String docSelfContentSign;

    // 文章的标题
    @NameInMap("docTitle")
    public String docTitle;

    // 文章标题，无Html标签
    @NameInMap("docTitleBrief")
    public String docTitleBrief;

    // 原文链接
    @NameInMap("docUrl")
    public String docUrl;

    // 业务自定义字段透传docUserDefineJson
    @NameInMap("docUserDefineJson")
    public String docUserDefineJson;

    // 情感得分
    @NameInMap("emotionScore")
    public String emotionScore;

    // 实体别名
    @NameInMap("entityAlias")
    public String entityAlias;

    // 实体相关度得分，0-1,两位小数
    @NameInMap("entityRelevancyScore")
    public String entityRelevancyScore;

    // 是否色情内容
    @NameInMap("eroticism")
    public Boolean eroticism;

    // 内容的暴恐政色得分，0-10，值越大说明内容越敏感
    @NameInMap("eroticismScoreFmt")
    public String eroticismScoreFmt;

    // 舆情文章提取出来的金融事件列表
    @NameInMap("financeEvents")
    public java.util.List<FinanceEvent> financeEvents;

    // 是否涉及赌博
    @NameInMap("gambling")
    public Boolean gambling;

    // 如果查询条件中有搭配词，那么这个字段存储文章中命中的搭配词列表
    @NameInMap("highlightAssKeywords")
    public java.util.List<String> highlightAssKeywords;

    // 在指定关键词、搭配词的情况下，返回文章内命中的词列表
    @NameInMap("highlightKeywords")
    public java.util.List<String> highlightKeywords;

    // 如果查询条件中有关键词，那么这个字段保存文章中命中的关键词列表
    @NameInMap("highlightPosKeywords")
    public java.util.List<String> highlightPosKeywords;

    // 文章内容中的图片个数
    @NameInMap("imageCount")
    public Long imageCount;

    // 站点来源host列表
    @NameInMap("mediaHosts")
    public java.util.List<String> mediaHosts;

    // 媒体影响力等级，0-4，值越大影响力越大
    @NameInMap("mediaInfluenceLevel")
    public Integer mediaInfluenceLevel;

    // 媒体影响力 0-10,两位小数
    @NameInMap("mediaInfluenceScore")
    public String mediaInfluenceScore;

    // 媒体名称
    @NameInMap("mediaName")
    public String mediaName;

    // 媒体传播得分，0-10,两位小数
    @NameInMap("mediaPropagationScore")
    public String mediaPropagationScore;

    // IM软件群聊天名称
    @NameInMap("mediaQunName")
    public String mediaQunName;

    // 媒体地域信息: 城市
    @NameInMap("mediaResCity")
    public String mediaResCity;

    // 媒体地域信息: 国家
    @NameInMap("mediaResCountry")
    public String mediaResCountry;

    // 媒体地域信息: 省份
    @NameInMap("mediaResProvince")
    public String mediaResProvince;

    // 媒体类型，枚举值
    @NameInMap("mediaType")
    public String mediaType;

    // 疑似首发媒体列表
    @NameInMap("originalMedia")
    public java.util.List<String> originalMedia;

    // 关键词/搭配词与文章内容的相关性得分，0-10分，值越大相关性越高
    @NameInMap("relevanceScoreFmt")
    public String relevanceScoreFmt;

    // 相似文章数
    @NameInMap("similarNumber")
    public Integer similarNumber;

    // 是否垃圾内容
    @NameInMap("spam")
    public Boolean spam;

    // 用户情感分值
    @NameInMap("ueEmotionScore")
    public String ueEmotionScore;

    // 微博评论的外部ID
    @NameInMap("weiboCommentId")
    public String weiboCommentId;

    // 微博外部ID
    @NameInMap("weiboMid")
    public String weiboMid;

    public static YuqingMessage build(java.util.Map<String, ?> map) throws Exception {
        YuqingMessage self = new YuqingMessage();
        return TeaModel.build(map, self);
    }

    public YuqingMessage setAdvertisement(Boolean advertisement) {
        this.advertisement = advertisement;
        return this;
    }
    public Boolean getAdvertisement() {
        return this.advertisement;
    }

    public YuqingMessage setAlipayAccount(Long alipayAccount) {
        this.alipayAccount = alipayAccount;
        return this;
    }
    public Long getAlipayAccount() {
        return this.alipayAccount;
    }

    public YuqingMessage setAppStoreAppName(String appStoreAppName) {
        this.appStoreAppName = appStoreAppName;
        return this;
    }
    public String getAppStoreAppName() {
        return this.appStoreAppName;
    }

    public YuqingMessage setAppStoreAppScore(Long appStoreAppScore) {
        this.appStoreAppScore = appStoreAppScore;
        return this;
    }
    public Long getAppStoreAppScore() {
        return this.appStoreAppScore;
    }

    public YuqingMessage setAppStoreName(String appStoreName) {
        this.appStoreName = appStoreName;
        return this;
    }
    public String getAppStoreName() {
        return this.appStoreName;
    }

    public YuqingMessage setAtAuthorNames(java.util.List<String> atAuthorNames) {
        this.atAuthorNames = atAuthorNames;
        return this;
    }
    public java.util.List<String> getAtAuthorNames() {
        return this.atAuthorNames;
    }

    public YuqingMessage setAuthorAvatarUrl(String authorAvatarUrl) {
        this.authorAvatarUrl = authorAvatarUrl;
        return this;
    }
    public String getAuthorAvatarUrl() {
        return this.authorAvatarUrl;
    }

    public YuqingMessage setAuthorFollowersCount(Long authorFollowersCount) {
        this.authorFollowersCount = authorFollowersCount;
        return this;
    }
    public Long getAuthorFollowersCount() {
        return this.authorFollowersCount;
    }

    public YuqingMessage setAuthorFriendsCount(Long authorFriendsCount) {
        this.authorFriendsCount = authorFriendsCount;
        return this;
    }
    public Long getAuthorFriendsCount() {
        return this.authorFriendsCount;
    }

    public YuqingMessage setAuthorId(String authorId) {
        this.authorId = authorId;
        return this;
    }
    public String getAuthorId() {
        return this.authorId;
    }

    public YuqingMessage setAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }
    public String getAuthorName() {
        return this.authorName;
    }

    public YuqingMessage setAuthorProfileUrl(String authorProfileUrl) {
        this.authorProfileUrl = authorProfileUrl;
        return this;
    }
    public String getAuthorProfileUrl() {
        return this.authorProfileUrl;
    }

    public YuqingMessage setAuthorStatusesCount(Long authorStatusesCount) {
        this.authorStatusesCount = authorStatusesCount;
        return this;
    }
    public Long getAuthorStatusesCount() {
        return this.authorStatusesCount;
    }

    public YuqingMessage setAuthorVerifyType(String authorVerifyType) {
        this.authorVerifyType = authorVerifyType;
        return this;
    }
    public String getAuthorVerifyType() {
        return this.authorVerifyType;
    }

    public YuqingMessage setBkz(Boolean bkz) {
        this.bkz = bkz;
        return this;
    }
    public Boolean getBkz() {
        return this.bkz;
    }

    public YuqingMessage setContentAudioText(String contentAudioText) {
        this.contentAudioText = contentAudioText;
        return this;
    }
    public String getContentAudioText() {
        return this.contentAudioText;
    }

    public YuqingMessage setContentAudioUrls(String contentAudioUrls) {
        this.contentAudioUrls = contentAudioUrls;
        return this;
    }
    public String getContentAudioUrls() {
        return this.contentAudioUrls;
    }

    public YuqingMessage setContentEmotionType(Integer contentEmotionType) {
        this.contentEmotionType = contentEmotionType;
        return this;
    }
    public Integer getContentEmotionType() {
        return this.contentEmotionType;
    }

    public YuqingMessage setContentImageText(String contentImageText) {
        this.contentImageText = contentImageText;
        return this;
    }
    public String getContentImageText() {
        return this.contentImageText;
    }

    public YuqingMessage setContentImageUrls(String contentImageUrls) {
        this.contentImageUrls = contentImageUrls;
        return this;
    }
    public String getContentImageUrls() {
        return this.contentImageUrls;
    }

    public YuqingMessage setContentVideoText(String contentVideoText) {
        this.contentVideoText = contentVideoText;
        return this;
    }
    public String getContentVideoText() {
        return this.contentVideoText;
    }

    public YuqingMessage setContentVideoUrls(String contentVideoUrls) {
        this.contentVideoUrls = contentVideoUrls;
        return this;
    }
    public String getContentVideoUrls() {
        return this.contentVideoUrls;
    }

    public YuqingMessage setDocAnswersCount(Long docAnswersCount) {
        this.docAnswersCount = docAnswersCount;
        return this;
    }
    public Long getDocAnswersCount() {
        return this.docAnswersCount;
    }

    public YuqingMessage setDocAreas(java.util.List<String> docAreas) {
        this.docAreas = docAreas;
        return this;
    }
    public java.util.List<String> getDocAreas() {
        return this.docAreas;
    }

    public YuqingMessage setDocCommentsCount(Long docCommentsCount) {
        this.docCommentsCount = docCommentsCount;
        return this;
    }
    public Long getDocCommentsCount() {
        return this.docCommentsCount;
    }

    public YuqingMessage setDocContent(String docContent) {
        this.docContent = docContent;
        return this;
    }
    public String getDocContent() {
        return this.docContent;
    }

    public YuqingMessage setDocContentBrief(String docContentBrief) {
        this.docContentBrief = docContentBrief;
        return this;
    }
    public String getDocContentBrief() {
        return this.docContentBrief;
    }

    public YuqingMessage setDocContentSign(String docContentSign) {
        this.docContentSign = docContentSign;
        return this;
    }
    public String getDocContentSign() {
        return this.docContentSign;
    }

    public YuqingMessage setDocCreateTime(Long docCreateTime) {
        this.docCreateTime = docCreateTime;
        return this;
    }
    public Long getDocCreateTime() {
        return this.docCreateTime;
    }

    public YuqingMessage setDocFocusArticleCount(Long docFocusArticleCount) {
        this.docFocusArticleCount = docFocusArticleCount;
        return this;
    }
    public Long getDocFocusArticleCount() {
        return this.docFocusArticleCount;
    }

    public YuqingMessage setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public YuqingMessage setDocLikesCount(Long docLikesCount) {
        this.docLikesCount = docLikesCount;
        return this;
    }
    public Long getDocLikesCount() {
        return this.docLikesCount;
    }

    public YuqingMessage setDocMessageType(String docMessageType) {
        this.docMessageType = docMessageType;
        return this;
    }
    public String getDocMessageType() {
        return this.docMessageType;
    }

    public YuqingMessage setDocParentId(String docParentId) {
        this.docParentId = docParentId;
        return this;
    }
    public String getDocParentId() {
        return this.docParentId;
    }

    public YuqingMessage setDocPublishTime(Long docPublishTime) {
        this.docPublishTime = docPublishTime;
        return this;
    }
    public Long getDocPublishTime() {
        return this.docPublishTime;
    }

    public YuqingMessage setDocReadsCount(Long docReadsCount) {
        this.docReadsCount = docReadsCount;
        return this;
    }
    public Long getDocReadsCount() {
        return this.docReadsCount;
    }

    public YuqingMessage setDocRepostsCount(Long docRepostsCount) {
        this.docRepostsCount = docRepostsCount;
        return this;
    }
    public Long getDocRepostsCount() {
        return this.docRepostsCount;
    }

    public YuqingMessage setDocSelfContentSign(String docSelfContentSign) {
        this.docSelfContentSign = docSelfContentSign;
        return this;
    }
    public String getDocSelfContentSign() {
        return this.docSelfContentSign;
    }

    public YuqingMessage setDocTitle(String docTitle) {
        this.docTitle = docTitle;
        return this;
    }
    public String getDocTitle() {
        return this.docTitle;
    }

    public YuqingMessage setDocTitleBrief(String docTitleBrief) {
        this.docTitleBrief = docTitleBrief;
        return this;
    }
    public String getDocTitleBrief() {
        return this.docTitleBrief;
    }

    public YuqingMessage setDocUrl(String docUrl) {
        this.docUrl = docUrl;
        return this;
    }
    public String getDocUrl() {
        return this.docUrl;
    }

    public YuqingMessage setDocUserDefineJson(String docUserDefineJson) {
        this.docUserDefineJson = docUserDefineJson;
        return this;
    }
    public String getDocUserDefineJson() {
        return this.docUserDefineJson;
    }

    public YuqingMessage setEmotionScore(String emotionScore) {
        this.emotionScore = emotionScore;
        return this;
    }
    public String getEmotionScore() {
        return this.emotionScore;
    }

    public YuqingMessage setEntityAlias(String entityAlias) {
        this.entityAlias = entityAlias;
        return this;
    }
    public String getEntityAlias() {
        return this.entityAlias;
    }

    public YuqingMessage setEntityRelevancyScore(String entityRelevancyScore) {
        this.entityRelevancyScore = entityRelevancyScore;
        return this;
    }
    public String getEntityRelevancyScore() {
        return this.entityRelevancyScore;
    }

    public YuqingMessage setEroticism(Boolean eroticism) {
        this.eroticism = eroticism;
        return this;
    }
    public Boolean getEroticism() {
        return this.eroticism;
    }

    public YuqingMessage setEroticismScoreFmt(String eroticismScoreFmt) {
        this.eroticismScoreFmt = eroticismScoreFmt;
        return this;
    }
    public String getEroticismScoreFmt() {
        return this.eroticismScoreFmt;
    }

    public YuqingMessage setFinanceEvents(java.util.List<FinanceEvent> financeEvents) {
        this.financeEvents = financeEvents;
        return this;
    }
    public java.util.List<FinanceEvent> getFinanceEvents() {
        return this.financeEvents;
    }

    public YuqingMessage setGambling(Boolean gambling) {
        this.gambling = gambling;
        return this;
    }
    public Boolean getGambling() {
        return this.gambling;
    }

    public YuqingMessage setHighlightAssKeywords(java.util.List<String> highlightAssKeywords) {
        this.highlightAssKeywords = highlightAssKeywords;
        return this;
    }
    public java.util.List<String> getHighlightAssKeywords() {
        return this.highlightAssKeywords;
    }

    public YuqingMessage setHighlightKeywords(java.util.List<String> highlightKeywords) {
        this.highlightKeywords = highlightKeywords;
        return this;
    }
    public java.util.List<String> getHighlightKeywords() {
        return this.highlightKeywords;
    }

    public YuqingMessage setHighlightPosKeywords(java.util.List<String> highlightPosKeywords) {
        this.highlightPosKeywords = highlightPosKeywords;
        return this;
    }
    public java.util.List<String> getHighlightPosKeywords() {
        return this.highlightPosKeywords;
    }

    public YuqingMessage setImageCount(Long imageCount) {
        this.imageCount = imageCount;
        return this;
    }
    public Long getImageCount() {
        return this.imageCount;
    }

    public YuqingMessage setMediaHosts(java.util.List<String> mediaHosts) {
        this.mediaHosts = mediaHosts;
        return this;
    }
    public java.util.List<String> getMediaHosts() {
        return this.mediaHosts;
    }

    public YuqingMessage setMediaInfluenceLevel(Integer mediaInfluenceLevel) {
        this.mediaInfluenceLevel = mediaInfluenceLevel;
        return this;
    }
    public Integer getMediaInfluenceLevel() {
        return this.mediaInfluenceLevel;
    }

    public YuqingMessage setMediaInfluenceScore(String mediaInfluenceScore) {
        this.mediaInfluenceScore = mediaInfluenceScore;
        return this;
    }
    public String getMediaInfluenceScore() {
        return this.mediaInfluenceScore;
    }

    public YuqingMessage setMediaName(String mediaName) {
        this.mediaName = mediaName;
        return this;
    }
    public String getMediaName() {
        return this.mediaName;
    }

    public YuqingMessage setMediaPropagationScore(String mediaPropagationScore) {
        this.mediaPropagationScore = mediaPropagationScore;
        return this;
    }
    public String getMediaPropagationScore() {
        return this.mediaPropagationScore;
    }

    public YuqingMessage setMediaQunName(String mediaQunName) {
        this.mediaQunName = mediaQunName;
        return this;
    }
    public String getMediaQunName() {
        return this.mediaQunName;
    }

    public YuqingMessage setMediaResCity(String mediaResCity) {
        this.mediaResCity = mediaResCity;
        return this;
    }
    public String getMediaResCity() {
        return this.mediaResCity;
    }

    public YuqingMessage setMediaResCountry(String mediaResCountry) {
        this.mediaResCountry = mediaResCountry;
        return this;
    }
    public String getMediaResCountry() {
        return this.mediaResCountry;
    }

    public YuqingMessage setMediaResProvince(String mediaResProvince) {
        this.mediaResProvince = mediaResProvince;
        return this;
    }
    public String getMediaResProvince() {
        return this.mediaResProvince;
    }

    public YuqingMessage setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public YuqingMessage setOriginalMedia(java.util.List<String> originalMedia) {
        this.originalMedia = originalMedia;
        return this;
    }
    public java.util.List<String> getOriginalMedia() {
        return this.originalMedia;
    }

    public YuqingMessage setRelevanceScoreFmt(String relevanceScoreFmt) {
        this.relevanceScoreFmt = relevanceScoreFmt;
        return this;
    }
    public String getRelevanceScoreFmt() {
        return this.relevanceScoreFmt;
    }

    public YuqingMessage setSimilarNumber(Integer similarNumber) {
        this.similarNumber = similarNumber;
        return this;
    }
    public Integer getSimilarNumber() {
        return this.similarNumber;
    }

    public YuqingMessage setSpam(Boolean spam) {
        this.spam = spam;
        return this;
    }
    public Boolean getSpam() {
        return this.spam;
    }

    public YuqingMessage setUeEmotionScore(String ueEmotionScore) {
        this.ueEmotionScore = ueEmotionScore;
        return this;
    }
    public String getUeEmotionScore() {
        return this.ueEmotionScore;
    }

    public YuqingMessage setWeiboCommentId(String weiboCommentId) {
        this.weiboCommentId = weiboCommentId;
        return this;
    }
    public String getWeiboCommentId() {
        return this.weiboCommentId;
    }

    public YuqingMessage setWeiboMid(String weiboMid) {
        this.weiboMid = weiboMid;
        return this;
    }
    public String getWeiboMid() {
        return this.weiboMid;
    }

}
