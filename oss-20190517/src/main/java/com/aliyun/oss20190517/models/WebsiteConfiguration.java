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

    }

}
