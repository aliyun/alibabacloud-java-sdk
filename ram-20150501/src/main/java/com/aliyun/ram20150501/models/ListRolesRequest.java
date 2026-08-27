// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListRolesRequest extends TeaModel {
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
    public java.util.List<ListRolesRequestTag> tag;

    public static ListRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRolesRequest self = new ListRolesRequest();
        return TeaModel.build(map, self);
    }

    public ListRolesRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListRolesRequest setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    public Integer getMaxItems() {
        return this.maxItems;
    }

    public ListRolesRequest setTag(java.util.List<ListRolesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListRolesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListRolesRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>owner</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListRolesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListRolesRequestTag self = new ListRolesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListRolesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListRolesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
