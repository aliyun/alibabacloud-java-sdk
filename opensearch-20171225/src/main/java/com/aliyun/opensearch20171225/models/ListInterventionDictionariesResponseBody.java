// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListInterventionDictionariesResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListInterventionDictionariesResponseBodyResult> result;

    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListInterventionDictionariesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInterventionDictionariesResponseBody self = new ListInterventionDictionariesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInterventionDictionariesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInterventionDictionariesResponseBody setResult(java.util.List<ListInterventionDictionariesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListInterventionDictionariesResponseBodyResult> getResult() {
        return this.result;
    }

    public ListInterventionDictionariesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListInterventionDictionariesResponseBodyResult extends TeaModel {
        @NameInMap("analyzer")
        public String analyzer;

        @NameInMap("created")
        public Integer created;

        @NameInMap("id")
        public Integer id;

        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

        @NameInMap("updated")
        public Integer updated;

        public static ListInterventionDictionariesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListInterventionDictionariesResponseBodyResult self = new ListInterventionDictionariesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListInterventionDictionariesResponseBodyResult setAnalyzer(String analyzer) {
            this.analyzer = analyzer;
            return this;
        }
        public String getAnalyzer() {
            return this.analyzer;
        }

        public ListInterventionDictionariesResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public ListInterventionDictionariesResponseBodyResult setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListInterventionDictionariesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListInterventionDictionariesResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListInterventionDictionariesResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

}
