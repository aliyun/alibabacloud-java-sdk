// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListJobGroupsAsyncRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6243d904-939d-42ce-a8e4-886a139e77a3</p>
     */
    @NameInMap("AsyncTaskId")
    public String asyncTaskId;

    public static ListJobGroupsAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobGroupsAsyncRequest self = new ListJobGroupsAsyncRequest();
        return TeaModel.build(map, self);
    }

    public ListJobGroupsAsyncRequest setAsyncTaskId(String asyncTaskId) {
        this.asyncTaskId = asyncTaskId;
        return this;
    }
    public String getAsyncTaskId() {
        return this.asyncTaskId;
    }

}
