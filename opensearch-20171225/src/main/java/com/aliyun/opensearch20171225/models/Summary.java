// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class Summary extends TeaModel {
    @NameInMap("active")
    public Boolean active;

    @NameInMap("meta")
    public SummaryMeta meta;

    @NameInMap("name")
    public String name;

    public static Summary build(java.util.Map<String, ?> map) throws Exception {
        Summary self = new Summary();
        return TeaModel.build(map, self);
    }

    public Summary setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

    public Summary setMeta(SummaryMeta meta) {
        this.meta = meta;
        return this;
    }
    public SummaryMeta getMeta() {
        return this.meta;
    }

    public Summary setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public static class SummaryMeta extends TeaModel {
        @NameInMap("element")
        public String element;

        @NameInMap("ellipsis")
        public String ellipsis;

        @NameInMap("field")
        public String field;

        @NameInMap("len")
        public Integer len;

        @NameInMap("snippet")
        public String snippet;

        public static SummaryMeta build(java.util.Map<String, ?> map) throws Exception {
            SummaryMeta self = new SummaryMeta();
            return TeaModel.build(map, self);
        }

        public SummaryMeta setElement(String element) {
            this.element = element;
            return this;
        }
        public String getElement() {
            return this.element;
        }

        public SummaryMeta setEllipsis(String ellipsis) {
            this.ellipsis = ellipsis;
            return this;
        }
        public String getEllipsis() {
            return this.ellipsis;
        }

        public SummaryMeta setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public SummaryMeta setLen(Integer len) {
            this.len = len;
            return this;
        }
        public Integer getLen() {
            return this.len;
        }

        public SummaryMeta setSnippet(String snippet) {
            this.snippet = snippet;
            return this;
        }
        public String getSnippet() {
            return this.snippet;
        }

    }

}
