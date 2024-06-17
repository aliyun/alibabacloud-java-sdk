// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListClusterNamesResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     * 
     * <strong>example:</strong>
     * <p>F6E3D968-529C-5C40-AFDD-133A8B8FD930</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The result set</p>
     */
    @NameInMap("result")
    public ListClusterNamesResponseBodyResult result;

    public static ListClusterNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterNamesResponseBody self = new ListClusterNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterNamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterNamesResponseBody setResult(ListClusterNamesResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListClusterNamesResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListClusterNamesResponseBodyResult extends TeaModel {
        /**
         * <p>The description of the cluster</p>
         * 
         * <strong>example:</strong>
         * <p>ha3_test</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The ID of the cluster</p>
         * 
         * <strong>example:</strong>
         * <p>25030</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The name of the cluster</p>
         * 
         * <strong>example:</strong>
         * <p>my_index</p>
         */
        @NameInMap("name")
        public String name;

        public static ListClusterNamesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListClusterNamesResponseBodyResult self = new ListClusterNamesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListClusterNamesResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListClusterNamesResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListClusterNamesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
