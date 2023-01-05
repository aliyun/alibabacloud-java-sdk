// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListResourceTagsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceTags")
    public ListResourceTagsResponseBodyResourceTags resourceTags;

    @NameInMap("Success")
    public Boolean success;

    public static ListResourceTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTagsResponseBody self = new ListResourceTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceTagsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListResourceTagsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListResourceTagsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListResourceTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceTagsResponseBody setResourceTags(ListResourceTagsResponseBodyResourceTags resourceTags) {
        this.resourceTags = resourceTags;
        return this;
    }
    public ListResourceTagsResponseBodyResourceTags getResourceTags() {
        return this.resourceTags;
    }

    public ListResourceTagsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListResourceTagsResponseBodyResourceTagsList extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListResourceTagsResponseBodyResourceTagsList build(java.util.Map<String, ?> map) throws Exception {
            ListResourceTagsResponseBodyResourceTagsList self = new ListResourceTagsResponseBodyResourceTagsList();
            return TeaModel.build(map, self);
        }

        public ListResourceTagsResponseBodyResourceTagsList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListResourceTagsResponseBodyResourceTagsList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListResourceTagsResponseBodyResourceTags extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListResourceTagsResponseBodyResourceTagsList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListResourceTagsResponseBodyResourceTags build(java.util.Map<String, ?> map) throws Exception {
            ListResourceTagsResponseBodyResourceTags self = new ListResourceTagsResponseBodyResourceTags();
            return TeaModel.build(map, self);
        }

        public ListResourceTagsResponseBodyResourceTags setList(java.util.List<ListResourceTagsResponseBodyResourceTagsList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListResourceTagsResponseBodyResourceTagsList> getList() {
            return this.list;
        }

        public ListResourceTagsResponseBodyResourceTags setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListResourceTagsResponseBodyResourceTags setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListResourceTagsResponseBodyResourceTags setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
