// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListDataSourceAttributeResponseBody extends TeaModel {
    @NameInMap("DbList")
    public java.util.List<ListDataSourceAttributeResponseBodyDbList> dbList;

    /**
     * <strong>example:</strong>
     * <p>1B217656-2267-4FBF-B26C-CDD201BDC3B8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDataSourceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceAttributeResponseBody self = new ListDataSourceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSourceAttributeResponseBody setDbList(java.util.List<ListDataSourceAttributeResponseBodyDbList> dbList) {
        this.dbList = dbList;
        return this;
    }
    public java.util.List<ListDataSourceAttributeResponseBodyDbList> getDbList() {
        return this.dbList;
    }

    public ListDataSourceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataSourceAttributeResponseBodyDbList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>All</p>
         */
        @NameInMap("AuditMode")
        public String auditMode;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DbId")
        public Integer dbId;

        @NameInMap("FreqAuditMode")
        public String freqAuditMode;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ResultAuditMaxLine")
        public Integer resultAuditMaxLine;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ResultAuditMaxSize")
        public Integer resultAuditMaxSize;

        /**
         * <strong>example:</strong>
         * <p>Close</p>
         */
        @NameInMap("ResultAuditMode")
        public String resultAuditMode;

        public static ListDataSourceAttributeResponseBodyDbList build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceAttributeResponseBodyDbList self = new ListDataSourceAttributeResponseBodyDbList();
            return TeaModel.build(map, self);
        }

        public ListDataSourceAttributeResponseBodyDbList setAuditMode(String auditMode) {
            this.auditMode = auditMode;
            return this;
        }
        public String getAuditMode() {
            return this.auditMode;
        }

        public ListDataSourceAttributeResponseBodyDbList setDbId(Integer dbId) {
            this.dbId = dbId;
            return this;
        }
        public Integer getDbId() {
            return this.dbId;
        }

        public ListDataSourceAttributeResponseBodyDbList setFreqAuditMode(String freqAuditMode) {
            this.freqAuditMode = freqAuditMode;
            return this;
        }
        public String getFreqAuditMode() {
            return this.freqAuditMode;
        }

        public ListDataSourceAttributeResponseBodyDbList setResultAuditMaxLine(Integer resultAuditMaxLine) {
            this.resultAuditMaxLine = resultAuditMaxLine;
            return this;
        }
        public Integer getResultAuditMaxLine() {
            return this.resultAuditMaxLine;
        }

        public ListDataSourceAttributeResponseBodyDbList setResultAuditMaxSize(Integer resultAuditMaxSize) {
            this.resultAuditMaxSize = resultAuditMaxSize;
            return this;
        }
        public Integer getResultAuditMaxSize() {
            return this.resultAuditMaxSize;
        }

        public ListDataSourceAttributeResponseBodyDbList setResultAuditMode(String resultAuditMode) {
            this.resultAuditMode = resultAuditMode;
            return this;
        }
        public String getResultAuditMode() {
            return this.resultAuditMode;
        }

    }

}
