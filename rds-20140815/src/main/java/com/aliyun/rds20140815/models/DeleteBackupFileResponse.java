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

    public static class DeleteBackupFileResponseDeletedBaksetIds extends TeaModel {
        @NameInMap("DeletedBaksetIds")
        @Validation(required = true)
        public java.util.List<Integer> deletedBaksetIds;

        public static DeleteBackupFileResponseDeletedBaksetIds build(java.util.Map<String, ?> map) throws Exception {
            DeleteBackupFileResponseDeletedBaksetIds self = new DeleteBackupFileResponseDeletedBaksetIds();
            return TeaModel.build(map, self);
        }

    }

}
