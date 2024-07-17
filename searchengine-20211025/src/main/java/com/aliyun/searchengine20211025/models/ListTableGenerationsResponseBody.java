// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListTableGenerationsResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>F6E3D968-529C-5C40-AFDD-133A8B8FD930</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The result.</p>
     */
    @NameInMap("result")
    public java.util.List<ListTableGenerationsResponseBodyResult> result;

    public static ListTableGenerationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTableGenerationsResponseBody self = new ListTableGenerationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTableGenerationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTableGenerationsResponseBody setResult(java.util.List<ListTableGenerationsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListTableGenerationsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListTableGenerationsResponseBodyResult extends TeaModel {
        /**
         * <p>The ID of the full index version.</p>
         * 
         * <strong>example:</strong>
         * <p>1708674867</p>
         */
        @NameInMap("generationId")
        public Long generationId;

        public static ListTableGenerationsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListTableGenerationsResponseBodyResult self = new ListTableGenerationsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListTableGenerationsResponseBodyResult setGenerationId(Long generationId) {
            this.generationId = generationId;
            return this;
        }
        public Long getGenerationId() {
            return this.generationId;
        }

    }

}
