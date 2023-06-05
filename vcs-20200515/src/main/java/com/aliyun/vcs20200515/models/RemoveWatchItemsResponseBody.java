// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class RemoveWatchItemsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RemoveWatchItemsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RemoveWatchItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveWatchItemsResponseBody self = new RemoveWatchItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveWatchItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RemoveWatchItemsResponseBody setData(RemoveWatchItemsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RemoveWatchItemsResponseBodyData getData() {
        return this.data;
    }

    public RemoveWatchItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RemoveWatchItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveWatchItemsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RemoveWatchItemsResponseBodyData extends TeaModel {
        @NameInMap("DeletedItemIds")
        public String deletedItemIds;

        @NameInMap("FailedItemIds")
        public String failedItemIds;

        public static RemoveWatchItemsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RemoveWatchItemsResponseBodyData self = new RemoveWatchItemsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RemoveWatchItemsResponseBodyData setDeletedItemIds(String deletedItemIds) {
            this.deletedItemIds = deletedItemIds;
            return this;
        }
        public String getDeletedItemIds() {
            return this.deletedItemIds;
        }

        public RemoveWatchItemsResponseBodyData setFailedItemIds(String failedItemIds) {
            this.failedItemIds = failedItemIds;
            return this;
        }
        public String getFailedItemIds() {
            return this.failedItemIds;
        }

    }

}
