// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListDashboardRequest extends TeaModel {
    /**
     * <p>The dashboard name.</p>
     * 
     * <strong>example:</strong>
     * <p>dashboard-1609294922657-434834</p>
     */
    @NameInMap("dashboardName")
    public String dashboardName;

    /**
     * <p>The display name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The line from which the query starts. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("offset")
    public Integer offset;

    /**
     * <p>The number of entries to return on each page for a paged query. The maximum value is 500. The default value is 500.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <p>The tag information.</p>
     */
    @NameInMap("tags")
    public java.util.List<ListDashboardRequestTags> tags;

    public static ListDashboardRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardRequest self = new ListDashboardRequest();
        return TeaModel.build(map, self);
    }

    public ListDashboardRequest setDashboardName(String dashboardName) {
        this.dashboardName = dashboardName;
        return this;
    }
    public String getDashboardName() {
        return this.dashboardName;
    }

    public ListDashboardRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ListDashboardRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListDashboardRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListDashboardRequest setTags(java.util.List<ListDashboardRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListDashboardRequestTags> getTags() {
        return this.tags;
    }

    public static class ListDashboardRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("value")
        public String value;

        public static ListDashboardRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListDashboardRequestTags self = new ListDashboardRequestTags();
            return TeaModel.build(map, self);
        }

        public ListDashboardRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListDashboardRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
