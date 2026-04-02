// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class DeleteTempFileTasksRequest extends TeaModel {
    @NameInMap("TempFileTaskIds")
    public java.util.List<String> tempFileTaskIds;

    public static DeleteTempFileTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTempFileTasksRequest self = new DeleteTempFileTasksRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTempFileTasksRequest setTempFileTaskIds(java.util.List<String> tempFileTaskIds) {
        this.tempFileTaskIds = tempFileTaskIds;
        return this;
    }
    public java.util.List<String> getTempFileTaskIds() {
        return this.tempFileTaskIds;
    }

}
