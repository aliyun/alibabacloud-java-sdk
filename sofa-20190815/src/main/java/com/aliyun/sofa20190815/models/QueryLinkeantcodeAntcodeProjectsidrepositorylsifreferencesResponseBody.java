// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("FileCount")
    public Long fileCount;

    @NameInMap("RefCount")
    public Long refCount;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("RefList")
    public java.util.List<QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponseBodyRefList> refList;

    public static QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponseBody self = new QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponseBody setFileCount(Long fileCount) {
        this.fileCount = fileCount;
        return this;
    }
    public Long getFileCount() {
        return this.fileCount;
    }

    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponseBody setRefCount(Long refCount) {
        this.refCount = refCount;
        return this;
    }
    public Long getRefCount() {
        return this.refCount;
    }

    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponseBody setRefList(java.util.List<QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponseBodyRefList> refList) {
        this.refList = refList;
        return this;
    }
    public java.util.List<QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponseBodyRefList> getRefList() {
        return this.refList;
    }

    public static class QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponseBodyRefList extends TeaModel {
        @NameInMap("Uri")
        public String uri;

        @NameInMap("ReferenceChunks")
        public java.util.List<String> referenceChunks;

        public static QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponseBodyRefList build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponseBodyRefList self = new QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponseBodyRefList();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponseBodyRefList setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

        public QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponseBodyRefList setReferenceChunks(java.util.List<String> referenceChunks) {
            this.referenceChunks = referenceChunks;
            return this;
        }
        public java.util.List<String> getReferenceChunks() {
            return this.referenceChunks;
        }

    }

}
