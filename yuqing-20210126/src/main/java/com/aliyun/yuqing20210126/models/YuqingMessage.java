// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class YuqingMessage extends TeaModel {
    @NameInMap("advertisement")
    public Boolean advertisement;

    @NameInMap("alipayAccount")
    public Long alipayAccount;

    @NameInMap("appStoreAppName")
    public String appStoreAppName;

    @NameInMap("appStoreAppScore")
    public Long appStoreAppScore;

    @NameInMap("appStoreName")
    public String appStoreName;

    @NameInMap("atAuthorNames")
    public java.util.List<String> atAuthorNames;

    @NameInMap("authorAvatarUrl")
    public String authorAvatarUrl;

    @NameInMap("authorFollowersCount")
    public Long authorFollowersCount;

    @NameInMap("authorFriendsCount")
    public Long authorFriendsCount;

    @NameInMap("authorId")
    public String authorId;

    @NameInMap("authorName")
    public String authorName;

    @NameInMap("authorProfileUrl")
    public String authorProfileUrl;

    @NameInMap("authorStatusesCount")
    public Long authorStatusesCount;

    @NameInMap("authorVerifyType")
    public String authorVerifyType;

    @NameInMap("bkz")
    public Boolean bkz;

    @NameInMap("contentAudioText")
    public String contentAudioText;

    @NameInMap("contentAudioUrls")
    public String contentAudioUrls;

    @NameInMap("contentEmotionType")
    public Integer contentEmotionType;

    @NameInMap("contentImageText")
    public String contentImageText;

    @NameInMap("contentImageUrls")
    public String contentImageUrls;

    @NameInMap("contentVideoText")
    public String contentVideoText;

    @NameInMap("contentVideoUrls")
    public String contentVideoUrls;

    @NameInMap("docAnswersCount")
    public Long docAnswersCount;

    @NameInMap("docAreas")
    public java.util.List<String> docAreas;

    @NameInMap("docCommentsCount")
    public Long docCommentsCount;

    @NameInMap("docContent")
    public String docContent;

    @NameInMap("docContentBrief")
    public String docContentBrief;

    @NameInMap("docContentSign")
    public String docContentSign;

    @NameInMap("docCreateTime")
    public Long docCreateTime;

    @NameInMap("docFocusArticleCount")
    public Long docFocusArticleCount;

    @NameInMap("docId")
    public String docId;

    @NameInMap("docLikesCount")
    public Long docLikesCount;

    @NameInMap("docMessageType")
    public String docMessageType;

    @NameInMap("docParentId")
    public String docParentId;

    @NameInMap("docPublishTime")
    public Long docPublishTime;

    @NameInMap("docReadsCount")
    public Long docReadsCount;

    @NameInMap("docRepostsCount")
    public Long docRepostsCount;

    @NameInMap("docSelfContentSign")
    public String docSelfContentSign;

    @NameInMap("docTitle")
    public String docTitle;

    @NameInMap("docTitleBrief")
    public String docTitleBrief;

    @NameInMap("docUrl")
    public String docUrl;

    @NameInMap("docUserDefineJson")
    public String docUserDefineJson;

    @NameInMap("emotionScore")
    public String emotionScore;

    @NameInMap("entityAlias")
    public String entityAlias;

    @NameInMap("entityRelevancyScore")
    public String entityRelevancyScore;

    @NameInMap("eroticism")
    public Boolean eroticism;

    @NameInMap("eroticismScoreFmt")
    public String eroticismScoreFmt;

    @NameInMap("financeEvents")
    public java.util.List<FinanceEvent> financeEvents;

    @NameInMap("gambling")
    public Boolean gambling;

    @NameInMap("highlightAssKeywords")
    public java.util.List<String> highlightAssKeywords;

    @NameInMap("highlightKeywords")
    public java.util.List<String> highlightKeywords;

    @NameInMap("highlightPosKeywords")
    public java.util.List<String> highlightPosKeywords;

    @NameInMap("imageCount")
    public Long imageCount;

    @NameInMap("mediaHosts")
    public java.util.List<String> mediaHosts;

    @NameInMap("mediaInfluenceLevel")
    public Integer mediaInfluenceLevel;

    @NameInMap("mediaInfluenceScore")
    public String mediaInfluenceScore;

    @NameInMap("mediaName")
    public String mediaName;

    @NameInMap("mediaPropagationScore")
    public String mediaPropagationScore;

    @NameInMap("mediaQunName")
    public String mediaQunName;

    @NameInMap("mediaResCity")
    public String mediaResCity;

    @NameInMap("mediaResCountry")
    public String mediaResCountry;

    @NameInMap("mediaResProvince")
    public String mediaResProvince;

    @NameInMap("mediaType")
    public String mediaType;

    @NameInMap("originalMedia")
    public java.util.List<String> originalMedia;

    @NameInMap("relevanceScoreFmt")
    public String relevanceScoreFmt;

    @NameInMap("similarNumber")
    public Integer similarNumber;

    @NameInMap("spam")
    public Boolean spam;

    @NameInMap("ueEmotionScore")
    public String ueEmotionScore;

    @NameInMap("weiboCommentId")
    public String weiboCommentId;

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
