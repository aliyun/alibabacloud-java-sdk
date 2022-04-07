// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class SelectRequestOptions extends TeaModel {
    // description
    @NameInMap("MaxSkippedRecordsAllowed")
    public Long maxSkippedRecordsAllowed;

    // description
    @NameInMap("SkipPartialDataRecord")
    public Boolean skipPartialDataRecord;

    public static SelectRequestOptions build(java.util.Map<String, ?> map) throws Exception {
        SelectRequestOptions self = new SelectRequestOptions();
        return TeaModel.build(map, self);
    }

    public SelectRequestOptions setMaxSkippedRecordsAllowed(Long maxSkippedRecordsAllowed) {
        this.maxSkippedRecordsAllowed = maxSkippedRecordsAllowed;
        return this;
    }
    public Long getMaxSkippedRecordsAllowed() {
        return this.maxSkippedRecordsAllowed;
    }

    public SelectRequestOptions setSkipPartialDataRecord(Boolean skipPartialDataRecord) {
        this.skipPartialDataRecord = skipPartialDataRecord;
        return this;
    }
    public Boolean getSkipPartialDataRecord() {
        return this.skipPartialDataRecord;
    }

}
