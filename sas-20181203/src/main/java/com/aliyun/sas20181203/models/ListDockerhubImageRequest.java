// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListDockerhubImageRequest extends TeaModel {
    /**
     * <p>The query condition for images. You can query images in the <code>[namespace/]repoName[:version]</code> format. Conditions in <code>[]</code> are optional.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>python:3.9</p>
     */
    @NameInMap("Query")
    public String query;

    public static ListDockerhubImageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDockerhubImageRequest self = new ListDockerhubImageRequest();
        return TeaModel.build(map, self);
    }

    public ListDockerhubImageRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
