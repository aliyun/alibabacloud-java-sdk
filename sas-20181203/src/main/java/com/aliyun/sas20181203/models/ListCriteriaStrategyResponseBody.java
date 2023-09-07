// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCriteriaStrategyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListCriteriaStrategyResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Id")
        public Long id;

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
