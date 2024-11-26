// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class SearchCondition extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[&quot;A&amp;&amp;B&quot;,&quot;C&quot;]</p>
     */
    @NameInMap("assKeywordList")
    public java.util.List<String> assKeywordList;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("atAuthorNameList")
    public java.util.List<String> atAuthorNameList;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("authorNameList")
    public java.util.List<String> authorNameList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("commentsLevel")
    public Integer commentsLevel;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("contentLenLevel")
    public Integer contentLenLevel;

    /**
     * <strong>example:</strong>
     * <p>1620452881429</p>
     */
    @NameInMap("createTimeEnd")
    public Long createTimeEnd;

    /**
     * <strong>example:</strong>
     * <p>1610452881429</p>
     */
    @NameInMap("createTimeStart")
    public Long createTimeStart;

    /**
     * <strong>example:</strong>
     * <p>3478278371214</p>
     */
    @NameInMap("docContentSign")
    public String docContentSign;

    /**
     * <strong>example:</strong>
     * <p>5747368272834931</p>
     */
    @NameInMap("docIdList")
    public java.util.List<String> docIdList;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("duplicateRemoval")
    public Boolean duplicateRemoval;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("emotionType")
    public Integer emotionType;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableKeywordHighlight")
    public Boolean enableKeywordHighlight;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("excludeAtAuthorNameList")
    public java.util.List<String> excludeAtAuthorNameList;

    /**
     * <strong>example:</strong>
     * <p>新浪财经</p>
     */
    @NameInMap("excludeAuthorNameList")
    public java.util.List<String> excludeAuthorNameList;

    /**
     * <strong>example:</strong>
     * <p>finance.sina.com.cn</p>
     */
    @NameInMap("excludeHostNameList")
    public java.util.List<String> excludeHostNameList;

    /**
     * <strong>example:</strong>
     * <p>[&quot;A&amp;&amp;B&quot;,&quot;C&quot;]</p>
     */
    @NameInMap("excludeKeywordList")
    public java.util.List<String> excludeKeywordList;

    /**
     * <strong>example:</strong>
     * <p>[&quot;A&amp;&amp;B&quot;,&quot;C&quot;]</p>
     */
    @NameInMap("excludeKeywordListInTitle")
    public java.util.List<String> excludeKeywordListInTitle;

    /**
     * <strong>example:</strong>
     * <p>123,456</p>
     */
    @NameInMap("excludeKeywordTagIds")
    public java.util.List<Long> excludeKeywordTagIds;

    @NameInMap("excludeMaterialTagList")
    public java.util.List<String> excludeMaterialTagList;

    /**
     * <strong>example:</strong>
     * <p>123,456</p>
     */
    @NameInMap("excludeMediaLibraryIdList")
    public java.util.List<String> excludeMediaLibraryIdList;

    /**
     * <strong>example:</strong>
     * <p>新浪财经</p>
     */
    @NameInMap("excludeMediaNameList")
    public java.util.List<String> excludeMediaNameList;

    /**
     * <strong>example:</strong>
     * <p>WEIBO-REPOST_WEIBO</p>
     */
    @NameInMap("excludeMediaTypeList")
    public java.util.List<String> excludeMediaTypeList;

    /**
     * <strong>example:</strong>
     * <p>COMMENT</p>
     */
    @NameInMap("excludeMessageTypeList")
    public java.util.List<String> excludeMessageTypeList;

    @NameInMap("fieldConditions")
    public java.util.List<FieldCondition> fieldConditions;

    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("filterId")
    public Long filterId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hasAudio")
    public Boolean hasAudio;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hasImage")
    public Boolean hasImage;

    @NameInMap("hasMultiModeContent")
    public Boolean hasMultiModeContent;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hasVideo")
    public Boolean hasVideo;

    /**
     * <strong>example:</strong>
     * <p>finance.sina.com.cn</p>
     */
    @NameInMap("hostNameList")
    public java.util.List<String> hostNameList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("influenceLevel")
    public Long influenceLevel;

    /**
     * <strong>example:</strong>
     * <p>123,456</p>
     */
    @NameInMap("keywordTagIds")
    public java.util.List<Long> keywordTagIds;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("likesLevel")
    public Integer likesLevel;

    @NameInMap("materialTagList")
    public java.util.List<String> materialTagList;

    /**
     * <strong>example:</strong>
     * <p>123,456</p>
     */
    @NameInMap("mediaLibraryIdList")
    public java.util.List<String> mediaLibraryIdList;

    /**
     * <strong>example:</strong>
     * <p>新浪财经</p>
     */
    @NameInMap("mediaNameList")
    public java.util.List<String> mediaNameList;

    /**
     * <strong>example:</strong>
     * <p>WEIBO-REPOST_WEIBO</p>
     */
    @NameInMap("mediaTypeList")
    public java.util.List<String> mediaTypeList;

    /**
     * <strong>example:</strong>
     * <p>COMMENT</p>
     */
    @NameInMap("messageTypeList")
    public java.util.List<String> messageTypeList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNow")
    public Integer pageNow;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>485738373837374</p>
     */
    @NameInMap("parentDocId")
    public String parentDocId;

    /**
     * <strong>example:</strong>
     * <p>[&quot;A&amp;&amp;B&quot;,&quot;C&quot;]</p>
     */
    @NameInMap("posKeywordList")
    public java.util.List<String> posKeywordList;

    /**
     * <strong>example:</strong>
     * <p>[&quot;A&amp;&amp;B&quot;,&quot;C&quot;]</p>
     */
    @NameInMap("posKeywordListInTitle")
    public java.util.List<String> posKeywordListInTitle;

    /**
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("projectId")
    public Long projectId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("propagationLevel")
    public Long propagationLevel;

    /**
     * <strong>example:</strong>
     * <p>1620452881429</p>
     */
    @NameInMap("publishTimeEnd")
    public Long publishTimeEnd;

    /**
     * <strong>example:</strong>
     * <p>1610452881429</p>
     */
    @NameInMap("publishTimeStart")
    public Long publishTimeStart;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("readsLevel")
    public Integer readsLevel;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("relevanceLevel")
    public Integer relevanceLevel;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("repostLevel")
    public Integer repostLevel;

    /**
     * <strong>example:</strong>
     * <p>PUBLISH_TIME</p>
     */
    @NameInMap("sortBy")
    public String sortBy;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("sortByDirection")
    public String sortByDirection;

    /**
     * <strong>example:</strong>
     * <p>#xxxx#</p>
     */
    @NameInMap("topicList")
    public java.util.List<String> topicList;

    /**
     * <strong>example:</strong>
     * <p>1620452881429</p>
     */
    @NameInMap("updateTimeEnd")
    public Long updateTimeEnd;

    /**
     * <strong>example:</strong>
     * <p>1610452881429</p>
     */
    @NameInMap("updateTimeStart")
    public Long updateTimeStart;

    public static SearchCondition build(java.util.Map<String, ?> map) throws Exception {
        SearchCondition self = new SearchCondition();
        return TeaModel.build(map, self);
    }

    public SearchCondition setAssKeywordList(java.util.List<String> assKeywordList) {
        this.assKeywordList = assKeywordList;
        return this;
    }
    public java.util.List<String> getAssKeywordList() {
        return this.assKeywordList;
    }

    public SearchCondition setAtAuthorNameList(java.util.List<String> atAuthorNameList) {
        this.atAuthorNameList = atAuthorNameList;
        return this;
    }
    public java.util.List<String> getAtAuthorNameList() {
        return this.atAuthorNameList;
    }

    public SearchCondition setAuthorNameList(java.util.List<String> authorNameList) {
        this.authorNameList = authorNameList;
        return this;
    }
    public java.util.List<String> getAuthorNameList() {
        return this.authorNameList;
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

    public SearchCondition setDocIdList(java.util.List<String> docIdList) {
        this.docIdList = docIdList;
        return this;
    }
    public java.util.List<String> getDocIdList() {
        return this.docIdList;
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

    public SearchCondition setExcludeAtAuthorNameList(java.util.List<String> excludeAtAuthorNameList) {
        this.excludeAtAuthorNameList = excludeAtAuthorNameList;
        return this;
    }
    public java.util.List<String> getExcludeAtAuthorNameList() {
        return this.excludeAtAuthorNameList;
    }

    public SearchCondition setExcludeAuthorNameList(java.util.List<String> excludeAuthorNameList) {
        this.excludeAuthorNameList = excludeAuthorNameList;
        return this;
    }
    public java.util.List<String> getExcludeAuthorNameList() {
        return this.excludeAuthorNameList;
    }

    public SearchCondition setExcludeHostNameList(java.util.List<String> excludeHostNameList) {
        this.excludeHostNameList = excludeHostNameList;
        return this;
    }
    public java.util.List<String> getExcludeHostNameList() {
        return this.excludeHostNameList;
    }

    public SearchCondition setExcludeKeywordList(java.util.List<String> excludeKeywordList) {
        this.excludeKeywordList = excludeKeywordList;
        return this;
    }
    public java.util.List<String> getExcludeKeywordList() {
        return this.excludeKeywordList;
    }

    public SearchCondition setExcludeKeywordListInTitle(java.util.List<String> excludeKeywordListInTitle) {
        this.excludeKeywordListInTitle = excludeKeywordListInTitle;
        return this;
    }
    public java.util.List<String> getExcludeKeywordListInTitle() {
        return this.excludeKeywordListInTitle;
    }

    public SearchCondition setExcludeKeywordTagIds(java.util.List<Long> excludeKeywordTagIds) {
        this.excludeKeywordTagIds = excludeKeywordTagIds;
        return this;
    }
    public java.util.List<Long> getExcludeKeywordTagIds() {
        return this.excludeKeywordTagIds;
    }

    public SearchCondition setExcludeMaterialTagList(java.util.List<String> excludeMaterialTagList) {
        this.excludeMaterialTagList = excludeMaterialTagList;
        return this;
    }
    public java.util.List<String> getExcludeMaterialTagList() {
        return this.excludeMaterialTagList;
    }

    public SearchCondition setExcludeMediaLibraryIdList(java.util.List<String> excludeMediaLibraryIdList) {
        this.excludeMediaLibraryIdList = excludeMediaLibraryIdList;
        return this;
    }
    public java.util.List<String> getExcludeMediaLibraryIdList() {
        return this.excludeMediaLibraryIdList;
    }

    public SearchCondition setExcludeMediaNameList(java.util.List<String> excludeMediaNameList) {
        this.excludeMediaNameList = excludeMediaNameList;
        return this;
    }
    public java.util.List<String> getExcludeMediaNameList() {
        return this.excludeMediaNameList;
    }

    public SearchCondition setExcludeMediaTypeList(java.util.List<String> excludeMediaTypeList) {
        this.excludeMediaTypeList = excludeMediaTypeList;
        return this;
    }
    public java.util.List<String> getExcludeMediaTypeList() {
        return this.excludeMediaTypeList;
    }

    public SearchCondition setExcludeMessageTypeList(java.util.List<String> excludeMessageTypeList) {
        this.excludeMessageTypeList = excludeMessageTypeList;
        return this;
    }
    public java.util.List<String> getExcludeMessageTypeList() {
        return this.excludeMessageTypeList;
    }

    public SearchCondition setFieldConditions(java.util.List<FieldCondition> fieldConditions) {
        this.fieldConditions = fieldConditions;
        return this;
    }
    public java.util.List<FieldCondition> getFieldConditions() {
        return this.fieldConditions;
    }

    public SearchCondition setFilterId(Long filterId) {
        this.filterId = filterId;
        return this;
    }
    public Long getFilterId() {
        return this.filterId;
    }

    public SearchCondition setHasAudio(Boolean hasAudio) {
        this.hasAudio = hasAudio;
        return this;
    }
    public Boolean getHasAudio() {
        return this.hasAudio;
    }

    public SearchCondition setHasImage(Boolean hasImage) {
        this.hasImage = hasImage;
        return this;
    }
    public Boolean getHasImage() {
        return this.hasImage;
    }

    public SearchCondition setHasMultiModeContent(Boolean hasMultiModeContent) {
        this.hasMultiModeContent = hasMultiModeContent;
        return this;
    }
    public Boolean getHasMultiModeContent() {
        return this.hasMultiModeContent;
    }

    public SearchCondition setHasVideo(Boolean hasVideo) {
        this.hasVideo = hasVideo;
        return this;
    }
    public Boolean getHasVideo() {
        return this.hasVideo;
    }

    public SearchCondition setHostNameList(java.util.List<String> hostNameList) {
        this.hostNameList = hostNameList;
        return this;
    }
    public java.util.List<String> getHostNameList() {
        return this.hostNameList;
    }

    public SearchCondition setInfluenceLevel(Long influenceLevel) {
        this.influenceLevel = influenceLevel;
        return this;
    }
    public Long getInfluenceLevel() {
        return this.influenceLevel;
    }

    public SearchCondition setKeywordTagIds(java.util.List<Long> keywordTagIds) {
        this.keywordTagIds = keywordTagIds;
        return this;
    }
    public java.util.List<Long> getKeywordTagIds() {
        return this.keywordTagIds;
    }

    public SearchCondition setLikesLevel(Integer likesLevel) {
        this.likesLevel = likesLevel;
        return this;
    }
    public Integer getLikesLevel() {
        return this.likesLevel;
    }

    public SearchCondition setMaterialTagList(java.util.List<String> materialTagList) {
        this.materialTagList = materialTagList;
        return this;
    }
    public java.util.List<String> getMaterialTagList() {
        return this.materialTagList;
    }

    public SearchCondition setMediaLibraryIdList(java.util.List<String> mediaLibraryIdList) {
        this.mediaLibraryIdList = mediaLibraryIdList;
        return this;
    }
    public java.util.List<String> getMediaLibraryIdList() {
        return this.mediaLibraryIdList;
    }

    public SearchCondition setMediaNameList(java.util.List<String> mediaNameList) {
        this.mediaNameList = mediaNameList;
        return this;
    }
    public java.util.List<String> getMediaNameList() {
        return this.mediaNameList;
    }

    public SearchCondition setMediaTypeList(java.util.List<String> mediaTypeList) {
        this.mediaTypeList = mediaTypeList;
        return this;
    }
    public java.util.List<String> getMediaTypeList() {
        return this.mediaTypeList;
    }

    public SearchCondition setMessageTypeList(java.util.List<String> messageTypeList) {
        this.messageTypeList = messageTypeList;
        return this;
    }
    public java.util.List<String> getMessageTypeList() {
        return this.messageTypeList;
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

    public SearchCondition setPosKeywordList(java.util.List<String> posKeywordList) {
        this.posKeywordList = posKeywordList;
        return this;
    }
    public java.util.List<String> getPosKeywordList() {
        return this.posKeywordList;
    }

    public SearchCondition setPosKeywordListInTitle(java.util.List<String> posKeywordListInTitle) {
        this.posKeywordListInTitle = posKeywordListInTitle;
        return this;
    }
    public java.util.List<String> getPosKeywordListInTitle() {
        return this.posKeywordListInTitle;
    }

    public SearchCondition setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public SearchCondition setPropagationLevel(Long propagationLevel) {
        this.propagationLevel = propagationLevel;
        return this;
    }
    public Long getPropagationLevel() {
        return this.propagationLevel;
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

    public SearchCondition setTopicList(java.util.List<String> topicList) {
        this.topicList = topicList;
        return this;
    }
    public java.util.List<String> getTopicList() {
        return this.topicList;
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
