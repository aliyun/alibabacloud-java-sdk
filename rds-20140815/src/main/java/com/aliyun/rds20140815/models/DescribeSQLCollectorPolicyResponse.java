// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLCollectorPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SQLCollectorStatus")
    @Validation(required = true)
    public String SQLCollectorStatus;

    @NameInMap("StoragePeriod")
    @Validation(required = true)
    public Integer storagePeriod;

    public static DescribeSQLCollectorPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLCollectorPolicyResponse self = new DescribeSQLCollectorPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLCollectorPolicyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLCollectorPolicyResponse setSQLCollectorStatus(String SQLCollectorStatus) {
        this.SQLCollectorStatus = SQLCollectorStatus;
        return this;
    }
    public String getSQLCollectorStatus() {
        return this.SQLCollectorStatus;
    }

    public DescribeSQLCollectorPolicyResponse setStoragePeriod(Integer storagePeriod) {
        this.storagePeriod = storagePeriod;
        return this;
    }
    public Integer getStoragePeriod() {
        return this.storagePeriod;
    }

}
