// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateQuotaApplicationsForTemplateResponseBody extends TeaModel {
    /**
     * <p>The list of Alibaba Cloud accounts that belong to the resource directory members for which quotas are applied.</p>
     */
    @NameInMap("AliyunUids")
    public java.util.List<String> aliyunUids;

    /**
     * <p>The batch ID of the quota application.</p>
     * 
     * <strong>example:</strong>
     * <p>d314d6ae-867d-484c-9009-3d421a80****</p>
     */
    @NameInMap("BatchQuotaApplicationId")
    public String batchQuotaApplicationId;

    /**
     * <p>The list of Alibaba Cloud accounts that belong to the resource directory members for which quota applications failed and the reasons for the failures.</p>
     */
    @NameInMap("FailResults")
    public java.util.List<CreateQuotaApplicationsForTemplateResponseBodyFailResults> failResults;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8FF8CAF0-29D9-4F11-B6A4-FD2CBCA016D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateQuotaApplicationsForTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateQuotaApplicationsForTemplateResponseBody self = new CreateQuotaApplicationsForTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateQuotaApplicationsForTemplateResponseBody setAliyunUids(java.util.List<String> aliyunUids) {
        this.aliyunUids = aliyunUids;
        return this;
    }
    public java.util.List<String> getAliyunUids() {
        return this.aliyunUids;
    }

    public CreateQuotaApplicationsForTemplateResponseBody setBatchQuotaApplicationId(String batchQuotaApplicationId) {
        this.batchQuotaApplicationId = batchQuotaApplicationId;
        return this;
    }
    public String getBatchQuotaApplicationId() {
        return this.batchQuotaApplicationId;
    }

    public CreateQuotaApplicationsForTemplateResponseBody setFailResults(java.util.List<CreateQuotaApplicationsForTemplateResponseBodyFailResults> failResults) {
        this.failResults = failResults;
        return this;
    }
    public java.util.List<CreateQuotaApplicationsForTemplateResponseBodyFailResults> getFailResults() {
        return this.failResults;
    }

    public CreateQuotaApplicationsForTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateQuotaApplicationsForTemplateResponseBodyFailResults extends TeaModel {
        /**
         * <p>The Alibaba Cloud account that belongs to the resource directory member for which the quota application failed.</p>
         * 
         * <strong>example:</strong>
         * <p>135048337611****</p>
         */
        @NameInMap("AliyunUid")
        public String aliyunUid;

        /**
         * <p>The reason for the failure.</p>
         * 
         * <strong>example:</strong>
         * <p>The quota adjustment application is being processed. Please try again later.</p>
         */
        @NameInMap("Reason")
        public String reason;

        public static CreateQuotaApplicationsForTemplateResponseBodyFailResults build(java.util.Map<String, ?> map) throws Exception {
            CreateQuotaApplicationsForTemplateResponseBodyFailResults self = new CreateQuotaApplicationsForTemplateResponseBodyFailResults();
            return TeaModel.build(map, self);
        }

        public CreateQuotaApplicationsForTemplateResponseBodyFailResults setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public CreateQuotaApplicationsForTemplateResponseBodyFailResults setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

}
