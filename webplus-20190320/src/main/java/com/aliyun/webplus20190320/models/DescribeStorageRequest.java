// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeStorageRequest extends TeaModel {
    @NameInMap("UsingSharedStorage")
    public Boolean usingSharedStorage;

    public static DescribeStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageRequest self = new DescribeStorageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStorageRequest setUsingSharedStorage(Boolean usingSharedStorage) {
        this.usingSharedStorage = usingSharedStorage;
        return this;
    }
    public Boolean getUsingSharedStorage() {
        return this.usingSharedStorage;
    }

}
