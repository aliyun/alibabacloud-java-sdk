// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckTypesResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListCheckTypesResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListCheckTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCheckTypesResponseBody self = new ListCheckTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCheckTypesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCheckTypesResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListCheckTypesResponseBody setData(java.util.List<ListCheckTypesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCheckTypesResponseBodyData> getData() {
        return this.data;
    }

    public ListCheckTypesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCheckTypesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCheckTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCheckTypesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCheckTypesResponseBodyDataCheckDetails extends TeaModel {
        /**
         * <p>The list of the baseline categories of attribution.</p>
         */
        @NameInMap("AffiliatedRiskTypes")
        public java.util.List<String> affiliatedRiskTypes;

        /**
         * <p>The list of baselines attribution.</p>
         */
        @NameInMap("AffiliatedRisks")
        public java.util.List<String> affiliatedRisks;

        /**
         * <p>The ID of the check item.</p>
         */
        @NameInMap("CheckId")
        public Long checkId;

        /**
         * <p>The description of the check item.</p>
         */
        @NameInMap("CheckItem")
        public String checkItem;

        public static ListCheckTypesResponseBodyDataCheckDetails build(java.util.Map<String, ?> map) throws Exception {
            ListCheckTypesResponseBodyDataCheckDetails self = new ListCheckTypesResponseBodyDataCheckDetails();
            return TeaModel.build(map, self);
        }

        public ListCheckTypesResponseBodyDataCheckDetails setAffiliatedRiskTypes(java.util.List<String> affiliatedRiskTypes) {
            this.affiliatedRiskTypes = affiliatedRiskTypes;
            return this;
        }
        public java.util.List<String> getAffiliatedRiskTypes() {
            return this.affiliatedRiskTypes;
        }

        public ListCheckTypesResponseBodyDataCheckDetails setAffiliatedRisks(java.util.List<String> affiliatedRisks) {
            this.affiliatedRisks = affiliatedRisks;
            return this;
        }
        public java.util.List<String> getAffiliatedRisks() {
            return this.affiliatedRisks;
        }

        public ListCheckTypesResponseBodyDataCheckDetails setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public ListCheckTypesResponseBodyDataCheckDetails setCheckItem(String checkItem) {
            this.checkItem = checkItem;
            return this;
        }
        public String getCheckItem() {
            return this.checkItem;
        }

    }

    public static class ListCheckTypesResponseBodyData extends TeaModel {
        /**
         * <p>The detail of check items.</p>
         */
        @NameInMap("CheckDetails")
        public java.util.List<ListCheckTypesResponseBodyDataCheckDetails> checkDetails;

        /**
         * <p>The type of the check item.</p>
         */
        @NameInMap("CheckType")
        public String checkType;

        /**
         * <p>The display name of the check item type.</p>
         */
        @NameInMap("CheckTypeDisName")
        public String checkTypeDisName;

        public static ListCheckTypesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCheckTypesResponseBodyData self = new ListCheckTypesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCheckTypesResponseBodyData setCheckDetails(java.util.List<ListCheckTypesResponseBodyDataCheckDetails> checkDetails) {
            this.checkDetails = checkDetails;
            return this;
        }
        public java.util.List<ListCheckTypesResponseBodyDataCheckDetails> getCheckDetails() {
            return this.checkDetails;
        }

        public ListCheckTypesResponseBodyData setCheckType(String checkType) {
            this.checkType = checkType;
            return this;
        }
        public String getCheckType() {
            return this.checkType;
        }

        public ListCheckTypesResponseBodyData setCheckTypeDisName(String checkTypeDisName) {
            this.checkTypeDisName = checkTypeDisName;
            return this;
        }
        public String getCheckTypeDisName() {
            return this.checkTypeDisName;
        }

    }

}
