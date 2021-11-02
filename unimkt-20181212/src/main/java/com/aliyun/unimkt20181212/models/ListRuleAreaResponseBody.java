// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ListRuleAreaResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<ListRuleAreaResponseBodyModel> model;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Long total;

    public static ListRuleAreaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRuleAreaResponseBody self = new ListRuleAreaResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRuleAreaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRuleAreaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRuleAreaResponseBody setModel(java.util.List<ListRuleAreaResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<ListRuleAreaResponseBodyModel> getModel() {
        return this.model;
    }

    public ListRuleAreaResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRuleAreaResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRuleAreaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRuleAreaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListRuleAreaResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListRuleAreaResponseBodyModel extends TeaModel {
        @NameInMap("AdSlotId")
        public String adSlotId;

        @NameInMap("AdSlotName")
        public String adSlotName;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("MediaName")
        public String mediaName;

        @NameInMap("RecordId")
        public String recordId;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        public static ListRuleAreaResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ListRuleAreaResponseBodyModel self = new ListRuleAreaResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ListRuleAreaResponseBodyModel setAdSlotId(String adSlotId) {
            this.adSlotId = adSlotId;
            return this;
        }
        public String getAdSlotId() {
            return this.adSlotId;
        }

        public ListRuleAreaResponseBodyModel setAdSlotName(String adSlotName) {
            this.adSlotName = adSlotName;
            return this;
        }
        public String getAdSlotName() {
            return this.adSlotName;
        }

        public ListRuleAreaResponseBodyModel setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ListRuleAreaResponseBodyModel setMediaName(String mediaName) {
            this.mediaName = mediaName;
            return this;
        }
        public String getMediaName() {
            return this.mediaName;
        }

        public ListRuleAreaResponseBodyModel setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public ListRuleAreaResponseBodyModel setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ListRuleAreaResponseBodyModel setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListRuleAreaResponseBodyModel setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public ListRuleAreaResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRuleAreaResponseBodyModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
