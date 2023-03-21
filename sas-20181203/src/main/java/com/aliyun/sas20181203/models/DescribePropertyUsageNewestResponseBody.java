// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyUsageNewestResponseBody extends TeaModel {
    @NameInMap("ItemCount")
    public Integer itemCount;

    @NameInMap("NewestStatisticItems")
    public java.util.List<DescribePropertyUsageNewestResponseBodyNewestStatisticItems> newestStatisticItems;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Type")
    public String type;

    public static DescribePropertyUsageNewestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyUsageNewestResponseBody self = new DescribePropertyUsageNewestResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePropertyUsageNewestResponseBody setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
        return this;
    }
    public Integer getItemCount() {
        return this.itemCount;
    }

    public DescribePropertyUsageNewestResponseBody setNewestStatisticItems(java.util.List<DescribePropertyUsageNewestResponseBodyNewestStatisticItems> newestStatisticItems) {
        this.newestStatisticItems = newestStatisticItems;
        return this;
    }
    public java.util.List<DescribePropertyUsageNewestResponseBodyNewestStatisticItems> getNewestStatisticItems() {
        return this.newestStatisticItems;
    }

    public DescribePropertyUsageNewestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePropertyUsageNewestResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class DescribePropertyUsageNewestResponseBodyNewestStatisticItems extends TeaModel {
        @NameInMap("Create")
        public Long create;

        @NameInMap("Name")
        public String name;

        public static DescribePropertyUsageNewestResponseBodyNewestStatisticItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyUsageNewestResponseBodyNewestStatisticItems self = new DescribePropertyUsageNewestResponseBodyNewestStatisticItems();
            return TeaModel.build(map, self);
        }

        public DescribePropertyUsageNewestResponseBodyNewestStatisticItems setCreate(Long create) {
            this.create = create;
            return this;
        }
        public Long getCreate() {
            return this.create;
        }

        public DescribePropertyUsageNewestResponseBodyNewestStatisticItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
