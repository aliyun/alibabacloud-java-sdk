// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListUsersForGroupRequest extends TeaModel {
    /**
     * <p>The name of the RAM user group.</p>
     * 
     * <strong>example:</strong>
     * <p>Dev-Team</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The <code>marker</code>. If part of a previous response is truncated, you can use this parameter to obtain the truncated part.</p>
     * 
     * <strong>example:</strong>
     * <p>EXAMPLE</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The number of entries to return. If a response is truncated because it reaches the value of <code>MaxItems</code>, the value of <code>IsTruncated</code> will be <code>true</code>.</p>
     * <p>Valid values: 1 to 1000. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxItems")
    public Integer maxItems;

    public static ListUsersForGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUsersForGroupRequest self = new ListUsersForGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListUsersForGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ListUsersForGroupRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListUsersForGroupRequest setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    public Integer getMaxItems() {
        return this.maxItems;
    }

}
