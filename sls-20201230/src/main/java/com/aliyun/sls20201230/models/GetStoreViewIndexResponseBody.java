// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetStoreViewIndexResponseBody extends TeaModel {
    @NameInMap("indexes")
    public java.util.List<GetStoreViewIndexResponseBodyIndexes> indexes;

    public static GetStoreViewIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStoreViewIndexResponseBody self = new GetStoreViewIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStoreViewIndexResponseBody setIndexes(java.util.List<GetStoreViewIndexResponseBodyIndexes> indexes) {
        this.indexes = indexes;
        return this;
    }
    public java.util.List<GetStoreViewIndexResponseBodyIndexes> getIndexes() {
        return this.indexes;
    }

    public static class GetStoreViewIndexResponseBodyIndexes extends TeaModel {
        @NameInMap("index")
        public Index index;

        @NameInMap("logstore")
        public String logstore;

        @NameInMap("project")
        public String project;

        public static GetStoreViewIndexResponseBodyIndexes build(java.util.Map<String, ?> map) throws Exception {
            GetStoreViewIndexResponseBodyIndexes self = new GetStoreViewIndexResponseBodyIndexes();
            return TeaModel.build(map, self);
        }

        public GetStoreViewIndexResponseBodyIndexes setIndex(Index index) {
            this.index = index;
            return this;
        }
        public Index getIndex() {
            return this.index;
        }

        public GetStoreViewIndexResponseBodyIndexes setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public GetStoreViewIndexResponseBodyIndexes setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

}
