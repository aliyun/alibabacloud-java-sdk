// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeCdcClassListResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeCdcClassListResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6BA32080EEA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdcClassListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdcClassListResponseBody self = new DescribeCdcClassListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdcClassListResponseBody setData(DescribeCdcClassListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCdcClassListResponseBodyData getData() {
        return this.data;
    }

    public DescribeCdcClassListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCdcClassListResponseBodyDataClassCodeList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>polarx.n2.small.2e.cdc</p>
         */
        @NameInMap("ClassCode")
        public String classCode;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CpuCore")
        public String cpuCore;

        /**
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("Mem")
        public String mem;

        public static DescribeCdcClassListResponseBodyDataClassCodeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdcClassListResponseBodyDataClassCodeList self = new DescribeCdcClassListResponseBodyDataClassCodeList();
            return TeaModel.build(map, self);
        }

        public DescribeCdcClassListResponseBodyDataClassCodeList setClassCode(String classCode) {
            this.classCode = classCode;
            return this;
        }
        public String getClassCode() {
            return this.classCode;
        }

        public DescribeCdcClassListResponseBodyDataClassCodeList setCpuCore(String cpuCore) {
            this.cpuCore = cpuCore;
            return this;
        }
        public String getCpuCore() {
            return this.cpuCore;
        }

        public DescribeCdcClassListResponseBodyDataClassCodeList setMem(String mem) {
            this.mem = mem;
            return this;
        }
        public String getMem() {
            return this.mem;
        }

    }

    public static class DescribeCdcClassListResponseBodyData extends TeaModel {
        /**
         * <p>array</p>
         */
        @NameInMap("ClassCodeList")
        public java.util.List<DescribeCdcClassListResponseBodyDataClassCodeList> classCodeList;

        public static DescribeCdcClassListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdcClassListResponseBodyData self = new DescribeCdcClassListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCdcClassListResponseBodyData setClassCodeList(java.util.List<DescribeCdcClassListResponseBodyDataClassCodeList> classCodeList) {
            this.classCodeList = classCodeList;
            return this;
        }
        public java.util.List<DescribeCdcClassListResponseBodyDataClassCodeList> getClassCodeList() {
            return this.classCodeList;
        }

    }

}
