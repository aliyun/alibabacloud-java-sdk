// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class YuqingMessage extends TeaModel {
    @NameInMap("appName")
    public String appName;

    @NameInMap("appScore")
    public Long appScore;

    @NameInMap("appStoreName")
    public String appStoreName;

    @NameInMap("atAuthorNames")
    public java.util.List<String> atAuthorNames;

    @NameInMap("audioCount")
    public Integer audioCount;

    @NameInMap("authorAvatarUrl")
    public String authorAvatarUrl;

    @NameInMap("authorFollowersCount")
    public Long authorFollowersCount;

    @NameInMap("authorFriendsCount")
    public Long authorFriendsCount;

    @NameInMap("authorGender")
    public String authorGender;

    @NameInMap("authorId")
    public String authorId;

    @NameInMap("authorLikesCount")
    public Long authorLikesCount;

    @NameInMap("authorName")
    public String authorName;

    @NameInMap("authorProfileUrl")
    public String authorProfileUrl;

    @NameInMap("authorStatusesCount")
    public Long authorStatusesCount;

    @NameInMap("authorVerified")
    public Boolean authorVerified;

    @NameInMap("authorVerifyType")
    public Integer authorVerifyType;

    @NameInMap("contentAudioText")
    public String contentAudioText;

    @NameInMap("contentAudioUrls")
    public String contentAudioUrls;

    @NameInMap("contentImageText")
    public String contentImageText;

    @NameInMap("contentImageUrls")
    public String contentImageUrls;

    @NameInMap("contentLang")
    public String contentLang;

    @NameInMap("contentLen")
    public Long contentLen;

    @NameInMap("contentVideoText")
    public String contentVideoText;

    @NameInMap("contentVideoUrls")
    public String contentVideoUrls;

    @NameInMap("createTime")
    public Long createTime;

    @NameInMap("docAnswersCount")
    public Long docAnswersCount;

    @NameInMap("docAreas")
    public java.util.List<String> docAreas;

    @NameInMap("docCoinCount")
    public Long docCoinCount;

    @NameInMap("docCommentsCount")
    public Long docCommentsCount;

    @NameInMap("docContent")
    public String docContent;

    @NameInMap("docContentBrief")
    public String docContentBrief;

    @NameInMap("docContentSign")
    public String docContentSign;

    @NameInMap("docId")
    public String docId;

    @NameInMap("docLikesCount")
    public Long docLikesCount;

    @NameInMap("docPlayCount")
    public Long docPlayCount;

    @NameInMap("docReadingCount")
    public Long docReadingCount;

    @NameInMap("docReadsCount")
    public Long docReadsCount;

    @NameInMap("docRepostsCount")
    public Long docRepostsCount;

    @NameInMap("docReprintName")
    public String docReprintName;

    @NameInMap("docSelfContentSign")
    public String docSelfContentSign;

    @NameInMap("docTitle")
    public String docTitle;

    @NameInMap("docUrl")
    public String docUrl;

    @NameInMap("emotionScore")
    public Double emotionScore;

    @NameInMap("emotionType")
    public Integer emotionType;

    @NameInMap("extInfo")
    public java.util.Map<String, String> extInfo;

    @NameInMap("finEventCount")
    public Integer finEventCount;

    @NameInMap("financeEventList")
    public YuqingFinanceEvent financeEventList;

    @NameInMap("highlightKeywords")
    public java.util.List<String> highlightKeywords;

    @NameInMap("imageCount")
    public Integer imageCount;

    @NameInMap("influenceScore")
    public Double influenceScore;

    @NameInMap("mediaHosts")
    public java.util.List<String> mediaHosts;

    @NameInMap("mediaInfluenceLevel")
    public Integer mediaInfluenceLevel;

    @NameInMap("mediaName")
    public String mediaName;

    @NameInMap("mediaPropagationLevel")
    public Integer mediaPropagationLevel;

    @NameInMap("mediaType")
    public String mediaType;

    @NameInMap("messageType")
    public String messageType;

    @NameInMap("parentDocId")
    public String parentDocId;

    @NameInMap("propagationScore")
    public Double propagationScore;

    @NameInMap("publishTime")
    public Long publishTime;

    @NameInMap("relevanceScore")
    public Double relevanceScore;

    @NameInMap("reportMaterialTags")
    public java.util.List<String> reportMaterialTags;

    @NameInMap("repostList")
    public java.util.List<String> repostList;

    @NameInMap("similarNumber")
    public Integer similarNumber;

    @NameInMap("topics")
    public java.util.List<String> topics;

    @NameInMap("videoCount")
    public Integer videoCount;

    @NameInMap("weiboCommentId")
    public String weiboCommentId;

    @NameInMap("weiboMid")
    public String weiboMid;

    public static YuqingMessage build(java.util.Map<String, ?> map) throws Exception {
        YuqingMessage self = new YuqingMessage();
        return TeaModel.build(map, self);
    }

    public YuqingMessage setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public YuqingMessage setAppScore(Long appScore) {
        this.appScore = appScore;
        return this;
    }
    public Long getAppScore() {
        return this.appScore;
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

    public YuqingMessage setAudioCount(Integer audioCount) {
        this.audioCount = audioCount;
        return this;
    }
    public Integer getAudioCount() {
        return this.audioCount;
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

    public YuqingMessage setAuthorGender(String authorGender) {
        this.authorGender = authorGender;
        return this;
    }
    public String getAuthorGender() {
        return this.authorGender;
    }

    public YuqingMessage setAuthorId(String authorId) {
        this.authorId = authorId;
        return this;
    }
    public String getAuthorId() {
        return this.authorId;
    }

    public YuqingMessage setAuthorLikesCount(Long authorLikesCount) {
        this.authorLikesCount = authorLikesCount;
        return this;
    }
    public Long getAuthorLikesCount() {
        return this.authorLikesCount;
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

    public YuqingMessage setAuthorVerified(Boolean authorVerified) {
        this.authorVerified = authorVerified;
        return this;
    }
    public Boolean getAuthorVerified() {
        return this.authorVerified;
    }

    public YuqingMessage setAuthorVerifyType(Integer authorVerifyType) {
        this.authorVerifyType = authorVerifyType;
        return this;
    }
    public Integer getAuthorVerifyType() {
        return this.authorVerifyType;
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

    public YuqingMessage setContentLang(String contentLang) {
        this.contentLang = contentLang;
        return this;
    }
    public String getContentLang() {
        return this.contentLang;
    }

    public YuqingMessage setContentLen(Long contentLen) {
        this.contentLen = contentLen;
        return this;
    }
    public Long getContentLen() {
        return this.contentLen;
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

    public YuqingMessage setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
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

    public YuqingMessage setDocCoinCount(Long docCoinCount) {
        this.docCoinCount = docCoinCount;
        return this;
    }
    public Long getDocCoinCount() {
        return this.docCoinCount;
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

    public YuqingMessage setDocPlayCount(Long docPlayCount) {
        this.docPlayCount = docPlayCount;
        return this;
    }
    public Long getDocPlayCount() {
        return this.docPlayCount;
    }

    public YuqingMessage setDocReadingCount(Long docReadingCount) {
        this.docReadingCount = docReadingCount;
        return this;
    }
    public Long getDocReadingCount() {
        return this.docReadingCount;
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

    public YuqingMessage setDocReprintName(String docReprintName) {
        this.docReprintName = docReprintName;
        return this;
    }
    public String getDocReprintName() {
        return this.docReprintName;
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

    public YuqingMessage setDocUrl(String docUrl) {
        this.docUrl = docUrl;
        return this;
    }
    public String getDocUrl() {
        return this.docUrl;
    }

    public YuqingMessage setEmotionScore(Double emotionScore) {
        this.emotionScore = emotionScore;
        return this;
    }
    public Double getEmotionScore() {
        return this.emotionScore;
    }

    public YuqingMessage setEmotionType(Integer emotionType) {
        this.emotionType = emotionType;
        return this;
    }
    public Integer getEmotionType() {
        return this.emotionType;
    }

    public YuqingMessage setExtInfo(java.util.Map<String, String> extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public java.util.Map<String, String> getExtInfo() {
        return this.extInfo;
    }

    public YuqingMessage setFinEventCount(Integer finEventCount) {
        this.finEventCount = finEventCount;
        return this;
    }
    public Integer getFinEventCount() {
        return this.finEventCount;
    }

    public YuqingMessage setFinanceEventList(YuqingFinanceEvent financeEventList) {
        this.financeEventList = financeEventList;
        return this;
    }
    public YuqingFinanceEvent getFinanceEventList() {
        return this.financeEventList;
    }

    public YuqingMessage setHighlightKeywords(java.util.List<String> highlightKeywords) {
        this.highlightKeywords = highlightKeywords;
        return this;
    }
    public java.util.List<String> getHighlightKeywords() {
        return this.highlightKeywords;
    }

    public YuqingMessage setImageCount(Integer imageCount) {
        this.imageCount = imageCount;
        return this;
    }
    public Integer getImageCount() {
        return this.imageCount;
    }

    public YuqingMessage setInfluenceScore(Double influenceScore) {
        this.influenceScore = influenceScore;
        return this;
    }
    public Double getInfluenceScore() {
        return this.influenceScore;
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

    public YuqingMessage setMediaName(String mediaName) {
        this.mediaName = mediaName;
        return this;
    }
    public String getMediaName() {
        return this.mediaName;
    }

    public YuqingMessage setMediaPropagationLevel(Integer mediaPropagationLevel) {
        this.mediaPropagationLevel = mediaPropagationLevel;
        return this;
    }
    public Integer getMediaPropagationLevel() {
        return this.mediaPropagationLevel;
    }

    public YuqingMessage setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public YuqingMessage setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public YuqingMessage setParentDocId(String parentDocId) {
        this.parentDocId = parentDocId;
        return this;
    }
    public String getParentDocId() {
        return this.parentDocId;
    }

    public YuqingMessage setPropagationScore(Double propagationScore) {
        this.propagationScore = propagationScore;
        return this;
    }
    public Double getPropagationScore() {
        return this.propagationScore;
    }

    public YuqingMessage setPublishTime(Long publishTime) {
        this.publishTime = publishTime;
        return this;
    }
    public Long getPublishTime() {
        return this.publishTime;
    }

    public YuqingMessage setRelevanceScore(Double relevanceScore) {
        this.relevanceScore = relevanceScore;
        return this;
    }
    public Double getRelevanceScore() {
        return this.relevanceScore;
    }

    public YuqingMessage setReportMaterialTags(java.util.List<String> reportMaterialTags) {
        this.reportMaterialTags = reportMaterialTags;
        return this;
    }
    public java.util.List<String> getReportMaterialTags() {
        return this.reportMaterialTags;
    }

    public YuqingMessage setRepostList(java.util.List<String> repostList) {
        this.repostList = repostList;
        return this;
    }
    public java.util.List<String> getRepostList() {
        return this.repostList;
    }

    public YuqingMessage setSimilarNumber(Integer similarNumber) {
        this.similarNumber = similarNumber;
        return this;
    }
    public Integer getSimilarNumber() {
        return this.similarNumber;
    }

    public YuqingMessage setTopics(java.util.List<String> topics) {
        this.topics = topics;
        return this;
    }
    public java.util.List<String> getTopics() {
        return this.topics;
    }

    public YuqingMessage setVideoCount(Integer videoCount) {
        this.videoCount = videoCount;
        return this;
    }
    public Integer getVideoCount() {
        return this.videoCount;
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
