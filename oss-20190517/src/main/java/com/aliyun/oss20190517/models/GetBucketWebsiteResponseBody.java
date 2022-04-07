// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketWebsiteResponseBody extends TeaModel {
    @NameInMap("ErrorDocument")
    public ErrorDocument errorDocument;

    @NameInMap("IndexDocument")
    public IndexDocument indexDocument;

    @NameInMap("RoutingRules")
    public RoutingRules routingRules;

    public static GetBucketWebsiteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBucketWebsiteResponseBody self = new GetBucketWebsiteResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBucketWebsiteResponseBody setErrorDocument(ErrorDocument errorDocument) {
        this.errorDocument = errorDocument;
        return this;
    }
    public ErrorDocument getErrorDocument() {
        return this.errorDocument;
    }

    public GetBucketWebsiteResponseBody setIndexDocument(IndexDocument indexDocument) {
        this.indexDocument = indexDocument;
        return this;
    }
    public IndexDocument getIndexDocument() {
        return this.indexDocument;
    }

    public GetBucketWebsiteResponseBody setRoutingRules(RoutingRules routingRules) {
        this.routingRules = routingRules;
        return this;
    }
    public RoutingRules getRoutingRules() {
        return this.routingRules;
    }

    public static class RoutingRules extends TeaModel {
        @NameInMap("RoutingRule")
        public java.util.List<RoutingRule> routingRules;

        public static RoutingRules build(java.util.Map<String, ?> map) throws Exception {
            RoutingRules self = new RoutingRules();
            return TeaModel.build(map, self);
        }

        public RoutingRules setRoutingRules(java.util.List<RoutingRule> routingRules) {
            this.routingRules = routingRules;
            return this;
        }
        public java.util.List<RoutingRule> getRoutingRules() {
            return this.routingRules;
        }

    }

}
