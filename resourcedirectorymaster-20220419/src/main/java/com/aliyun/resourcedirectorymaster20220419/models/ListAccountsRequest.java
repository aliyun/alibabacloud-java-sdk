// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListAccountsRequest extends TeaModel {
    @NameInMap("IncludeTags")
    public Boolean includeTags;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QueryKeyword")
    public String queryKeyword;

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

    public ListAccountsRequest setQueryKeyword(String queryKeyword) {
        this.queryKeyword = queryKeyword;
        return this;
    }
    public String getQueryKeyword() {
        return this.queryKeyword;
    }

    public ListAccountsRequest setTag(java.util.List<ListAccountsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListAccountsRequestTag> getTag() {
        return this.tag;
    }

    public static class ListAccountsRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

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
