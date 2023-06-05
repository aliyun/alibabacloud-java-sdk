// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeWatchItemsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeWatchItemsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeWatchItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWatchItemsResponseBody self = new DescribeWatchItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWatchItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeWatchItemsResponseBody setData(DescribeWatchItemsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeWatchItemsResponseBodyData getData() {
        return this.data;
    }

    public DescribeWatchItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeWatchItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWatchItemsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeWatchItemsResponseBodyDataRecords extends TeaModel {
        @NameInMap("ItemAttributes")
        public String itemAttributes;

        @NameInMap("ItemImageUrl")
        public String itemImageUrl;

        @NameInMap("WatchItemId")
        public String watchItemId;

        @NameInMap("WatchItemName")
        public String watchItemName;

        public static DescribeWatchItemsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeWatchItemsResponseBodyDataRecords self = new DescribeWatchItemsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public DescribeWatchItemsResponseBodyDataRecords setItemAttributes(String itemAttributes) {
            this.itemAttributes = itemAttributes;
            return this;
        }
        public String getItemAttributes() {
            return this.itemAttributes;
        }

        public DescribeWatchItemsResponseBodyDataRecords setItemImageUrl(String itemImageUrl) {
            this.itemImageUrl = itemImageUrl;
            return this;
        }
        public String getItemImageUrl() {
            return this.itemImageUrl;
        }

        public DescribeWatchItemsResponseBodyDataRecords setWatchItemId(String watchItemId) {
            this.watchItemId = watchItemId;
            return this;
        }
        public String getWatchItemId() {
            return this.watchItemId;
        }

        public DescribeWatchItemsResponseBodyDataRecords setWatchItemName(String watchItemName) {
            this.watchItemName = watchItemName;
            return this;
        }
        public String getWatchItemName() {
            return this.watchItemName;
        }

    }

    public static class DescribeWatchItemsResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Records")
        public java.util.List<DescribeWatchItemsResponseBodyDataRecords> records;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeWatchItemsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeWatchItemsResponseBodyData self = new DescribeWatchItemsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeWatchItemsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeWatchItemsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeWatchItemsResponseBodyData setRecords(java.util.List<DescribeWatchItemsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<DescribeWatchItemsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public DescribeWatchItemsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
