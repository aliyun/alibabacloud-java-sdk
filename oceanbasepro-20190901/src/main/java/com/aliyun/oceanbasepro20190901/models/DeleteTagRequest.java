// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteTagRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Key")
    public String key;

    public static DeleteTagRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTagRequest self = new DeleteTagRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTagRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
