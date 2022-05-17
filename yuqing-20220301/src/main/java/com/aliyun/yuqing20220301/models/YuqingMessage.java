// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class YuqingMessage extends TeaModel {
    // 应用名称
    @NameInMap("appName")
    public String appName;

    // 应用市场评分
    @NameInMap("appScore")
    public Long appScore;

    // 应用市场名称
    @NameInMap("appStoreName")
    public String appStoreName;

    // 提及到的用户列表
    @NameInMap("atAuthorNames")
    public java.util.List<String> atAuthorNames;

    // 音频数
    @NameInMap("audioCount")
    public Integer audioCount;

    // 作者头像地址
    @NameInMap("authorAvatarUrl")
    public String authorAvatarUrl;

    // 粉丝数
    @NameInMap("authorFollowersCount")
    public Long authorFollowersCount;

    // 好友数
    @NameInMap("authorFriendsCount")
    public Long authorFriendsCount;

    // 性别,f:女，m:男
    @NameInMap("authorGender")
    public String authorGender;

    // 作者id
    @NameInMap("authorId")
    public String authorId;

    // 作者收到的点赞数
    @NameInMap("authorLikesCount")
    public Long authorLikesCount;

    // 作者名称
    @NameInMap("authorName")
    public String authorName;

    // 作者主页地址
    @NameInMap("authorProfileUrl")
    public String authorProfileUrl;

    // 发文数
    @NameInMap("authorStatusesCount")
    public Long authorStatusesCount;

    // 作者是否认证
    @NameInMap("authorVerified")
    public Boolean authorVerified;

    // 作者认证等级，0:黄V，>0:蓝V
    @NameInMap("authorVerifyType")
    public Integer authorVerifyType;

    // 音频识别出来的文本
    @NameInMap("contentAudioText")
    public String contentAudioText;

    // 音频列表地址
    @NameInMap("contentAudioUrls")
    public String contentAudioUrls;

    // 图片识别出来的文本
    @NameInMap("contentImageText")
    public String contentImageText;

    // 图片列表地址
    @NameInMap("contentImageUrls")
    public String contentImageUrls;

    // 语种
    @NameInMap("contentLang")
    public String contentLang;

    // 文本长度
    @NameInMap("contentLen")
    public Long contentLen;

    // 视频识别出来的文本
    @NameInMap("contentVideoText")
    public String contentVideoText;

    // 视频列表地址
    @NameInMap("contentVideoUrls")
    public String contentVideoUrls;

    // 舆情文章被抓取的时间戳
    @NameInMap("createTime")
    public Long createTime;

    // 回答数
    @NameInMap("docAnswersCount")
    public Long docAnswersCount;

    // 提级地域列表
    @NameInMap("docAreas")
    public java.util.List<String> docAreas;

    // 投币数
    @NameInMap("docCoinCount")
    public Long docCoinCount;

    // 文章评论数
    @NameInMap("docCommentsCount")
    public Long docCommentsCount;

    // 文章正文内容
    @NameInMap("docContent")
    public String docContent;

    // 文章摘要
    @NameInMap("docContentBrief")
    public String docContentBrief;

    // 文章内容签名，如果是转发微博或者其他有父内容的doc，计算的是父文章的得分。一般用于去重，相同的doc_content_sign说明内容相同
    @NameInMap("docContentSign")
    public String docContentSign;

    // 文章唯一docId
    @NameInMap("docId")
    public String docId;

    // 文章点赞数
    @NameInMap("docLikesCount")
    public Long docLikesCount;

    // 播放数
    @NameInMap("docPlayCount")
    public Long docPlayCount;

    // 在读数
    @NameInMap("docReadingCount")
    public Long docReadingCount;

    // 文章阅读数
    @NameInMap("docReadsCount")
    public Long docReadsCount;

    // 文章点赞数
    @NameInMap("docRepostsCount")
    public Long docRepostsCount;

    // 文章转载自
    @NameInMap("docReprintName")
    public String docReprintName;

    // 文章自身的内容签名，转发微博计算的是转发内容的contentSign，与父微博无关
    @NameInMap("docSelfContentSign")
    public String docSelfContentSign;

    // 文章标题
    @NameInMap("docTitle")
    public String docTitle;

    // 原文地址
    @NameInMap("docUrl")
    public String docUrl;

    // 情感得分
    @NameInMap("emotionScore")
    public Double emotionScore;

    // 情感的正负面，-1代表负面，1代表非负面
    @NameInMap("emotionType")
    public Integer emotionType;

    // 扩展字段值
    @NameInMap("extInfo")
    public java.util.Map<String, String> extInfo;

    // 企业事件数
    @NameInMap("finEventCount")
    public Integer finEventCount;

    // 命中的关键词列表
    @NameInMap("highlightKeywords")
    public java.util.List<String> highlightKeywords;

    // 图片数
    @NameInMap("imageCount")
    public Integer imageCount;

    // 影响力得分，0-10
    @NameInMap("influenceScore")
    public Double influenceScore;

    // 站点列表
    @NameInMap("mediaHosts")
    public java.util.List<String> mediaHosts;

    // 影响力等级
    @NameInMap("mediaInfluenceLevel")
    public Integer mediaInfluenceLevel;

    // 媒体名称
    @NameInMap("mediaName")
    public String mediaName;

    // 传播等级
    @NameInMap("mediaPropagationLevel")
    public Integer mediaPropagationLevel;

    // 媒体类型，枚举值
    @NameInMap("mediaType")
    public String mediaType;

    // 舆情消息类型:转发,评论/回复, 原文,群聊等
    @NameInMap("messageType")
    public String messageType;

    // 文章的父docId，如被转发的文章docId
    @NameInMap("parentDocId")
    public String parentDocId;

    // 传播得分，0-10
    @NameInMap("propagationScore")
    public Double propagationScore;

    // 舆情文章的发布时间戳
    @NameInMap("publishTime")
    public Long publishTime;

    // 相关性得分
    @NameInMap("relevanceScore")
    public Double relevanceScore;

    // 疑似首发列表
    @NameInMap("repostList")
    public java.util.List<String> repostList;

    // 相似文章数
    @NameInMap("similarNumber")
    public Integer similarNumber;

    // 话题列表
    @NameInMap("topics")
    public java.util.List<String> topics;

    // 视频数
    @NameInMap("videoCount")
    public Integer videoCount;

    // 微博评论id
    @NameInMap("weiboCommentId")
    public String weiboCommentId;

    // 微博消息id
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
