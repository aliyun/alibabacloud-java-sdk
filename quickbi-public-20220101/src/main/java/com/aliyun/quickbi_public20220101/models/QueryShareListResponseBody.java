// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryShareListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DC4E1E63-B337-44F8-8C22-6F00DF67E2C3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<QueryShareListResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

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

    public QueryShareListResponseBody setResult(java.util.List<QueryShareListResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryShareListResponseBodyResult> getResult() {
        return this.result;
    }

    public QueryShareListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryShareListResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AuthPoint")
        public Integer authPoint;

        /**
         * <strong>example:</strong>
         * <p>1640102400000</p>
         */
        @NameInMap("ExpireDate")
        public Long expireDate;

        /**
         * <strong>example:</strong>
         * <p>6b407e50-e774-406b-9956-da2425c2****</p>
         */
        @NameInMap("ReportId")
        public String reportId;

        /**
         * <strong>example:</strong>
         * <p>0ab9659e-29cf-47d7-a364-3a91553b****</p>
         */
        @NameInMap("ShareId")
        public String shareId;

        /**
         * <strong>example:</strong>
         * <p>95296e95-ca89-4c7d-8af9-dedf0ad0****</p>
         */
        @NameInMap("ShareToId")
        public String shareToId;

        @NameInMap("ShareToName")
        public String shareToName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ShareToType")
        public Integer shareToType;

        /**
         * <strong>example:</strong>
         * <p>product</p>
         */
        @NameInMap("ShareType")
        public String shareType;

        public static QueryShareListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryShareListResponseBodyResult self = new QueryShareListResponseBodyResult();
            return TeaModel.build(map, self);
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

        public QueryShareListResponseBodyResult setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
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

        public QueryShareListResponseBodyResult setShareToName(String shareToName) {
            this.shareToName = shareToName;
            return this;
        }
        public String getShareToName() {
            return this.shareToName;
        }

        public QueryShareListResponseBodyResult setShareToType(Integer shareToType) {
            this.shareToType = shareToType;
            return this;
        }
        public Integer getShareToType() {
            return this.shareToType;
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
