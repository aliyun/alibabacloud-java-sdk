// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListAppsQuery extends TeaModel {
    @NameInMap("group")
    public Boolean group;

    @NameInMap("page")
    public Integer page;

    @NameInMap("size")
    public Integer size;

    public static ListAppsQuery build(java.util.Map<String, ?> map) throws Exception {
        ListAppsQuery self = new ListAppsQuery();
        return TeaModel.build(map, self);
    }

}
