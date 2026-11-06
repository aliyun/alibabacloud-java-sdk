// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeKVCacheInstanceAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the KVCache instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pkv-123456</p>
     */
    @NameInMap("KVCacheInstanceId")
    public String KVCacheInstanceId;

    public static DescribeKVCacheInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKVCacheInstanceAttributeRequest self = new DescribeKVCacheInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKVCacheInstanceAttributeRequest setKVCacheInstanceId(String KVCacheInstanceId) {
        this.KVCacheInstanceId = KVCacheInstanceId;
        return this;
    }
    public String getKVCacheInstanceId() {
        return this.KVCacheInstanceId;
    }

}
