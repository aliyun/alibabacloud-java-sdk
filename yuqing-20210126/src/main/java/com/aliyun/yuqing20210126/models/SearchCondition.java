// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class SearchCondition extends TeaModel {
    // 广告取值true or false
    @NameInMap("advertisementFilter")
    public Boolean advertisementFilter;

    // 支付宝内部的2088账号
    @NameInMap("alipayAccountFilter")
    public String alipayAccountFilter;

    // 搭配词，json字符串数组
    @NameInMap("assKeywordsIdx")
    public String assKeywordsIdx;

    // 粉丝数上限
    @NameInMap("authorFollowersCountMaxFilter")
    public Long authorFollowersCountMaxFilter;

    // 粉丝数下限
    @NameInMap("authorFollowersCountMinFilter")
    public Long authorFollowersCountMinFilter;

    // 指定用户名，多个用户用英文逗号隔开
    @NameInMap("authorNameIdx")
    public String authorNameIdx;

    // 作者认证类型，多个用,隔开
    @NameInMap("authorVerifyTypeFilter")
    public String authorVerifyTypeFilter;

    // 业务自定义标签字段过滤
    @NameInMap("bizTagsIdx")
    public String bizTagsIdx;

    // 暴恐政取值true or false
    @NameInMap("bkzFilter")
    public Boolean bkzFilter;

    // 评论数上限
    @NameInMap("commentsCountMaxFilter")
    public Long commentsCountMaxFilter;

    // 评论数下限
    @NameInMap("commentsCountMinFilter")
    public Long commentsCountMinFilter;

    // 内容长度上限
    @NameInMap("contentLengthMaxFilter")
    public Long contentLengthMaxFilter;

    // 内容长度下限
    @NameInMap("contentLengthMinFilter")
    public Long contentLengthMinFilter;

    // 答案数上限
    @NameInMap("docAnswersCountMaxFilter")
    public Long docAnswersCountMaxFilter;

    // 答案数下限
    @NameInMap("docAnswersCountMinFilter")
    public Long docAnswersCountMinFilter;

    // 提级地域
    @NameInMap("docAreaIdx")
    public String docAreaIdx;

    // 相似文章索引Id,，多个用英文逗号隔开
    @NameInMap("docContentSignIdx")
    public String docContentSignIdx;

    // 创建时间戳上限
    @NameInMap("docCreateTimeEndFilter")
    public Long docCreateTimeEndFilter;

    // 创建时间戳下限
    @NameInMap("docCreateTimeStartFilter")
    public Long docCreateTimeStartFilter;

    // 发布时间戳上限
    @NameInMap("docPublishTimeEndFilter")
    public Long docPublishTimeEndFilter;

    // 发布时间戳下限
    @NameInMap("docPublishTimeStartFilter")
    public Long docPublishTimeStartFilter;

    // 文章更新时间上限
    @NameInMap("docUpdateTimeEndFilter")
    public Long docUpdateTimeEndFilter;

    // 更新时间戳下限
    @NameInMap("docUpdateTimeStartFilter")
    public Long docUpdateTimeStartFilter;

    // 返回的数据是否去重，默认true
    @NameInMap("duplicateRemoval")
    public Boolean duplicateRemoval;

    // 情感分值上限，范围-10~10
    @NameInMap("emotionScoreMaxFilter")
    public Double emotionScoreMaxFilter;

    // 情感分值下限，范围-10~10
    @NameInMap("emotionScoreMinFilter")
    public Double emotionScoreMinFilter;

    // 是否要进行关键词高亮显示
    @NameInMap("enableKeywordHighlight")
    public Boolean enableKeywordHighlight;

    // 公司全名称
    @NameInMap("entityName")
    public String entityName;

    // 色情取值true or false
    @NameInMap("eroticismFilter")
    public Boolean eroticismFilter;

    // 排除指定用户名，多个用户用英文逗号隔开
    @NameInMap("excludeAuthorNameIdx")
    public String excludeAuthorNameIdx;

    // 排除指定Host
    @NameInMap("excludingMediaHostsFilter")
    public String excludingMediaHostsFilter;

    // 排除指定媒体库ids，媒体库在舆情平台上定义
    @NameInMap("excludingMediaPoolIdsFilter")
    public String excludingMediaPoolIdsFilter;

    // 舆情筛选模板Id
    @NameInMap("filterId")
    public Long filterId;

    // 实体所在地，主要指的是公司
    @NameInMap("financeEntityAreaFilter")
    public String financeEntityAreaFilter;

    // 实体关联度得分上限
    @NameInMap("financeEntityRelevanceScoreMaxFilter")
    public Double financeEntityRelevanceScoreMaxFilter;

    // 实体关联度得分下限
    @NameInMap("financeEntityRelevanceScoreMinFilter")
    public Double financeEntityRelevanceScoreMinFilter;

    // 金融事件id，支持多个
    @NameInMap("financeEventCodeFilter")
    public String financeEventCodeFilter;

    // 赌博取值true or false
    @NameInMap("gamblingFilter")
    public Boolean gamblingFilter;

    // 热搜标题倒排
    @NameInMap("hotspotTitleIdx")
    public String hotspotTitleIdx;

    // 违规广告取值true or false
    @NameInMap("illegalAdvertisementFilter")
    public Boolean illegalAdvertisementFilter;

    // 点赞数上限
    @NameInMap("likesCountMaxFilter")
    public Long likesCountMaxFilter;

    // 点赞数下限
    @NameInMap("likesCountMinFilter")
    public Long likesCountMinFilter;

    // 指定Host
    @NameInMap("mediaHostsFilter")
    public String mediaHostsFilter;

    // 媒体影响分上限
    @NameInMap("mediaInfluenceScoreMaxFilter")
    public Double mediaInfluenceScoreMaxFilter;

    // 媒体影响分下限
    @NameInMap("mediaInfluenceScoreMinFilter")
    public Double mediaInfluenceScoreMinFilter;

    // 媒体名称
    @NameInMap("mediaNameFilter")
    public String mediaNameFilter;

    // 指定媒体库ids，媒体库在舆情平台上定义
    @NameInMap("mediaPoolIdsFilter")
    public String mediaPoolIdsFilter;

    // 媒体传播分上限取值范围：0-10分
    @NameInMap("mediaPropagationScoreMaxFilter")
    public Double mediaPropagationScoreMaxFilter;

    // 媒体传播分下限取值范围：0-10分
    @NameInMap("mediaPropagationScoreMinFilter")
    public Double mediaPropagationScoreMinFilter;

    // 枚举字符串如：WEIBO-WEIBO
    @NameInMap("mediaTypeFilter")
    public String mediaTypeFilter;

    // 枚举字符串如：COMMENT
    @NameInMap("messageTypeFilter")
    public String messageTypeFilter;

    // 排除关键词
    @NameInMap("negKeywordsIdx")
    public String negKeywordsIdx;

    // 指定页码
    @NameInMap("pageNow")
    public Integer pageNow;

    // 指定每页大小，最大50
    @NameInMap("pageSize")
    public Integer pageSize;

    // 父文章docId
    @NameInMap("parentIdsIdx")
    public String parentIdsIdx;

    // 格式同AssKeywordsIdx，如果指定了AssKeywordsIdx，两者要同时满足。
    @NameInMap("posKeywordsIdx")
    public String posKeywordsIdx;

    // 舆情文章id，支持多值
    @NameInMap("primaryKeyIdx")
    public String primaryKeyIdx;

    // 舆情项目Id
    @NameInMap("projectId")
    public Long projectId;

    // 阅读数上限
    @NameInMap("readsCountMaxFilter")
    public Long readsCountMaxFilter;

    // 阅读数下限
    @NameInMap("readsCountMinFilter")
    public Long readsCountMinFilter;

    // 相关性分上限
    @NameInMap("relevanceScoreMaxFilter")
    public Double relevanceScoreMaxFilter;

    // 相关性分下限
    @NameInMap("relevanceScoreMinFilter")
    public Double relevanceScoreMinFilter;

    // 转发数上限
    @NameInMap("repostsCountMaxFilter")
    public Long repostsCountMaxFilter;

    // 转发数下限
    @NameInMap("repostsCountMinFilter")
    public Long repostsCountMinFilter;

    // 文章转载来源名称
    @NameInMap("reprintFromFilter")
    public String reprintFromFilter;

    // 排序字段枚举
    @NameInMap("sortBy")
    public String sortBy;

    // 如'+'是升序，'-'是降序
    @NameInMap("sortByDirection")
    public String sortByDirection;

    // 垃圾取值true or false
    @NameInMap("spamFilter")
    public Boolean spamFilter;

    // 疑似垃圾取值true or false
    @NameInMap("suspicionSpamFilter")
    public Boolean suspicionSpamFilter;

    // 标题不包含的关键词
    @NameInMap("titleExcludingWordsIdx")
    public String titleExcludingWordsIdx;

    // 标题包含的关键词
    @NameInMap("titleIncludingWordsIdx")
    public String titleIncludingWordsIdx;

    // 检索的话题
    @NameInMap("topicIdx")
    public String topicIdx;

    // 指定索引模式,KEYWORD|CREATE_TIME
    @NameInMap("usedIndexModeSwitch")
    public String usedIndexModeSwitch;

    public static SearchCondition build(java.util.Map<String, ?> map) throws Exception {
        SearchCondition self = new SearchCondition();
        return TeaModel.build(map, self);
    }

    public SearchCondition setAdvertisementFilter(Boolean advertisementFilter) {
        this.advertisementFilter = advertisementFilter;
        return this;
    }
    public Boolean getAdvertisementFilter() {
        return this.advertisementFilter;
    }

    public SearchCondition setAlipayAccountFilter(String alipayAccountFilter) {
        this.alipayAccountFilter = alipayAccountFilter;
        return this;
    }
    public String getAlipayAccountFilter() {
        return this.alipayAccountFilter;
    }

    public SearchCondition setAssKeywordsIdx(String assKeywordsIdx) {
        this.assKeywordsIdx = assKeywordsIdx;
        return this;
    }
    public String getAssKeywordsIdx() {
        return this.assKeywordsIdx;
    }

    public SearchCondition setAuthorFollowersCountMaxFilter(Long authorFollowersCountMaxFilter) {
        this.authorFollowersCountMaxFilter = authorFollowersCountMaxFilter;
        return this;
    }
    public Long getAuthorFollowersCountMaxFilter() {
        return this.authorFollowersCountMaxFilter;
    }

    public SearchCondition setAuthorFollowersCountMinFilter(Long authorFollowersCountMinFilter) {
        this.authorFollowersCountMinFilter = authorFollowersCountMinFilter;
        return this;
    }
    public Long getAuthorFollowersCountMinFilter() {
        return this.authorFollowersCountMinFilter;
    }

    public SearchCondition setAuthorNameIdx(String authorNameIdx) {
        this.authorNameIdx = authorNameIdx;
        return this;
    }
    public String getAuthorNameIdx() {
        return this.authorNameIdx;
    }

    public SearchCondition setAuthorVerifyTypeFilter(String authorVerifyTypeFilter) {
        this.authorVerifyTypeFilter = authorVerifyTypeFilter;
        return this;
    }
    public String getAuthorVerifyTypeFilter() {
        return this.authorVerifyTypeFilter;
    }

    public SearchCondition setBizTagsIdx(String bizTagsIdx) {
        this.bizTagsIdx = bizTagsIdx;
        return this;
    }
    public String getBizTagsIdx() {
        return this.bizTagsIdx;
    }

    public SearchCondition setBkzFilter(Boolean bkzFilter) {
        this.bkzFilter = bkzFilter;
        return this;
    }
    public Boolean getBkzFilter() {
        return this.bkzFilter;
    }

    public SearchCondition setCommentsCountMaxFilter(Long commentsCountMaxFilter) {
        this.commentsCountMaxFilter = commentsCountMaxFilter;
        return this;
    }
    public Long getCommentsCountMaxFilter() {
        return this.commentsCountMaxFilter;
    }

    public SearchCondition setCommentsCountMinFilter(Long commentsCountMinFilter) {
        this.commentsCountMinFilter = commentsCountMinFilter;
        return this;
    }
    public Long getCommentsCountMinFilter() {
        return this.commentsCountMinFilter;
    }

    public SearchCondition setContentLengthMaxFilter(Long contentLengthMaxFilter) {
        this.contentLengthMaxFilter = contentLengthMaxFilter;
        return this;
    }
    public Long getContentLengthMaxFilter() {
        return this.contentLengthMaxFilter;
    }

    public SearchCondition setContentLengthMinFilter(Long contentLengthMinFilter) {
        this.contentLengthMinFilter = contentLengthMinFilter;
        return this;
    }
    public Long getContentLengthMinFilter() {
        return this.contentLengthMinFilter;
    }

    public SearchCondition setDocAnswersCountMaxFilter(Long docAnswersCountMaxFilter) {
        this.docAnswersCountMaxFilter = docAnswersCountMaxFilter;
        return this;
    }
    public Long getDocAnswersCountMaxFilter() {
        return this.docAnswersCountMaxFilter;
    }

    public SearchCondition setDocAnswersCountMinFilter(Long docAnswersCountMinFilter) {
        this.docAnswersCountMinFilter = docAnswersCountMinFilter;
        return this;
    }
    public Long getDocAnswersCountMinFilter() {
        return this.docAnswersCountMinFilter;
    }

    public SearchCondition setDocAreaIdx(String docAreaIdx) {
        this.docAreaIdx = docAreaIdx;
        return this;
    }
    public String getDocAreaIdx() {
        return this.docAreaIdx;
    }

    public SearchCondition setDocContentSignIdx(String docContentSignIdx) {
        this.docContentSignIdx = docContentSignIdx;
        return this;
    }
    public String getDocContentSignIdx() {
        return this.docContentSignIdx;
    }

    public SearchCondition setDocCreateTimeEndFilter(Long docCreateTimeEndFilter) {
        this.docCreateTimeEndFilter = docCreateTimeEndFilter;
        return this;
    }
    public Long getDocCreateTimeEndFilter() {
        return this.docCreateTimeEndFilter;
    }

    public SearchCondition setDocCreateTimeStartFilter(Long docCreateTimeStartFilter) {
        this.docCreateTimeStartFilter = docCreateTimeStartFilter;
        return this;
    }
    public Long getDocCreateTimeStartFilter() {
        return this.docCreateTimeStartFilter;
    }

    public SearchCondition setDocPublishTimeEndFilter(Long docPublishTimeEndFilter) {
        this.docPublishTimeEndFilter = docPublishTimeEndFilter;
        return this;
    }
    public Long getDocPublishTimeEndFilter() {
        return this.docPublishTimeEndFilter;
    }

    public SearchCondition setDocPublishTimeStartFilter(Long docPublishTimeStartFilter) {
        this.docPublishTimeStartFilter = docPublishTimeStartFilter;
        return this;
    }
    public Long getDocPublishTimeStartFilter() {
        return this.docPublishTimeStartFilter;
    }

    public SearchCondition setDocUpdateTimeEndFilter(Long docUpdateTimeEndFilter) {
        this.docUpdateTimeEndFilter = docUpdateTimeEndFilter;
        return this;
    }
    public Long getDocUpdateTimeEndFilter() {
        return this.docUpdateTimeEndFilter;
    }

    public SearchCondition setDocUpdateTimeStartFilter(Long docUpdateTimeStartFilter) {
        this.docUpdateTimeStartFilter = docUpdateTimeStartFilter;
        return this;
    }
    public Long getDocUpdateTimeStartFilter() {
        return this.docUpdateTimeStartFilter;
    }

    public SearchCondition setDuplicateRemoval(Boolean duplicateRemoval) {
        this.duplicateRemoval = duplicateRemoval;
        return this;
    }
    public Boolean getDuplicateRemoval() {
        return this.duplicateRemoval;
    }

    public SearchCondition setEmotionScoreMaxFilter(Double emotionScoreMaxFilter) {
        this.emotionScoreMaxFilter = emotionScoreMaxFilter;
        return this;
    }
    public Double getEmotionScoreMaxFilter() {
        return this.emotionScoreMaxFilter;
    }

    public SearchCondition setEmotionScoreMinFilter(Double emotionScoreMinFilter) {
        this.emotionScoreMinFilter = emotionScoreMinFilter;
        return this;
    }
    public Double getEmotionScoreMinFilter() {
        return this.emotionScoreMinFilter;
    }

    public SearchCondition setEnableKeywordHighlight(Boolean enableKeywordHighlight) {
        this.enableKeywordHighlight = enableKeywordHighlight;
        return this;
    }
    public Boolean getEnableKeywordHighlight() {
        return this.enableKeywordHighlight;
    }

    public SearchCondition setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public SearchCondition setEroticismFilter(Boolean eroticismFilter) {
        this.eroticismFilter = eroticismFilter;
        return this;
    }
    public Boolean getEroticismFilter() {
        return this.eroticismFilter;
    }

    public SearchCondition setExcludeAuthorNameIdx(String excludeAuthorNameIdx) {
        this.excludeAuthorNameIdx = excludeAuthorNameIdx;
        return this;
    }
    public String getExcludeAuthorNameIdx() {
        return this.excludeAuthorNameIdx;
    }

    public SearchCondition setExcludingMediaHostsFilter(String excludingMediaHostsFilter) {
        this.excludingMediaHostsFilter = excludingMediaHostsFilter;
        return this;
    }
    public String getExcludingMediaHostsFilter() {
        return this.excludingMediaHostsFilter;
    }

    public SearchCondition setExcludingMediaPoolIdsFilter(String excludingMediaPoolIdsFilter) {
        this.excludingMediaPoolIdsFilter = excludingMediaPoolIdsFilter;
        return this;
    }
    public String getExcludingMediaPoolIdsFilter() {
        return this.excludingMediaPoolIdsFilter;
    }

    public SearchCondition setFilterId(Long filterId) {
        this.filterId = filterId;
        return this;
    }
    public Long getFilterId() {
        return this.filterId;
    }

    public SearchCondition setFinanceEntityAreaFilter(String financeEntityAreaFilter) {
        this.financeEntityAreaFilter = financeEntityAreaFilter;
        return this;
    }
    public String getFinanceEntityAreaFilter() {
        return this.financeEntityAreaFilter;
    }

    public SearchCondition setFinanceEntityRelevanceScoreMaxFilter(Double financeEntityRelevanceScoreMaxFilter) {
        this.financeEntityRelevanceScoreMaxFilter = financeEntityRelevanceScoreMaxFilter;
        return this;
    }
    public Double getFinanceEntityRelevanceScoreMaxFilter() {
        return this.financeEntityRelevanceScoreMaxFilter;
    }

    public SearchCondition setFinanceEntityRelevanceScoreMinFilter(Double financeEntityRelevanceScoreMinFilter) {
        this.financeEntityRelevanceScoreMinFilter = financeEntityRelevanceScoreMinFilter;
        return this;
    }
    public Double getFinanceEntityRelevanceScoreMinFilter() {
        return this.financeEntityRelevanceScoreMinFilter;
    }

    public SearchCondition setFinanceEventCodeFilter(String financeEventCodeFilter) {
        this.financeEventCodeFilter = financeEventCodeFilter;
        return this;
    }
    public String getFinanceEventCodeFilter() {
        return this.financeEventCodeFilter;
    }

    public SearchCondition setGamblingFilter(Boolean gamblingFilter) {
        this.gamblingFilter = gamblingFilter;
        return this;
    }
    public Boolean getGamblingFilter() {
        return this.gamblingFilter;
    }

    public SearchCondition setHotspotTitleIdx(String hotspotTitleIdx) {
        this.hotspotTitleIdx = hotspotTitleIdx;
        return this;
    }
    public String getHotspotTitleIdx() {
        return this.hotspotTitleIdx;
    }

    public SearchCondition setIllegalAdvertisementFilter(Boolean illegalAdvertisementFilter) {
        this.illegalAdvertisementFilter = illegalAdvertisementFilter;
        return this;
    }
    public Boolean getIllegalAdvertisementFilter() {
        return this.illegalAdvertisementFilter;
    }

    public SearchCondition setLikesCountMaxFilter(Long likesCountMaxFilter) {
        this.likesCountMaxFilter = likesCountMaxFilter;
        return this;
    }
    public Long getLikesCountMaxFilter() {
        return this.likesCountMaxFilter;
    }

    public SearchCondition setLikesCountMinFilter(Long likesCountMinFilter) {
        this.likesCountMinFilter = likesCountMinFilter;
        return this;
    }
    public Long getLikesCountMinFilter() {
        return this.likesCountMinFilter;
    }

    public SearchCondition setMediaHostsFilter(String mediaHostsFilter) {
        this.mediaHostsFilter = mediaHostsFilter;
        return this;
    }
    public String getMediaHostsFilter() {
        return this.mediaHostsFilter;
    }

    public SearchCondition setMediaInfluenceScoreMaxFilter(Double mediaInfluenceScoreMaxFilter) {
        this.mediaInfluenceScoreMaxFilter = mediaInfluenceScoreMaxFilter;
        return this;
    }
    public Double getMediaInfluenceScoreMaxFilter() {
        return this.mediaInfluenceScoreMaxFilter;
    }

    public SearchCondition setMediaInfluenceScoreMinFilter(Double mediaInfluenceScoreMinFilter) {
        this.mediaInfluenceScoreMinFilter = mediaInfluenceScoreMinFilter;
        return this;
    }
    public Double getMediaInfluenceScoreMinFilter() {
        return this.mediaInfluenceScoreMinFilter;
    }

    public SearchCondition setMediaNameFilter(String mediaNameFilter) {
        this.mediaNameFilter = mediaNameFilter;
        return this;
    }
    public String getMediaNameFilter() {
        return this.mediaNameFilter;
    }

    public SearchCondition setMediaPoolIdsFilter(String mediaPoolIdsFilter) {
        this.mediaPoolIdsFilter = mediaPoolIdsFilter;
        return this;
    }
    public String getMediaPoolIdsFilter() {
        return this.mediaPoolIdsFilter;
    }

    public SearchCondition setMediaPropagationScoreMaxFilter(Double mediaPropagationScoreMaxFilter) {
        this.mediaPropagationScoreMaxFilter = mediaPropagationScoreMaxFilter;
        return this;
    }
    public Double getMediaPropagationScoreMaxFilter() {
        return this.mediaPropagationScoreMaxFilter;
    }

    public SearchCondition setMediaPropagationScoreMinFilter(Double mediaPropagationScoreMinFilter) {
        this.mediaPropagationScoreMinFilter = mediaPropagationScoreMinFilter;
        return this;
    }
    public Double getMediaPropagationScoreMinFilter() {
        return this.mediaPropagationScoreMinFilter;
    }

    public SearchCondition setMediaTypeFilter(String mediaTypeFilter) {
        this.mediaTypeFilter = mediaTypeFilter;
        return this;
    }
    public String getMediaTypeFilter() {
        return this.mediaTypeFilter;
    }

    public SearchCondition setMessageTypeFilter(String messageTypeFilter) {
        this.messageTypeFilter = messageTypeFilter;
        return this;
    }
    public String getMessageTypeFilter() {
        return this.messageTypeFilter;
    }

    public SearchCondition setNegKeywordsIdx(String negKeywordsIdx) {
        this.negKeywordsIdx = negKeywordsIdx;
        return this;
    }
    public String getNegKeywordsIdx() {
        return this.negKeywordsIdx;
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

    public SearchCondition setParentIdsIdx(String parentIdsIdx) {
        this.parentIdsIdx = parentIdsIdx;
        return this;
    }
    public String getParentIdsIdx() {
        return this.parentIdsIdx;
    }

    public SearchCondition setPosKeywordsIdx(String posKeywordsIdx) {
        this.posKeywordsIdx = posKeywordsIdx;
        return this;
    }
    public String getPosKeywordsIdx() {
        return this.posKeywordsIdx;
    }

    public SearchCondition setPrimaryKeyIdx(String primaryKeyIdx) {
        this.primaryKeyIdx = primaryKeyIdx;
        return this;
    }
    public String getPrimaryKeyIdx() {
        return this.primaryKeyIdx;
    }

    public SearchCondition setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public SearchCondition setReadsCountMaxFilter(Long readsCountMaxFilter) {
        this.readsCountMaxFilter = readsCountMaxFilter;
        return this;
    }
    public Long getReadsCountMaxFilter() {
        return this.readsCountMaxFilter;
    }

    public SearchCondition setReadsCountMinFilter(Long readsCountMinFilter) {
        this.readsCountMinFilter = readsCountMinFilter;
        return this;
    }
    public Long getReadsCountMinFilter() {
        return this.readsCountMinFilter;
    }

    public SearchCondition setRelevanceScoreMaxFilter(Double relevanceScoreMaxFilter) {
        this.relevanceScoreMaxFilter = relevanceScoreMaxFilter;
        return this;
    }
    public Double getRelevanceScoreMaxFilter() {
        return this.relevanceScoreMaxFilter;
    }

    public SearchCondition setRelevanceScoreMinFilter(Double relevanceScoreMinFilter) {
        this.relevanceScoreMinFilter = relevanceScoreMinFilter;
        return this;
    }
    public Double getRelevanceScoreMinFilter() {
        return this.relevanceScoreMinFilter;
    }

    public SearchCondition setRepostsCountMaxFilter(Long repostsCountMaxFilter) {
        this.repostsCountMaxFilter = repostsCountMaxFilter;
        return this;
    }
    public Long getRepostsCountMaxFilter() {
        return this.repostsCountMaxFilter;
    }

    public SearchCondition setRepostsCountMinFilter(Long repostsCountMinFilter) {
        this.repostsCountMinFilter = repostsCountMinFilter;
        return this;
    }
    public Long getRepostsCountMinFilter() {
        return this.repostsCountMinFilter;
    }

    public SearchCondition setReprintFromFilter(String reprintFromFilter) {
        this.reprintFromFilter = reprintFromFilter;
        return this;
    }
    public String getReprintFromFilter() {
        return this.reprintFromFilter;
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

    public SearchCondition setSpamFilter(Boolean spamFilter) {
        this.spamFilter = spamFilter;
        return this;
    }
    public Boolean getSpamFilter() {
        return this.spamFilter;
    }

    public SearchCondition setSuspicionSpamFilter(Boolean suspicionSpamFilter) {
        this.suspicionSpamFilter = suspicionSpamFilter;
        return this;
    }
    public Boolean getSuspicionSpamFilter() {
        return this.suspicionSpamFilter;
    }

    public SearchCondition setTitleExcludingWordsIdx(String titleExcludingWordsIdx) {
        this.titleExcludingWordsIdx = titleExcludingWordsIdx;
        return this;
    }
    public String getTitleExcludingWordsIdx() {
        return this.titleExcludingWordsIdx;
    }

    public SearchCondition setTitleIncludingWordsIdx(String titleIncludingWordsIdx) {
        this.titleIncludingWordsIdx = titleIncludingWordsIdx;
        return this;
    }
    public String getTitleIncludingWordsIdx() {
        return this.titleIncludingWordsIdx;
    }

    public SearchCondition setTopicIdx(String topicIdx) {
        this.topicIdx = topicIdx;
        return this;
    }
    public String getTopicIdx() {
        return this.topicIdx;
    }

    public SearchCondition setUsedIndexModeSwitch(String usedIndexModeSwitch) {
        this.usedIndexModeSwitch = usedIndexModeSwitch;
        return this;
    }
    public String getUsedIndexModeSwitch() {
        return this.usedIndexModeSwitch;
    }

}
