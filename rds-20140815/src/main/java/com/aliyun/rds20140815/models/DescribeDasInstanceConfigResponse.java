// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDasInstanceConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    @NameInMap("StorageUpperBound")
    @Validation(required = true)
    public Integer storageUpperBound;

    @NameInMap("MaxStorageUpperBound")
    @Validation(required = true)
    public Integer maxStorageUpperBound;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("StorageThreshold")
    @Validation(required = true)
    public Integer storageThreshold;

    @NameInMap("StorageAutoScale")
    @Validation(required = true)
    public Boolean storageAutoScale;

    @NameInMap("DBType")
    @Validation(required = true)
    public String DBType;

    public static DescribeDasInstanceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDasInstanceConfigResponse self = new DescribeDasInstanceConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDasInstanceConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDasInstanceConfigResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeDasInstanceConfigResponse setStorageUpperBound(Integer storageUpperBound) {
        this.storageUpperBound = storageUpperBound;
        return this;
    }
    public Integer getStorageUpperBound() {
        return this.storageUpperBound;
    }

    public DescribeDasInstanceConfigResponse setMaxStorageUpperBound(Integer maxStorageUpperBound) {
        this.maxStorageUpperBound = maxStorageUpperBound;
        return this;
    }
    public Integer getMaxStorageUpperBound() {
        return this.maxStorageUpperBound;
    }

    public DescribeDasInstanceConfigResponse setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDasInstanceConfigResponse setStorageThreshold(Integer storageThreshold) {
        this.storageThreshold = storageThreshold;
        return this;
    }
    public Integer getStorageThreshold() {
        return this.storageThreshold;
    }

    public DescribeDasInstanceConfigResponse setStorageAutoScale(Boolean storageAutoScale) {
        this.storageAutoScale = storageAutoScale;
        return this;
    }
    public Boolean getStorageAutoScale() {
        return this.storageAutoScale;
    }

    public DescribeDasInstanceConfigResponse setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

}
