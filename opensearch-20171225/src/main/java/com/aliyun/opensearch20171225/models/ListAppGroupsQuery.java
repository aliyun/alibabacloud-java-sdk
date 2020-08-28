// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListAppGroupsQuery extends TeaModel {
    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("name")
    public String name;

    @NameInMap("type")
    public String type;

    @NameInMap("sortBy")
    public Integer sortBy;

    public static ListAppGroupsQuery build(java.util.Map<String, ?> map) throws Exception {
        ListAppGroupsQuery self = new ListAppGroupsQuery();
        return TeaModel.build(map, self);
    }

}
