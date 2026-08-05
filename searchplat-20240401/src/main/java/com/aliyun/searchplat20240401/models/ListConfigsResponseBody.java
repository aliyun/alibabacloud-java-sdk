// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ListConfigsResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>65150BD6-1622-4177-9D30-65B33A9F6969</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The configuration list.</p>
     */
    @NameInMap("result")
    public java.util.List<ListConfigsResponseBodyResult> result;

    /**
     * <p>The total number of configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConfigsResponseBody self = new ListConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConfigsResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListConfigsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConfigsResponseBody setResult(java.util.List<ListConfigsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListConfigsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListConfigsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListConfigsResponseBodyResult extends TeaModel {
        /**
         * <p>The configuration content.</p>
         */
        @NameInMap("configData")
        public java.util.Map<String, ?> configData;

        /**
         * <p>The configuration type. Valid values:</p>
         * <ul>
         * <li>prompt: Prompt configuration.</li>
         * <li>lark: Lark configuration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>prompt</p>
         */
        @NameInMap("configType")
        public String configType;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-001</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static ListConfigsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListConfigsResponseBodyResult self = new ListConfigsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListConfigsResponseBodyResult setConfigData(java.util.Map<String, ?> configData) {
            this.configData = configData;
            return this;
        }
        public java.util.Map<String, ?> getConfigData() {
            return this.configData;
        }

        public ListConfigsResponseBodyResult setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public ListConfigsResponseBodyResult setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
