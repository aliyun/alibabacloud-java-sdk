// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListS3IngestionsRequest extends TeaModel {
    @NameInMap("logstore")
    public String logstore;

    @NameInMap("offset")
    public String offset;

    @NameInMap("size")
    public String size;

    public static ListS3IngestionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListS3IngestionsRequest self = new ListS3IngestionsRequest();
        return TeaModel.build(map, self);
    }

    public ListS3IngestionsRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public ListS3IngestionsRequest setOffset(String offset) {
        this.offset = offset;
        return this;
    }
    public String getOffset() {
        return this.offset;
    }

    public ListS3IngestionsRequest setSize(String size) {
        this.size = size;
        return this;
    }
    public String getSize() {
        return this.size;
    }

}
