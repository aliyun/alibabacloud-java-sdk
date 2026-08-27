// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListRolesShrinkRequest extends TeaModel {
    /**
     * <p>The marker. If the response is truncated, you can use <code>Marker</code> to retrieve the content that starts from the position after the truncation point.</p>
     * 
     * <strong>example:</strong>
     * <p>EXAMPLE</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The number of entries to return. If the response is truncated because it reaches the <code>MaxItems</code> limit, the <code>IsTruncated</code> parameter is set to <code>true</code>.</p>
     * <p>Valid values: 1 to 1000. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxItems")
    public Integer maxItems;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public String tagShrink;

    public static ListRolesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRolesShrinkRequest self = new ListRolesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListRolesShrinkRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListRolesShrinkRequest setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    public Integer getMaxItems() {
        return this.maxItems;
    }

    public ListRolesShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

}
