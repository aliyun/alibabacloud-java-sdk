// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListInstanceSpecsResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     * 
     * <strong>example:</strong>
     * <p>10D5E615-69F7-5F49-B850-00169ADE513C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The result.</p>
     */
    @NameInMap("result")
    public java.util.List<ListInstanceSpecsResponseBodyResult> result;

    public static ListInstanceSpecsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceSpecsResponseBody self = new ListInstanceSpecsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceSpecsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceSpecsResponseBody setResult(java.util.List<ListInstanceSpecsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListInstanceSpecsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListInstanceSpecsResponseBodyResult extends TeaModel {
        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("cpu")
        public Integer cpu;

        /**
         * <p>The maximum storage space of a Searcher worker.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("maxDisk")
        public Integer maxDisk;

        /**
         * <p>The memory. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("mem")
        public Integer mem;

        /**
         * <p>The minimum storage space of a Searcher worker.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("minDisk")
        public Integer minDisk;

        public static ListInstanceSpecsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceSpecsResponseBodyResult self = new ListInstanceSpecsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListInstanceSpecsResponseBodyResult setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListInstanceSpecsResponseBodyResult setMaxDisk(Integer maxDisk) {
            this.maxDisk = maxDisk;
            return this;
        }
        public Integer getMaxDisk() {
            return this.maxDisk;
        }

        public ListInstanceSpecsResponseBodyResult setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public ListInstanceSpecsResponseBodyResult setMinDisk(Integer minDisk) {
            this.minDisk = minDisk;
            return this;
        }
        public Integer getMinDisk() {
            return this.minDisk;
        }

    }

}
