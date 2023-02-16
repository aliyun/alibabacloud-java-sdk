// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListAccountsForParentRequest extends TeaModel {
    @NameInMap("IncludeTags")
    public Boolean includeTags;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ParentFolderId")
    public String parentFolderId;

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
        @NameInMap("Key")
        public String key;

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
