// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class RenameFolderRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    public static RenameFolderRequest build(java.util.Map<String, ?> map) throws Exception {
        RenameFolderRequest self = new RenameFolderRequest();
        return TeaModel.build(map, self);
    }

    public RenameFolderRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
