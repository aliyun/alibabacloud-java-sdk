// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDSTDependenciesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Dependencies")
    public java.util.List<ListDSTDependenciesResponseBodyDependencies> dependencies;

    public static ListDSTDependenciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDSTDependenciesResponseBody self = new ListDSTDependenciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDSTDependenciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDSTDependenciesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDSTDependenciesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListDSTDependenciesResponseBody setDependencies(java.util.List<ListDSTDependenciesResponseBodyDependencies> dependencies) {
        this.dependencies = dependencies;
        return this;
    }
    public java.util.List<ListDSTDependenciesResponseBodyDependencies> getDependencies() {
        return this.dependencies;
    }

    public static class ListDSTDependenciesResponseBodyDependenciesInfo extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListDSTDependenciesResponseBodyDependenciesInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDSTDependenciesResponseBodyDependenciesInfo self = new ListDSTDependenciesResponseBodyDependenciesInfo();
            return TeaModel.build(map, self);
        }

        public ListDSTDependenciesResponseBodyDependenciesInfo setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListDSTDependenciesResponseBodyDependenciesInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDSTDependenciesResponseBodyDependencies extends TeaModel {
        @NameInMap("Relation")
        public String relation;

        @NameInMap("Type")
        public String type;

        @NameInMap("Info")
        public java.util.List<ListDSTDependenciesResponseBodyDependenciesInfo> info;

        public static ListDSTDependenciesResponseBodyDependencies build(java.util.Map<String, ?> map) throws Exception {
            ListDSTDependenciesResponseBodyDependencies self = new ListDSTDependenciesResponseBodyDependencies();
            return TeaModel.build(map, self);
        }

        public ListDSTDependenciesResponseBodyDependencies setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

        public ListDSTDependenciesResponseBodyDependencies setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListDSTDependenciesResponseBodyDependencies setInfo(java.util.List<ListDSTDependenciesResponseBodyDependenciesInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<ListDSTDependenciesResponseBodyDependenciesInfo> getInfo() {
            return this.info;
        }

    }

}
