// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class RunContactReviewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RawContractContent")
    public String rawContractContent;

    @NameInMap("ContactContent")
    public RunContactReviewResponseBodyContactContent contactContent;

    public static RunContactReviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunContactReviewResponseBody self = new RunContactReviewResponseBody();
        return TeaModel.build(map, self);
    }

    public RunContactReviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunContactReviewResponseBody setRawContractContent(String rawContractContent) {
        this.rawContractContent = rawContractContent;
        return this;
    }
    public String getRawContractContent() {
        return this.rawContractContent;
    }

    public RunContactReviewResponseBody setContactContent(RunContactReviewResponseBodyContactContent contactContent) {
        this.contactContent = contactContent;
        return this;
    }
    public RunContactReviewResponseBodyContactContent getContactContent() {
        return this.contactContent;
    }

    public static class RunContactReviewResponseBodyContactContentReviewResults extends TeaModel {
        @NameInMap("RiskLevel")
        public String riskLevel;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public java.util.List<String> value;

        @NameInMap("StartPosition")
        public java.util.List<String> startPosition;

        @NameInMap("ModificationSuggestion")
        public String modificationSuggestion;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("EndPosition")
        public java.util.List<String> endPosition;

        public static RunContactReviewResponseBodyContactContentReviewResults build(java.util.Map<String, ?> map) throws Exception {
            RunContactReviewResponseBodyContactContentReviewResults self = new RunContactReviewResponseBodyContactContentReviewResults();
            return TeaModel.build(map, self);
        }

        public RunContactReviewResponseBodyContactContentReviewResults setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public RunContactReviewResponseBodyContactContentReviewResults setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public RunContactReviewResponseBodyContactContentReviewResults setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

        public RunContactReviewResponseBodyContactContentReviewResults setStartPosition(java.util.List<String> startPosition) {
            this.startPosition = startPosition;
            return this;
        }
        public java.util.List<String> getStartPosition() {
            return this.startPosition;
        }

        public RunContactReviewResponseBodyContactContentReviewResults setModificationSuggestion(String modificationSuggestion) {
            this.modificationSuggestion = modificationSuggestion;
            return this;
        }
        public String getModificationSuggestion() {
            return this.modificationSuggestion;
        }

        public RunContactReviewResponseBodyContactContentReviewResults setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public RunContactReviewResponseBodyContactContentReviewResults setEndPosition(java.util.List<String> endPosition) {
            this.endPosition = endPosition;
            return this;
        }
        public java.util.List<String> getEndPosition() {
            return this.endPosition;
        }

    }

    public static class RunContactReviewResponseBodyContactContentStructureResults extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public java.util.List<String> value;

        @NameInMap("StartPosition")
        public java.util.List<String> startPosition;

        @NameInMap("Name")
        public String name;

        @NameInMap("EndPosition")
        public java.util.List<String> endPosition;

        public static RunContactReviewResponseBodyContactContentStructureResults build(java.util.Map<String, ?> map) throws Exception {
            RunContactReviewResponseBodyContactContentStructureResults self = new RunContactReviewResponseBodyContactContentStructureResults();
            return TeaModel.build(map, self);
        }

        public RunContactReviewResponseBodyContactContentStructureResults setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public RunContactReviewResponseBodyContactContentStructureResults setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

        public RunContactReviewResponseBodyContactContentStructureResults setStartPosition(java.util.List<String> startPosition) {
            this.startPosition = startPosition;
            return this;
        }
        public java.util.List<String> getStartPosition() {
            return this.startPosition;
        }

        public RunContactReviewResponseBodyContactContentStructureResults setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RunContactReviewResponseBodyContactContentStructureResults setEndPosition(java.util.List<String> endPosition) {
            this.endPosition = endPosition;
            return this;
        }
        public java.util.List<String> getEndPosition() {
            return this.endPosition;
        }

    }

    public static class RunContactReviewResponseBodyContactContent extends TeaModel {
        @NameInMap("ReviewResults")
        public java.util.List<RunContactReviewResponseBodyContactContentReviewResults> reviewResults;

        @NameInMap("StructureResults")
        public java.util.List<RunContactReviewResponseBodyContactContentStructureResults> structureResults;

        public static RunContactReviewResponseBodyContactContent build(java.util.Map<String, ?> map) throws Exception {
            RunContactReviewResponseBodyContactContent self = new RunContactReviewResponseBodyContactContent();
            return TeaModel.build(map, self);
        }

        public RunContactReviewResponseBodyContactContent setReviewResults(java.util.List<RunContactReviewResponseBodyContactContentReviewResults> reviewResults) {
            this.reviewResults = reviewResults;
            return this;
        }
        public java.util.List<RunContactReviewResponseBodyContactContentReviewResults> getReviewResults() {
            return this.reviewResults;
        }

        public RunContactReviewResponseBodyContactContent setStructureResults(java.util.List<RunContactReviewResponseBodyContactContentStructureResults> structureResults) {
            this.structureResults = structureResults;
            return this;
        }
        public java.util.List<RunContactReviewResponseBodyContactContentStructureResults> getStructureResults() {
            return this.structureResults;
        }

    }

}
