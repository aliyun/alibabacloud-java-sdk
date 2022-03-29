// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class YuqingMessage extends TeaModel {
    // 作者头像地址
    @NameInMap("authorAvatarUrl")
    public String authorAvatarUrl;

    // 粉丝数
    @NameInMap("authorFollowersCount")
    public Long authorFollowersCount;

    // 好友数
    @NameInMap("authorFriendsCount")
    public Long authorFriendsCount;

    // 作者id
    @NameInMap("authorId")
    public String authorId;

    // 作者名称
    @NameInMap("authorName")
    public String authorName;

    // 发文数
    @NameInMap("authorStatusesCount")
    public Long authorStatusesCount;

    // 作者认证类型
    @NameInMap("authorVerifyType")
    public String authorVerifyType;

    // 舆情文章被抓取的时间戳
    @NameInMap("createTime")
    public Long createTime;

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

    // 文章自身的内容签名，转发微博计算的是转发内容的contentSign，与父微博无关
    @NameInMap("docSelfContentSign")
    public String docSelfContentSign;

    // 文章标题
    @NameInMap("docTitle")
    public String docTitle;

    // 原文地址
    @NameInMap("docUrl")
    public String docUrl;

    // 情感的正负面，-1代表负面，1代表非负面
    @NameInMap("emotionType")
    public Integer emotionType;

    // 命中的搜索词列表
    @NameInMap("highlightKeywords")
    public java.util.List<String> highlightKeywords;

    // 媒体类型，枚举值
    @NameInMap("mediaType")
    public String mediaType;

    // 舆情消息类型:转发,评论/回复, 原文,群聊等
    @NameInMap("messageType")
    public String messageType;

    // 文章的父docId，如被转发的文章docId
    @NameInMap("parentDocId")
    public String parentDocId;

    // 舆情文章的发布时间戳
    @NameInMap("publishTime")
    public Long publishTime;

    // 相关性得分
    @NameInMap("relevanceScore")
    public Double relevanceScore;

    // 相似文章数
    @NameInMap("similarNumber")
    public Integer similarNumber;

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

    public YuqingMessage setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
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

    public YuqingMessage setEmotionType(Integer emotionType) {
        this.emotionType = emotionType;
        return this;
    }
    public Integer getEmotionType() {
        return this.emotionType;
    }

    public YuqingMessage setHighlightKeywords(java.util.List<String> highlightKeywords) {
        this.highlightKeywords = highlightKeywords;
        return this;
    }
    public java.util.List<String> getHighlightKeywords() {
        return this.highlightKeywords;
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

    public YuqingMessage setSimilarNumber(Integer similarNumber) {
        this.similarNumber = similarNumber;
        return this;
    }
    public Integer getSimilarNumber() {
        return this.similarNumber;
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
