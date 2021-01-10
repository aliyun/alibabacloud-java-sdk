// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogHitspercentageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("ResponseContentRange")
    public String responseContentRange;

    @NameInMap("ResponseContentType")
    public String responseContentType;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public GetLinkeLinklogHitspercentageResponseBodyResult result;

    public static GetLinkeLinklogHitspercentageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogHitspercentageResponseBody self = new GetLinkeLinklogHitspercentageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogHitspercentageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeLinklogHitspercentageResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeLinklogHitspercentageResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeLinklogHitspercentageResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetLinkeLinklogHitspercentageResponseBody setResponseContentRange(String responseContentRange) {
        this.responseContentRange = responseContentRange;
        return this;
    }
    public String getResponseContentRange() {
        return this.responseContentRange;
    }

    public GetLinkeLinklogHitspercentageResponseBody setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public String getResponseContentType() {
        return this.responseContentType;
    }

    public GetLinkeLinklogHitspercentageResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeLinklogHitspercentageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeLinklogHitspercentageResponseBody setResult(GetLinkeLinklogHitspercentageResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeLinklogHitspercentageResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeLinklogHitspercentageResponseBodyResult extends TeaModel {
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

        @NameInMap("StoreId")
        public Long storeId;

        @NameInMap("StoreName")
        public String storeName;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("KnowledgeHitsPercentageList")
        public java.util.List<String> knowledgeHitsPercentageList;

        @NameInMap("StoreIds")
        public java.util.List<Long> storeIds;

        public static GetLinkeLinklogHitspercentageResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeLinklogHitspercentageResponseBodyResult self = new GetLinkeLinklogHitspercentageResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeLinklogHitspercentageResponseBodyResult setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public GetLinkeLinklogHitspercentageResponseBodyResult setBeginText(String beginText) {
            this.beginText = beginText;
            return this;
        }
        public String getBeginText() {
            return this.beginText;
        }

        public GetLinkeLinklogHitspercentageResponseBodyResult setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public GetLinkeLinklogHitspercentageResponseBodyResult setEndText(String endText) {
            this.endText = endText;
            return this;
        }
        public String getEndText() {
            return this.endText;
        }

        public GetLinkeLinklogHitspercentageResponseBodyResult setFailCount(Long failCount) {
            this.failCount = failCount;
            return this;
        }
        public Long getFailCount() {
            return this.failCount;
        }

        public GetLinkeLinklogHitspercentageResponseBodyResult setFailPercent(String failPercent) {
            this.failPercent = failPercent;
            return this;
        }
        public String getFailPercent() {
            return this.failPercent;
        }

        public GetLinkeLinklogHitspercentageResponseBodyResult setFailPercentText(String failPercentText) {
            this.failPercentText = failPercentText;
            return this;
        }
        public String getFailPercentText() {
            return this.failPercentText;
        }

        public GetLinkeLinklogHitspercentageResponseBodyResult setHitCount(Long hitCount) {
            this.hitCount = hitCount;
            return this;
        }
        public Long getHitCount() {
            return this.hitCount;
        }

        public GetLinkeLinklogHitspercentageResponseBodyResult setHitPercent(String hitPercent) {
            this.hitPercent = hitPercent;
            return this;
        }
        public String getHitPercent() {
            return this.hitPercent;
        }

        public GetLinkeLinklogHitspercentageResponseBodyResult setHitPercentText(String hitPercentText) {
            this.hitPercentText = hitPercentText;
            return this;
        }
        public String getHitPercentText() {
            return this.hitPercentText;
        }

        public GetLinkeLinklogHitspercentageResponseBodyResult setStoreId(Long storeId) {
            this.storeId = storeId;
            return this;
        }
        public Long getStoreId() {
            return this.storeId;
        }

        public GetLinkeLinklogHitspercentageResponseBodyResult setStoreName(String storeName) {
            this.storeName = storeName;
            return this;
        }
        public String getStoreName() {
            return this.storeName;
        }

        public GetLinkeLinklogHitspercentageResponseBodyResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetLinkeLinklogHitspercentageResponseBodyResult setKnowledgeHitsPercentageList(java.util.List<String> knowledgeHitsPercentageList) {
            this.knowledgeHitsPercentageList = knowledgeHitsPercentageList;
            return this;
        }
        public java.util.List<String> getKnowledgeHitsPercentageList() {
            return this.knowledgeHitsPercentageList;
        }

        public GetLinkeLinklogHitspercentageResponseBodyResult setStoreIds(java.util.List<Long> storeIds) {
            this.storeIds = storeIds;
            return this;
        }
        public java.util.List<Long> getStoreIds() {
            return this.storeIds;
        }

    }

}
