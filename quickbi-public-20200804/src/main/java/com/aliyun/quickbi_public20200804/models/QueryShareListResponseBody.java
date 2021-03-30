// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200804.models;

import com.aliyun.tea.*;

public class QueryShareListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<QueryShareListResponseBodyResult> result;

    public static QueryShareListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryShareListResponseBody self = new QueryShareListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryShareListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryShareListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryShareListResponseBody setResult(java.util.List<QueryShareListResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryShareListResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryShareListResponseBodyResult extends TeaModel {
        @NameInMap("ShareId")
        public String shareId;

        @NameInMap("ShareToId")
        public String shareToId;

        @NameInMap("AuthPoint")
        public Integer authPoint;

        @NameInMap("ExpireDate")
        public Long expireDate;

        @NameInMap("ShareToType")
        public Integer shareToType;

        @NameInMap("ReportId")
        public String reportId;

        @NameInMap("ShareToName")
        public String shareToName;

        @NameInMap("ShareType")
        public String shareType;

        public static QueryShareListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryShareListResponseBodyResult self = new QueryShareListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryShareListResponseBodyResult setShareId(String shareId) {
            this.shareId = shareId;
            return this;
        }
        public String getShareId() {
            return this.shareId;
        }

        public QueryShareListResponseBodyResult setShareToId(String shareToId) {
            this.shareToId = shareToId;
            return this;
        }
        public String getShareToId() {
            return this.shareToId;
        }

        public QueryShareListResponseBodyResult setAuthPoint(Integer authPoint) {
            this.authPoint = authPoint;
            return this;
        }
        public Integer getAuthPoint() {
            return this.authPoint;
        }

        public QueryShareListResponseBodyResult setExpireDate(Long expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public Long getExpireDate() {
            return this.expireDate;
        }

        public QueryShareListResponseBodyResult setShareToType(Integer shareToType) {
            this.shareToType = shareToType;
            return this;
        }
        public Integer getShareToType() {
            return this.shareToType;
        }

        public QueryShareListResponseBodyResult setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public QueryShareListResponseBodyResult setShareToName(String shareToName) {
            this.shareToName = shareToName;
            return this;
        }
        public String getShareToName() {
            return this.shareToName;
        }

        public QueryShareListResponseBodyResult setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

    }

}
