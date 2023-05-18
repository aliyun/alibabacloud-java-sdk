// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListAccountsForParentRequest extends TeaModel {
    /**
     * <p>Specifies whether to return the information of tags. Valid values:</p>
     * <br>
     * <p>false (default value)</p>
     * <br>
     * <p>true</p>
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

    /**
     * <p>The ID of the folder.</p>
     */
    @NameInMap("ParentFolderId")
    public String parentFolderId;

    /**
     * <p>The keyword used for the query, such as the display name of a member.</p>
     * <br>
     * <p>Fuzzy match is supported.</p>
     */
    @NameInMap("QueryKeyword")
    public String queryKeyword;

    @NameInMap("Tag")
    public java.util.List<ListAccountsForParentRequestTag> tag;

    public static ListAccountsForParentRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccountsForParentRequest self = new ListAccountsForParentRequest();
        return TeaModel.build(map, self);
    }

    public ListAccountsForParentRequest setIncludeTags(Boolean includeTags) {
        this.includeTags = includeTags;
        return this;
    }
    public Boolean getIncludeTags() {
        return this.includeTags;
    }

    public ListAccountsForParentRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAccountsForParentRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAccountsForParentRequest setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
        return this;
    }
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    public ListAccountsForParentRequest setQueryKeyword(String queryKeyword) {
        this.queryKeyword = queryKeyword;
        return this;
    }
    public String getQueryKeyword() {
        return this.queryKeyword;
    }

    public ListAccountsForParentRequest setTag(java.util.List<ListAccountsForParentRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListAccountsForParentRequestTag> getTag() {
        return this.tag;
    }

    public static class ListAccountsForParentRequestTag extends TeaModel {
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

        public static ListAccountsForParentRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListAccountsForParentRequestTag self = new ListAccountsForParentRequestTag();
            return TeaModel.build(map, self);
        }

        public ListAccountsForParentRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAccountsForParentRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
