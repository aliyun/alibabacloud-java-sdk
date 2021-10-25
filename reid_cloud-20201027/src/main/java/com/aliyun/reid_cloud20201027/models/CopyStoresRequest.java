// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201027.models;

import com.aliyun.tea.*;

public class CopyStoresRequest extends TeaModel {
    @NameInMap("SourceStoreId")
    public Long sourceStoreId;

    @NameInMap("CopyWorking")
    public Boolean copyWorking;

    @NameInMap("ShadowStoreNum")
    public Integer shadowStoreNum;

    @NameInMap("BrandId")
    public Long brandId;

    @NameInMap("StoreName")
    public String storeName;

    public static CopyStoresRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyStoresRequest self = new CopyStoresRequest();
        return TeaModel.build(map, self);
    }

    public CopyStoresRequest setSourceStoreId(Long sourceStoreId) {
        this.sourceStoreId = sourceStoreId;
        return this;
    }
    public Long getSourceStoreId() {
        return this.sourceStoreId;
    }

    public CopyStoresRequest setCopyWorking(Boolean copyWorking) {
        this.copyWorking = copyWorking;
        return this;
    }
    public Boolean getCopyWorking() {
        return this.copyWorking;
    }

    public CopyStoresRequest setShadowStoreNum(Integer shadowStoreNum) {
        this.shadowStoreNum = shadowStoreNum;
        return this;
    }
    public Integer getShadowStoreNum() {
        return this.shadowStoreNum;
    }

    public CopyStoresRequest setBrandId(Long brandId) {
        this.brandId = brandId;
        return this;
    }
    public Long getBrandId() {
        return this.brandId;
    }

    public CopyStoresRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

}
