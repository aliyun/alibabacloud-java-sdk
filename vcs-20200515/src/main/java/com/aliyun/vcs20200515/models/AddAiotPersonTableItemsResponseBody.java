// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddAiotPersonTableItemsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultList")
    public java.util.List<AddAiotPersonTableItemsResponseBodyResultList> resultList;

    public static AddAiotPersonTableItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAiotPersonTableItemsResponseBody self = new AddAiotPersonTableItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAiotPersonTableItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddAiotPersonTableItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddAiotPersonTableItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddAiotPersonTableItemsResponseBody setResultList(java.util.List<AddAiotPersonTableItemsResponseBodyResultList> resultList) {
        this.resultList = resultList;
        return this;
    }
    public java.util.List<AddAiotPersonTableItemsResponseBodyResultList> getResultList() {
        return this.resultList;
    }

    public static class AddAiotPersonTableItemsResponseBodyResultList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("PersonTableItemId")
        public String personTableItemId;

        public static AddAiotPersonTableItemsResponseBodyResultList build(java.util.Map<String, ?> map) throws Exception {
            AddAiotPersonTableItemsResponseBodyResultList self = new AddAiotPersonTableItemsResponseBodyResultList();
            return TeaModel.build(map, self);
        }

        public AddAiotPersonTableItemsResponseBodyResultList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AddAiotPersonTableItemsResponseBodyResultList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AddAiotPersonTableItemsResponseBodyResultList setPersonTableItemId(String personTableItemId) {
            this.personTableItemId = personTableItemId;
            return this;
        }
        public String getPersonTableItemId() {
            return this.personTableItemId;
        }

    }

}
