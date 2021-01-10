// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeLsifreferencesResponseBody extends TeaModel {
    @NameInMap("FileCount")
    public Long fileCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RefCount")
    public Long refCount;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("RefList")
    public java.util.List<CreateLinkeantcodeAntcodeLsifreferencesResponseBodyRefList> refList;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateLinkeantcodeAntcodeLsifreferencesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeLsifreferencesResponseBody self = new CreateLinkeantcodeAntcodeLsifreferencesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeLsifreferencesResponseBody setFileCount(Long fileCount) {
        this.fileCount = fileCount;
        return this;
    }
    public Long getFileCount() {
        return this.fileCount;
    }

    public CreateLinkeantcodeAntcodeLsifreferencesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeantcodeAntcodeLsifreferencesResponseBody setRefCount(Long refCount) {
        this.refCount = refCount;
        return this;
    }
    public Long getRefCount() {
        return this.refCount;
    }

    public CreateLinkeantcodeAntcodeLsifreferencesResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeantcodeAntcodeLsifreferencesResponseBody setRefList(java.util.List<CreateLinkeantcodeAntcodeLsifreferencesResponseBodyRefList> refList) {
        this.refList = refList;
        return this;
    }
    public java.util.List<CreateLinkeantcodeAntcodeLsifreferencesResponseBodyRefList> getRefList() {
        return this.refList;
    }

    public CreateLinkeantcodeAntcodeLsifreferencesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeantcodeAntcodeLsifreferencesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CreateLinkeantcodeAntcodeLsifreferencesResponseBodyRefList extends TeaModel {
        @NameInMap("Uri")
        public String uri;

        @NameInMap("ReferenceChunks")
        public java.util.List<String> referenceChunks;

        public static CreateLinkeantcodeAntcodeLsifreferencesResponseBodyRefList build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeLsifreferencesResponseBodyRefList self = new CreateLinkeantcodeAntcodeLsifreferencesResponseBodyRefList();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeLsifreferencesResponseBodyRefList setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

        public CreateLinkeantcodeAntcodeLsifreferencesResponseBodyRefList setReferenceChunks(java.util.List<String> referenceChunks) {
            this.referenceChunks = referenceChunks;
            return this;
        }
        public java.util.List<String> getReferenceChunks() {
            return this.referenceChunks;
        }

    }

}
