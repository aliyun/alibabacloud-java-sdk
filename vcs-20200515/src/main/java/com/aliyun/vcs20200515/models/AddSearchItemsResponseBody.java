// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddSearchItemsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AddSearchItemsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static AddSearchItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddSearchItemsResponseBody self = new AddSearchItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddSearchItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddSearchItemsResponseBody setData(AddSearchItemsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddSearchItemsResponseBodyData getData() {
        return this.data;
    }

    public AddSearchItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddSearchItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddSearchItemsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class AddSearchItemsResponseBodyData extends TeaModel {
        @NameInMap("AddedItemIds")
        public String addedItemIds;

        @NameInMap("FailedItemIds")
        public String failedItemIds;

        public static AddSearchItemsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddSearchItemsResponseBodyData self = new AddSearchItemsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddSearchItemsResponseBodyData setAddedItemIds(String addedItemIds) {
            this.addedItemIds = addedItemIds;
            return this;
        }
        public String getAddedItemIds() {
            return this.addedItemIds;
        }

        public AddSearchItemsResponseBodyData setFailedItemIds(String failedItemIds) {
            this.failedItemIds = failedItemIds;
            return this;
        }
        public String getFailedItemIds() {
            return this.failedItemIds;
        }

    }

}
