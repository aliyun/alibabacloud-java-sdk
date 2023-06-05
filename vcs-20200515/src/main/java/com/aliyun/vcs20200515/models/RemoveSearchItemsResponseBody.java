// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class RemoveSearchItemsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RemoveSearchItemsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static RemoveSearchItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveSearchItemsResponseBody self = new RemoveSearchItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveSearchItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RemoveSearchItemsResponseBody setData(RemoveSearchItemsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RemoveSearchItemsResponseBodyData getData() {
        return this.data;
    }

    public RemoveSearchItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RemoveSearchItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveSearchItemsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class RemoveSearchItemsResponseBodyData extends TeaModel {
        @NameInMap("DeletedItemIds")
        public String deletedItemIds;

        @NameInMap("FailedItemIds")
        public String failedItemIds;

        public static RemoveSearchItemsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RemoveSearchItemsResponseBodyData self = new RemoveSearchItemsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RemoveSearchItemsResponseBodyData setDeletedItemIds(String deletedItemIds) {
            this.deletedItemIds = deletedItemIds;
            return this;
        }
        public String getDeletedItemIds() {
            return this.deletedItemIds;
        }

        public RemoveSearchItemsResponseBodyData setFailedItemIds(String failedItemIds) {
            this.failedItemIds = failedItemIds;
            return this;
        }
        public String getFailedItemIds() {
            return this.failedItemIds;
        }

    }

}
