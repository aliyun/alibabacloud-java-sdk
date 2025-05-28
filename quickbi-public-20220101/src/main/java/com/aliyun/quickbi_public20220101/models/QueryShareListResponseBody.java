// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryShareListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DC4E1E63-B337-44F8-8C22-6F00DF67E2C3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returns the list of objects to which the work has been shared.</p>
     */
    @NameInMap("Result")
    public java.util.List<QueryShareListResponseBodyResult> result;

    /**
     * <p>Indicates whether the request was successful. Possible values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
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
         * <p>Sharing permissions. Possible values:</p>
         * <ul>
         * <li>1: View only</li>
         * <li>3: View and export</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AuthPoint")
        public Integer authPoint;

        /**
         * <p>The timestamp in milliseconds indicating the expiration time of the authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>1640102400000</p>
         */
        @NameInMap("ExpireDate")
        public Long expireDate;

        /**
         * <p>The ID of the work.</p>
         * 
         * <strong>example:</strong>
         * <p>6b407e50-e774-406b-9956-da2425c2****</p>
         */
        @NameInMap("ReportId")
        public String reportId;

        /**
         * <p>The ID of the sharing configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>0ab9659e-29cf-47d7-a364-3a91553b****</p>
         */
        @NameInMap("ShareId")
        public String shareId;

        /**
         * <p>The ID of the sharing target, which could be a user ID or a group ID in Quick BI.</p>
         * <ul>
         * <li>When ShareToType=2 (all members within an organization), ShareToId is the organization ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>95296e95-ca89-4c7d-8af9-dedf0ad0****</p>
         */
        @NameInMap("ShareToId")
        public String shareToId;

        /**
         * <p>The name of the sharing target.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ShareToName")
        public String shareToName;

        /**
         * <p>The type of sharing. Possible values:</p>
         * <ul>
         * <li>0: User</li>
         * <li>1: Group</li>
         * <li>2: Organization</li>
         * <li>3: Space</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ShareToType")
        public Integer shareToType;

        /**
         * <p>The type of the shared work. The value range includes: </p>
         * <ul>
         * <li>dataProduct: Data Portal </li>
         * <li>dashboard: Dashboard </li>
         * <li>report: Spreadsheet </li>
         * <li>dashboardOfflineQuery: Self-service Data Extraction </li>
         * <li>ANALYSIS: Ad-hoc Analysis </li>
         * <li>DATAFORM: Data Entry </li>
         * <li>SCREEN: Data Visualization Screen</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dashboard</p>
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
