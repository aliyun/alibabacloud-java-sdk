// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class WebsiteConfiguration extends TeaModel {
    // description
    @NameInMap("ErrorDocument")
    public WebsiteConfigurationErrorDocument errorDocument;

    // description
    @NameInMap("IndexDocument")
    public WebsiteConfigurationIndexDocument indexDocument;

    // description
    @NameInMap("RoutingRules")
    public WebsiteConfigurationRoutingRules routingRules;

    public static WebsiteConfiguration build(java.util.Map<String, ?> map) throws Exception {
        WebsiteConfiguration self = new WebsiteConfiguration();
        return TeaModel.build(map, self);
    }

    public WebsiteConfiguration setErrorDocument(WebsiteConfigurationErrorDocument errorDocument) {
        this.errorDocument = errorDocument;
        return this;
    }
    public WebsiteConfigurationErrorDocument getErrorDocument() {
        return this.errorDocument;
    }

    public WebsiteConfiguration setIndexDocument(WebsiteConfigurationIndexDocument indexDocument) {
        this.indexDocument = indexDocument;
        return this;
    }
    public WebsiteConfigurationIndexDocument getIndexDocument() {
        return this.indexDocument;
    }

    public WebsiteConfiguration setRoutingRules(WebsiteConfigurationRoutingRules routingRules) {
        this.routingRules = routingRules;
        return this;
    }
    public WebsiteConfigurationRoutingRules getRoutingRules() {
        return this.routingRules;
    }

    public static class WebsiteConfigurationErrorDocument extends TeaModel {
        // description
        @NameInMap("HttpStatus")
        public String httpStatus;

        // description
        @NameInMap("Key")
        public String key;

        public static WebsiteConfigurationErrorDocument build(java.util.Map<String, ?> map) throws Exception {
            WebsiteConfigurationErrorDocument self = new WebsiteConfigurationErrorDocument();
            return TeaModel.build(map, self);
        }

        public WebsiteConfigurationErrorDocument setHttpStatus(String httpStatus) {
            this.httpStatus = httpStatus;
            return this;
        }
        public String getHttpStatus() {
            return this.httpStatus;
        }

        public WebsiteConfigurationErrorDocument setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class WebsiteConfigurationIndexDocument extends TeaModel {
        // description
        @NameInMap("Suffix")
        public String suffix;

        // description
        @NameInMap("SupportSubDir")
        public Boolean supportSubDir;

        // description
        @NameInMap("Type")
        public String type;

        public static WebsiteConfigurationIndexDocument build(java.util.Map<String, ?> map) throws Exception {
            WebsiteConfigurationIndexDocument self = new WebsiteConfigurationIndexDocument();
            return TeaModel.build(map, self);
        }

        public WebsiteConfigurationIndexDocument setSuffix(String suffix) {
            this.suffix = suffix;
            return this;
        }
        public String getSuffix() {
            return this.suffix;
        }

        public WebsiteConfigurationIndexDocument setSupportSubDir(Boolean supportSubDir) {
            this.supportSubDir = supportSubDir;
            return this;
        }
        public Boolean getSupportSubDir() {
            return this.supportSubDir;
        }

        public WebsiteConfigurationIndexDocument setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class WebsiteConfigurationRoutingRules extends TeaModel {
        // description
        @NameInMap("RoutingRule")
        public java.util.List<RoutingRule> routingRules;

        public static WebsiteConfigurationRoutingRules build(java.util.Map<String, ?> map) throws Exception {
            WebsiteConfigurationRoutingRules self = new WebsiteConfigurationRoutingRules();
            return TeaModel.build(map, self);
        }

        public WebsiteConfigurationRoutingRules setRoutingRules(java.util.List<RoutingRule> routingRules) {
            this.routingRules = routingRules;
            return this;
        }
        public java.util.List<RoutingRule> getRoutingRules() {
            return this.routingRules;
        }

    }

}
