// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ListDemosResponseBody extends TeaModel {
    @NameInMap("Demos")
    public java.util.List<ListDemosResponseBodyDemos> demos;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Categories")
        public java.util.List<String> categories;

        @NameInMap("DemoDescription")
        public String demoDescription;

        @NameInMap("DemoName")
        public String demoName;

        @NameInMap("DemoUrl")
        public String demoUrl;

        @NameInMap("Order")
        public Long order;

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
