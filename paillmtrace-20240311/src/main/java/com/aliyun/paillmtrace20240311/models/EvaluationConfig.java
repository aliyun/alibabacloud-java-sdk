// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class EvaluationConfig extends TeaModel {
    @NameInMap("Answer")
    public EvaluationConfigAnswer answer;

    @NameInMap("Context")
    public EvaluationConfigContext context;

    @NameInMap("Query")
    public EvaluationConfigQuery query;

    public static EvaluationConfig build(java.util.Map<String, ?> map) throws Exception {
        EvaluationConfig self = new EvaluationConfig();
        return TeaModel.build(map, self);
    }

    public EvaluationConfig setAnswer(EvaluationConfigAnswer answer) {
        this.answer = answer;
        return this;
    }
    public EvaluationConfigAnswer getAnswer() {
        return this.answer;
    }

    public EvaluationConfig setContext(EvaluationConfigContext context) {
        this.context = context;
        return this;
    }
    public EvaluationConfigContext getContext() {
        return this.context;
    }

    public EvaluationConfig setQuery(EvaluationConfigQuery query) {
        this.query = query;
        return this;
    }
    public EvaluationConfigQuery getQuery() {
        return this.query;
    }

    public static class EvaluationConfigAnswer extends TeaModel {
        @NameInMap("JsonPathInSpan")
        public String jsonPathInSpan;

        @NameInMap("JsonPathInSpanValue")
        public String jsonPathInSpanValue;

        @NameInMap("SpanName")
        public String spanName;

        public static EvaluationConfigAnswer build(java.util.Map<String, ?> map) throws Exception {
            EvaluationConfigAnswer self = new EvaluationConfigAnswer();
            return TeaModel.build(map, self);
        }

        public EvaluationConfigAnswer setJsonPathInSpan(String jsonPathInSpan) {
            this.jsonPathInSpan = jsonPathInSpan;
            return this;
        }
        public String getJsonPathInSpan() {
            return this.jsonPathInSpan;
        }

        public EvaluationConfigAnswer setJsonPathInSpanValue(String jsonPathInSpanValue) {
            this.jsonPathInSpanValue = jsonPathInSpanValue;
            return this;
        }
        public String getJsonPathInSpanValue() {
            return this.jsonPathInSpanValue;
        }

        public EvaluationConfigAnswer setSpanName(String spanName) {
            this.spanName = spanName;
            return this;
        }
        public String getSpanName() {
            return this.spanName;
        }

    }

    public static class EvaluationConfigContext extends TeaModel {
        @NameInMap("JsonPathInSpan")
        public String jsonPathInSpan;

        @NameInMap("JsonPathInSpanValue")
        public String jsonPathInSpanValue;

        @NameInMap("SpanName")
        public String spanName;

        public static EvaluationConfigContext build(java.util.Map<String, ?> map) throws Exception {
            EvaluationConfigContext self = new EvaluationConfigContext();
            return TeaModel.build(map, self);
        }

        public EvaluationConfigContext setJsonPathInSpan(String jsonPathInSpan) {
            this.jsonPathInSpan = jsonPathInSpan;
            return this;
        }
        public String getJsonPathInSpan() {
            return this.jsonPathInSpan;
        }

        public EvaluationConfigContext setJsonPathInSpanValue(String jsonPathInSpanValue) {
            this.jsonPathInSpanValue = jsonPathInSpanValue;
            return this;
        }
        public String getJsonPathInSpanValue() {
            return this.jsonPathInSpanValue;
        }

        public EvaluationConfigContext setSpanName(String spanName) {
            this.spanName = spanName;
            return this;
        }
        public String getSpanName() {
            return this.spanName;
        }

    }

    public static class EvaluationConfigQuery extends TeaModel {
        @NameInMap("JsonPathInSpan")
        public String jsonPathInSpan;

        @NameInMap("JsonPathInSpanValue")
        public String jsonPathInSpanValue;

        @NameInMap("SpanName")
        public String spanName;

        public static EvaluationConfigQuery build(java.util.Map<String, ?> map) throws Exception {
            EvaluationConfigQuery self = new EvaluationConfigQuery();
            return TeaModel.build(map, self);
        }

        public EvaluationConfigQuery setJsonPathInSpan(String jsonPathInSpan) {
            this.jsonPathInSpan = jsonPathInSpan;
            return this;
        }
        public String getJsonPathInSpan() {
            return this.jsonPathInSpan;
        }

        public EvaluationConfigQuery setJsonPathInSpanValue(String jsonPathInSpanValue) {
            this.jsonPathInSpanValue = jsonPathInSpanValue;
            return this;
        }
        public String getJsonPathInSpanValue() {
            return this.jsonPathInSpanValue;
        }

        public EvaluationConfigQuery setSpanName(String spanName) {
            this.spanName = spanName;
            return this;
        }
        public String getSpanName() {
            return this.spanName;
        }

    }

}
