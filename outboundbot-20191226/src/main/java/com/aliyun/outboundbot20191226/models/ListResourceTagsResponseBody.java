// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListResourceTagsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ResourceTags")
    public ListResourceTagsResponseBodyResourceTags resourceTags;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("List")
        public java.util.List<ListResourceTagsResponseBodyResourceTagsList> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
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
