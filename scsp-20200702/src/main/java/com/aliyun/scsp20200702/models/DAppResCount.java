// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class DAppResCount extends TeaModel {
    // 总数
    @NameInMap("Total")
    public Integer total;

    // 按类型分组的资源计数
    @NameInMap("Items")
    public java.util.List<DAppResCountItems> items;

    public static DAppResCount build(java.util.Map<String, ?> map) throws Exception {
        DAppResCount self = new DAppResCount();
        return TeaModel.build(map, self);
    }

    public DAppResCount setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DAppResCount setItems(java.util.List<DAppResCountItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DAppResCountItems> getItems() {
        return this.items;
    }

    public static class DAppResCountItems extends TeaModel {
        // 类型
        @NameInMap("Type")
        public DPair type;

        // 计数
        @NameInMap("Count")
        public Integer count;

        public static DAppResCountItems build(java.util.Map<String, ?> map) throws Exception {
            DAppResCountItems self = new DAppResCountItems();
            return TeaModel.build(map, self);
        }

        public DAppResCountItems setType(DPair type) {
            this.type = type;
            return this;
        }
        public DPair getType() {
            return this.type;
        }

        public DAppResCountItems setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
