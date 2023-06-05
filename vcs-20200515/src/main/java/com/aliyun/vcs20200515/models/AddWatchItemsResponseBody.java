// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddWatchItemsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AddWatchItemsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AddWatchItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddWatchItemsResponseBody self = new AddWatchItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddWatchItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddWatchItemsResponseBody setData(AddWatchItemsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddWatchItemsResponseBodyData getData() {
        return this.data;
    }

    public AddWatchItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddWatchItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddWatchItemsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddWatchItemsResponseBodyData extends TeaModel {
        @NameInMap("AddedItemIds")
        public String addedItemIds;

        @NameInMap("FailedItemIds")
        public String failedItemIds;

        public static AddWatchItemsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddWatchItemsResponseBodyData self = new AddWatchItemsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddWatchItemsResponseBodyData setAddedItemIds(String addedItemIds) {
            this.addedItemIds = addedItemIds;
            return this;
        }
        public String getAddedItemIds() {
            return this.addedItemIds;
        }

        public AddWatchItemsResponseBodyData setFailedItemIds(String failedItemIds) {
            this.failedItemIds = failedItemIds;
            return this;
        }
        public String getFailedItemIds() {
            return this.failedItemIds;
        }

    }

}
