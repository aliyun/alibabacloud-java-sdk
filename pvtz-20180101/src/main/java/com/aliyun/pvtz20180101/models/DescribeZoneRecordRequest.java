// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeZoneRecordRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5808</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

    public static DescribeZoneRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeZoneRecordRequest self = new DescribeZoneRecordRequest();
        return TeaModel.build(map, self);
    }

    public DescribeZoneRecordRequest setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

}
