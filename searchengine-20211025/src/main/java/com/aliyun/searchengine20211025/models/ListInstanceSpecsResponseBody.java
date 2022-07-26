// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListInstanceSpecsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("cpu")
        public Integer cpu;

        @NameInMap("disk")
        public Integer disk;

        @NameInMap("mem")
        public Integer mem;

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

        public ListInstanceSpecsResponseBodyResult setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public ListInstanceSpecsResponseBodyResult setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

    }

}
