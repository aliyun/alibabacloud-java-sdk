// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ListDemosResponseBody extends TeaModel {
    // 样例列表
    @NameInMap("Demos")
    public java.util.List<ListDemosResponseBodyDemos> demos;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 总数
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDemosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDemosResponseBody self = new ListDemosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDemosResponseBody setDemos(java.util.List<ListDemosResponseBodyDemos> demos) {
        this.demos = demos;
        return this;
    }
    public java.util.List<ListDemosResponseBodyDemos> getDemos() {
        return this.demos;
    }

    public ListDemosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDemosResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDemosResponseBodyDemos extends TeaModel {
        // 所在目录
        @NameInMap("Categories")
        public java.util.List<String> categories;

        // 样例描述
        @NameInMap("DemoDescription")
        public String demoDescription;

        // 样例名称
        @NameInMap("DemoName")
        public String demoName;

        // 样例地址
        @NameInMap("DemoUrl")
        public String demoUrl;

        // 序号
        @NameInMap("Order")
        public Long order;

        // 大小
        @NameInMap("Size")
        public Long size;

        public static ListDemosResponseBodyDemos build(java.util.Map<String, ?> map) throws Exception {
            ListDemosResponseBodyDemos self = new ListDemosResponseBodyDemos();
            return TeaModel.build(map, self);
        }

        public ListDemosResponseBodyDemos setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public ListDemosResponseBodyDemos setDemoDescription(String demoDescription) {
            this.demoDescription = demoDescription;
            return this;
        }
        public String getDemoDescription() {
            return this.demoDescription;
        }

        public ListDemosResponseBodyDemos setDemoName(String demoName) {
            this.demoName = demoName;
            return this;
        }
        public String getDemoName() {
            return this.demoName;
        }

        public ListDemosResponseBodyDemos setDemoUrl(String demoUrl) {
            this.demoUrl = demoUrl;
            return this;
        }
        public String getDemoUrl() {
            return this.demoUrl;
        }

        public ListDemosResponseBodyDemos setOrder(Long order) {
            this.order = order;
            return this;
        }
        public Long getOrder() {
            return this.order;
        }

        public ListDemosResponseBodyDemos setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

}
