// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SearchItemResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SearchItemResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SearchItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchItemResponseBody self = new SearchItemResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchItemResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchItemResponseBody setData(SearchItemResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchItemResponseBodyData getData() {
        return this.data;
    }

    public SearchItemResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchItemResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchItemResponseBodyDataRecords extends TeaModel {
        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("ItemImageSimilarity")
        public Double itemImageSimilarity;

        @NameInMap("ItemImageUrl")
        public String itemImageUrl;

        @NameInMap("ItemName")
        public String itemName;

        public static SearchItemResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            SearchItemResponseBodyDataRecords self = new SearchItemResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public SearchItemResponseBodyDataRecords setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public SearchItemResponseBodyDataRecords setItemImageSimilarity(Double itemImageSimilarity) {
            this.itemImageSimilarity = itemImageSimilarity;
            return this;
        }
        public Double getItemImageSimilarity() {
            return this.itemImageSimilarity;
        }

        public SearchItemResponseBodyDataRecords setItemImageUrl(String itemImageUrl) {
            this.itemImageUrl = itemImageUrl;
            return this;
        }
        public String getItemImageUrl() {
            return this.itemImageUrl;
        }

        public SearchItemResponseBodyDataRecords setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

    }

    public static class SearchItemResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Records")
        public java.util.List<SearchItemResponseBodyDataRecords> records;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static SearchItemResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchItemResponseBodyData self = new SearchItemResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchItemResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public SearchItemResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public SearchItemResponseBodyData setRecords(java.util.List<SearchItemResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<SearchItemResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public SearchItemResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
