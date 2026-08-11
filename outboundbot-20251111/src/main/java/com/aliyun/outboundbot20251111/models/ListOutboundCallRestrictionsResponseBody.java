// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class ListOutboundCallRestrictionsResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public ListOutboundCallRestrictionsResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance does not exist. Instance=392db13c-8901-4a25-b566-91d0d8114cec</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The list of variable values in the error message.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListOutboundCallRestrictionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOutboundCallRestrictionsResponseBody self = new ListOutboundCallRestrictionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOutboundCallRestrictionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOutboundCallRestrictionsResponseBody setData(ListOutboundCallRestrictionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListOutboundCallRestrictionsResponseBodyData getData() {
        return this.data;
    }

    public ListOutboundCallRestrictionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListOutboundCallRestrictionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListOutboundCallRestrictionsResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListOutboundCallRestrictionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOutboundCallRestrictionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListOutboundCallRestrictionsResponseBodyDataOutboundCallRestrictions extends TeaModel {
        /**
         * <p>The creation time, in millisecond-level timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>134*****</p>
         */
        @NameInMap("Number")
        public String number;

        /**
         * <p>The policy. Valid values:
         * 0: blacklist.
         * 1: whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Policy")
        public Integer policy;

        /**
         * <p>The remark.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The outbound call restriction ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
         */
        @NameInMap("RestrictionId")
        public String restrictionId;

        public static ListOutboundCallRestrictionsResponseBodyDataOutboundCallRestrictions build(java.util.Map<String, ?> map) throws Exception {
            ListOutboundCallRestrictionsResponseBodyDataOutboundCallRestrictions self = new ListOutboundCallRestrictionsResponseBodyDataOutboundCallRestrictions();
            return TeaModel.build(map, self);
        }

        public ListOutboundCallRestrictionsResponseBodyDataOutboundCallRestrictions setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public ListOutboundCallRestrictionsResponseBodyDataOutboundCallRestrictions setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListOutboundCallRestrictionsResponseBodyDataOutboundCallRestrictions setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListOutboundCallRestrictionsResponseBodyDataOutboundCallRestrictions setPolicy(Integer policy) {
            this.policy = policy;
            return this;
        }
        public Integer getPolicy() {
            return this.policy;
        }

        public ListOutboundCallRestrictionsResponseBodyDataOutboundCallRestrictions setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListOutboundCallRestrictionsResponseBodyDataOutboundCallRestrictions setRestrictionId(String restrictionId) {
            this.restrictionId = restrictionId;
            return this;
        }
        public String getRestrictionId() {
            return this.restrictionId;
        }

    }

    public static class ListOutboundCallRestrictionsResponseBodyData extends TeaModel {
        /**
         * <p>The data list.</p>
         */
        @NameInMap("OutboundCallRestrictions")
        public java.util.List<ListOutboundCallRestrictionsResponseBodyDataOutboundCallRestrictions> outboundCallRestrictions;

        /**
         * <p>The page number, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records that match the conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListOutboundCallRestrictionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOutboundCallRestrictionsResponseBodyData self = new ListOutboundCallRestrictionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOutboundCallRestrictionsResponseBodyData setOutboundCallRestrictions(java.util.List<ListOutboundCallRestrictionsResponseBodyDataOutboundCallRestrictions> outboundCallRestrictions) {
            this.outboundCallRestrictions = outboundCallRestrictions;
            return this;
        }
        public java.util.List<ListOutboundCallRestrictionsResponseBodyDataOutboundCallRestrictions> getOutboundCallRestrictions() {
            return this.outboundCallRestrictions;
        }

        public ListOutboundCallRestrictionsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListOutboundCallRestrictionsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListOutboundCallRestrictionsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
