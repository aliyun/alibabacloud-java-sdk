// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class DeleteResourceRecordRequest extends TeaModel {
    /**
     * <p>The IDs of the records to delete. Separate multiple IDs with commas (,). You can specify up to 200 IDs at a time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>record-001,record-002</p>
     */
    @NameInMap("ids")
    public String ids;

    public static DeleteResourceRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceRecordRequest self = new DeleteResourceRecordRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResourceRecordRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

}
