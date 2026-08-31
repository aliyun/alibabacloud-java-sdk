// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetResourceRecordRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow retrieving system built-in records.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("includeSystemRecords")
    public Boolean includeSystemRecords;

    public static GetResourceRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceRecordRequest self = new GetResourceRecordRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceRecordRequest setIncludeSystemRecords(Boolean includeSystemRecords) {
        this.includeSystemRecords = includeSystemRecords;
        return this;
    }
    public Boolean getIncludeSystemRecords() {
        return this.includeSystemRecords;
    }

}
