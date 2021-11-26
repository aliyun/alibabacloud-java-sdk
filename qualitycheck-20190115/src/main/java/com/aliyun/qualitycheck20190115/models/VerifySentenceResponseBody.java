// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class VerifySentenceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public VerifySentenceResponseBodyData data;

    @NameInMap("IncorrectWords")
    public Integer incorrectWords;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SourceRole")
    public Integer sourceRole;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TargetRole")
    public Integer targetRole;

    public static VerifySentenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifySentenceResponseBody self = new VerifySentenceResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifySentenceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifySentenceResponseBody setData(VerifySentenceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public VerifySentenceResponseBodyData getData() {
        return this.data;
    }

    public VerifySentenceResponseBody setIncorrectWords(Integer incorrectWords) {
        this.incorrectWords = incorrectWords;
        return this;
    }
    public Integer getIncorrectWords() {
        return this.incorrectWords;
    }

    public VerifySentenceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifySentenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifySentenceResponseBody setSourceRole(Integer sourceRole) {
        this.sourceRole = sourceRole;
        return this;
    }
    public Integer getSourceRole() {
        return this.sourceRole;
    }

    public VerifySentenceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public VerifySentenceResponseBody setTargetRole(Integer targetRole) {
        this.targetRole = targetRole;
        return this;
    }
    public Integer getTargetRole() {
        return this.targetRole;
    }

    public static class VerifySentenceResponseBodyDataDeltaSourceLine extends TeaModel {
        @NameInMap("Line")
        public java.util.List<String> line;

        public static VerifySentenceResponseBodyDataDeltaSourceLine build(java.util.Map<String, ?> map) throws Exception {
            VerifySentenceResponseBodyDataDeltaSourceLine self = new VerifySentenceResponseBodyDataDeltaSourceLine();
            return TeaModel.build(map, self);
        }

        public VerifySentenceResponseBodyDataDeltaSourceLine setLine(java.util.List<String> line) {
            this.line = line;
            return this;
        }
        public java.util.List<String> getLine() {
            return this.line;
        }

    }

    public static class VerifySentenceResponseBodyDataDeltaSource extends TeaModel {
        @NameInMap("Line")
        public VerifySentenceResponseBodyDataDeltaSourceLine line;

        @NameInMap("Position")
        public Integer position;

        public static VerifySentenceResponseBodyDataDeltaSource build(java.util.Map<String, ?> map) throws Exception {
            VerifySentenceResponseBodyDataDeltaSource self = new VerifySentenceResponseBodyDataDeltaSource();
            return TeaModel.build(map, self);
        }

        public VerifySentenceResponseBodyDataDeltaSource setLine(VerifySentenceResponseBodyDataDeltaSourceLine line) {
            this.line = line;
            return this;
        }
        public VerifySentenceResponseBodyDataDeltaSourceLine getLine() {
            return this.line;
        }

        public VerifySentenceResponseBodyDataDeltaSource setPosition(Integer position) {
            this.position = position;
            return this;
        }
        public Integer getPosition() {
            return this.position;
        }

    }

    public static class VerifySentenceResponseBodyDataDeltaTargetLine extends TeaModel {
        @NameInMap("Line")
        public java.util.List<String> line;

        public static VerifySentenceResponseBodyDataDeltaTargetLine build(java.util.Map<String, ?> map) throws Exception {
            VerifySentenceResponseBodyDataDeltaTargetLine self = new VerifySentenceResponseBodyDataDeltaTargetLine();
            return TeaModel.build(map, self);
        }

        public VerifySentenceResponseBodyDataDeltaTargetLine setLine(java.util.List<String> line) {
            this.line = line;
            return this;
        }
        public java.util.List<String> getLine() {
            return this.line;
        }

    }

    public static class VerifySentenceResponseBodyDataDeltaTarget extends TeaModel {
        @NameInMap("Line")
        public VerifySentenceResponseBodyDataDeltaTargetLine line;

        @NameInMap("Position")
        public Integer position;

        public static VerifySentenceResponseBodyDataDeltaTarget build(java.util.Map<String, ?> map) throws Exception {
            VerifySentenceResponseBodyDataDeltaTarget self = new VerifySentenceResponseBodyDataDeltaTarget();
            return TeaModel.build(map, self);
        }

        public VerifySentenceResponseBodyDataDeltaTarget setLine(VerifySentenceResponseBodyDataDeltaTargetLine line) {
            this.line = line;
            return this;
        }
        public VerifySentenceResponseBodyDataDeltaTargetLine getLine() {
            return this.line;
        }

        public VerifySentenceResponseBodyDataDeltaTarget setPosition(Integer position) {
            this.position = position;
            return this;
        }
        public Integer getPosition() {
            return this.position;
        }

    }

    public static class VerifySentenceResponseBodyDataDelta extends TeaModel {
        @NameInMap("Source")
        public VerifySentenceResponseBodyDataDeltaSource source;

        @NameInMap("Target")
        public VerifySentenceResponseBodyDataDeltaTarget target;

        @NameInMap("Type")
        public String type;

        public static VerifySentenceResponseBodyDataDelta build(java.util.Map<String, ?> map) throws Exception {
            VerifySentenceResponseBodyDataDelta self = new VerifySentenceResponseBodyDataDelta();
            return TeaModel.build(map, self);
        }

        public VerifySentenceResponseBodyDataDelta setSource(VerifySentenceResponseBodyDataDeltaSource source) {
            this.source = source;
            return this;
        }
        public VerifySentenceResponseBodyDataDeltaSource getSource() {
            return this.source;
        }

        public VerifySentenceResponseBodyDataDelta setTarget(VerifySentenceResponseBodyDataDeltaTarget target) {
            this.target = target;
            return this;
        }
        public VerifySentenceResponseBodyDataDeltaTarget getTarget() {
            return this.target;
        }

        public VerifySentenceResponseBodyDataDelta setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class VerifySentenceResponseBodyData extends TeaModel {
        @NameInMap("Delta")
        public java.util.List<VerifySentenceResponseBodyDataDelta> delta;

        public static VerifySentenceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            VerifySentenceResponseBodyData self = new VerifySentenceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public VerifySentenceResponseBodyData setDelta(java.util.List<VerifySentenceResponseBodyDataDelta> delta) {
            this.delta = delta;
            return this;
        }
        public java.util.List<VerifySentenceResponseBodyDataDelta> getDelta() {
            return this.delta;
        }

    }

}
