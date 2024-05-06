// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetNodeConfigResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The result set.</p>
     */
    @NameInMap("result")
    public GetNodeConfigResponseBodyResult result;

    public static GetNodeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNodeConfigResponseBody self = new GetNodeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNodeConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNodeConfigResponseBody setResult(GetNodeConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetNodeConfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetNodeConfigResponseBodyResult extends TeaModel {
        /**
         * <p>Indicates whether the expression is the default one.</p>
         */
        @NameInMap("active")
        public Boolean active;

        /**
         * <p>The number of data replicas.</p>
         */
        @NameInMap("dataDuplicateNumber")
        public Integer dataDuplicateNumber;

        /**
         * <p>The number of data shards.</p>
         */
        @NameInMap("dataFragmentNumber")
        public Integer dataFragmentNumber;

        @NameInMap("flowRatio")
        public Integer flowRatio;

        /**
         * <p>The minimum service ratio.</p>
         */
        @NameInMap("minServicePercent")
        public Integer minServicePercent;

        /**
         * <p>Indicates whether the node is associated with the cluster.</p>
         */
        @NameInMap("published")
        public Boolean published;

        public static GetNodeConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetNodeConfigResponseBodyResult self = new GetNodeConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetNodeConfigResponseBodyResult setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public GetNodeConfigResponseBodyResult setDataDuplicateNumber(Integer dataDuplicateNumber) {
            this.dataDuplicateNumber = dataDuplicateNumber;
            return this;
        }
        public Integer getDataDuplicateNumber() {
            return this.dataDuplicateNumber;
        }

        public GetNodeConfigResponseBodyResult setDataFragmentNumber(Integer dataFragmentNumber) {
            this.dataFragmentNumber = dataFragmentNumber;
            return this;
        }
        public Integer getDataFragmentNumber() {
            return this.dataFragmentNumber;
        }

        public GetNodeConfigResponseBodyResult setFlowRatio(Integer flowRatio) {
            this.flowRatio = flowRatio;
            return this;
        }
        public Integer getFlowRatio() {
            return this.flowRatio;
        }

        public GetNodeConfigResponseBodyResult setMinServicePercent(Integer minServicePercent) {
            this.minServicePercent = minServicePercent;
            return this;
        }
        public Integer getMinServicePercent() {
            return this.minServicePercent;
        }

        public GetNodeConfigResponseBodyResult setPublished(Boolean published) {
            this.published = published;
            return this;
        }
        public Boolean getPublished() {
            return this.published;
        }

    }

}
