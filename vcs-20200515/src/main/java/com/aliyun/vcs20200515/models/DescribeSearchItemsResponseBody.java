// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeSearchItemsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeSearchItemsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static DescribeSearchItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSearchItemsResponseBody self = new DescribeSearchItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSearchItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSearchItemsResponseBody setData(DescribeSearchItemsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSearchItemsResponseBodyData getData() {
        return this.data;
    }

    public DescribeSearchItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSearchItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSearchItemsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeSearchItemsResponseBodyDataRecords extends TeaModel {
        @NameInMap("ItemImageUrl")
        public String itemImageUrl;

        @NameInMap("SearchItemId")
        public String searchItemId;

        @NameInMap("SearchItemName")
        public String searchItemName;

        public static DescribeSearchItemsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeSearchItemsResponseBodyDataRecords self = new DescribeSearchItemsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public DescribeSearchItemsResponseBodyDataRecords setItemImageUrl(String itemImageUrl) {
            this.itemImageUrl = itemImageUrl;
            return this;
        }
        public String getItemImageUrl() {
            return this.itemImageUrl;
        }

        public DescribeSearchItemsResponseBodyDataRecords setSearchItemId(String searchItemId) {
            this.searchItemId = searchItemId;
            return this;
        }
        public String getSearchItemId() {
            return this.searchItemId;
        }

        public DescribeSearchItemsResponseBodyDataRecords setSearchItemName(String searchItemName) {
            this.searchItemName = searchItemName;
            return this;
        }
        public String getSearchItemName() {
            return this.searchItemName;
        }

    }

    public static class DescribeSearchItemsResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public String pageNumber;

        @NameInMap("PageSize")
        public String pageSize;

        @NameInMap("Records")
        public java.util.List<DescribeSearchItemsResponseBodyDataRecords> records;

        @NameInMap("TotalCount")
        public String totalCount;

        public static DescribeSearchItemsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSearchItemsResponseBodyData self = new DescribeSearchItemsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSearchItemsResponseBodyData setPageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public String getPageNumber() {
            return this.pageNumber;
        }

        public DescribeSearchItemsResponseBodyData setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public DescribeSearchItemsResponseBodyData setRecords(java.util.List<DescribeSearchItemsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<DescribeSearchItemsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public DescribeSearchItemsResponseBodyData setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

    }

}
