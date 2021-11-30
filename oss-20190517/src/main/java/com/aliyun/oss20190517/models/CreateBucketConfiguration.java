// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class CreateBucketConfiguration extends TeaModel {
    @NameInMap("DataRedundancyType")
    public String dataRedundancyType;

    @NameInMap("StorageClass")
    public String storageClass;

    public static CreateBucketConfiguration build(java.util.Map<String, ?> map) throws Exception {
        CreateBucketConfiguration self = new CreateBucketConfiguration();
        return TeaModel.build(map, self);
    }

    public CreateBucketConfiguration setDataRedundancyType(String dataRedundancyType) {
        this.dataRedundancyType = dataRedundancyType;
        return this;
    }
    public String getDataRedundancyType() {
        return this.dataRedundancyType;
    }

    public CreateBucketConfiguration setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

}
