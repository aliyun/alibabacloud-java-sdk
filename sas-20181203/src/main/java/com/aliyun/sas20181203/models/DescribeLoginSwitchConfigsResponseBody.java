// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLoginSwitchConfigsResponseBody extends TeaModel {
    @NameInMap("ConfigList")
    public java.util.List<DescribeLoginSwitchConfigsResponseBodyConfigList> configList;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLoginSwitchConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoginSwitchConfigsResponseBody self = new DescribeLoginSwitchConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoginSwitchConfigsResponseBody setConfigList(java.util.List<DescribeLoginSwitchConfigsResponseBodyConfigList> configList) {
        this.configList = configList;
        return this;
    }
    public java.util.List<DescribeLoginSwitchConfigsResponseBodyConfigList> getConfigList() {
        return this.configList;
    }

    public DescribeLoginSwitchConfigsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeLoginSwitchConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLoginSwitchConfigsResponseBodyConfigList extends TeaModel {
        @NameInMap("Item")
        public String item;

        @NameInMap("Status")
        public Integer status;

        public static DescribeLoginSwitchConfigsResponseBodyConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoginSwitchConfigsResponseBodyConfigList self = new DescribeLoginSwitchConfigsResponseBodyConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeLoginSwitchConfigsResponseBodyConfigList setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public DescribeLoginSwitchConfigsResponseBodyConfigList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
