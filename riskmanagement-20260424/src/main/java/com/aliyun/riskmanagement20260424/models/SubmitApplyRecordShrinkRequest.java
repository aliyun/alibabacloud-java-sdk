// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class SubmitApplyRecordShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AR01</p>
     */
    @NameInMap("ApplyRequest")
    public String applyRequest;

    /**
     * <strong>example:</strong>
     * <p>[{\&quot;fileName\&quot;:\&quot;5a4b4xxxxd0b6.png\&quot;,\&quot;filePath\&quot;:\&quot;xxx/1cxxx7d0202.png\&quot;,\&quot;name\&quot;:\&quot;5axxxc1d0b6.png\&quot;}]</p>
     */
    @NameInMap("CommitmentLetter")
    public String commitmentLetter;

    /**
     * <strong>example:</strong>
     * <p>已经整改，关掉相关网站。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>43029423</p>
     */
    @NameInMap("EventIdList")
    public String eventIdListShrink;

    /**
     * <strong>example:</strong>
     * <p>[{\&quot;fileName\&quot;:\&quot;5a4b4xxxxd0b6.png\&quot;,\&quot;filePath\&quot;:\&quot;xxx/1cxxx7d0202.png\&quot;,\&quot;name\&quot;:\&quot;5axxxc1d0b6.png\&quot;}]</p>
     */
    @NameInMap("QualificationProof")
    public String qualificationProof;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Trial")
    public Boolean trial;

    public static SubmitApplyRecordShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitApplyRecordShrinkRequest self = new SubmitApplyRecordShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitApplyRecordShrinkRequest setApplyRequest(String applyRequest) {
        this.applyRequest = applyRequest;
        return this;
    }
    public String getApplyRequest() {
        return this.applyRequest;
    }

    public SubmitApplyRecordShrinkRequest setCommitmentLetter(String commitmentLetter) {
        this.commitmentLetter = commitmentLetter;
        return this;
    }
    public String getCommitmentLetter() {
        return this.commitmentLetter;
    }

    public SubmitApplyRecordShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitApplyRecordShrinkRequest setEventIdListShrink(String eventIdListShrink) {
        this.eventIdListShrink = eventIdListShrink;
        return this;
    }
    public String getEventIdListShrink() {
        return this.eventIdListShrink;
    }

    public SubmitApplyRecordShrinkRequest setQualificationProof(String qualificationProof) {
        this.qualificationProof = qualificationProof;
        return this;
    }
    public String getQualificationProof() {
        return this.qualificationProof;
    }

    public SubmitApplyRecordShrinkRequest setTrial(Boolean trial) {
        this.trial = trial;
        return this;
    }
    public Boolean getTrial() {
        return this.trial;
    }

}
