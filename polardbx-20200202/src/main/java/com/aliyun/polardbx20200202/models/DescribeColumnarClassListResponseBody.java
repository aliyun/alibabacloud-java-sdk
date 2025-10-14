// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeColumnarClassListResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeColumnarClassListResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>173CA69A-3513-591D-8A09-C1EA37CBE2D9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeColumnarClassListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeColumnarClassListResponseBody self = new DescribeColumnarClassListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeColumnarClassListResponseBody setData(DescribeColumnarClassListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeColumnarClassListResponseBodyData getData() {
        return this.data;
    }

    public DescribeColumnarClassListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeColumnarClassListResponseBodyDataClassCodeList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>polarx.n8.large.col</p>
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

        public static DescribeColumnarClassListResponseBodyDataClassCodeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeColumnarClassListResponseBodyDataClassCodeList self = new DescribeColumnarClassListResponseBodyDataClassCodeList();
            return TeaModel.build(map, self);
        }

        public DescribeColumnarClassListResponseBodyDataClassCodeList setClassCode(String classCode) {
            this.classCode = classCode;
            return this;
        }
        public String getClassCode() {
            return this.classCode;
        }

        public DescribeColumnarClassListResponseBodyDataClassCodeList setCpuCore(String cpuCore) {
            this.cpuCore = cpuCore;
            return this;
        }
        public String getCpuCore() {
            return this.cpuCore;
        }

        public DescribeColumnarClassListResponseBodyDataClassCodeList setMem(String mem) {
            this.mem = mem;
            return this;
        }
        public String getMem() {
            return this.mem;
        }

    }

    public static class DescribeColumnarClassListResponseBodyData extends TeaModel {
        /**
         * <p>object</p>
         */
        @NameInMap("ClassCodeList")
        public java.util.List<DescribeColumnarClassListResponseBodyDataClassCodeList> classCodeList;

        public static DescribeColumnarClassListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeColumnarClassListResponseBodyData self = new DescribeColumnarClassListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeColumnarClassListResponseBodyData setClassCodeList(java.util.List<DescribeColumnarClassListResponseBodyDataClassCodeList> classCodeList) {
            this.classCodeList = classCodeList;
            return this;
        }
        public java.util.List<DescribeColumnarClassListResponseBodyDataClassCodeList> getClassCodeList() {
            return this.classCodeList;
        }

    }

}
