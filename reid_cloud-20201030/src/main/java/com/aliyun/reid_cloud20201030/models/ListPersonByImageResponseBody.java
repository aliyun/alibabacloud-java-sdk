// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class ListPersonByImageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PersonSearchResultItems")
    public ListPersonByImageResponseBodyPersonSearchResultItems personSearchResultItems;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static ListPersonByImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPersonByImageResponseBody self = new ListPersonByImageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPersonByImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPersonByImageResponseBody setPersonSearchResultItems(ListPersonByImageResponseBodyPersonSearchResultItems personSearchResultItems) {
        this.personSearchResultItems = personSearchResultItems;
        return this;
    }
    public ListPersonByImageResponseBodyPersonSearchResultItems getPersonSearchResultItems() {
        return this.personSearchResultItems;
    }

    public ListPersonByImageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListPersonByImageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListPersonByImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPersonByImageResponseBodyPersonSearchResultItemsPersonSearchResultItem extends TeaModel {
        @NameInMap("UkId")
        public Long ukId;

        @NameInMap("Score")
        public Float score;

        public static ListPersonByImageResponseBodyPersonSearchResultItemsPersonSearchResultItem build(java.util.Map<String, ?> map) throws Exception {
            ListPersonByImageResponseBodyPersonSearchResultItemsPersonSearchResultItem self = new ListPersonByImageResponseBodyPersonSearchResultItemsPersonSearchResultItem();
            return TeaModel.build(map, self);
        }

        public ListPersonByImageResponseBodyPersonSearchResultItemsPersonSearchResultItem setUkId(Long ukId) {
            this.ukId = ukId;
            return this;
        }
        public Long getUkId() {
            return this.ukId;
        }

        public ListPersonByImageResponseBodyPersonSearchResultItemsPersonSearchResultItem setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class ListPersonByImageResponseBodyPersonSearchResultItems extends TeaModel {
        @NameInMap("PersonSearchResultItem")
        public java.util.List<ListPersonByImageResponseBodyPersonSearchResultItemsPersonSearchResultItem> personSearchResultItem;

        public static ListPersonByImageResponseBodyPersonSearchResultItems build(java.util.Map<String, ?> map) throws Exception {
            ListPersonByImageResponseBodyPersonSearchResultItems self = new ListPersonByImageResponseBodyPersonSearchResultItems();
            return TeaModel.build(map, self);
        }

        public ListPersonByImageResponseBodyPersonSearchResultItems setPersonSearchResultItem(java.util.List<ListPersonByImageResponseBodyPersonSearchResultItemsPersonSearchResultItem> personSearchResultItem) {
            this.personSearchResultItem = personSearchResultItem;
            return this;
        }
        public java.util.List<ListPersonByImageResponseBodyPersonSearchResultItemsPersonSearchResultItem> getPersonSearchResultItem() {
            return this.personSearchResultItem;
        }

    }

}
