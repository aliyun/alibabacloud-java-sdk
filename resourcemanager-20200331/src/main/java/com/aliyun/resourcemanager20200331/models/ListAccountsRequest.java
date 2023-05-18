// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListAccountsRequest extends TeaModel {
    /**
     * <p>Specifies whether to return the information of tags. Valid values:</p>
     * <br>
     * <p>*   false (default value)</p>
     * <p>*   true</p>
     */
    @NameInMap("IncludeTags")
    public Boolean includeTags;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: 1 to 100. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Tag")
    public java.util.List<ListAccountsRequestTag> tag;

    public static ListAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccountsRequest self = new ListAccountsRequest();
        return TeaModel.build(map, self);
    }

    public ListAccountsRequest setIncludeTags(Boolean includeTags) {
        this.includeTags = includeTags;
        return this;
    }
    public Boolean getIncludeTags() {
        return this.includeTags;
    }

    public ListAccountsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAccountsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAccountsRequest setTag(java.util.List<ListAccountsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListAccountsRequestTag> getTag() {
        return this.tag;
    }

    public static class ListAccountsRequestTag extends TeaModel {
        /**
         * <p>A tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>A tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAccountsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListAccountsRequestTag self = new ListAccountsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListAccountsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAccountsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
