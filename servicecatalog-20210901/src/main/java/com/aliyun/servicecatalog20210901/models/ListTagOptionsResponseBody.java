// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListTagOptionsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * <br>
     * <p>Valid values: 1 to 100. Minimum value: 1. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the details of the tag option.</p>
     */
    @NameInMap("TagOptionDetails")
    public java.util.List<ListTagOptionsResponseBodyTagOptionDetails> tagOptionDetails;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTagOptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagOptionsResponseBody self = new ListTagOptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagOptionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTagOptionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTagOptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagOptionsResponseBody setTagOptionDetails(java.util.List<ListTagOptionsResponseBodyTagOptionDetails> tagOptionDetails) {
        this.tagOptionDetails = tagOptionDetails;
        return this;
    }
    public java.util.List<ListTagOptionsResponseBodyTagOptionDetails> getTagOptionDetails() {
        return this.tagOptionDetails;
    }

    public ListTagOptionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTagOptionsResponseBodyTagOptionDetails extends TeaModel {
        /**
         * <p>Indicates whether the tag option is enabled. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("Active")
        public Boolean active;

        /**
         * <p>The key of the tag option.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The ID of the Alibaba Cloud account to which the tag option belongs.</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the tag option.</p>
         */
        @NameInMap("TagOptionId")
        public String tagOptionId;

        /**
         * <p>The value of the tag option.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTagOptionsResponseBodyTagOptionDetails build(java.util.Map<String, ?> map) throws Exception {
            ListTagOptionsResponseBodyTagOptionDetails self = new ListTagOptionsResponseBodyTagOptionDetails();
            return TeaModel.build(map, self);
        }

        public ListTagOptionsResponseBodyTagOptionDetails setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public ListTagOptionsResponseBodyTagOptionDetails setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTagOptionsResponseBodyTagOptionDetails setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListTagOptionsResponseBodyTagOptionDetails setTagOptionId(String tagOptionId) {
            this.tagOptionId = tagOptionId;
            return this;
        }
        public String getTagOptionId() {
            return this.tagOptionId;
        }

        public ListTagOptionsResponseBodyTagOptionDetails setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
