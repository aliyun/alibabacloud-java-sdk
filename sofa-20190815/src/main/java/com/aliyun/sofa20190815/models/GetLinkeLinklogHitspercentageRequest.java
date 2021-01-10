// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogHitspercentageRequest extends TeaModel {
    @NameInMap("Begin")
    public Long begin;

    @NameInMap("BeginText")
    public String beginText;

    @NameInMap("End")
    public Long end;

    @NameInMap("EndText")
    public String endText;

    @NameInMap("FailCount")
    public Long failCount;

    @NameInMap("FailPercent")
    public String failPercent;

    @NameInMap("FailPercentText")
    public String failPercentText;

    @NameInMap("HitCount")
    public Long hitCount;

    @NameInMap("HitPercent")
    public String hitPercent;

    @NameInMap("HitPercentText")
    public String hitPercentText;

    @NameInMap("KnowledgeHitsPercentageListRepeatList")
    public java.util.List<String> knowledgeHitsPercentageListRepeatList;

    @NameInMap("StoreId")
    public Long storeId;

    @NameInMap("StoreIdsRepeatList")
    public java.util.List<Long> storeIdsRepeatList;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetLinkeLinklogHitspercentageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogHitspercentageRequest self = new GetLinkeLinklogHitspercentageRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogHitspercentageRequest setBegin(Long begin) {
        this.begin = begin;
        return this;
    }
    public Long getBegin() {
        return this.begin;
    }

    public GetLinkeLinklogHitspercentageRequest setBeginText(String beginText) {
        this.beginText = beginText;
        return this;
    }
    public String getBeginText() {
        return this.beginText;
    }

    public GetLinkeLinklogHitspercentageRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetLinkeLinklogHitspercentageRequest setEndText(String endText) {
        this.endText = endText;
        return this;
    }
    public String getEndText() {
        return this.endText;
    }

    public GetLinkeLinklogHitspercentageRequest setFailCount(Long failCount) {
        this.failCount = failCount;
        return this;
    }
    public Long getFailCount() {
        return this.failCount;
    }

    public GetLinkeLinklogHitspercentageRequest setFailPercent(String failPercent) {
        this.failPercent = failPercent;
        return this;
    }
    public String getFailPercent() {
        return this.failPercent;
    }

    public GetLinkeLinklogHitspercentageRequest setFailPercentText(String failPercentText) {
        this.failPercentText = failPercentText;
        return this;
    }
    public String getFailPercentText() {
        return this.failPercentText;
    }

    public GetLinkeLinklogHitspercentageRequest setHitCount(Long hitCount) {
        this.hitCount = hitCount;
        return this;
    }
    public Long getHitCount() {
        return this.hitCount;
    }

    public GetLinkeLinklogHitspercentageRequest setHitPercent(String hitPercent) {
        this.hitPercent = hitPercent;
        return this;
    }
    public String getHitPercent() {
        return this.hitPercent;
    }

    public GetLinkeLinklogHitspercentageRequest setHitPercentText(String hitPercentText) {
        this.hitPercentText = hitPercentText;
        return this;
    }
    public String getHitPercentText() {
        return this.hitPercentText;
    }

    public GetLinkeLinklogHitspercentageRequest setKnowledgeHitsPercentageListRepeatList(java.util.List<String> knowledgeHitsPercentageListRepeatList) {
        this.knowledgeHitsPercentageListRepeatList = knowledgeHitsPercentageListRepeatList;
        return this;
    }
    public java.util.List<String> getKnowledgeHitsPercentageListRepeatList() {
        return this.knowledgeHitsPercentageListRepeatList;
    }

    public GetLinkeLinklogHitspercentageRequest setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }
    public Long getStoreId() {
        return this.storeId;
    }

    public GetLinkeLinklogHitspercentageRequest setStoreIdsRepeatList(java.util.List<Long> storeIdsRepeatList) {
        this.storeIdsRepeatList = storeIdsRepeatList;
        return this;
    }
    public java.util.List<Long> getStoreIdsRepeatList() {
        return this.storeIdsRepeatList;
    }

    public GetLinkeLinklogHitspercentageRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public GetLinkeLinklogHitspercentageRequest setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
