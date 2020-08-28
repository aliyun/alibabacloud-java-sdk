// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListUsersForGroupRequest extends TeaModel {
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("Marker")
    public String marker;

    @NameInMap("MaxItems")
    public Integer maxItems;

    public static ListUsersForGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUsersForGroupRequest self = new ListUsersForGroupRequest();
        return TeaModel.build(map, self);
    }

}
