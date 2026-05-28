// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListDashboardShrinkRequest extends TeaModel {
    @NameInMap("dashboardName")
    public String dashboardName;

    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The line from which the query starts. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("offset")
    public Integer offset;

    /**
     * <p>The number of entries per page. Maximum value: 500. Default value: 500.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("size")
    public Integer size;

    @NameInMap("tags")
    public String tagsShrink;

    public static ListDashboardShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardShrinkRequest self = new ListDashboardShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDashboardShrinkRequest setDashboardName(String dashboardName) {
        this.dashboardName = dashboardName;
        return this;
    }
    public String getDashboardName() {
        return this.dashboardName;
    }

    public ListDashboardShrinkRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ListDashboardShrinkRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListDashboardShrinkRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListDashboardShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
