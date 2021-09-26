// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListDataSourceAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DbList")
    public java.util.List<ListDataSourceAttributeResponseBodyDbList> dbList;

    public static ListDataSourceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceAttributeResponseBody self = new ListDataSourceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSourceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataSourceAttributeResponseBody setDbList(java.util.List<ListDataSourceAttributeResponseBodyDbList> dbList) {
        this.dbList = dbList;
        return this;
    }
    public java.util.List<ListDataSourceAttributeResponseBodyDbList> getDbList() {
        return this.dbList;
    }

    public static class ListDataSourceAttributeResponseBodyDbList extends TeaModel {
        @NameInMap("ResultAuditMode")
        public String resultAuditMode;

        @NameInMap("DbId")
        public Integer dbId;

        @NameInMap("ResultAuditMaxSize")
        public Integer resultAuditMaxSize;

        @NameInMap("AuditMode")
        public String auditMode;

        @NameInMap("ResultAuditMaxLine")
        public Integer resultAuditMaxLine;

        public static ListDataSourceAttributeResponseBodyDbList build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceAttributeResponseBodyDbList self = new ListDataSourceAttributeResponseBodyDbList();
            return TeaModel.build(map, self);
        }

        public ListDataSourceAttributeResponseBodyDbList setResultAuditMode(String resultAuditMode) {
            this.resultAuditMode = resultAuditMode;
            return this;
        }
        public String getResultAuditMode() {
            return this.resultAuditMode;
        }

        public ListDataSourceAttributeResponseBodyDbList setDbId(Integer dbId) {
            this.dbId = dbId;
            return this;
        }
        public Integer getDbId() {
            return this.dbId;
        }

        public ListDataSourceAttributeResponseBodyDbList setResultAuditMaxSize(Integer resultAuditMaxSize) {
            this.resultAuditMaxSize = resultAuditMaxSize;
            return this;
        }
        public Integer getResultAuditMaxSize() {
            return this.resultAuditMaxSize;
        }

        public ListDataSourceAttributeResponseBodyDbList setAuditMode(String auditMode) {
            this.auditMode = auditMode;
            return this;
        }
        public String getAuditMode() {
            return this.auditMode;
        }

        public ListDataSourceAttributeResponseBodyDbList setResultAuditMaxLine(Integer resultAuditMaxLine) {
            this.resultAuditMaxLine = resultAuditMaxLine;
            return this;
        }
        public Integer getResultAuditMaxLine() {
            return this.resultAuditMaxLine;
        }

    }

}
