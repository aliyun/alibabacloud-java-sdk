// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListUsersForGroupRequest extends TeaModel {
    /**
     * <p>The name of the user group.</p>
     * 
     * <strong>example:</strong>
     * <p>Dev-Team</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The marker. If the response is truncated, you can use this parameter to obtain the content that starts from the position after the truncation.</p>
     * 
     * <strong>example:</strong>
     * <p>EXAMPLE</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The maximum number of entries to return. If the response is truncated because it reaches the <code>MaxItems</code> limit, the <code>IsTruncated</code> response parameter is set to <code>true</code>.</p>
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
