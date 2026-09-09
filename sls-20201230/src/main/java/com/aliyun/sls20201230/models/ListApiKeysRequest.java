// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListApiKeysRequest extends TeaModel {
    /**
     * <p>The Logstore that the API key is allowed to write to.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("allowedStore")
    public String allowedStore;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("offset")
    public Integer offset;

    /**
     * <p>The number of entries per page.</p>
     * 
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
