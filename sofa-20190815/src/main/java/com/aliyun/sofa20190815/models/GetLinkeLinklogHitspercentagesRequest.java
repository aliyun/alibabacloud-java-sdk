// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogHitspercentagesRequest extends TeaModel {
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

    public static GetLinkeLinklogHitspercentagesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogHitspercentagesRequest self = new GetLinkeLinklogHitspercentagesRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogHitspercentagesRequest setBegin(Long begin) {
        this.begin = begin;
        return this;
    }
    public Long getBegin() {
        return this.begin;
    }

    public GetLinkeLinklogHitspercentagesRequest setBeginText(String beginText) {
        this.beginText = beginText;
        return this;
    }
    public String getBeginText() {
        return this.beginText;
    }

    public GetLinkeLinklogHitspercentagesRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetLinkeLinklogHitspercentagesRequest setEndText(String endText) {
        this.endText = endText;
        return this;
    }
    public String getEndText() {
        return this.endText;
    }

    public GetLinkeLinklogHitspercentagesRequest setFailCount(Long failCount) {
        this.failCount = failCount;
        return this;
    }
    public Long getFailCount() {
        return this.failCount;
    }

    public GetLinkeLinklogHitspercentagesRequest setFailPercent(String failPercent) {
        this.failPercent = failPercent;
        return this;
    }
    public String getFailPercent() {
        return this.failPercent;
    }

    public GetLinkeLinklogHitspercentagesRequest setFailPercentText(String failPercentText) {
        this.failPercentText = failPercentText;
        return this;
    }
    public String getFailPercentText() {
        return this.failPercentText;
    }

    public GetLinkeLinklogHitspercentagesRequest setHitCount(Long hitCount) {
        this.hitCount = hitCount;
        return this;
    }
    public Long getHitCount() {
        return this.hitCount;
    }

    public GetLinkeLinklogHitspercentagesRequest setHitPercent(String hitPercent) {
        this.hitPercent = hitPercent;
        return this;
    }
    public String getHitPercent() {
        return this.hitPercent;
    }

    public GetLinkeLinklogHitspercentagesRequest setHitPercentText(String hitPercentText) {
        this.hitPercentText = hitPercentText;
        return this;
    }
    public String getHitPercentText() {
        return this.hitPercentText;
    }

    public GetLinkeLinklogHitspercentagesRequest setKnowledgeHitsPercentageListRepeatList(java.util.List<String> knowledgeHitsPercentageListRepeatList) {
        this.knowledgeHitsPercentageListRepeatList = knowledgeHitsPercentageListRepeatList;
        return this;
    }
    public java.util.List<String> getKnowledgeHitsPercentageListRepeatList() {
        return this.knowledgeHitsPercentageListRepeatList;
    }

    public GetLinkeLinklogHitspercentagesRequest setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }
    public Long getStoreId() {
        return this.storeId;
    }

    public GetLinkeLinklogHitspercentagesRequest setStoreIdsRepeatList(java.util.List<Long> storeIdsRepeatList) {
        this.storeIdsRepeatList = storeIdsRepeatList;
        return this;
    }
    public java.util.List<Long> getStoreIdsRepeatList() {
        return this.storeIdsRepeatList;
    }

    public GetLinkeLinklogHitspercentagesRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public GetLinkeLinklogHitspercentagesRequest setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
