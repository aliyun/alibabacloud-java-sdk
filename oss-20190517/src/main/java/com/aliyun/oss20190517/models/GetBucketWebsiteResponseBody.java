// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketWebsiteResponseBody extends TeaModel {
    @NameInMap("ErrorDocument")
    public GetBucketWebsiteResponseBodyErrorDocument errorDocument;

    @NameInMap("IndexDocument")
    public GetBucketWebsiteResponseBodyIndexDocument indexDocument;

    public static GetBucketWebsiteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBucketWebsiteResponseBody self = new GetBucketWebsiteResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBucketWebsiteResponseBody setErrorDocument(GetBucketWebsiteResponseBodyErrorDocument errorDocument) {
        this.errorDocument = errorDocument;
        return this;
    }
    public GetBucketWebsiteResponseBodyErrorDocument getErrorDocument() {
        return this.errorDocument;
    }

    public GetBucketWebsiteResponseBody setIndexDocument(GetBucketWebsiteResponseBodyIndexDocument indexDocument) {
        this.indexDocument = indexDocument;
        return this;
    }
    public GetBucketWebsiteResponseBodyIndexDocument getIndexDocument() {
        return this.indexDocument;
    }

    public static class GetBucketWebsiteResponseBodyErrorDocument extends TeaModel {
        @NameInMap("HttpStatus")
        public String httpStatus;

        @NameInMap("Key")
        public String key;

        public static GetBucketWebsiteResponseBodyErrorDocument build(java.util.Map<String, ?> map) throws Exception {
            GetBucketWebsiteResponseBodyErrorDocument self = new GetBucketWebsiteResponseBodyErrorDocument();
            return TeaModel.build(map, self);
        }

        public GetBucketWebsiteResponseBodyErrorDocument setHttpStatus(String httpStatus) {
            this.httpStatus = httpStatus;
            return this;
        }
        public String getHttpStatus() {
            return this.httpStatus;
        }

        public GetBucketWebsiteResponseBodyErrorDocument setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class GetBucketWebsiteResponseBodyIndexDocument extends TeaModel {
        @NameInMap("Suffix")
        public String suffix;

        public static GetBucketWebsiteResponseBodyIndexDocument build(java.util.Map<String, ?> map) throws Exception {
            GetBucketWebsiteResponseBodyIndexDocument self = new GetBucketWebsiteResponseBodyIndexDocument();
            return TeaModel.build(map, self);
        }

        public GetBucketWebsiteResponseBodyIndexDocument setSuffix(String suffix) {
            this.suffix = suffix;
            return this;
        }
        public String getSuffix() {
            return this.suffix;
        }

    }

}
