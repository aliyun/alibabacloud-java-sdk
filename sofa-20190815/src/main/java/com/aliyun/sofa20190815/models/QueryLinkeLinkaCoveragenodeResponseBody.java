// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaCoveragenodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public QueryLinkeLinkaCoveragenodeResponseBodyResult result;

    public static QueryLinkeLinkaCoveragenodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaCoveragenodeResponseBody self = new QueryLinkeLinkaCoveragenodeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaCoveragenodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinkaCoveragenodeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinkaCoveragenodeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinkaCoveragenodeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinkaCoveragenodeResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryLinkeLinkaCoveragenodeResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinkaCoveragenodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinkaCoveragenodeResponseBody setResult(QueryLinkeLinkaCoveragenodeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryLinkeLinkaCoveragenodeResponseBodyResult getResult() {
        return this.result;
    }

    public static class QueryLinkeLinkaCoveragenodeResponseBodyResult extends TeaModel {
        @NameInMap("BranchCovered")
        public Long branchCovered;

        @NameInMap("BranchTotal")
        public Long branchTotal;

        @NameInMap("ClassCovered")
        public Long classCovered;

        @NameInMap("ClassTotal")
        public Long classTotal;

        @NameInMap("CxtyCovered")
        public Long cxtyCovered;

        @NameInMap("CxtyTotal")
        public Long cxtyTotal;

        @NameInMap("FileUrl")
        public String fileUrl;

        @NameInMap("HasSourceCode")
        public Boolean hasSourceCode;

        @NameInMap("Id")
        public String id;

        @NameInMap("InstrCovered")
        public Long instrCovered;

        @NameInMap("InstrTotal")
        public Long instrTotal;

        @NameInMap("LineCoverageData")
        public String lineCoverageData;

        @NameInMap("LineCovered")
        public Long lineCovered;

        @NameInMap("LineTotal")
        public Long lineTotal;

        @NameInMap("MethodCovered")
        public Long methodCovered;

        @NameInMap("MethodTotal")
        public Long methodTotal;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("DiffLines")
        public java.util.List<Long> diffLines;

        public static QueryLinkeLinkaCoveragenodeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinkaCoveragenodeResponseBodyResult self = new QueryLinkeLinkaCoveragenodeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinkaCoveragenodeResponseBodyResult setBranchCovered(Long branchCovered) {
            this.branchCovered = branchCovered;
            return this;
        }
        public Long getBranchCovered() {
            return this.branchCovered;
        }

        public QueryLinkeLinkaCoveragenodeResponseBodyResult setBranchTotal(Long branchTotal) {
            this.branchTotal = branchTotal;
            return this;
        }
        public Long getBranchTotal() {
            return this.branchTotal;
        }

        public QueryLinkeLinkaCoveragenodeResponseBodyResult setClassCovered(Long classCovered) {
            this.classCovered = classCovered;
            return this;
        }
        public Long getClassCovered() {
            return this.classCovered;
        }

        public QueryLinkeLinkaCoveragenodeResponseBodyResult setClassTotal(Long classTotal) {
            this.classTotal = classTotal;
            return this;
        }
        public Long getClassTotal() {
            return this.classTotal;
        }

        public QueryLinkeLinkaCoveragenodeResponseBodyResult setCxtyCovered(Long cxtyCovered) {
            this.cxtyCovered = cxtyCovered;
            return this;
        }
        public Long getCxtyCovered() {
            return this.cxtyCovered;
        }

        public QueryLinkeLinkaCoveragenodeResponseBodyResult setCxtyTotal(Long cxtyTotal) {
            this.cxtyTotal = cxtyTotal;
            return this;
        }
        public Long getCxtyTotal() {
            return this.cxtyTotal;
        }

        public QueryLinkeLinkaCoveragenodeResponseBodyResult setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public QueryLinkeLinkaCoveragenodeResponseBodyResult setHasSourceCode(Boolean hasSourceCode) {
            this.hasSourceCode = hasSourceCode;
            return this;
        }
        public Boolean getHasSourceCode() {
            return this.hasSourceCode;
        }

        public QueryLinkeLinkaCoveragenodeResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeLinkaCoveragenodeResponseBodyResult setInstrCovered(Long instrCovered) {
            this.instrCovered = instrCovered;
            return this;
        }
        public Long getInstrCovered() {
            return this.instrCovered;
        }

        public QueryLinkeLinkaCoveragenodeResponseBodyResult setInstrTotal(Long instrTotal) {
            this.instrTotal = instrTotal;
            return this;
        }
        public Long getInstrTotal() {
            return this.instrTotal;
        }

        public QueryLinkeLinkaCoveragenodeResponseBodyResult setLineCoverageData(String lineCoverageData) {
            this.lineCoverageData = lineCoverageData;
            return this;
        }
        public String getLineCoverageData() {
            return this.lineCoverageData;
        }

        public QueryLinkeLinkaCoveragenodeResponseBodyResult setLineCovered(Long lineCovered) {
            this.lineCovered = lineCovered;
            return this;
        }
        public Long getLineCovered() {
            return this.lineCovered;
        }

        public QueryLinkeLinkaCoveragenodeResponseBodyResult setLineTotal(Long lineTotal) {
            this.lineTotal = lineTotal;
            return this;
        }
        public Long getLineTotal() {
            return this.lineTotal;
        }

        public QueryLinkeLinkaCoveragenodeResponseBodyResult setMethodCovered(Long methodCovered) {
            this.methodCovered = methodCovered;
            return this;
        }
        public Long getMethodCovered() {
            return this.methodCovered;
        }

        public QueryLinkeLinkaCoveragenodeResponseBodyResult setMethodTotal(Long methodTotal) {
            this.methodTotal = methodTotal;
            return this;
        }
        public Long getMethodTotal() {
            return this.methodTotal;
        }

        public QueryLinkeLinkaCoveragenodeResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeLinkaCoveragenodeResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryLinkeLinkaCoveragenodeResponseBodyResult setDiffLines(java.util.List<Long> diffLines) {
            this.diffLines = diffLines;
            return this;
        }
        public java.util.List<Long> getDiffLines() {
            return this.diffLines;
        }

    }

}
