// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeEnumItemsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeEnumItemsResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEnumItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnumItemsResponseBody self = new DescribeEnumItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEnumItemsResponseBody setData(java.util.List<DescribeEnumItemsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeEnumItemsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeEnumItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEnumItemsResponseBodyData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeEnumItemsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnumItemsResponseBodyData self = new DescribeEnumItemsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeEnumItemsResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeEnumItemsResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
