// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpsertResourceRecordRequest extends TeaModel {
    /**
     * <p>The list of records to write. A maximum of 200 records can be written at a time. If no ID is specified for a record, the server automatically generates one.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("records")
    public java.util.List<ResourceRecord> records;

    public static UpsertResourceRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        UpsertResourceRecordRequest self = new UpsertResourceRecordRequest();
        return TeaModel.build(map, self);
    }

    public UpsertResourceRecordRequest setRecords(java.util.List<ResourceRecord> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ResourceRecord> getRecords() {
        return this.records;
    }

}
