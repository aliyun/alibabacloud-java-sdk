// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListAppsRequest extends TeaModel {
    /**
     * <p>true</p>
     */
    @NameInMap("group")
    public Boolean group;

    /**
     * <p>0</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>0</p>
     */
    @NameInMap("size")
    public Integer size;

    public static ListAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppsRequest self = new ListAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListAppsRequest setGroup(Boolean group) {
        this.group = group;
        return this;
    }
    public Boolean getGroup() {
        return this.group;
    }

    public ListAppsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListAppsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
