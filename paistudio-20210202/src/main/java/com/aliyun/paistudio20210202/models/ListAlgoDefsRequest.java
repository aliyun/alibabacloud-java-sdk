// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class ListAlgoDefsRequest extends TeaModel {
    @NameInMap("body")
    public java.util.List<ListAlgoDefsRequestBody> body;

    public static ListAlgoDefsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlgoDefsRequest self = new ListAlgoDefsRequest();
        return TeaModel.build(map, self);
    }

    public ListAlgoDefsRequest setBody(java.util.List<ListAlgoDefsRequestBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<ListAlgoDefsRequestBody> getBody() {
        return this.body;
    }

    public static class ListAlgoDefsRequestBody extends TeaModel {
        @NameInMap("Provider")
        public String provider;

        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("Version")
        public String version;

        @NameInMap("Signature")
        public String signature;

        public static ListAlgoDefsRequestBody build(java.util.Map<String, ?> map) throws Exception {
            ListAlgoDefsRequestBody self = new ListAlgoDefsRequestBody();
            return TeaModel.build(map, self);
        }

        public ListAlgoDefsRequestBody setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public ListAlgoDefsRequestBody setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListAlgoDefsRequestBody setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListAlgoDefsRequestBody setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
