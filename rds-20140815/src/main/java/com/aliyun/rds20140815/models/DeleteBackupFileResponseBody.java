// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteBackupFileResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the IDs of deleted backup sets.</p>
     */
    @NameInMap("DeletedBaksetIds")
    public DeleteBackupFileResponseBodyDeletedBaksetIds deletedBaksetIds;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBackupFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupFileResponseBody self = new DeleteBackupFileResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBackupFileResponseBody setDeletedBaksetIds(DeleteBackupFileResponseBodyDeletedBaksetIds deletedBaksetIds) {
        this.deletedBaksetIds = deletedBaksetIds;
        return this;
    }
    public DeleteBackupFileResponseBodyDeletedBaksetIds getDeletedBaksetIds() {
        return this.deletedBaksetIds;
    }

    public DeleteBackupFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteBackupFileResponseBodyDeletedBaksetIds extends TeaModel {
        @NameInMap("DeletedBaksetIds")
        public java.util.List<Integer> deletedBaksetIds;

        public static DeleteBackupFileResponseBodyDeletedBaksetIds build(java.util.Map<String, ?> map) throws Exception {
            DeleteBackupFileResponseBodyDeletedBaksetIds self = new DeleteBackupFileResponseBodyDeletedBaksetIds();
            return TeaModel.build(map, self);
        }

        public DeleteBackupFileResponseBodyDeletedBaksetIds setDeletedBaksetIds(java.util.List<Integer> deletedBaksetIds) {
            this.deletedBaksetIds = deletedBaksetIds;
            return this;
        }
        public java.util.List<Integer> getDeletedBaksetIds() {
            return this.deletedBaksetIds;
        }

    }

}
