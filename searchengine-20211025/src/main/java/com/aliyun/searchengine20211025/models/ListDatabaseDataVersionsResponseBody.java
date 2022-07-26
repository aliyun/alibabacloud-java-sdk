// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListDatabaseDataVersionsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListDatabaseDataVersionsResponseBodyResult> result;

    public static ListDatabaseDataVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatabaseDataVersionsResponseBody self = new ListDatabaseDataVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatabaseDataVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatabaseDataVersionsResponseBody setResult(java.util.List<ListDatabaseDataVersionsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDatabaseDataVersionsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListDatabaseDataVersionsResponseBodyResult extends TeaModel {
        @NameInMap("dataVersion")
        public String dataVersion;

        @NameInMap("domain")
        public String domain;

        @NameInMap("fullFinishTime")
        public String fullFinishTime;

        @NameInMap("incFinishTime")
        public String incFinishTime;

        @NameInMap("indexSize")
        public Long indexSize;

        public static ListDatabaseDataVersionsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDatabaseDataVersionsResponseBodyResult self = new ListDatabaseDataVersionsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDatabaseDataVersionsResponseBodyResult setDataVersion(String dataVersion) {
            this.dataVersion = dataVersion;
            return this;
        }
        public String getDataVersion() {
            return this.dataVersion;
        }

        public ListDatabaseDataVersionsResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListDatabaseDataVersionsResponseBodyResult setFullFinishTime(String fullFinishTime) {
            this.fullFinishTime = fullFinishTime;
            return this;
        }
        public String getFullFinishTime() {
            return this.fullFinishTime;
        }

        public ListDatabaseDataVersionsResponseBodyResult setIncFinishTime(String incFinishTime) {
            this.incFinishTime = incFinishTime;
            return this;
        }
        public String getIncFinishTime() {
            return this.incFinishTime;
        }

        public ListDatabaseDataVersionsResponseBodyResult setIndexSize(Long indexSize) {
            this.indexSize = indexSize;
            return this;
        }
        public Long getIndexSize() {
            return this.indexSize;
        }

    }

}
