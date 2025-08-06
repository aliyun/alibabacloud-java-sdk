// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAuditResultResponseBody extends TeaModel {
    @NameInMap("AIAuditResult")
    public GetAuditResultResponseBodyAIAuditResult AIAuditResult;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAuditResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuditResultResponseBody self = new GetAuditResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuditResultResponseBody setAIAuditResult(GetAuditResultResponseBodyAIAuditResult AIAuditResult) {
        this.AIAuditResult = AIAuditResult;
        return this;
    }
    public GetAuditResultResponseBodyAIAuditResult getAIAuditResult() {
        return this.AIAuditResult;
    }

    public GetAuditResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAuditResultResponseBodyAIAuditResult extends TeaModel {
        @NameInMap("AbnormalModules")
        public String abnormalModules;

        @NameInMap("CoverResult")
        public String coverResult;

        @NameInMap("ImageResult")
        public String imageResult;

        @NameInMap("Label")
        public String label;

        @NameInMap("PornResult")
        public String pornResult;

        @NameInMap("TerrorismResult")
        public String terrorismResult;

        @NameInMap("TitleResult")
        public String titleResult;

        public static GetAuditResultResponseBodyAIAuditResult build(java.util.Map<String, ?> map) throws Exception {
            GetAuditResultResponseBodyAIAuditResult self = new GetAuditResultResponseBodyAIAuditResult();
            return TeaModel.build(map, self);
        }

        public GetAuditResultResponseBodyAIAuditResult setAbnormalModules(String abnormalModules) {
            this.abnormalModules = abnormalModules;
            return this;
        }
        public String getAbnormalModules() {
            return this.abnormalModules;
        }

        public GetAuditResultResponseBodyAIAuditResult setCoverResult(String coverResult) {
            this.coverResult = coverResult;
            return this;
        }
        public String getCoverResult() {
            return this.coverResult;
        }

        public GetAuditResultResponseBodyAIAuditResult setImageResult(String imageResult) {
            this.imageResult = imageResult;
            return this;
        }
        public String getImageResult() {
            return this.imageResult;
        }

        public GetAuditResultResponseBodyAIAuditResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAuditResultResponseBodyAIAuditResult setPornResult(String pornResult) {
            this.pornResult = pornResult;
            return this;
        }
        public String getPornResult() {
            return this.pornResult;
        }

        public GetAuditResultResponseBodyAIAuditResult setTerrorismResult(String terrorismResult) {
            this.terrorismResult = terrorismResult;
            return this;
        }
        public String getTerrorismResult() {
            return this.terrorismResult;
        }

        public GetAuditResultResponseBodyAIAuditResult setTitleResult(String titleResult) {
            this.titleResult = titleResult;
            return this;
        }
        public String getTitleResult() {
            return this.titleResult;
        }

    }

}
