// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteBackupFileResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DeletedBaksetIds")
    @Validation(required = true)
    public DeleteBackupFileResponseDeletedBaksetIds deletedBaksetIds;

    public static DeleteBackupFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupFileResponse self = new DeleteBackupFileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBackupFileResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteBackupFileResponse setDeletedBaksetIds(DeleteBackupFileResponseDeletedBaksetIds deletedBaksetIds) {
        this.deletedBaksetIds = deletedBaksetIds;
        return this;
    }
    public DeleteBackupFileResponseDeletedBaksetIds getDeletedBaksetIds() {
        return this.deletedBaksetIds;
    }

    public static class DeleteBackupFileResponseDeletedBaksetIds extends TeaModel {
        @NameInMap("DeletedBaksetIds")
        @Validation(required = true)
        public java.util.List<Integer> deletedBaksetIds;

        public static DeleteBackupFileResponseDeletedBaksetIds build(java.util.Map<String, ?> map) throws Exception {
            DeleteBackupFileResponseDeletedBaksetIds self = new DeleteBackupFileResponseDeletedBaksetIds();
            return TeaModel.build(map, self);
        }

        public DeleteBackupFileResponseDeletedBaksetIds setDeletedBaksetIds(java.util.List<Integer> deletedBaksetIds) {
            this.deletedBaksetIds = deletedBaksetIds;
            return this;
        }
        public java.util.List<Integer> getDeletedBaksetIds() {
            return this.deletedBaksetIds;
        }

    }

}
