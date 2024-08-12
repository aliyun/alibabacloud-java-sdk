// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class DescribeSnLabelCountsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeSnLabelCountsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSnLabelCountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnLabelCountsResponseBody self = new DescribeSnLabelCountsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSnLabelCountsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSnLabelCountsResponseBody setData(DescribeSnLabelCountsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSnLabelCountsResponseBodyData getData() {
        return this.data;
    }

    public DescribeSnLabelCountsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSnLabelCountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSnLabelCountsResponseBodyDataLabelCountDTOList extends TeaModel {
        @NameInMap("Count")
        public String count;

        @NameInMap("Label")
        public String label;

        public static DescribeSnLabelCountsResponseBodyDataLabelCountDTOList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnLabelCountsResponseBodyDataLabelCountDTOList self = new DescribeSnLabelCountsResponseBodyDataLabelCountDTOList();
            return TeaModel.build(map, self);
        }

        public DescribeSnLabelCountsResponseBodyDataLabelCountDTOList setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public DescribeSnLabelCountsResponseBodyDataLabelCountDTOList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class DescribeSnLabelCountsResponseBodyData extends TeaModel {
        @NameInMap("LabelCountDTOList")
        public java.util.List<DescribeSnLabelCountsResponseBodyDataLabelCountDTOList> labelCountDTOList;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeSnLabelCountsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnLabelCountsResponseBodyData self = new DescribeSnLabelCountsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSnLabelCountsResponseBodyData setLabelCountDTOList(java.util.List<DescribeSnLabelCountsResponseBodyDataLabelCountDTOList> labelCountDTOList) {
            this.labelCountDTOList = labelCountDTOList;
            return this;
        }
        public java.util.List<DescribeSnLabelCountsResponseBodyDataLabelCountDTOList> getLabelCountDTOList() {
            return this.labelCountDTOList;
        }

        public DescribeSnLabelCountsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
