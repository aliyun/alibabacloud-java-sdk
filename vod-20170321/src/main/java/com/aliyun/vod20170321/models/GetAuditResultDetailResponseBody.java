// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAuditResultDetailResponseBody extends TeaModel {
    @NameInMap("AIAuditResultDetail")
    public GetAuditResultDetailResponseBodyAIAuditResultDetail AIAuditResultDetail;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAuditResultDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuditResultDetailResponseBody self = new GetAuditResultDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuditResultDetailResponseBody setAIAuditResultDetail(GetAuditResultDetailResponseBodyAIAuditResultDetail AIAuditResultDetail) {
        this.AIAuditResultDetail = AIAuditResultDetail;
        return this;
    }
    public GetAuditResultDetailResponseBodyAIAuditResultDetail getAIAuditResultDetail() {
        return this.AIAuditResultDetail;
    }

    public GetAuditResultDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAuditResultDetailResponseBodyAIAuditResultDetailList extends TeaModel {
        @NameInMap("Index")
        public String index;

        @NameInMap("Object")
        public String object;

        @NameInMap("PornLabel")
        public String pornLabel;

        @NameInMap("PornScore")
        public String pornScore;

        @NameInMap("TerrorismLabel")
        public String terrorismLabel;

        @NameInMap("TerrorismScore")
        public String terrorismScore;

        @NameInMap("Timestamp")
        public String timestamp;

        public static GetAuditResultDetailResponseBodyAIAuditResultDetailList build(java.util.Map<String, ?> map) throws Exception {
            GetAuditResultDetailResponseBodyAIAuditResultDetailList self = new GetAuditResultDetailResponseBodyAIAuditResultDetailList();
            return TeaModel.build(map, self);
        }

        public GetAuditResultDetailResponseBodyAIAuditResultDetailList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public GetAuditResultDetailResponseBodyAIAuditResultDetailList setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public GetAuditResultDetailResponseBodyAIAuditResultDetailList setPornLabel(String pornLabel) {
            this.pornLabel = pornLabel;
            return this;
        }
        public String getPornLabel() {
            return this.pornLabel;
        }

        public GetAuditResultDetailResponseBodyAIAuditResultDetailList setPornScore(String pornScore) {
            this.pornScore = pornScore;
            return this;
        }
        public String getPornScore() {
            return this.pornScore;
        }

        public GetAuditResultDetailResponseBodyAIAuditResultDetailList setTerrorismLabel(String terrorismLabel) {
            this.terrorismLabel = terrorismLabel;
            return this;
        }
        public String getTerrorismLabel() {
            return this.terrorismLabel;
        }

        public GetAuditResultDetailResponseBodyAIAuditResultDetailList setTerrorismScore(String terrorismScore) {
            this.terrorismScore = terrorismScore;
            return this;
        }
        public String getTerrorismScore() {
            return this.terrorismScore;
        }

        public GetAuditResultDetailResponseBodyAIAuditResultDetailList setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class GetAuditResultDetailResponseBodyAIAuditResultDetail extends TeaModel {
        @NameInMap("List")
        public java.util.List<GetAuditResultDetailResponseBodyAIAuditResultDetailList> list;

        @NameInMap("Total")
        public Integer total;

        public static GetAuditResultDetailResponseBodyAIAuditResultDetail build(java.util.Map<String, ?> map) throws Exception {
            GetAuditResultDetailResponseBodyAIAuditResultDetail self = new GetAuditResultDetailResponseBodyAIAuditResultDetail();
            return TeaModel.build(map, self);
        }

        public GetAuditResultDetailResponseBodyAIAuditResultDetail setList(java.util.List<GetAuditResultDetailResponseBodyAIAuditResultDetailList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetAuditResultDetailResponseBodyAIAuditResultDetailList> getList() {
            return this.list;
        }

        public GetAuditResultDetailResponseBodyAIAuditResultDetail setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
