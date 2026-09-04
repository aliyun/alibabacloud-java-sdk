// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListApiKeysRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("allowedStore")
    public String allowedStore;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("offset")
    public Integer offset;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("size")
    public Integer size;

    public static ListApiKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApiKeysRequest self = new ListApiKeysRequest();
        return TeaModel.build(map, self);
    }

    public ListApiKeysRequest setAllowedStore(String allowedStore) {
        this.allowedStore = allowedStore;
        return this;
    }
    public String getAllowedStore() {
        return this.allowedStore;
    }

    public ListApiKeysRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListApiKeysRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
