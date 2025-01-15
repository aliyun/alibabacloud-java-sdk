// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListFoldersForParentRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * <p>Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the parent folder.</p>
     * <p>If you leave this parameter empty, the information of the first-level subfolders of the Root folder is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>r-b1****</p>
     */
    @NameInMap("ParentFolderId")
    public String parentFolderId;

    /**
     * <p>The keyword used for the query, such as a folder name.</p>
     * <p>Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>rdFolder</p>
     */
    @NameInMap("QueryKeyword")
    public String queryKeyword;

    /**
     * <p>The tags. This parameter specifies a filter condition.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListFoldersForParentRequestTag> tag;

    public static ListFoldersForParentRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFoldersForParentRequest self = new ListFoldersForParentRequest();
        return TeaModel.build(map, self);
    }

    public ListFoldersForParentRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFoldersForParentRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFoldersForParentRequest setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
        return this;
    }
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    public ListFoldersForParentRequest setQueryKeyword(String queryKeyword) {
        this.queryKeyword = queryKeyword;
        return this;
    }
    public String getQueryKeyword() {
        return this.queryKeyword;
    }

    public ListFoldersForParentRequest setTag(java.util.List<ListFoldersForParentRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListFoldersForParentRequestTag> getTag() {
        return this.tag;
    }

    public static class ListFoldersForParentRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListFoldersForParentRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListFoldersForParentRequestTag self = new ListFoldersForParentRequestTag();
            return TeaModel.build(map, self);
        }

        public ListFoldersForParentRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListFoldersForParentRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
