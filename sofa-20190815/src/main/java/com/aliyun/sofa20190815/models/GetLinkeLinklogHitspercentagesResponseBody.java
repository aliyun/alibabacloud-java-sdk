// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogHitspercentagesResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeLinklogHitspercentagesResponseBodyResult> result;

    public static GetLinkeLinklogHitspercentagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogHitspercentagesResponseBody self = new GetLinkeLinklogHitspercentagesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogHitspercentagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeLinklogHitspercentagesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeLinklogHitspercentagesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeLinklogHitspercentagesResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetLinkeLinklogHitspercentagesResponseBody setResponseContentRange(String responseContentRange) {
        this.responseContentRange = responseContentRange;
        return this;
    }
    public String getResponseContentRange() {
        return this.responseContentRange;
    }

    public GetLinkeLinklogHitspercentagesResponseBody setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public String getResponseContentType() {
        return this.responseContentType;
    }

    public GetLinkeLinklogHitspercentagesResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeLinklogHitspercentagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeLinklogHitspercentagesResponseBody setResult(java.util.List<GetLinkeLinklogHitspercentagesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeLinklogHitspercentagesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeLinklogHitspercentagesResponseBodyResult extends TeaModel {
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

        public static GetLinkeLinklogHitspercentagesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeLinklogHitspercentagesResponseBodyResult self = new GetLinkeLinklogHitspercentagesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeLinklogHitspercentagesResponseBodyResult setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public GetLinkeLinklogHitspercentagesResponseBodyResult setBeginText(String beginText) {
            this.beginText = beginText;
            return this;
        }
        public String getBeginText() {
            return this.beginText;
        }

        public GetLinkeLinklogHitspercentagesResponseBodyResult setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public GetLinkeLinklogHitspercentagesResponseBodyResult setEndText(String endText) {
            this.endText = endText;
            return this;
        }
        public String getEndText() {
            return this.endText;
        }

        public GetLinkeLinklogHitspercentagesResponseBodyResult setFailCount(Long failCount) {
            this.failCount = failCount;
            return this;
        }
        public Long getFailCount() {
            return this.failCount;
        }

        public GetLinkeLinklogHitspercentagesResponseBodyResult setFailPercent(String failPercent) {
            this.failPercent = failPercent;
            return this;
        }
        public String getFailPercent() {
            return this.failPercent;
        }

        public GetLinkeLinklogHitspercentagesResponseBodyResult setFailPercentText(String failPercentText) {
            this.failPercentText = failPercentText;
            return this;
        }
        public String getFailPercentText() {
            return this.failPercentText;
        }

        public GetLinkeLinklogHitspercentagesResponseBodyResult setHitCount(Long hitCount) {
            this.hitCount = hitCount;
            return this;
        }
        public Long getHitCount() {
            return this.hitCount;
        }

        public GetLinkeLinklogHitspercentagesResponseBodyResult setHitPercent(String hitPercent) {
            this.hitPercent = hitPercent;
            return this;
        }
        public String getHitPercent() {
            return this.hitPercent;
        }

        public GetLinkeLinklogHitspercentagesResponseBodyResult setHitPercentText(String hitPercentText) {
            this.hitPercentText = hitPercentText;
            return this;
        }
        public String getHitPercentText() {
            return this.hitPercentText;
        }

        public GetLinkeLinklogHitspercentagesResponseBodyResult setStoreId(Long storeId) {
            this.storeId = storeId;
            return this;
        }
        public Long getStoreId() {
            return this.storeId;
        }

        public GetLinkeLinklogHitspercentagesResponseBodyResult setStoreName(String storeName) {
            this.storeName = storeName;
            return this;
        }
        public String getStoreName() {
            return this.storeName;
        }

        public GetLinkeLinklogHitspercentagesResponseBodyResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetLinkeLinklogHitspercentagesResponseBodyResult setKnowledgeHitsPercentageList(java.util.List<String> knowledgeHitsPercentageList) {
            this.knowledgeHitsPercentageList = knowledgeHitsPercentageList;
            return this;
        }
        public java.util.List<String> getKnowledgeHitsPercentageList() {
            return this.knowledgeHitsPercentageList;
        }

        public GetLinkeLinklogHitspercentagesResponseBodyResult setStoreIds(java.util.List<Long> storeIds) {
            this.storeIds = storeIds;
            return this;
        }
        public java.util.List<Long> getStoreIds() {
            return this.storeIds;
        }

    }

}
