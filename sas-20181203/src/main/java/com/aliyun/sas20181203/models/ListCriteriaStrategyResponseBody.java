// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCriteriaStrategyResponseBody extends TeaModel {
    /**
     * <p>The response code. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The IDs and names of the rules.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListCriteriaStrategyResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>835851E3-AFA2-5EA7-93E9-4FC9BCF3F973</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListCriteriaStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCriteriaStrategyResponseBody self = new ListCriteriaStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCriteriaStrategyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCriteriaStrategyResponseBody setData(java.util.List<ListCriteriaStrategyResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCriteriaStrategyResponseBodyData> getData() {
        return this.data;
    }

    public ListCriteriaStrategyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCriteriaStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCriteriaStrategyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCriteriaStrategyResponseBodyData extends TeaModel {
        /**
         * <p>The unique identifier of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListCriteriaStrategyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCriteriaStrategyResponseBodyData self = new ListCriteriaStrategyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCriteriaStrategyResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListCriteriaStrategyResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
